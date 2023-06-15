import java.io.*; 
public class task21 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        if (a == 0)
            System.out.println("ноль");
        else
            EvenOdd(a);
    }

    public static void isPlus(int a)
    {
        if (a > 0)
            System.out.print("положительное ");
        else
            System.out.print("отрицательное ");
    }

    public static void EvenOdd(int a)
    {
        if (a % 2 == 0) {
            isPlus(a);
            System.out.println("четное число");
        } 
        else {
            isPlus(a);
            System.out.println("нечетное число");
        }
            
    }
}