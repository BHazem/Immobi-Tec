package immobi.tec.immobitec.controllers;


import immobi.tec.immobitec.entities.Property;
import immobi.tec.immobitec.services.IAnnouncement;
import immobi.tec.immobitec.services.IProperty;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class PropertyController {

    IProperty iProperty;


    @GetMapping("/getAllProperties")
    public List<Property> getAllProperties(){
        return  iProperty.getAllProperties();
    }

    @PostMapping("/addProperty")
    @ResponseBody
    public Property addProperty(@RequestBody Property p){
        return iProperty.addProperty(p);
    }

    @PutMapping("/updateProperty")
    @ResponseBody
    public Property updateProperty(@RequestBody Property p){
        return iProperty.updateProperty(p);
    }

    @DeleteMapping("/deleteProperty/{id}")
    public void deleteProperty(@PathVariable("id") int id){
        iProperty.deleteProperty(id);
    }

    @GetMapping("/getPropertyById/{id}")
    public Property getPropertyByID(@PathVariable("id") int id){
        return iProperty.getPropertyById(id);
    }



}
