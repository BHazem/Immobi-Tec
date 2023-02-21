package immobi.tec.immobitec.services;


import immobi.tec.immobitec.entities.Auction;
import immobi.tec.immobitec.entities.Mise;

import java.util.List;

public interface IAuction {
    public Auction addAction(Auction a);
    public List<Auction> getAllAuctions();
    public Auction getAuctionByid(int id_auction);
    public void deleteAuction(int id_auction);
    public Auction updateAuction(Auction a);

    public List<Auction> findAuctionWithHighestBid();




    public Mise addMiseToAuction(int idAuction , Mise mise);
    public List<Mise> getAllMise();


}
