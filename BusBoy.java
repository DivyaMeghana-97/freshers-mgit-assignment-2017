
public class BusBoy {
	int boys[]=new int[5];
public BusBoy()
{
  	for(int i=0;i<5;i++)
  	{
  		boys[i]=0;
  	}
}
  public void Boy()
  {
	  for(int i=0;i<5;i++)
	  {
		  if(boys[i]==0)
		  {
			  boys[i]=1;
			  System.out.println("Bus Boy" + i+1 + "serves water\n");
		  }
	  }
  }
}
