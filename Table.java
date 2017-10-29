
public class Table {
	int tables[]=new int[20];
	public Table()
	{
	for(int i=0;i<20;i++)
	{
		tables[i]=0;
	}
	}
	public void allotTable()
	{
		for(int i=0;i<20;i++)
		{
			if(tables[i]==0)
			{
				tables[i]=1;
				System.out.println("table"+ i+1 + "ïs alloted");
				break;
			}
		}
	}

}
