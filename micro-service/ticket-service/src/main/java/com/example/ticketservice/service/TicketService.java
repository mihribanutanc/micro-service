package com.example.ticketservice.service;

import com.example.ticketservice.dto.TicketDto;
import com.example.ticketservice.mapper.TicketMapper;
import com.example.ticketservice.model.Ticket;
import com.example.ticketservice.repository.TicketRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TicketService {

    private final TicketRepository ticketRepository;

    private final TicketMapper ticketMapper;

    public TicketDto save(TicketDto ticketDto){
        Ticket ticket = ticketMapper.toEntity(ticketDto);
        Ticket savedTicket = ticketRepository.save(ticket);
        return ticketMapper.toDto(savedTicket);
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
