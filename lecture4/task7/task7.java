public class task7 {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }
    public static void checkSeason(int month) {
        if ((month > 0) & (month < 4) | (month == 12))
            System.out.println("Зима");
        else if (month < 6)
            System.out.println("Весна");
        else if (month < 9)
            System.out.println("Лето");
        else if (month < 12)
            System.out.println("Осень");
        else
            System.out.println("Такого месяца не существует");
    }
}