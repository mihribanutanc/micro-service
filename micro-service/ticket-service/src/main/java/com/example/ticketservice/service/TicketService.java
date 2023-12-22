package com.example.ticketservice.service;

import com.example.ticketservice.model.Ticket;
import com.example.ticketservice.repository.TicketRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class TicketService {

    private TicketRepository ticketRepository;

    public Ticket create(Ticket ticket){

       return ticketRepository.save(ticket);
    }
}
