package com.example.donkeykong;

public class Time {
    public static long delta = 0;
    public static int fps = 0;

    public static int fpsCount;
    public static long fpsTime;
    public static long lastTime = System.currentTimeMillis();

    public static void update() {
        long currentTime = System.currentTimeMillis();
        delta = currentTime - lastTime;
        fpsTime += delta;
        if (fpsTime > 1000) {
            fps = fpsCount;
            fpsTime = fpsCount = 0;
        } else {
            fpsCount++;
        }
        lastTime = currentTime;
    }

}
