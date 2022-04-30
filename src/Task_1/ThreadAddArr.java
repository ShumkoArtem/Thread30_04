package Task_1;

public class ThreadAddArr implements Runnable{

    private int [] arr;

    public int[] getArr() {
        return arr;
    }

    @Override
    public void run() {


        // создаем массив со значениями от 0 до 10
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 11);
        }
        this.arr = array;
        for (int x: array) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
