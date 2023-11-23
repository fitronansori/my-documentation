package belajar.classes.com.classes;

public class RuntimeApp {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("Available Processors: " + runtime.availableProcessors());
        System.out.println("Free Memory: " + runtime.freeMemory());
        System.out.println("Total Memory: " + runtime.totalMemory());
        System.out.println("Max Memory: " + runtime.maxMemory());
    }
}
