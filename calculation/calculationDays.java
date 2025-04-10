package calculation;

public class calculationDays {
    public static boolean isDaysCorrect(int year, int days) {
        // Проверяем високосный ли год
        boolean isLeap = (year % 400 == 0) || (year % 100 != 0 && year % 4 == 0);
        return (isLeap && days == 366) || (!isLeap && days == 365);
    }
}
