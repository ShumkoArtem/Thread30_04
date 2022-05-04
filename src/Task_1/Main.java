package Task_1;

public class Main {
    public static void main(String[] args) {
        /**
         * При старте приложения запускаются три потока. Пер-
         * вый поток заполняет массив случайными числами. Два
         * других потока ожидают заполнения. Когда массив запол-
         * нен оба потока запускаются. Первый поток находит сумму
         * элементов массива, второй поток среднеарифметическое
         * значение в массиве. Полученный массив, сумма и средне-
         * арифметическое возвращаются в метод main, где должны
         * быть отображены.
         */

        // создаем массив со значениями от 0 до 10
        ThreadAddArr threadAddArr = new ThreadAddArr();
        Thread addArr = new Thread(threadAddArr);
        addArr.start();

        try {
            Thread.sleep(1000); // обязательно обработать
        }catch (InterruptedException exception){
            exception.printStackTrace();
        }

        //создаем объект потока Sum
        ThreadSum sum = new ThreadSum(threadAddArr.getArr());

        //создаем объект потока avg (используя Rannable)
        ThreadAvg avg = new ThreadAvg(threadAddArr.getArr());
        Thread avgThread = new Thread(avg);

        avgThread.start(); // запускаем поток Avg
        sum.start();// запускаем поток Sum

        try {
            Thread.sleep(1000); // обязательно обработать
        }catch (InterruptedException exception){
            exception.printStackTrace();
        }

        System.out.println("Сумма элементов массива = " + sum.getSum());
        System.out.println("Средне арифметическое элементов массива = " + avg.getAvgArray());

    }
}
