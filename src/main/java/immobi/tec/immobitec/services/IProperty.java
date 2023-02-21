package immobi.tec.immobitec.services;

import immobi.tec.immobitec.entities.Property;

import java.util.List;

public interface IProperty {

    public Property getPropertyById(int id);

    public List<Property> getAllProperties();

    public Property addProperty(Property p);

    public Property updateProperty(Property p);

    public void deleteProperty(int id);
}
