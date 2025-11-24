package com.locadora.service;

import java.util.ArrayList;
import java.util.List;

public class EventManager {
    private final List<EventListener> listeners = new ArrayList<>();

    public void register(EventListener eventListener){
        this.listeners.add(eventListener);
    }

    public void unRegister(EventListener eventListener){
        this.listeners.remove(eventListener);
    }
    
    public void notify(String msg){
        System.out.println("--- ENVIANDO NOTIFICAÇÃO ---");
        for (EventListener listener : listeners) {
            listener.update(msg);
        }
    }
}
