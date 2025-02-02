public class ThreadExample extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            System.out.println("download image dog" + i + ".jpg");

        }

    }

    public static void main(String[] args) {
        System.out.println("application started");
        for (int i = 0; i < 100000; i++) {
            System.out.println("download image cat" + i + ".jpg");

        }
        ThreadExample t1 = new ThreadExample();
        t1.start();
        System.out.println("application stopped");
    }
}