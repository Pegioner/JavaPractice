import java.io.*; 
public class task22 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        if (a > 0)
            Digit(a);
    }

    public static void isEven(int a)
    {
        if (a % 2 == 0)
            System.out.print("четное ");
        else
            System.out.print("нечетное ");
    }

    public static void Digit(int a)
    {
        if (a / 10 == 0){
            isEven(a);
            System.out.println("однозначное число");
        }  
        else if (a / 100 == 0){
            isEven(a);
            System.out.println("двузначное число");
        }
        else if (a / 1000 == 0){
            isEven(a);
            System.out.println("трехзначное число");
        }
    }
}