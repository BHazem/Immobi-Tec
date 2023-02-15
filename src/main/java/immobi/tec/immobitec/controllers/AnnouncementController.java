package immobi.tec.immobitec.controllers;

import immobi.tec.immobitec.entities.Announcement;
import immobi.tec.immobitec.entities.Property;
import immobi.tec.immobitec.services.IAnnouncement;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class AnnouncementController {

    IAnnouncement iAnnouncement;

    @GetMapping("/getAllAnnouncements")
    public List<Announcement> getAllAnnouncements(){
        return  iAnnouncement.getAllAnnouncements();
    }

    @PostMapping("/addAnnouncement")
    @ResponseBody
    public Announcement addAnnouncement(@RequestBody Announcement a){
        return iAnnouncement.addAnnouncement(a);
    }

    @PutMapping("/updateAnnouncement")
    @ResponseBody
    public Announcement updateAnnouncement(@RequestBody Announcement a){
        return iAnnouncement.updateAnnouncement(a);
    }

    @DeleteMapping("/deleteAnnouncement/{id}")
    public void deleteAnnouncement(@PathVariable("id") int id){
        iAnnouncement.deleteAnnouncement(id);
    }

    @GetMapping("/getAnnouncementById/{id}")
    public Announcement getAnnouncementByID(@PathVariable("id") int id){
        return iAnnouncement.getAnnouncementById(id);
    }
}
