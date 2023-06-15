import java.io.*; 
public class task15 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String[] s2 = s.split(" ");
        int x = Integer.parseInt(s2[0]);
        int y = Integer.parseInt(s2[1]);

        if ((x > 0) & (y > 0))
            System.out.println(1);
        else if ((x > 0) & (y < 0))
            System.out.println(4);
        else if (y > 0)
            System.out.println(2);
        else
            System.out.println(3);
    }
}