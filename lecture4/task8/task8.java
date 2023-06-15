import java.io.*; 
public class task8 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        System.out.println((a > 0) ? a * 2 : ((a < 0) ? a + 1 : a));
    }
}