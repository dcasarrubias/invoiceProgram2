
/*
 * David Casarrubias-Mena
 * Date: February 12, 2015
 */
public class Invoice {
	private String partNumber;
	private String description;
	private int quantityOfItem;
	private double priceOfItem;
	
	public Invoice(String n, String d, int qItem, double p ){
		partNumber = n;
		description = d;
		quantityOfItem = qItem;
		priceOfItem = p;
	}
	
	public void setPartNumber(String n){
		partNumber = n;
	}
	
	public void setDescription(String d){
		description = d;
	}
	
	public void setQuantityOfItem(int qItem){
		quantityOfItem = qItem;
	}
	
	public void setPriceOfItem(double p){
		priceOfItem = p;
	}
	
	public String getPartNumber(){
		return partNumber;
	}
	
	public String getDescription(){
		return description;
	}
	
	public int getQuantityOfItem(){
		return quantityOfItem;
	}
	
	public double getPriceOfItem(){
		return priceOfItem;
	}
	
	public double getInvoiceAmount(){
		double total;
		
		if(quantityOfItem < 0){
			quantityOfItem = 0;
		}
		
		if(priceOfItem < 0){
			priceOfItem = 0;
		}
		
		total = quantityOfItem * priceOfItem;
		return total;
	}

	
	
	
}

