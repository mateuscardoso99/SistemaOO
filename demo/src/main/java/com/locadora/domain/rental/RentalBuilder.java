package com.locadora.domain.rental;

import java.time.LocalDateTime;
import java.util.List;

import com.locadora.domain.customer.Customer;
import com.locadora.domain.enums.PaymentMethod;
import com.locadora.domain.media.Media;

public interface RentalBuilder {
    public RentalBuilder setStart(LocalDateTime start);
    public RentalBuilder setEnd(LocalDateTime end);
    public RentalBuilder setMedias(List<Media> medias);
    public RentalBuilder setPayment(PaymentMethod payment);
    public RentalBuilder setCustomer(Customer customer);
    public Rental build(); 
    public void reset();
} 