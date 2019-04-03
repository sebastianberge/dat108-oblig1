package no.hvl.dat108;

public class Consumer extends Thread {

    private Buffer buffer;

    /**
     * Constructs a new consumer.
     *
     * @param buffer The shared buffer
     */
    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            Integer item = buffer.remove();
            System.out.println("Consumed: " + item);
            try {
                sleep(50);
            } catch (InterruptedException e) {
                // ignore
            }
        }
    }

}
