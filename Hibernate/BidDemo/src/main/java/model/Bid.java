package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Bid {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="bid_seq")
	@SequenceGenerator(name="bid_seq",sequenceName="OrclBidSeq")
	public  int bidId;
	public int  farmerId;
	public float amount;
	public int quantity;
	

    public Bid() {
		super();
	}
    
    public Bid( int farmerId, float amount, int quantity) {
		super();		
		this.farmerId = farmerId;
		this.amount = amount;
		this.quantity = quantity;
	}

	public int getBidId() {
		return bidId;
	}

	public void setBidId(int bidId) {
		this.bidId = bidId;
	}

	public int getFarmerId() {
		return farmerId;
	}

	public void setFarmerId(int farmerId) {
		this.farmerId = farmerId;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Bid [bidId=" + bidId + ", farmerId=" + farmerId + ", amount=" + amount + ", quantity=" + quantity + "]";
	}
    
    
   
}
