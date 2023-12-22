package com.example.ticketservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Ticket {


    @Id
    private String id = UUID.randomUUID().toString();


    private String description;

    private String notes;

    private String assignee;


    private Date ticketDate;


}
