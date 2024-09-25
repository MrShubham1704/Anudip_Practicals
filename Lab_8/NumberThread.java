package Lab_8;


class NumberRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000); // 1 second delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class NumberThread {
    public static void main(String[] args) {
        Thread thread = new Thread(new NumberRunnable());
        thread.start();
    }
}
