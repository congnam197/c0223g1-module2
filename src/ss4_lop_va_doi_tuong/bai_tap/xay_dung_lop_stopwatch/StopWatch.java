package ss4_lop_va_doi_tuong.bai_tap.xay_dung_lop_stopwatch;

import java.time.LocalTime;

public class StopWatch {

    private long starTime, endTime;

    public StopWatch(long starTime, long endTime) {
        this.starTime = starTime;
        this.endTime = endTime;
    }

    public long getStarTime() {
        return starTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public StopWatch() {
        this.starTime = System.currentTimeMillis();
    }

    public void start() {
        this.starTime = System.currentTimeMillis();
    }

    public void end() {
        this.endTime = System.currentTimeMillis();
    }

    public long getElapsedTime() {
        return this.endTime - this.starTime;

    }
}
