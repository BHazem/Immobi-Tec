package immobi.tec.immobitec.entities;

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
public class Announcement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_announcement;

    private float price;
    private Boolean boosted ;

    @Enumerated(EnumType.STRING)
    private TypeAnnouncement type ;

    @OneToOne(mappedBy = "announcement",cascade = CascadeType.ALL)
    private Property property;

}
