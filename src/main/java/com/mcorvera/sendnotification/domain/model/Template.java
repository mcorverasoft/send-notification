package com.mcorvera.sendnotification.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "MISBHNPLANTILLA")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Template {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tempgenerator")
    @SequenceGenerator(name = "tempgenerator", sequenceName = "SEQPLANTILLA", allocationSize = 1)
    @Column(name = "BHNID")
    private Long id;
    @Column(name = "BHNCODIGO", unique = true)
    private String code;
    @Column(name="BHNPLANTILLA")
    private String templateMessage;
    @Column(name = "BHNFECHACREACION")
    private Instant date;
    @Column(name = "BHNFACTUALIZACION")
    private Instant update;
    @Column(name = "BHNCREADOPOR")
    private Long createdBy;
    @Column(name ="BHNACTUALIZADOPOR")
    private Long updatedBy;
    @Column(name = "BHNESTADO")
    private Integer status;

}
