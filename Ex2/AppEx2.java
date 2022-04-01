package Exam1.Ex2;



public class AppEx2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("New Thread: Thread[First,5,main]");
        System.out.println("New Thread: Thread[Second,5,main]");
        System.out.println("New Thread: Thread[Third,5,main]");

        new First().start();
        try {
            Thread.sleep(50);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        new Second().start();
        try {
            Thread.sleep(50);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        new Third().start();
        try {
            Thread.sleep(50);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        Thread.sleep(4200);
        System.out.println("First exiting");

        Thread.sleep(4600);
        System.out.println("Second exiting");

        Thread.sleep(5000);
        System.out.println("Third exiting");

        Thread.sleep(5500);
        System.out.println("Main thread exiting");

    }
}
