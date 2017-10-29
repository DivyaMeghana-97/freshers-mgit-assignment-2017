
 import java.awt.*;
import java.awt.event.*;

import java.applet.*;
 /*
<applet code="CardLayoutDemo" width=700 height=700> </applet>
*/
public class CardLayoutDemo extends Applet implements ActionListener, MouseListener,ItemListener 
{

public Checkbox cb1[], cb2[], cb3[];
Object res;
public Label lb1[],lb2[],lb3[];

 Panel menu;
CardLayout cardLO;
 Button starter, maincourse,desert;

public void init() {

starter = new Button("STARTER");
 maincourse = new Button("MAINCOURSE"); 
 desert= new Button("DESERT");
add(starter);
add(maincourse);
add(desert);

cardLO = new CardLayout(); 
menu = new Panel();
menu.setLayout(cardLO); // set panel layout to card layout


cb1=new Checkbox[6];
cb1[0]=new Checkbox("Gobi Manchuria");
cb1[1]=new Checkbox("Veg Salad ");
cb1[2]=new Checkbox("Chicken 65");
cb1[3]=new Checkbox("Chilly Chicken");
cb1[4]=new Checkbox("Pepper Chicken");
cb1[5]=new Checkbox("Chicken Manchuria");
cb2=new Checkbox[6];
cb2[0]=new Checkbox("Veg Biryani Half");
cb2[1]=new Checkbox("Veg Biryani Full");
cb2[2]=new Checkbox("Egg Biryani Half");
cb2[2]=new Checkbox("Egg Biryani Full");
cb2[3]=new Checkbox("Chicken Biryani Half");
cb2[4]=new Checkbox("Chicken Biryani Full");
cb2[5]=new Checkbox("Chicken Biryani Jumbo");
cb3=new Checkbox[6];
cb3[0]=new Checkbox("Strawberry Icecream");
cb3[1]=new Checkbox("Venila Icecream");
cb3[2]=new Checkbox("Choclate Icecream");
cb3[3]=new Checkbox("Butterscotch Icecream");
cb3[4]=new Checkbox("Spl Sweet");
cb3[5]=new Checkbox("Fruit Salad");

lb1=new Label[6];
lb1[0]=new Label("120");
lb1[1]=new Label("65 ");
lb1[2]=new Label("160");
lb1[3]=new Label("160");
lb1[4]=new Label("160");
lb1[5]=new Label("160");
lb2=new Label[6];
lb2[0]=new Label("180");
lb2[1]=new Label("300");
lb2[2]=new Label("200");
lb2[3]=new Label("400");
lb2[4]=new Label("220");
lb2[5]=new Label("440");
lb3=new Label[6];
lb3[0]=new Label("65");
lb3[1]=new Label("50");
lb3[2]=new Label("70");
lb3[3]=new Label("70");
lb3[4]=new Label("65");
lb3[5]=new Label("50");


Panel startpan = new Panel();
for(int i=0;i<6;i++) {
startpan.add(cb1[i]);
startpan.add(lb1[i]);
}
Panel mainpan=new Panel();
for(int j=0;j<6;j++) {
mainpan.add(cb2[j]);
mainpan.add(lb2[j]);
}
Panel desertpan=new Panel();
for(int k=0;k<6;k++) {
desertpan.add(cb3[k]);
desertpan.add(lb3[k]);}

menu.add(startpan, "STARTERS"); 
menu.add(mainpan, "MAINCOURSE");
menu.add(desertpan,"DESERTS");
add(menu); 
starter.addActionListener(this); 
maincourse.addActionListener(this);
desert.addActionListener(this);
addMouseListener(this);
}


public void mousePressed(MouseEvent me)
 { cardLO.next(menu);}
public void mouseClicked(MouseEvent me) {}
public void mouseEntered(MouseEvent me) { }
public void mouseExited(MouseEvent me) { }
public void mouseReleased(MouseEvent me) { }

public void actionPerformed(ActionEvent ae) { 
if(ae.getSource() == starter)
 {

cardLO.show(menu, "STARTERS");
 }
else if(ae.getSource() == maincourse) {

cardLO.show(menu, "MAINCOURSE"); 
}
else {
	cardLO.show(menu, "DESERTS");
}
}
public void itemStateChanged(ItemEvent e) {      
    res=e.getSource();  
}
public void placeOrderToManager()
{
	Manager m=new Manager();
	m.getOrder(res);
}
}