package com.locadora.service;

import java.util.List;

import com.locadora.domain.log.Log;
import com.locadora.repository.LogRepository;

public class LogService {
    private static LogService instance;
    private final LogRepository repository;

    private LogService(){
        repository = LogRepository.getInstance();
    }

    public static LogService getInstance(){
        if(instance == null){
            instance = new LogService();
        }
        return instance;
    }

    public void addLog(String message){
        repository.register(message);
    }

    public List<Log> findAll(){
        return repository.getLogs();
    }
}
