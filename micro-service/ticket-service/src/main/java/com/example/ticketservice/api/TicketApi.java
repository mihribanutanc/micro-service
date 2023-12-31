package com.example.ticketservice.api;

import com.example.ticketservice.dto.TicketDto;
import com.example.ticketservice.model.Ticket;
import com.example.ticketservice.service.TicketService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/ticket")
public class TicketApi {

    private TicketService ticketService;

    @PostMapping
    public TicketDto create(@RequestBody TicketDto ticketDto){
        return ticketService.save(ticketDto);
    }

}
