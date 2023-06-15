import java.io.*; 
public class task17 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String[] s4 = s.split(" ");
        int a = Integer.parseInt(s4[0]);
        int b = Integer.parseInt(s4[1]);
        int c = Integer.parseInt(s4[2]);
        int d = Integer.parseInt(s4[3]);
        System.out.println(max(max(a, b), max(c, d)));
    }

    public static int max(int a, int b)
    {
        if (a > b)
            return a;
        else
            return b;
    }
}