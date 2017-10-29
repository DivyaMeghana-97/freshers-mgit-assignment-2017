
public class Host {
	private int hosts[]=new int[5];
	public Host()
	{
	for(int i=0;i<5;i++)
	{
		hosts[i]=0;
	}
	}
	public void setHost()
	{
		for(int i=0;i<5;i++)
		{
			if(hosts[i]==0)
			{
				hosts[i]=1;
				Table t=new Table();
				t.allotTable();
							
			}
		}
	}

}
