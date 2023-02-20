package immobi.tec.immobitec.services;

import immobi.tec.immobitec.entities.Announcement;
import immobi.tec.immobitec.repositories.AnnouncementRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceAnnouncement implements IAnnouncement{

    AnnouncementRepository announcementRepository;


    @Override
    public Announcement getAnnouncementById(int id) {
        return announcementRepository.findById(id).orElse(null);
    }

    @Override
    public List<Announcement> getAllAnnouncements() {
        return announcementRepository.findAll();
    }

    @Override
    public Announcement addAnnouncement(Announcement a) {
        return announcementRepository.save(a);
    }

    @Override
    public Announcement updateAnnouncement(Announcement a) {
        return announcementRepository.save(a);
    }

    @Override
    public void deleteAnnouncement(int id) {
        announcementRepository.deleteById(id);
    }
}
