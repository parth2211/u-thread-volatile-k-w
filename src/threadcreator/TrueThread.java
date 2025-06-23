package threadcreator;

import java.util.concurrent.TimeUnit;

public class TrueThread implements Runnable{

    SharedResource sharedResource;

    public TrueThread(SharedResource sharedResource) {
        this.sharedResource = sharedResource;
    }

    @Override
    public void run() {
        while(!sharedResource.flag) {
//            try {
//                TimeUnit.MILLISECONDS.sleep(50);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
        }
        System.out.println(Thread.currentThread().getName() + ": False Thread flips the flag ... I am out of loop");
        sharedResource.flag = false;
    }
}
