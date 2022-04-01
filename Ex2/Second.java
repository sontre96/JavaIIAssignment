package Exam1.Ex2;

public class Second extends Thread {
    @Override
    public void run(){
        int index = 5;
        for (int i=0; i < 5; i++){
            System.out.println("Second:" + index--);
            try {
                Thread.sleep(1100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
