package Exam1.Ex2;

public class Third extends Thread {
    @Override
    public void run(){
        int index = 5;
        for (int i=0; i < 5; i++){
            System.out.println("Third:" + index--);
            try {
                Thread.sleep(1200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
