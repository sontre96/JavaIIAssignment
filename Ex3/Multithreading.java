package Exam1.Ex3;

public class Multithreading extends Thread {
    @Override
    public void run() {
//        super.run();
        for (int i =0; i < 10; i++){
            System.out.println("Multithreading");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
