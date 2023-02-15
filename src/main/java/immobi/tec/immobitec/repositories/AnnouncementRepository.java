package immobi.tec.immobitec.repositories;

import immobi.tec.immobitec.entities.Announcement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnnouncementRepository extends JpaRepository<Announcement,Integer> {
}
