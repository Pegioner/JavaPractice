import java.io.*; 
public class task19 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String[] s3 = s.split(" ");
        int a = Integer.parseInt(s3[0]);
        int b = Integer.parseInt(s3[1]);
        int c = Integer.parseInt(s3[2]);

        if (a == b)
            System.out.println(3);
        else if (a == c)
            System.out.println(2);
        else if (b == c)
            System.out.println(1);
    }
}