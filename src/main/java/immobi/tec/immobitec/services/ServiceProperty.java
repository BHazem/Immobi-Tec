package immobi.tec.immobitec.services;

import immobi.tec.immobitec.entities.Property;
import immobi.tec.immobitec.repositories.PropertyRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ServiceProperty implements IProperty{

    PropertyRepository propertyRepository;

    @Override
    public Property getPropertyById(int id) {
        return propertyRepository.findById(id).orElse(null);
    }

    @Override
    public List<Property> getAllProperties() {
        return propertyRepository.findAll();
    }

    @Override
    public Property addProperty(Property p) {
        return propertyRepository.save(p);
    }

    @Override
    public Property updateProperty(Property p) {
        return propertyRepository.save(p);
    }

    @Override
    public void deleteProperty(int id) {
        propertyRepository.deleteById(id);
    }
}
