package immobi.tec.immobitec.services;


import immobi.tec.immobitec.repositories.AuctionRepo;
import immobi.tec.immobitec.entities.Auction;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AuctionImp implements IAuction {
 AuctionRepo auctionRepo ;


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
}
