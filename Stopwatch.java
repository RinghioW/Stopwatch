
public class Stopwatch {

    private long start;
    private long delta = 0;
    private boolean running = false;

    public void start(){
        if(!running) {
            running = true;
            start = System.nanoTime() - delta;
        }
    }

    public void stop(){
        if(running) {
            delta = System.nanoTime() - start;
            running = false;
        }
    }

    public void reset(){
        running = false;
        delta = 0;
    }

    public long elapsedTime(){
        return running? System.nanoTime() - start : delta;
    }

}

