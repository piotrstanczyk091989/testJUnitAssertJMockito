package pl.javaps.p9b.model;

public class Statistic {
    private long success;
    private long failure;

    public long getSuccess() {
        return success;
    }

    public long getFailure() {
        return failure;
    }

    public void collect(boolean sent) {
        if (sent) {
            success++;
        } else {
            failure++;
        }
    }
}
