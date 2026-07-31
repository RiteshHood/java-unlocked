// this example shows the 2nd way of creating a thread.

class mytask implements Runnable{
    public void run(){
            System.out.println("Thread is running");
    }
}
public class TestMultithreading{
    public static void main(String[] args){

        mytask obj = new mytask();
        Thread t1 = new Thread(obj);
        t1.start();
    }
}