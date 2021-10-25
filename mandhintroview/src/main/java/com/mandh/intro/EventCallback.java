package com.mandh.intro;

public interface EventCallback<T> {
    /**
     * Method which will be called on event.
     *
     * @param data T
     */
    public void onEvent(T data);
}
