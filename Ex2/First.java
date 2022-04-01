package Exam1.Ex2;

public  class First extends Thread  {
    @Override
    public void run(){
        int index = 5;
        for (int i=0; i < 5; i++){
            System.out.println("First:" + index--);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
