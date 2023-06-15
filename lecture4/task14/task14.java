import java.io.*; 
public class task14 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите имя: ");
        String name = reader.readLine();
        System.out.print("Введите возраст: ");
        int age = Integer.parseInt(reader.readLine());
        if(age < 18)
            System.out.println("Подрасти еще");
        else if(age > 20)
            System.out.println("И 18-ти достаточно");
    }
}