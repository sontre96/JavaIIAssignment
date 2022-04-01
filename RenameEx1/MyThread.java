package Exam1.RenameEx1;

public class MyThread extends Thread {
    @Override
    public void run() {
        for (int i=0; i <= 20; i++){
            if(i%2 == 0) {
                System.out.println("Even Number of myJavaThread:" + i);
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("Thread stopped");
    }

    public static void main(String args[]) {
        MyThread myThread = new MyThread();
        System.out.println("Name of myThread:" + myThread.getName());

        myThread.setName("myJavaThread");
        System.out.println("After rename myThread: " + myThread.getName());

        myThread.run();

    }
}
