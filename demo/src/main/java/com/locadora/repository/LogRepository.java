package com.locadora.repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import com.locadora.domain.log.Log;

public class LogRepository {
    private static int id;
    private static LogRepository instance;
    private final List<Log> logs;

    private LogRepository() {
        this.logs = new ArrayList<>();
        id = 0;
    }

    public static LogRepository getInstance() {
        if (instance == null) {
            instance = new LogRepository();
        }
        return instance;
    }

    public void register(String message) {
        String formatted = "[" + LocalDateTime.now() + "] " + message;
        id++;
        logs.add(new Log(id, formatted));
    }

    public List<Log> getLogs() {
        return logs;
    }
}
