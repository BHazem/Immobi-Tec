package immobi.tec.immobitec.controllers;

import immobi.tec.immobitec.entities.Appointement;
import immobi.tec.immobitec.entities.Service;
import immobi.tec.immobitec.services.IAppointmentService;
import immobi.tec.immobitec.services.IServiceImp;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class ServicesController {

    IServiceImp iServiceImp;
    IAppointmentService iAppointmentService;


    @PostMapping("/addService")
    @ResponseBody
    public Service addService(@RequestBody Service service){
return iServiceImp.addService(service);
    }
    @DeleteMapping("/deleteService/{id}")
    @ResponseBody
    public void deleteService(@PathVariable("id") int id ){
        iServiceImp.deleteService(id);
    }

@PutMapping("/updateService")
@ResponseBody
    public Service updateService(@RequestBody Service service){return iServiceImp.updateService(service);}

    @GetMapping("/getAllService")
@ResponseBody
  public List<Service> getAllService(){return iServiceImp.getAllService();}
@PostMapping("/addAppointement")
@ResponseBody
public Appointement addAppointement(@RequestBody Appointement appointement){
        return iAppointmentService.addAppointement(appointement);
}
@DeleteMapping("/deleteAppointement/{id}")
@ResponseBody
public void deleteAppointement(@PathVariable("id") int id){iAppointmentService.deleteAppointement(id);}

    @PutMapping("/updateAppointement")
    @ResponseBody
    public Appointement updateAppointement(@RequestBody Appointement appointement){
        return iAppointmentService.updateAppointement(appointement);
    }
    @GetMapping("/getAllAppointement")
    @ResponseBody
    public List<Appointement> getAllAppointement(){return iAppointmentService.getAllAppointement();}



}
