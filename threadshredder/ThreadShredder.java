public class ThreadShredder implements Runnable {

    public static void main(String[] args) {
        System.out.println("Hello World"); 
        System.out.println("I'm going to run some Java Threads now"); 
        (new Thread(new ThreadShredder())).start();
        (new Thread(new ThreadShredder())).start();
        System.out.println("Well that was fun, wonder if those will ever finish...");
    }

    public void run() {
        System.out.println("I'm a Java Thread and I count to infinity");
        long x = 0;
        while(true) {
            x++;
        }
    }

}

