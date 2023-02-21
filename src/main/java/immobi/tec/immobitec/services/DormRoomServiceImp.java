package immobi.tec.immobitec.services;

import immobi.tec.immobitec.entities.DormRoom;
import immobi.tec.immobitec.repositories.DormRoomRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class DormRoomServiceImp implements IDormRoomService {
    DormRoomRepository dormRoomRepository;


    @Override
    public DormRoom addDormRoom(DormRoom d) {
        return dormRoomRepository.save(d);
    }

    @Override
    public List<DormRoom> getAllRooms() {
        return dormRoomRepository.findAll();
    }

    @Override
    public DormRoom getRoomById(int id) {
        return dormRoomRepository.findById(id).orElse(null);
    }

    @Override
    public DormRoom updateDormRoom(DormRoom d) {
        return dormRoomRepository.save(d);
    }

    @Override
    public void deleteDormRoom(int id) {
        dormRoomRepository.deleteById(id);
    }


}
