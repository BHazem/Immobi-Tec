package immobi.tec.immobitec.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;


@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Service implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_service;

    private String title ;
    private String description ;
    private float price ;
    private String Picture ;


    @ManyToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    private User user;

    @OneToMany(mappedBy = "service",cascade = CascadeType.ALL)
    @JsonIgnore
    Set<Appointement> appointements;
}
