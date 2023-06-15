import java.io.*; 
public class task24 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String[] s3 = s.split(" ");
        int a = Integer.parseInt(s3[0]);
        int b = Integer.parseInt(s3[1]);
        int c = Integer.parseInt(s3[2]);

        Sign(a);
        Sign(b);
        Sign(c);
        System.out.println("количество отрицательных чисел: " + minus);
        System.out.println("количество положительных чисел: " + plus);
    }

    public static int plus = 0, minus = 0;

    public static void Sign(int a)
    {
        if (a > 0)
            plus ++;
        else if (a < 0)
            minus ++;
    }
}