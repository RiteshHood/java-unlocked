public class Main3{
    public static void main(String [] args){
        System.out.println("The another way of creating a Thread: \n Lambda (Java 8+)");

        Thread t1 = new Thread(()->{
            System.out.println("Thread is running");
        });
        t1.start();
    }
}