package com.locadora.domain.rental;

import java.time.LocalDateTime;
import java.util.List;

import com.locadora.domain.customer.Customer;
import com.locadora.domain.enums.PaymentMethod;
import com.locadora.domain.media.Media;

// classe que representa a locação de medias com o padrão builder
// cada cliente tem uma lista de locações
public class Rental {
    private LocalDateTime start;
    private LocalDateTime end;
    private List<Media> medias;
    private PaymentMethod payment;
    private RentalStatus status;
    private Customer customer; // 1 -> *

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

    public PaymentMethod getPayment() {
        return payment;
    }
    
    public void setPayment(PaymentMethod payment) {
        this.payment = payment;
    }

    public void setStatus(RentalStatus status){
        this.status=status;
    }

    public RentalStatus getStatus(){
        return this.status;
    }

    public Customer getCustomer() {
         return customer;
    }

    public void setCustomer(Customer customer) {
         this.customer = customer;
    }

     @Override
    public String toString() {
        return "Rental:" +
                "\n\temail_cliente: " + customer.getEmail() + "," +
                "\n\tstart: " + start + "," +
                "\n\tend: " + end + "," +
                "\n\tmedias:" + medias.size() + "," +
                "\n\tpayment: " + payment;
    }
}
