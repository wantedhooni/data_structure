package utils;

public class StopWatch {
    private String name;
    private long startTime = 0;

    public StopWatch(String name) {
        System.out.println(String.format("[START] %s", name));
        this.name = name;
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        System.out.println(String.format("[END] %.5f초", ((System.currentTimeMillis() - startTime) / 1000.0) % 60.0));
    }
}
