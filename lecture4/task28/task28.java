public class task28 {
    public static void main(String[] args) throws Exception {
        int i = 0, j = 0;
        while (j < 10) {
            if (i == 9) {
                System.out.println("S");
                i = 0;
                j++;
            }
            else{
                System.out.print("S");
                i++;
            }

            /*while (i < 9) {
                System.out.print("S");
                i++;
            }
            System.out.println("S");
            i = 0;
            j++;*/
        }
    }
}
