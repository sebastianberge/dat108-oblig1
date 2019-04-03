package no.hvl.dat108;

import java.util.LinkedList;

public class Buffer {

    private final static int SIZE = 10;
    private LinkedList<Integer> buffer = new LinkedList<Integer>();

    /**
     * Add a new item to the buffer. If the buffer is full, wait.
     *
     * @param item the new item
     */
    public void add(Integer item) {
        while (true) {
            if (buffer.size() == SIZE) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            buffer.add(item);
            notifyAll();
            return;
        }
    }

    /**
     * Remove next available item from the buffer. If the buffer is empty, wait.
     *
     * @return next item
     */
    public Integer remove() {
        while (true) {
            if (buffer.size() == 0) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            Integer back = buffer.removeFirst();
            notifyAll();
            return back;
        }
    }

}
