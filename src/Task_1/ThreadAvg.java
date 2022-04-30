package Task_1;

public class ThreadAvg implements Runnable{

    private double avgArray;
    private int [] arr;

    public double getAvgArray() {
        return avgArray;
    }

    public ThreadAvg(int [] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {

        int summa = 0;
        double avg = 0;
        for (int x : this.arr) {
            summa += x;
        }
        avg = (double) summa / this.arr.length;
        this.avgArray = avg;
    }
}
