public class task18 {
    public static int min(int a, int b, int c) {
        return (a < b) ? ((a < c) ? a : c) : ((b < c) ? b : c);

    }
    public static void main(String[] args) {
        System.out.println(min(1, 2, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 5, 10));
    }
}
