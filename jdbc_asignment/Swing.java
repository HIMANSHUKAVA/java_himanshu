package gui;

import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Swing  implements ActionListener , ItemListener
{

	JFrame frame;
	
	JButton b1,b2,b3,b4,b5,b6,b7;
	JLabel l,l2,l3,l4,l5,l6,l7,l8;
	JTextField t1,t2,t3,t4,t5,t6;
	JRadioButton c1,c2;
	JTable table;
	DefaultTableModel ss;
	
	String[] coulmdata = {"S_no" , "ID", "Name" , "Gender" , "Address" , "Contect"};
	
	JScrollPane s1;
	public Swing() 
	{
	
		 frame = new JFrame("Welcome  tops");
		b1 = new JButton("Exit"); 
		JLabel l = new JLabel("        RegisterForm\r\n");
	    t1 =  new JTextField();
	    t2 =  new JTextField();
	    t3 =  new JTextField();
        c1 = new JRadioButton("Male");
        c2 = new JRadioButton("Female");
	    t4 =  new JTextField();	    
	    t5 =  new JTextField();
	    t6 =  new JTextField();
	    b2 = new JButton("Register");
	    b3 = new JButton("deleat");
	    b4 = new JButton("update");
	    b5 = new JButton("reset");
	    b6 = new JButton("refresh");
	    b7 = new JButton();

	    
	    
	    ss = new DefaultTableModel(coulmdata , 0);
	    table =  new JTable(ss);
     	table.setBounds(331, 187, 574, 308);
     	
     	table.repaint();
     	s1 = new JScrollPane(table,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED , JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
     	s1.setBounds(331, 187, 574, 108);
     	
	    
        
	    
	    l2=  new JLabel("ID\r\n");
	    l3=  new JLabel("Name\r\n");
	    l4=  new JLabel("Gender\r\n");
	    l5=  new JLabel("Address\r\n");
	    l6=  new JLabel("Contect\r\n");
//	    l7=  new JLabel("Contect\r\n");
	    l8=  new JLabel();
	    
		
	    ButtonGroup gg =  new ButtonGroup();
	    gg.add(c1);
	    gg.add(c2);
	    
	    
		
		 //b1.setBounds(130, 245, 105, 43);
        l.setFont(new Font("Tahoma", Font.BOLD, 17));
		l.setBounds(57, 28, 185, 54);

		l2.setBounds(10, 125, 59, 26);		
		l3.setFont((new Font("Tahoma", Font.BOLD, 13)));	
		l3.setBounds(10, 187, 59, 26);
		l4.setBounds(10, 258, 71, 26);
		l5.setFont(new Font("Tahoma", Font.BOLD, 17));
		l5.setBounds(10, 316, 71, 26);
	    l6.setBounds(10, 382, 71, 26);
	    l6.setFont(new Font("Tahoma", Font.BOLD, 17));
		
		
		//button//
		b1.setBounds(98, 480, 96, 37);
	    b2.setBounds(196, 480, 96, 37);
		b3.setBounds(99, 529, 96, 37);
		b4.setBounds(196, 527, 96, 37);
		b5.setBounds(142, 574, 96, 37);
		b6.setBounds(403, 541, 432, 25);
		
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		
		
		
		
		//checkbox
		c1.setFont(new Font("Tahoma", Font.BOLD, 12));
		c2.setFont(new Font("Tahoma", Font.BOLD, 12));
		c1.setBounds(92, 263, 71, 21);
        c2.setBounds(165, 263, 89, 20);
        c1.addItemListener(this);
        c2.addItemListener(this);
        
        
       
        
		
		
		t1.setBounds(98, 114, 194, 37);
		t2.setBounds(98, 187, 194, 37);
		t3.setBounds(98, 314, 194, 37);
		t4.setBounds(98, 382, 194, 37);

		
		frame.add(s1);
		frame.add(b1);
		frame.add(l);
		frame.add(t1);
		frame.add(l2);
		frame.add(t2);
		frame.add(t3);
		frame.add(l3);
		frame.add(l4);
		frame.add(c1);
		frame.add(c2);
		frame.add(l5);
		frame.add(l6);
		frame.add(t4);
		frame.add(t5);
		frame.add(t6);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		frame.add(b5);
		frame.add(b6);
		frame.add(b7);
        
        
		
		
		
		
		frame.setSize(950, 650);
		frame.setLayout(null);
		frame.setVisible(true);
		
	
		
	}

	
	public static void main(String[] args)
	{
		
		new Swing();

	}


	@Override
	public void actionPerformed(ActionEvent e)
	{
	
		if(e.getSource()==b1)
		{
			frame.dispose();
		}
		
		if(e.getSource()==b2)
		{
			insertdata();
			JOptionPane.showConfirmDialog(frame, "Sucessfully submited");
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
			
		}
		if(e.getSource()==b3)
		{
			
			deleatdata();
			JOptionPane.showConfirmDialog(frame, "delete data sucessfully");
			t1.setText("");
			
		}
		
		if(e.getSource()==b4)
		{
			updatedata();
			JOptionPane.showConfirmDialog(frame, "Sucessfully data upated");
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
		}
		if(e.getSource()==b5)
		{
			t1.setText("");
			t2.setText("");
			t3.setText("");
			t4.setText("");
		}
		if(e.getSource()==b6)
		{
			viewdata();
		}
	}


   @Override
	public void itemStateChanged(ItemEvent e) 
	{
	
		Component frame = null;
		if(c1.isSelected())
		{
		
			JOptionPane.showMessageDialog(frame, "You Are Male");
		}
		if(c2.isSelected())
		{
			JOptionPane.showMessageDialog(frame, "You Are Female");
		}
		
	}
//	
   String host =  "jdbc:mysql://localhost:3306/";
   String dbname="jdbc";
   String url = host+dbname;
	
  
   public void insertdata()
   {
	   
	   int id =  Integer.parseInt(t1.getText());
	   String name =  t2.getText();
	   String gender;
	   if(c1.isSelected())
	   {
		   gender =  c1.getText();
	   }
	   else
	   {
		   gender = c2.getText();
	   }
	   int contect =  Integer.parseInt(t4.getText());
	   
	   String address =  t3.getText();
	   
	   
	   try 
	   {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con =  DriverManager.getConnection(url, "root", "");
		Statement stp = con.createStatement();
		String quary = "insert into ragistretion values(null,'"+id+"', '"+name+"','"+gender+"','"+address+"','"+contect+"')";
		
		int insert =  stp.executeUpdate(quary);
		
		
		
	   } 
	   catch (ClassNotFoundException e) 
	   {
		// TODO Auto-generated catch block
		e.printStackTrace();
	    } catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
	   
	   
	   
	   
	   
   }
   public void deleatdata()
   {
	   int id = Integer.parseInt(t1.getText());
	   
	   try
	   {
	   Class.forName("com.mysql.jdbc.Driver");
	   Connection con =  DriverManager.getConnection(url, "root","");
	   Statement stp =  con.createStatement();
	   String quey = "delete from ragistretion where id='"+id+"' ";
	   int delet =  stp.executeUpdate(quey);
	   
	   
	   }
	   catch(Exception e)
	   {
		   e.printStackTrace();
	   }
	   
   }
   
   public void updatedata()
   {
	   int id =  Integer.parseInt(t1.getText());
	   String name =  t2.getText();
	   String gender;
	   if(c1.isSelected())
	   {
		   gender =  c1.getText();
	   }
	   else
	   {
		   gender = c2.getText();
	   }
	   int contect =  Integer.parseInt(t4.getText());
	   
	   String address =  t3.getText();
	   
	   try
	   {
		   Class.forName("com.mysql.jdbc.Driver");
		   Connection con = DriverManager.getConnection(url, "root", "");
		   Statement stp =  con.createStatement();
		   String quary = "update ragistretion set id= "+id+",name= '"+name+"',gender= '"+gender+"',address='"+address+"',contect= "+contect+"";
		   int  s =  stp.executeUpdate(quary);
		   
		   
		   
	   }
	   catch(Exception e)
	   {
		   e.printStackTrace();
	   }
	   
	   
	   
   }
   
   public void viewdata()
   {
	   
	 
	   try
	   {

		   String sql = "select * from ragistretion";
		   Class.forName("com.mysql.jdbc.Driver");
		   Connection con =  DriverManager.getConnection(url, "root","");
		   Statement stp =  con.createStatement();
		   ResultSet set = stp.executeQuery(sql);
		   
		   
		   ss.setRowCount(0);
		   
		   while(set.next())
		   {
			   ss.addRow( new Object[]  {set.getInt(1) ,set.getInt(2) , set.getString(3) , set.getString(4) , set.getString(5) , set.getInt(6) });
		   }
		   
		   
		   
	   }
	   catch(Exception e)
	   {
		   e.printStackTrace();
	   }
   }
   
}
