import java.io.*; 
public class task23 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String[] s3 = s.split(" ");
        int a = Integer.parseInt(s3[0]);
        int b = Integer.parseInt(s3[1]);
        int c = Integer.parseInt(s3[2]);

        Plus(a);
        Plus(b);
        Plus(c);
        System.out.println(x);
    }

    public static int x;

    public static void Plus(int a)
    {
        if (a > 0)
            x ++;
    }
}