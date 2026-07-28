// The one eay of creating threads in java : extending the Thread class , override run method and using start() to start the threads.

class mythread extends Thread {

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

}

public class Main {

    public static void main(String[] args) {

        mythread t1 = new mythread();
        t1.start();

        try {
            for (int j = 10; j < 20; j++) {
                System.out.println(j);
                t1.sleep(500);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
