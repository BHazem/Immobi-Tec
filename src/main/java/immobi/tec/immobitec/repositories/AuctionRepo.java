package immobi.tec.immobitec.repositories;

import immobi.tec.immobitec.entities.Auction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuctionRepo extends JpaRepository<Auction,Integer> {

}
