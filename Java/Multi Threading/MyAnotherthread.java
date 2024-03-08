// creating thread by extending thread class
public class MyAnotherthread extends Thread {
    public void run() {
        for (int i = 10; i >= 0; i--) {
            System.out.println("another thread i= " + i);
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}
