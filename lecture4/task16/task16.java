import java.io.*; 
public class task16 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String[] s2 = s.split(" ");
        int a = Integer.parseInt(s2[0]);
        int b = Integer.parseInt(s2[1]);

        if (a < b)
            System.out.println(a);
        else
            System.out.println(b);
    }
}