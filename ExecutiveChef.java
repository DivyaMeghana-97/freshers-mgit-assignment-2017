
public class ExecutiveChef extends CardLayoutDemo{
	public void receiveOrder(Object order)
    {
	    if(order==cb1[0]||order==cb1[1]||order==cb1[2]||order==cb1[3]||order==cb1[4]||order==cb1[5])
	    {
	       StarterChefs sc=new StarterChefs();
	       sc.makeorder(order);
	    }
	    if(order==cb2[0]||order==cb2[1]||order==cb2[2]||order==cb2[3]||order==cb2[4]||order==cb2[5])
	    {
	       MaincourseChefs sc=new MaincourseChefs();
	       sc.makeorder(order);
	    }
	    if(order==cb3[0]||order==cb3[1]||order==cb3[2]||order==cb3[3]||order==cb3[4]||order==cb3[5])
	    {
	       DesertChefs sc=new DesertChefs();
	       sc.makeorder(order);
	    }
    }

}
