package immobi.tec.immobitec.services;

import immobi.tec.immobitec.entities.Appointement;
import immobi.tec.immobitec.entities.Service;

import java.util.List;

public interface IAppointmentService {
    public Appointement addAppointement(Appointement appointement);
    public void deleteAppointement(int id);
    public Appointement updateAppointement(Appointement appointement);
    public List<Appointement> getAllAppointement();

}
