
public class Manager extends CardLayoutDemo{
	int manager=0;
	Object orderList=new Object();
	float bill;
	public Manager()
	{
		if(manager==0)
		{
		manager=1;
		System.out.println("Manager shows the menu\n");
		}
		else
		{
			System.out.println("Wait for the manager\n");
			manager=0;
			new Manager();
		}
	}
	
	void getOrder(Object ob)
	{
	 // CardLayoutDemo ob=new CardLayoutDemo();
	  orderList=ob;
	}
	void placeorder()
	{
		ExecutiveChef cheif=new ExecutiveChef();
		cheif.receiveOrder(orderList);
	}
	float makeBill()
	{
		
		return bill;
	}

}
