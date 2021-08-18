import java.awt.*; 
public class Demo 
{
	public static void main(String []args)
	{
		Frame f=new Frame("Details");
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(600, 600);
		Label l=new Label("Name");
		l.setBounds(50,80,40,20);
		TextField t=new TextField();
		t.setBounds(100, 80, 90, 25);
		f.add(l);
		f.add(t);
		Label l1=new Label("E-Mail");
		l1.setBounds(50,130,40,20);
		TextField t1=new TextField();
		t1.setBounds(100, 130, 120, 25);
		f.add(l1);
		f.add(t1);
		Label l2=new Label("Address");
		l2.setBounds(40,170,50,20);
		f.add(l2);
		TextArea t2=new TextArea();
		t2.setBounds(100, 170, 200, 200);
		f.add(t2);
		Label l3=new Label("Password");
		l3.setBounds(30, 410, 60, 20);
		TextField t3=new TextField();
		t3.setBounds(100, 410, 120, 25);
		f.add(l3);
		f.add(t3);
		Button btn=new Button("Submit");
		btn.setBounds(180, 470, 150, 40);
		f.add(btn);
		
	}
}
