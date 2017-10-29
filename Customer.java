
public class Customer
	{
	  private String customerName;
	  private int count;
	  public void setCustomerName(String s)
	  {
	    customerName=s;
	  }
	  public void setCount(int c)
	  {
	    count=c;
	  }
	  public void requestBill()
	  {
		  Manager m=new Manager();
		  m.makeBill();
	  }
    }
    
