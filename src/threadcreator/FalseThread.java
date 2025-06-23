package threadcreator;

import java.util.concurrent.TimeUnit;

public class FalseThread implements Runnable{

    SharedResource sharedResource;

    public FalseThread(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        long startTime = System.currentTimeMillis();
        while(true) {
            while (sharedResource.flag) {
                // busy wait (no sleep) to simulate CPU usage

            }
            System.out.println(Thread.currentThread().getName() + ": True Thread flips the flag ... I am out of loop");
            sharedResource.flag = true;
        }
    }
}
