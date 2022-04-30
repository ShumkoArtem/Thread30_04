package Task_1;

public class ThreadSum extends Thread{

    private int sum;
    private int [] arr;

    public int[] getArr() {
        return arr;
    }

    public int getSum() {
        return sum;
    }

    public ThreadSum(int [] arr) {
       this.arr = arr;
    }

    @Override
    public void run() {

        int sum = 0;
        for (int i = 0; i < this.arr.length; i++) {
            sum += this.arr[i];
        }
        this.sum = sum;
    }
}
