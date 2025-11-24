package com.locadora.config;

import java.util.List;

import com.locadora.domain.customer.Customer;
import com.locadora.domain.enums.MediaCategory;
import com.locadora.domain.media.BookFactory;
import com.locadora.domain.media.CDFactory;
import com.locadora.domain.media.ConcretMediaRequestBuilder;
import com.locadora.domain.media.MediaRequest;
import com.locadora.service.CustomerService;
import com.locadora.service.MediaService;

public class DataSeed {

    public static void initializerMedia(MediaService service){

        ConcretMediaRequestBuilder builder = new ConcretMediaRequestBuilder();
        
        BookFactory bookFactory = new BookFactory();
        CDFactory cdFactory = new CDFactory();

        List<String[]> mediaCDs = DataReaderCSV.readCSV("cds.csv");
        List<String[]> mediaBooks = DataReaderCSV.readCSV("books.csv");
        
        for (String[] tokens : mediaBooks) {
            try {
                String title = tokens[0];
                MediaCategory category = MediaCategory.valueOf(tokens[1]);
                Double price = Double.parseDouble(tokens[2]);
                int quantity = Integer.parseInt(tokens[3]);
                int pages = Integer.parseInt(tokens[4]);

                MediaRequest request = builder
                    .setCategory(category)
                    .setPages(pages)
                    .setQuantity(quantity)
                    .setPrice(price)
                    .setTitle(title)
                    .build();
                
                service.addMedia(bookFactory.create(request));
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage() + " " + e.getCause());
            }
        }

        for (String[] tokens : mediaCDs) {
            try {
                String title = tokens[0];
                MediaCategory category = MediaCategory.valueOf(tokens[1]);
                Double price = Double.parseDouble(tokens[2]);
                int quantity = Integer.parseInt(tokens[3]);
                int durationMinutes = Integer.parseInt(tokens[4]);

                MediaRequest request = builder
                    .setCategory(category)
                    .setDurationMinutes(durationMinutes)
                    .setQuantity(quantity)
                    .setPrice(price)
                    .setTitle(title)
                    .build();
                
                service.addMedia(cdFactory.create(request));
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage() + " " + e.getCause());
            }
        }
    }

    public static void initializerCustomers(CustomerService service){
        service.addCustomer(new Customer("Jonas", "jonas@email.com", "55911"));
        service.addCustomer(new Customer("Marcos", "marcos@email.com", "55922"));
        service.addCustomer(new Customer("Matheus", "matheus@email.com", "55933"));
    }
}
