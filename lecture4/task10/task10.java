import java.io.*; 
public class task10 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        if((a % 4 == 0) && (a % 100 != 0) || (a % 400 == 0))
            System.out.println("количество дней в году: 366");
        else
            System.out.println("количество дней в году: 365");

        /*System.out.println(((a % 4 == 0) && (a % 100 != 0) || (a % 400 == 0)) ?
            "количество дней в году: 366" : "количество дней в году: 365");*/
    }
}