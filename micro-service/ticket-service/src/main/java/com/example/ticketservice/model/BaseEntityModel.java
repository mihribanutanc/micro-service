package com.example.ticketservice.model;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

@MappedSuperclass
public abstract class BaseEntityModel implements Serializable {

    @Column(name = "create_date", updatable = false)
    @CreationTimestamp
    protected LocalDateTime createDate;

    @Column(name = "update_date")
    @UpdateTimestamp
    protected LocalDateTime updateDate;
}
