package threadcreator;

public class SharedResource {
    volatile boolean flag;

    public SharedResource(boolean flag) {
        this.flag = flag;
    }
}
