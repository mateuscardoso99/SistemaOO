package com.locadora.domain.log;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Log {
    private static Log instance;
    private final List<String> logs;

    private Log() {
        this.logs = new ArrayList<>();
    }

    public static Log getInstance() {
        if (instance == null) {
            instance = new Log();
        }
        return instance;
    }

    public void register(String message) {
        String formatted = "[" + LocalDateTime.now() + "] " + message;
        logs.add(formatted);
    }

    public List<String> getLogs() {
        return logs;
    }

    public void printAll() {
        logs.forEach(System.out::println);
    }
}
