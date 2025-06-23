import threadcreator.FalseThread;
import threadcreator.SharedResource;
import threadcreator.TrueThread;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource(true);

        Thread falseThread = new Thread(new FalseThread(sharedResource), "FalseThread");
        Thread trueThread = new Thread(new TrueThread(sharedResource), "TrueThread");

        falseThread.start();
        trueThread.start();
    }
}