public class task29 {
    public static void main(String[] args) throws Exception {
        int i = 1, j = 1;
        while (j < 11) {
            if (i == 10) {
                System.out.println(i * j);
                i = 1;
                j++;
            }
            else{
                System.out.print(i * j + " ");
                i++;
            }

            /*while (i < 10) {
                System.out.print(i * j + " ");
                i++;
            }
            System.out.println(i * j);
            i = 1;
            j++;*/
        }
    }
}