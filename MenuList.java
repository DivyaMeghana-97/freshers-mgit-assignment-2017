import java.awt.*;
import java.applet.*;
import java.awt.event.*;
public class MenuList extends Applet implements ItemListener
{
Checkbox cb1[],cb2[],cb3[];
public void init()
{
	Label l1=new Label("Staters");
	Label l2=new Label("MainCourse");
	Label l3=new Label("Deserts");
	Label startercost[]=new Label[6];
	Label maincoursecost[]=new Label[6];
	Label desertscost[]=new Label[6];
	startercost[0]=new Label("150");
	startercost[1]=new Label("150");
	startercost[2]=new Label("150");
	startercost[3]=new Label("150");
	startercost[4]=new Label("150");
	startercost[5]=new Label("150");
	maincoursecost[0]=new Label("150");
	maincoursecost[1]=new Label("150");
	maincoursecost[2]=new Label("150");
	maincoursecost[3]=new Label("150");
	maincoursecost[4]=new Label("150");
	maincoursecost[5]=new Label("150");
	desertscost[0]=new Label("150");
	desertscost[1]=new Label("150");
	desertscost[2]=new Label("150");
	desertscost[3]=new Label("150");
	desertscost[4]=new Label("150");
	desertscost[5]=new Label("150");
	
	
	cb1=new Checkbox[6];
	cb2=new Checkbox[6];
	cb3=new Checkbox[6];
	cb1[0]=new Checkbox("Gobi Manchuria");
	cb1[1]=new Checkbox("Veg Salad ");
	cb1[2]=new Checkbox("Chicken 65");
	cb1[3]=new Checkbox("Chilly Chicken");
	cb1[4]=new Checkbox("Pepper Chicken");
	cb1[5]=new Checkbox("Chicken Manchuria");
	cb2[0]=new Checkbox("Veg Biryani Half");
	cb2[1]=new Checkbox("Veg Biryani Full");
	cb2[2]=new Checkbox("Egg Biryani Half");
	cb2[2]=new Checkbox("Egg Biryani Full");
	cb2[3]=new Checkbox("Chicken Biryani Half");
	cb2[4]=new Checkbox("Chicken Biryani Full");
	cb2[5]=new Checkbox("Chicken Biryani Jumbo");
	cb3[0]=new Checkbox("Strawberry Icecream");
	cb3[1]=new Checkbox("Venila Icecream");
	cb3[2]=new Checkbox("Choclate Icecream");
	cb3[3]=new Checkbox("Butterscotch Icecream");
	cb3[4]=new Checkbox("Spl Sweet");
	cb3[5]=new Checkbox("Fruit Salad");
	
	/*setLayout(new GridLayout(1,3));
	add(l1);
	add(l2);
	add(l3);*/
	//for(int i=0;i<6;i++)
		//add(cb1[i]);
	//for(int i=0;i<6;i++)
		//add(cb2[i]);
	//System.out.println("\n");
	setLayout(new GridLayout(6,6));
	for(int i=0;i<6;i++)
		{
		add(cb1[i]);
		add(startercost[i]);
		add(cb2[i]);
		add(maincoursecost[i]);
		add(cb3[i]);
		add(desertscost[i]);
		}
}
public void itemStateChanged(ItemEvent ie)
{
	
}
}
/*<applet code="MenuList" width =600 height=700>
 * </applet>
 */
