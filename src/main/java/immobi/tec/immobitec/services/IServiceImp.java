package immobi.tec.immobitec.services;

import immobi.tec.immobitec.entities.Service;

import java.util.List;

public interface IServiceImp {
    public Service addService(Service service);
    public void deleteService(int id);
    public Service updateService(Service service);
    public List<Service>getAllService();






}
