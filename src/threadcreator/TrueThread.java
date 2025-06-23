package threadcreator;

import java.util.concurrent.TimeUnit;

public class TrueThread implements Runnable{

    SharedResource sharedResource;

    public TrueThread(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        while (true) {
            long startTime = System.currentTimeMillis();
            while (!sharedResource.flag) {
                // busy wait (no sleep) to simulate CPU usage

            }
            System.out.println(Thread.currentThread().getName() + ": False Thread flips the flag ... I am out of loop");
            sharedResource.flag = false;
        }
    }
}
