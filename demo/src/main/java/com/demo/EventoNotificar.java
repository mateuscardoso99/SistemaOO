package com.demo;
public enum EventoNotificar {
    NOVO_FILME("Novo filme"),
    FILME_DEVOLVIDO("Filme devolvido");

    private String value;

    private EventoNotificar(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}