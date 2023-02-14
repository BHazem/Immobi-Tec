package immobi.tec.immobitec.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;


@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Role implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Role;

    private String name ;
    private String function ;

    @OneToMany(mappedBy = "role",cascade = CascadeType.ALL)
    @JsonIgnore
    Set<User> users;
}
