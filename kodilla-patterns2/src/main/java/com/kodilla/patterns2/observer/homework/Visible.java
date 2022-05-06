package com.kodilla.patterns2.observer.homework;

public interface Visible {
    void registerWatcher (Watcher watcher);
    void notifyWatcher();
    void removeWatcher(Watcher watcher);

}
