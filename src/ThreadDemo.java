public class ThreadDemo implements Runnable{

    private Thread thread;
    private String threadName;

    public ThreadDemo(String threadName) {
        this.threadName = threadName;
        System.out.println("Oluşturuluyor :"+threadName);
    }

    @Override
    public void run() {
        System.out.println("Çalıştırılıyor :"+threadName);

        try {
            for(int i = 1; i<10; i++) {
                System.out.println(threadName + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Thread bitti: "+threadName);

    }

    public void start(){
        System.out.println("Thread oluşturuluyor: "+threadName);
        if(thread == null){
            thread = new Thread(this, threadName);
            thread.start();
        }
    }
}
