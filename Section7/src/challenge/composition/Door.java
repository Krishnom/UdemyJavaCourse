package challenge.composition;

import examples.composition.Dimension;

public class Door {
    private Dimension dimension;
    private String color;
    private Lock lock;

    public Door(Dimension dimension, String color, Lock lock) {
        this.dimension = dimension;
        this.color = color;
        this.lock = lock;
    }

    public void unlock() {
        lock.unlock();
    }
}
