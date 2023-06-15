public class task16 {
    public static void print3(String s) {
        for (int i = 0; i < 2; i++) {
            System.out.print(s + " ");
        }
        System.out.println(s);
    }
    public static void main(String[] args) {
        print3("window");
        print3("file");
    }
}
