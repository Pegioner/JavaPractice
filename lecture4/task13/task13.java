import java.io.*; 
public class task13 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String[] s3 = s.split(" ");
        int a = Integer.parseInt(s3[0]);
        int b = Integer.parseInt(s3[1]);
        int c = Integer.parseInt(s3[2]);
        if ((a == b) & (a == c))
            System.out.println(a + " " + b + " " + c);
        else if ((a == b) | (a == c))
            System.out.println(a + " " + a);
        else if (b == c)
            System.out.println(b + " " + c);
        else
            System.out.println("равных чисел нет");
    }
}