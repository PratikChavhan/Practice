class UserThread extends Thread {
    public void run() {
        System.out.println("this is a user defined thread");
    }
}

class ThreadOp {
    public static void main(String[] args) {
        System.out.println("program started");
        int x = 56 + 24;
        System.out.println("sum is " + x);

        // main thread
        Thread t = Thread.currentThread();

        String tname = t.getName();
        System.out.println("current running thread is " + tname);

        t.setName("MyMain");
        System.out.println("New name of current running thread is " + t.getName());

        // try {
        // Thread.sleep(5000);
        // } catch (Exception e) {
        // e.printStackTrace();
        // }

        System.out.println("Id of current thread: " + t.getId());
        // main thread id is 1

        // starting UserDefined thread
        UserThread th = new UserThread();
        th.start();

        System.out.println("program ended");
    }
}