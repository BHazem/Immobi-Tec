package immobi.tec.immobitec.repositories;

import immobi.tec.immobitec.entities.Auction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AuctionRepo extends JpaRepository<Auction,Integer> {
   /*  @Query("SELECT a FROM Auction a JOIN a.mises m WHERE m.montant = (SELECT max (m.montant) FROM Mise m JOIN a.mises)")
    */
   @Query("SELECT a FROM Auction a JOIN FETCH a.mises m WHERE m.montant = (SELECT MAX(m2.montant) FROM Mise m2 WHERE m2.auction.id_auction = a.id_auction)")

   List<Auction> findAuctionWithHighestBid();

}
