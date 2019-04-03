package no.hvl.dat108;

import java.util.Random;

public class Producer extends Thread {

    private Buffer buffer;
    Random rand = new Random();

    /**
     * Constructs a new producer.
     *
     * @param buffer The shared buffer
     */
    public Producer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            Integer item = rand.nextInt(100);
            buffer.add(item);
            System.out.println("Produced: " + item);
            try {
                sleep(50);
            } catch (InterruptedException e) {
                // ignore
            }
        }
    }
}
