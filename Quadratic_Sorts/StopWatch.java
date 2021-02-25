package Quadratic_Sorts;

/**
 * A stopwatch accumulates time when it is running. You can repeatedly start and
 * stop the stopwatch. You can use a stopwatch to measure the running time of a
 * program.
 */

public class StopWatch {

    // variable
    private long elapsedTime;
    private long startTime;
    private boolean isRunning;
    private boolean nano;

    // constructor
    public StopWatch() {
        reset();
        this.nano = false;
    }

    public StopWatch(boolean nano) {
        reset();
        this.nano = nano;
    }

    // Starts the stopwatch. Time starts accumulating now.
    public void start() {
        if (isRunning)
            return;
        isRunning = true;
        if (nano) {
            startTime = System.nanoTime();
        } else {
            startTime = System.currentTimeMillis();
        }
    }

    // Stops the stopwatch. Time stops accumulating and
    // is added to the elapsed time.
    public void stop() {
        if (!isRunning)
            return;
        isRunning = false;
        if (nano) {
            elapsedTime = System.nanoTime() - startTime;
        } else {
            elapsedTime = System.currentTimeMillis() - startTime;
        }
    }

    // Returns the total elapsed time.
    // @return the total elapsed time
    public long getElapsedTime() {
        if (isRunning) {
            if (nano) {
                elapsedTime = System.nanoTime() - startTime;
            } else {
                elapsedTime = System.currentTimeMillis() - startTime;
            }
        }
        return elapsedTime;
    }

    // Stops the watch and resets the elapsed time to 0.
    public void reset() {
        elapsedTime = 0;
        isRunning = false;
    }
}
