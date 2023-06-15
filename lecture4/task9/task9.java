import java.io.*; 
public class task9 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        if (a == 1)
            System.out.println("понедельник");
        else if (a == 2)
            System.out.println("вторник");
        else if (a == 3)
            System.out.println("среда");
        else if (a == 4)
            System.out.println("четверг");
        else if (a == 5)
            System.out.println("пятница");
        else if (a == 6)
            System.out.println("суббота");
        else if (a == 7)
            System.out.println("воскресенье");
        else
            System.out.println("такого дня недели не существует");

        /*System.out.println((a == 1) ? "понедельник" : ((a == 2) ? 
            "вторник" : ((a == 3) ? "среда" : ((a == 4) ? "четверг" :
            ((a == 5) ? "пятница" : ((a == 6) ? "суббота" : ((a == 7) ?
            "воскресенье" : "такого дня недели не существует")))))));*/
    }
}