package immobi.tec.immobitec.repositories;

import immobi.tec.immobitec.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

public interface UserRepository extends JpaRepository<User,Integer>{
    @Modifying
    @Transactional
    @Query("delete From User u where u.id_user=:idUser")
    void DeleteUser(@Param("idUser") int idUser );
}
