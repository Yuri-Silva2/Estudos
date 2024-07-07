package org.yuri;

public class Generics<T> {

    private T content;

    public void put(T content) {
        this.content = content;
    }

    public T get() {
        return content;
    }
}
