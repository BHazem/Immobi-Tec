package immobi.tec.immobitec.services;

import immobi.tec.immobitec.entities.DormRoom;

import java.util.List;

public interface IDormRoomService {



    public DormRoom addDormRoom(DormRoom d);
    public List<DormRoom> getAllRooms();
    public DormRoom getRoomById(int id);
    public DormRoom updateDormRoom(DormRoom d);
    public void deleteDormRoom(int id);




}
