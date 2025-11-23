package com.locadora.domain.rental;

import java.time.LocalDateTime;
import java.util.List;

import com.locadora.domain.media.Media;

// classe que representa a locação de medias com o padrão builder
// cada cliente tem uma lista de locações
public class Rental {
    private LocalDateTime start;
    private LocalDateTime end;
    private List<Media> medias;
    private Payment payment;
    private RentalStatus status;

    public Rental(){}

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public LocalDateTime getEnd() {
        return end;
    }

    public void setEnd(LocalDateTime end) {
        this.end = end;
    }

    public List<Media> getMedias() {
        return medias;
    }

    public void setMedias(List<Media> medias) {
        this.medias = medias;
    }

    public Payment getPayment() {
        return payment;
    }
    
    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public void setStatus(RentalStatus status){
        this.status=status;
    }

    public RentalStatus getStatus(){
        return this.status;
    }

     @Override
    public String toString() {
        return "Rental{" +
                "\nstart: " + start + "," +
                "\nend: " + end + "," +
                "\nmedias:" + medias.size() + "," +
                "\npayment: " + payment +
                "\n}";
    }
}
