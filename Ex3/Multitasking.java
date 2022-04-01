package Exam1.Ex3;

public class Multitasking extends Thread{
    @Override
    public void run() {
//        super.run();
        int count = 0;
        while (true) {
            System.out.println("Multitasking");

            try {
                sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
