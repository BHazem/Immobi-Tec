package immobi.tec.immobitec.services;

import immobi.tec.immobitec.entities.Announcement;

import java.util.List;

public interface IAnnouncement {

    public Announcement getAnnouncementById(int id);

    public List<Announcement> getAllAnnouncements();

    public Announcement addAnnouncement(Announcement a);

    public Announcement updateAnnouncement(Announcement a);

    public void deleteAnnouncement(int id);
}
