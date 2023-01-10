package deamon;

public class Main {
    public static void main (String[] args) {
        Thread thread = new Thread();
        thread.setDaemon(true);
        System.out.println(thread.isDaemon());
        System.out.println(thread.isAlive());
        System.out.println(thread.getName());
        System.out.println(thread.getPriority());
        System.out.println(thread.getState());
        System.out.println(thread.getContextClassLoader());
        System.out.println(thread.hashCode());
        System.out.println(thread.getClass());
        System.out.println(thread.getThreadGroup());
        System.out.println(thread.getUncaughtExceptionHandler());
        System.out.println(thread.isInterrupted());

        thread.start();

    }
}
