package Task_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {

    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        /**
         * При старте приложения попросите пользователя ввести 2 дроби.
         * Затем используя интерфейс Runnable запустить 4 потока,
         * которые используя лямбда-выражения выполнят действия:
         * Сумма двух дробей;
         * Разница двух дробей;
         * Произведение двух дробей;
         * Деление двух дробей.
         * Результ операций нужно вывести в консоль.
         */

        System.out.println("Введите два дробных числа");
        double num1 = imputNumber();
        double num2 = imputNumber();

        Runnable runnableSum = () -> {
            System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        };
        Runnable runnableDif = () -> {
            System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        };
        Runnable runnableMult = () -> {
            System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
        };
        Runnable runnableDiv = () -> {
            System.out.println(num1 + " * " + num2 + " = " + (num1 / num2));
        };

        new Thread(runnableSum).start();
        new Thread(runnableDif).start();
        new Thread(runnableMult).start();
        new Thread(runnableDiv).start();
    }


    private static double imputNumber() throws IOException {
        double num = 0;
        boolean flag = true;
        do {
            String strNum = reader.readLine();
            flag = true;

            try {
                num = Double.parseDouble(strNum);
            } catch (IllegalArgumentException ex) {
                System.out.println("Число - String!!!");
                flag = false;
            }
        } while (!flag);

        System.out.println(num);
        return num;
    }
}


