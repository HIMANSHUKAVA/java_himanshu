package project;

import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;

public class Register_Form implements ItemListener , ActionListener
{

	JFrame j;
	JLabel l;
	JLabel name;
	JTextField t1; // first
	JLabel DOB;
	JLabel dd;
	JLabel gender;
	JRadioButton male;
	JRadioButton female;
	JLabel email;
	JTextField t2; // email
	JLabel mobail;
	JTextField t3; // mobail
	JLabel Pass;
	JLabel repass;
	JPasswordField t4; // pass
	JPasswordField t5; // repass
	JLabel cource;
	JComboBox<String>m;
	String si[]= {"Full Stack Web Devlopment","Backend Devlopment","Frontend Devlopment","Mern Stack Devlopment",
			"Softwere Testing","Digital Marketing","Android Application" , "Business Stestic","Other"};
   JButton submit;
   JLabel branch;
   String[] br= {"Tops Technology Rajkot" , "Dream Spot It Acedmy" , "Red Net Bhavngar" , "Angle Insitute" , "Business Counter Bhavngar",
		   "Angle Insitute", "Other"};
   JComboBox<String >n;
   JComboBox<String>op;
   String []sem= {"1","2","3","4","5","6","7","8"};
   JLabel seme;
   
   
	public Register_Form() {
		
		//date picker
		UtilDateModel mm = new UtilDateModel();
	    JDatePanelImpl nn = new JDatePanelImpl(mm);
	    JDatePickerImpl datapiker = new JDatePickerImpl(nn);
	    
	    
	    
	    
	    
	    // TODO Auto-generated constructor stub
		j = new JFrame("Student Register Form");
		l = new JLabel("Register a new Student");
		name = new JLabel("Name");
		t1 = new JTextField();
		DOB = new JLabel("DOB");
		dd = new JLabel("(yyyy-mm-dd)");
		gender = new  JLabel("Gender");
		male = new JRadioButton("Male");
		female = new JRadioButton("Female");
		email = new JLabel("Mail Id");
		t2 = new JTextField();
		mobail = new JLabel("Mobail No");
		t3 =new JTextField();
		Pass = new JLabel("Password");
		repass = new JLabel("Re Password");
		t4 = new JPasswordField();
		t5 = new JPasswordField();
		cource = new JLabel("Cources");
		m = new JComboBox<>(si);
		submit = new JButton("Register");
		branch = new JLabel("Branch");
		n = new JComboBox<>(br);
		op = new JComboBox<>(sem);
		seme =  new JLabel("Semester");

		
		
		
		
		//bounds//
		name.setFont((new Font("Tahoma", Font.BOLD, 14)));
		name.setBounds(48, 77, 45, 13);
		t1.setBounds(136, 69, 231, 34);
        datapiker.setBounds(136, 132, 231, 27);
        DOB.setBounds(48, 138, 45, 13);
		DOB.setFont(new Font("Tahoma", Font.BOLD, 14));
		dd.setBounds(388, 140, 88, 13);
		l.setBounds(48, 24, 274, 27);
		l.setFont((new Font("Tahoma", Font.BOLD, 22)));
		gender.setBounds(48, 205, 53, 13);
		gender.setFont((new Font("Tahoma", Font.BOLD, 14)));
		male.setBounds(136, 203, 103, 21);
		female.setBounds(264, 203, 103, 21);
		email.setBounds(48, 265, 53, 13);
		email.setFont(new Font("Tahoma", Font.BOLD, 14));
		t2.setBounds(136, 254, 231, 34);
	    mobail.setBounds(48, 330, 82, 13);
	    mobail.setFont((new Font("Tahoma", Font.BOLD, 14)));
	    t3.setBounds(136, 321, 231, 34);
	    Pass.setBounds(48, 396, 70, 13);
	    Pass.setFont((new Font("Tahoma", Font.BOLD, 14)));
	    t4.setBounds(136, 387, 231, 34);
	    repass.setBounds(48, 462, 103, 13);
	    repass.setFont(((new Font("Tahoma", Font.BOLD, 12))));
	    t5.setBounds(136, 452, 231, 34);
	    cource.setBounds(48, 520, 70, 13);
	    cource.setFont((((new Font("Tahoma", Font.BOLD, 14)))));
	    m.setBounds(136, 512, 231, 34);
	    branch.setBounds(48, 579, 53, 13);
		branch.setFont(((((new Font("Tahoma", Font.BOLD, 14))))));
		n.setBounds(136, 571, 231, 34);
	    op.setBounds(136, 642, 231, 34);
	    seme.setBounds(48, 650, 70, 13);
	    seme.setFont((new Font("Tahoma", Font.BOLD, 14)));
	    submit.setBounds(136, 686, 231, 39);
	
	    
	   //perfomance//
	    submit.addActionListener(this);
	    
	    
	    
	    
	   //grup incon//
	    ButtonGroup ss = new ButtonGroup();
		ss.add(male);
		ss.add(female);
		male.addItemListener(this);
		female.addItemListener(this);
		
		
		
		
		
		
        //frame add details//
		j.setSize(490,800);
		j.setVisible(true);
		j.setLayout(null);
		j.add(l);
		j.add(name);
		j.add(t1);
		j.add(datapiker);
		j.add(DOB);
		j.add(dd);
		j.add(gender);
		j.add(male);
		j.add(female);
		j.add(email);
		j.add(t2);
		j.add(mobail);
		j.add(t3);
		j.add(Pass);
		j.add(repass);
		j.add(t4);
		j.add(t5);
		j.add(cource);
		j.add(m);
		j.add(branch);
		j.add(n);
	    j.add(op);
	    j.add(seme);
	    j.add(submit);
	 
}

public static void main(String[] args) 
{
	
	new Register_Form();
}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Component frame = null;
		if(e.getSource()==submit)
		{
			
			JOptionPane.showMessageDialog(frame, "Submit Your Detail Thank You");
		}
	
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		Component frame = null;
		if(male.isSelected())
		{
		
			JOptionPane.showMessageDialog(frame, "You Are Male");
		}
		if(female.isSelected())
		{
			JOptionPane.showMessageDialog(frame, "You Are Female");
		}
	
	}

	
	
		
		
		
	


}
