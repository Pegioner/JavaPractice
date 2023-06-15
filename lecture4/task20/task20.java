import java.io.*; 
public class task20 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String[] s3 = s.split(" ");
        int a = Integer.parseInt(s3[0]);
        int b = Integer.parseInt(s3[1]);
        int c = Integer.parseInt(s3[2]);

        int min = min(min(a,b),c);
        int max = max(max(a,b),c);
        int mid = (a + b + c) - min - max;
        System.out.println(min  + " " + mid + " " + max);
    }

    public static int min(int a, int b)
    {
        if (a < b)
            return a;
        else
            return b;
    }

    public static int max(int a, int b)
    {
        if (a > b)
            return a;
        else
            return b;
    }
}