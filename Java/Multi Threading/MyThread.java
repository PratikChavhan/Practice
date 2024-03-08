// creating thread by implementing runnable interface
class MyThread implements Runnable {
    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println("value of i is " + i);
            try {
                Thread.sleep(1000);
            } catch (Exception e) {

            }
        }
    }

    public static void main(String[] args) {
        MyThread t = new MyThread();
        Thread thread = new Thread(t);
        thread.start();

        MyAnotherthread t1 = new MyAnotherthread();
        t1.start();

    }
}
