package com.example.ticketservice.mapper;


import com.example.ticketservice.dto.TicketDto;
import com.example.ticketservice.model.Ticket;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

@Mapper(componentModel = "spring", nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface TicketMapper {

    TicketDto toDto(Ticket ticket);

    Ticket toEntity(TicketDto ticketDto);
}
