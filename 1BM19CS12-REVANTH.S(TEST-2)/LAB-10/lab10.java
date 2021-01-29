import java.awt.*;
import  java.awt.event.*;

class MyDiaolg extends Dialog {
  Button bl;
  private String msg1;
  MyDiaolg(Frame parent, String title,boolean mode,String msg1){
  super(parent, title, mode);
  setLayout(new FlowLayout());
  setSize(300,300);
  this.msg1 = msg1;

  bl = new Button("Close");
  add(bl);
  bl.addActionListener((ae)-> dispose());
  addWindowListener(new WindowAdapter() {
	  public void windowClosing(WindowEvent we) {
		  dispose();
	  }
  });
  }
  public void paint(Graphics g) {
	  g.drawString(msg1, 30, 80);
  }
}

public class lab10 extends Frame implements ActionListener{
  String msg="";
  TextField num1,num2,res;
  Button division;
  public lab10(){
    setLayout(new FlowLayout());
    Label number1 = new Label("NUMBER1:");
   num1 = new TextField(10);
   Label number2 = new Label("NUMBER2:");
   num2 = new TextField(10);
    division = new Button("\\");
   Label result = new Label("RESULT:");
   res = new TextField(10);
   add(number1);
   add(num1);
   add(number2);
   add(num2);
   add(division);
   add(result);
   add(res);
   num1.addActionListener(this);
  num2.addActionListener(this);
   division.addActionListener(this);
   res.addActionListener(this);
   addWindowListener(new MywindowAdapter());
  }
  public void actionPerformed(ActionEvent e){
    double c;
   try{
     int no1 = Integer.parseInt(num1.getText());
     int no2 = Integer.parseInt( num2.getText());
     c = no1/no2;
     res.setText(String.valueOf(c));
   } catch(ArithmeticException ex2){
	    new MyDiaolg(this,"error",true,""+ex2).setVisible(true);
	   }
   catch(NumberFormatException ex1){
     new MyDiaolg(this,"error",true,""+ex1).setVisible(true);
   }
  
  }
  public static void main(String args[])
  {
  lab10 b=new lab10();
   b.getSize(new Dimension(2000,3000));
   b.setTitle("Lab 10");
  b.setVisible(true);
  }
}
class MywindowAdapter extends WindowAdapter{
	public void windowClosing(WindowEvent we){
		System.exit(0);
  }}