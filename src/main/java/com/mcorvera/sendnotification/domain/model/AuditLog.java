package com.mcorvera.sendnotification.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "MISBHNLOG")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuditLog {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "logGenerator")
    @SequenceGenerator(name = "logGenerator", sequenceName = "SEQLOG", allocationSize = 1)
    @Column(name = "BHNID")
    private Long id;
    @Column(name = "BHNIDTRANSACCION")
    private Long idTemplate;
    @Column(name = "BHNFECHA")
    private Instant date;
    @Column(name="BHNMENSAJEERROR")
    private String exception;
    @Column(name="BHNSTACKTRACE")
    private String stackTrace;
}
