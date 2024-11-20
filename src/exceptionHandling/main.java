package exceptionHandling;

public class main {
    public static void main(String[] args) {
        System.out.println("Starting main");
        CallStack c = new CallStack();
        System.out.println("Calling method A");
        c.methodA();
        System.out.println("main done. Callstack done:");
    }
}
