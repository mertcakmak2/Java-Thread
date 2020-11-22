public class Main {

    public static void main(String[] args) {
	    ThreadDemo thread1 = new ThreadDemo("thread1");
        ThreadDemo thread2 = new ThreadDemo("thread2");
        ThreadDemo thread3 = new ThreadDemo("thread3");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
