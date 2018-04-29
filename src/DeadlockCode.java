import java.util.concurrent.Future;

public class DeadlockCode {

    Object obj1 = new Object();
    Object obj2 = new Object();

    public void leftRight()
    {
        synchronized (obj1)
        {
            synchronized (obj2)
            {
                System.out.println("LeftRight");
            }
        }
    }

    public void rightLeft()
    {
        synchronized (obj2)
        {
            synchronized (obj1)
            {
                System.out.println("RightLeft");
            }
        }

    }

    public static void main(String[] args) {
        DeadlockCode d = new DeadlockCode();
        d.leftRight();
        d.rightLeft();
    }

}

interface Executor
{
    void execute(Runnable command);
}
