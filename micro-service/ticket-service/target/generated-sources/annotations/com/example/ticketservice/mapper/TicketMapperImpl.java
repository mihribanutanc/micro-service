package com.example.ticketservice.mapper;

import com.example.ticketservice.dto.TicketDto;
import com.example.ticketservice.dto.TicketDto.TicketDtoBuilder;
import com.example.ticketservice.model.PriorityType;
import com.example.ticketservice.model.Ticket;
import com.example.ticketservice.model.Ticket.TicketBuilder;
import com.example.ticketservice.model.TicketStatus;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-28T13:24:00+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 17.0.9 (Amazon.com Inc.)"
)
@Component
public class TicketMapperImpl implements TicketMapper {

    @Override
    public TicketDto toDto(Ticket ticket) {
        if ( ticket == null ) {
            return null;
        }

        TicketDtoBuilder ticketDto = TicketDto.builder();

        if ( ticket.getDescription() != null ) {
            ticketDto.description( ticket.getDescription() );
        }
        if ( ticket.getNotes() != null ) {
            ticketDto.notes( ticket.getNotes() );
        }
        if ( ticket.getAssignee() != null ) {
            ticketDto.assignee( ticket.getAssignee() );
        }
        if ( ticket.getTicketDate() != null ) {
            ticketDto.ticketDate( ticket.getTicketDate() );
        }
        if ( ticket.getPriorityType() != null ) {
            ticketDto.priorityType( ticket.getPriorityType().name() );
        }
        if ( ticket.getTicketStatus() != null ) {
            ticketDto.ticketStatus( ticket.getTicketStatus().name() );
        }

        return ticketDto.build();
    }

    @Override
    public Ticket toEntity(TicketDto ticketDto) {
        if ( ticketDto == null ) {
            return null;
        }

        TicketBuilder ticket = Ticket.builder();

        if ( ticketDto.getDescription() != null ) {
            ticket.description( ticketDto.getDescription() );
        }
        if ( ticketDto.getNotes() != null ) {
            ticket.notes( ticketDto.getNotes() );
        }
        if ( ticketDto.getAssignee() != null ) {
            ticket.assignee( ticketDto.getAssignee() );
        }
        if ( ticketDto.getTicketDate() != null ) {
            ticket.ticketDate( ticketDto.getTicketDate() );
        }
        if ( ticketDto.getPriorityType() != null ) {
            ticket.priorityType( Enum.valueOf( PriorityType.class, ticketDto.getPriorityType() ) );
        }
        if ( ticketDto.getTicketStatus() != null ) {
            ticket.ticketStatus( Enum.valueOf( TicketStatus.class, ticketDto.getTicketStatus() ) );
        }

        return ticket.build();
    }
}
