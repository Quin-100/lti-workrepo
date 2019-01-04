package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import DAOImpl.BidDAOImpl;
import model.Bid;

public class TestBid {
	
	static Bid bid = null;
	static BidDAOImpl biddao = new BidDAOImpl();
	public static void accepDetails() {
		
		Scanner br = new Scanner(System.in);
		//BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Farmer Id :");
		int farmerId = br.nextInt();
		System.out.println("Enter Bid Amount :");
		float amount = br.nextInt();
		System.out.println("Enter Bid Quantity :");
		int quantity = br.nextInt();
		bid = new Bid(farmerId,amount,quantity);
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int choice=1;
		int bitId = 0;
		List<Bid> lstBid = new ArrayList<Bid>();
		
		while (choice>=1 && choice<6)
		{
			System.out.println("Bid CRUD");
			System.out.println("1.Add Bid");
			System.out.println("2.Update Bid");
			System.out.println("3.Delete Bid");
			System.out.println("4.List All Bid");
			System.out.println("5.List  Bid by id");
			System.out.println("6.Exit");
			
		    System.out.println("Choose CRUD to perform");
		         
			choice=sc.nextInt();
				
		         
		   switch (choice) {
		         
				case 1:	
					accepDetails();
					biddao.addBid(bid);
					break;
				case 2:	
					System.out.println("Enter BidId to update : ");
					bitId = sc.nextInt();
					accepDetails();					
					biddao.updateBid(bid,bitId);
					break;
				case 3:	
					System.out.println("Enter BidId to delete : ");
					bitId = sc.nextInt();
					biddao.deleteBid(bitId);
					break;
				case 4:	
					lstBid = biddao.allBid();
					for(Bid d : lstBid) {
						System.out.println(d);
					}
					System.out.println("No of Bids :"+lstBid.size());
					break;
				case 5:	
					System.out.println("Enter BidId to display : ");
					bitId = sc.nextInt();
					bid = biddao.allBidById(bitId);					
					System.out.println(bid);					
					break;
				case 6:	
					System.exit(0);
					break;

				default:
					break;
				}		    
		}		
	}

}
