package hipotecario.com.sv.sendnotification.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "MISBHNTRANSACCIONES")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "transGenerator")
    @SequenceGenerator(name = "transGenerator", sequenceName = "SEQTRANSACCION", allocationSize = 1)
    @Column(name = "BHNTID")
    private Long id;
    @Column(name = "BHNFECHA")
    private Instant date;
    @Column(name="BHNIDPLANTILLA")
    private Long idTemplate;
    @Column(name = "BHNREQUEST")
    private String request;
    @Column(name="BHNRESPONSE")
    private String response;
    @Column(name = "BHNESTADO")
    private String status;
}
