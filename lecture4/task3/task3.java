public class task3 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat.addNewCat();
        Cat cat2 = new Cat();
        Cat.addNewCat();
        //Cat.setCatsCount(2);
        System.out.println("The cat count is " + Cat.catsCount);
    }
    public static class Cat {
        private static int catsCount = 0;
        private String fullName;
        public static void addNewCat() {
            Cat.catsCount += 1;
        }
        public static void setCatsCount(int catsCount) {
            Cat.catsCount = catsCount;
        }
        public void setName(String firstName, String lastName) {
            String fullName = firstName + " " + lastName;
            this.fullName = fullName;
        }
    }
}