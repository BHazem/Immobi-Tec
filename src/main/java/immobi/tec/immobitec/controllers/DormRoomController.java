package immobi.tec.immobitec.controllers;

import immobi.tec.immobitec.entities.DormRoom;
import immobi.tec.immobitec.services.IDormRoomService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class DormRoomController {
    IDormRoomService iDormRoomService;

    @PostMapping("/addDormRoom")
    @ResponseBody
    public DormRoom addDormRoom(@RequestBody DormRoom d){
        return iDormRoomService.addDormRoom(d);
    }


    @GetMapping("/getAllRooms")
    public List<DormRoom> getAllRooms(){
        return iDormRoomService.getAllRooms();
    }

    @GetMapping("/getRoomById/{id}")
    public DormRoom getRoomById(@PathVariable("id") int id){
        return iDormRoomService.getRoomById(id);
    }

    @PutMapping("/updateDormRoom")
    @ResponseBody
    public DormRoom updateDormRoom(@RequestBody DormRoom d){
        return iDormRoomService.updateDormRoom(d);
    }
    @DeleteMapping("/deleteDormRoom/{id}")
    public void deleteDormRoom(@PathVariable("id") int id){
        iDormRoomService.deleteDormRoom(id);
    }



}
