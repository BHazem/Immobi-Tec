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
public class Post implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_post;

    private String description ;
    private int likes ;
    private int dislikes ;
    @Temporal(TemporalType.DATE)
    private Date date_post ;
    private String Picture ;


    @ManyToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    private AppUser user;

    @ManyToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    private Forum forum;

    @OneToMany(mappedBy = "post",cascade = CascadeType.ALL)
    @JsonIgnore
    Set<Comment> comments;
}
