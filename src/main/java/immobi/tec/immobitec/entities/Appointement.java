package immobi.tec.immobitec.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Appointement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_appointement;

    @Temporal(TemporalType.DATE)
    private Date date_appointement ;

    @ManyToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    private Service service;

}
