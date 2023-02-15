package immobi.tec.immobitec.repositories;

import immobi.tec.immobitec.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer>{
}
