package immobi.tec.immobitec.services;

import immobi.tec.immobitec.entities.Service;
import immobi.tec.immobitec.repositories.ServiceRepository;
import lombok.AllArgsConstructor;

import java.util.List;

@org.springframework.stereotype.Service
@AllArgsConstructor
public class ServicesServiceImp implements IServiceImp{

    ServiceRepository serviceRepository;
    @Override
    public Service addService(Service service) {
        return serviceRepository.save(service);
    }

    @Override
    public void deleteService(int id) {
        serviceRepository.deleteById(id);

    }

    @Override
    public Service updateService(Service service) {
        return serviceRepository.save(service);
    }

    @Override
    public List<Service> getAllService() {
        return serviceRepository.findAll();
    }


}
