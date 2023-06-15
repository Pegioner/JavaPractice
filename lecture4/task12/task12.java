import java.io.*; 
public class task12 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double a = Double.parseDouble(reader.readLine());
        if(a % 5 < 3)
            System.out.println("зелёный");
        else if(a % 5 >= 4)
            System.out.println("красный");
        else
            System.out.println("жёлтый");
    }
}