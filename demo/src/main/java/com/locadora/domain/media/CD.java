package com.locadora.domain.media;

public class CD extends Media{
    private int durationMinutes;

    public CD(String title, double price, int quantity, MediaCategory category, int durationMinutes) {
        super(title, price, quantity, category);
        this.durationMinutes = durationMinutes;
    }

    public int getDurationMinutes() { return durationMinutes; }
    public void setDurationMinutes(int durationMinutes) { this.durationMinutes = durationMinutes; }

    @Override
    public String toString(){
        return 
            "Midia: CD" +
            super.toString() +
            "\nduration: " + durationMinutes + "min\n";
    }
}
