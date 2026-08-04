class Numbers extends Thread {

    public void run() {

        for(int i=1;i<=5;i++){

            System.out.println("Numbers : " + i);

        }

    }

}

class Letters extends Thread {

    public void run() {

        for(char ch='A';ch<='E';ch++){

            System.out.println("Letters : " + ch);

        }

    }

}

public class demoMultithreading {

    public static void main(String[] args) {

        Numbers n = new Numbers();
        Letters l = new Letters();

        n.start();
        // l.start();

    }

}