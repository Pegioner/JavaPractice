import java.io.*; 
public class task11 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        if((a < b + c) && (b < a + c) && (c < a + b))
            System.out.println("Треугольник существует.");
        else
            System.out.println("Треугольник не существует.");

        /*System.out.println(((a < b + c) && (b < a + c) && (c < a + b)) ?
            "Треугольник существует." : "Треугольник не существует.");*/
    }
}