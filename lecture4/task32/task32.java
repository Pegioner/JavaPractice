import java.io.*; 
public class task32 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("m = ");
        int m = Integer.parseInt(reader.readLine());
        System.out.print("n = ");
        int n = Integer.parseInt(reader.readLine());
        for (int i = 0; i < m;  i++) {
            for (int j = 0; j < n;  j++) {
                System.out.print(8);
            }
            System.out.println();
        }
    }
}