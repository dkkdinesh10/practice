package thread.EvenOdd;

public class EvenOddThreadExample implements Runnable{
    int max=10;
    private volatile boolean isOdd=false;
    public static void main(String[] args) {
        EvenOddThreadExample main=new EvenOddThreadExample();
        EvenOddThreadExample main1=new EvenOddThreadExample();
        Thread t=new Thread(main);
        Thread t1=new Thread(main1);
        t.start();
        t1.start();
    }

    @Override
    public void run() {
        int number=1;
        while (number <= max) {
            if (number%2==0) {
                printEven(number);
            } else {
                printOdd(number);
            }
            number ++;
        }
    }

    synchronized void printEven(int number) {
        while (!isOdd) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(Thread.currentThread().getName() + ":" + number);
        isOdd = false;
        notify();
    }

    synchronized void printOdd(int number) {
        while (isOdd) {
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(Thread.currentThread().getName() + ":" + number);
        isOdd = true;
        notify();
    }
}
