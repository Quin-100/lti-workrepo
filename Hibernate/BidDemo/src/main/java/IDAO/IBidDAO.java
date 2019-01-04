package IDAO;

import java.util.List;

import model.Bid;

public interface IBidDAO {
	

	public  void addBid(Bid dep);
	public void updateBid(Bid dep,int bidId);
	public void deleteBid(int bidId);
	public  List<Bid> allBid();
	public Bid allBidById(int bidId);
	
	

}
