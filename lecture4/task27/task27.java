import java.io.*; 
public class task27 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        String[] s2 = s.split(" ");
        int N = Integer.parseInt(s2[1]);
        int i = 0;
        while (i < N) {
            System.out.println(s2[0]);
            i++;
        }
    }
}