package immobi.tec.immobitec.services;


import immobi.tec.immobitec.entities.Mise;
import immobi.tec.immobitec.repositories.AuctionRepo;
import immobi.tec.immobitec.entities.Auction;
import immobi.tec.immobitec.repositories.MiseRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class AuctionImp implements IAuction {
 AuctionRepo auctionRepo ;
MiseRepo miseRepo ;

    @Override
    public Auction addAction(Auction a) {
        return auctionRepo.save(a);
    }

    @Override
    public List<Auction> getAllAuctions() {
        return auctionRepo.findAll();
    }

    @Override
    public Auction getAuctionByid(int id_auction) {
        return auctionRepo.findById(id_auction).orElse(null);
    }

    @Override
    public void deleteAuction(int id_auction) {
     auctionRepo.deleteById(id_auction);
    }

    @Override
    public Auction updateAuction(Auction a) {
        return auctionRepo.save(a);
    }

    @Override
    public List<Auction> findAuctionWithHighestBid() {
         List<Auction>   a = auctionRepo.findAuctionWithHighestBid();
         return a;
    }



    @Override
    public Mise addMiseToAuction(int idAuction, Mise mise)  {
        Optional<Auction> AuctionOptional = auctionRepo.findById(idAuction);
        AuctionOptional.isPresent();
            Auction auction = AuctionOptional.get();
            mise.setAuction(auction);
            return miseRepo.save(mise);

    }

    @Override
    public List<Mise> getAllMise() {
        return miseRepo.findAll();
    }

}
