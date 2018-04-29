import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class MyDeadlock implements Runnable{
    public static void main(String[] args) {
        MyDeadlock m = new MyDeadlock();
        Thread t = new Thread(m);
        t.start();
        t.interrupt();
    }

    @Override
    public void run() {
        System.out.println("Hey thread is started");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
