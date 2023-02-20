package immobi.tec.immobitec.repositories;

import immobi.tec.immobitec.entities.Forum;
import immobi.tec.immobitec.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Integer> {
}
