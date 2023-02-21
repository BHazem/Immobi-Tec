package immobi.tec.immobitec.controllers;


import immobi.tec.immobitec.entities.Mise;
import immobi.tec.immobitec.services.IAuction;
import immobi.tec.immobitec.entities.Auction;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class AuctionController {

    IAuction iAuction;

    @PostMapping("/addAuction")
    @ResponseBody
    public Auction addAuction(@RequestBody Auction a){
        return iAuction.addAction(a);
    }


    @GetMapping("/getAllAuction")
    public List<Auction> getAllAuction(){
        return iAuction.getAllAuctions();
    }



    @GetMapping("/getAuctionByid/{id_auction}")
    public Auction getAuctionByid(@PathVariable("id_auction") int id_auction)
    {
        return iAuction.getAuctionByid(id_auction);
    }


    @DeleteMapping("/deleteAuction/{id_auction}")
    public void deleteAuction(@PathVariable int id_auction){
        iAuction.deleteAuction(id_auction);
    }



    @PutMapping("/updateAuction")
    public Auction updateAuction(@RequestBody Auction auction)
    {
        iAuction.updateAuction(auction);
        return auction;
    }


    @PostMapping("/{auctionId}/mise")
    public ResponseEntity<Mise> addmiseToAuction(@PathVariable("auctionId") int idAuction, @RequestBody Mise mise) {
        Mise savedMise = iAuction.addMiseToAuction( idAuction,mise);
        return new ResponseEntity<>(savedMise, HttpStatus.CREATED);
    }

    @GetMapping("/getAllMise")
    public List<Mise> getAllMIse(){
        return iAuction.getAllMise();
    }


    @GetMapping("/highestBid")
    public List<Auction> findAuctionWithHighestBid() {
        List<Auction> auction = iAuction.findAuctionWithHighestBid();
       return auction;
    }

}






