package immobi.tec.immobitec.services;

import immobi.tec.immobitec.entities.Appointement;
import immobi.tec.immobitec.repositories.AppointmentRepository;
import lombok.AllArgsConstructor;

import java.util.List;

@org.springframework.stereotype.Service
@AllArgsConstructor
public class AppointmentServiceImp implements IAppointmentService {
    AppointmentRepository appointmentRepository;

    @Override
    public Appointement addAppointement(Appointement appointement) {
        return appointmentRepository.save(appointement);
    }

    @Override
    public void deleteAppointement(int id) {
         appointmentRepository.deleteById(id);

    }

    @Override
    public Appointement updateAppointement(Appointement appointement) {
        return appointmentRepository.save(appointement);
    }

    @Override
    public List<Appointement> getAllAppointement() {
        return appointmentRepository.findAll();
    }
}
