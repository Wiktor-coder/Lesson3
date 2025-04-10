import java.util.Scanner;


import static calculation.calculationDays.isDaysCorrect;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;
        boolean gameOver = false;

        System.out.println("Игра: Угадай количество дней в году");
        System.out.println("Вводите год и предполагаемое количество дней через пробел");
        System.out.println("Для выхода введите любой нечисловой символ");

        while (!gameOver) {
            try {
                System.out.print("Введите год и количество дней: ");
                int year = scanner.nextInt();
                int days = scanner.nextInt();

                if (isDaysCorrect(year, days)) {
                    score++;
                    System.out.println("Верно! Текущий счет: " + score);
                } else {
                    gameOver = true;
                    System.out.println("Неверно! Игра окончена.");
                }
            } catch (Exception e) {
                gameOver = true;
                System.out.println("Ввод завершен. Игра окончена.");
            }
        }

        System.out.println("Ваш итоговый счет: " + score);
        scanner.close();
    }


}