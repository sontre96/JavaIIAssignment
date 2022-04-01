package Exam1.Ex3;

public class AppEx3 {
    public static void main(String[] args) {

        new Multithreading().start();
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        Thread multitasking = new Multitasking();
        multitasking.setDaemon(true);
        multitasking.start();
    }
}
