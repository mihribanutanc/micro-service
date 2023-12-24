package com.example.ticketservice.service;

import com.example.ticketservice.dto.TicketDto;
import com.example.ticketservice.model.Ticket;
import com.example.ticketservice.repository.TicketRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TicketService {

    private TicketRepository ticketRepository;

    public Ticket save(Ticket ticket){

        return ticketRepository.save(ticket);
    };

    public TicketDto update(String id, TicketDto ticketDto){
        return null;
    };

    public TicketDto getById(String ticketId){
        return null;
    };

    public List<TicketDto> getTickets(){
        return null;
    };
}
