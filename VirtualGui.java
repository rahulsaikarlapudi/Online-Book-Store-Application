package Hola;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VirtualGui implements ActionListener {
	JButton Button= new JButton("Next");
	JButton Button4 = new JButton("Next");
	JButton Button5 = new JButton("Done");
	JLabel Label1;
	JLabel Label2;
	JLabel Label3;
	JLabel label4;
	JLabel Label5;
	JLabel label6;
	JFrame f;
	JFrame f2;
	JFrame f3;
	JFrame f4;
	JFrame f5;
	JTextField text1;
	JList list;
	JPanel panel = new JPanel(null);
	String Genre;
	String price;
	JComboBox c2;
public VirtualGui() {
	f = new JFrame("Greeting");
	f.setLayout(new BorderLayout(4,4));
	f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	Label1 = new JLabel("Wlcome to the Virtual Book Store (;");
	Label2 = new JLabel("Please hit the next button");
	Button =  new JButton("Next");
	f.add(Label1, BorderLayout.NORTH);
	f.add(Label2, BorderLayout.CENTER);
	f.add(Button, BorderLayout.PAGE_END);
	f.setSize(480,200);
	f.setVisible(true);
	Button.addActionListener( new ActionListener()
    {
        @Override
        public void actionPerformed(ActionEvent e)
        {
          
  		  f.dispose();
	       GenreFrame(); // this method when called the second frame appear
        }
    });
}
void GenreFrame() {
	f2 = new JFrame("Genre");
	f2.setDefaultCloseOperation(f2.EXIT_ON_CLOSE);
	f2.add(panel);
	f2.setSize(480,200);
	f2.setVisible(true);
	Label3 = new JLabel("Please Select the Preferred Genere and press Next");
	Label3.setBounds(0, 0, 480, 20);
	panel.add(Label3);
	DefaultListModel<String> i1 = new DefaultListModel<>();
	JList<String> list = new JList<>(i1);
	i1.addElement("Drama");
	i1.addElement("Crime");
	i1.addElement("Kids");
	list.setBounds(0, 25, 70, 50);
	panel.add(list);
	f2.add(Button4, BorderLayout.PAGE_END);
	Button4.addActionListener(new ActionListener() {

		@SuppressWarnings("deprecation")
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			Genre = (String)list.getSelectedValue();
			f2.dispose();
			PriceFrame(Genre);
			
		}
		
	});

}
void PriceFrame(String Genre) {
	f3 = new JFrame("Price");
	f3.setDefaultCloseOperation(f3.EXIT_ON_CLOSE);
	f3.setLayout(new FlowLayout());
	label4 = new JLabel("Please Select your suitable price range");
	String price[] = {"High", "Low"};	
	JComboBox c1 = new JComboBox(price);
	Button5 = new JButton("Done");
	f3.add(label4);
	f3.add(c1);
	f3.add(Button5);
	f3.setSize(480, 200);
	f3.setVisible(true);
	Button5.addActionListener(new ActionListener(){

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			String price = (String)c1.getSelectedItem();
			f3.dispose();
			ChooseBook(price, Genre);
		}
		
	});
}
void ChooseBook(String price, String Genre){
	f4 = new JFrame("choice");
	f4.setDefaultCloseOperation(f4.EXIT_ON_CLOSE);
	f4.setLayout(new FlowLayout());
	f4.setVisible(true);
	f4.setSize(480,200);
	Label5 = new JLabel("Please Select Your Book");
	if(Genre.equals("Crime")&& price.equals("High")) {
		String s1[] = { "Crime High1", "Crimal High2", "Crime High3"};
		c2 = new JComboBox(s1);
	}else if(Genre.equals("Crime")&& price.equals("Low")){
		String s1[] = { "Crime low1", "Crimal low2", "Crime low3"};
		c2 = new JComboBox(s1);
	}
	else if(Genre.equals("Drama")&& price.equals("High")) {
		String s1[] = { "Drama High1", "Drama High2", "Drama High3"};
		c2 = new JComboBox(s1);
	}else if(Genre.equals("Drama")&& price.equals("Low")){
		String s1[] = { "Drama low1", "Drama low2", "Drama low3"};
		c2 = new JComboBox(s1);
	}
	else if(Genre.equals("Kids")&& price.equals("High")) {
		String s1[] = { "Kids High1", "Kids High2", "Kids High3"};
		c2 = new JComboBox(s1);
	}else if(Genre.equals("Kids")&& price.equals("Low")){
		String s1[] = { "Kids low1", "Kids low2", "Kids low3"};
		c2 = new JComboBox(s1);
	}
	JButton Button6 = new JButton("Done");
	f4.add(Label5);
	f4.add(c2);
	f4.add(Button6);
	Button6.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			String choice = (String)c2.getSelectedItem();
			f4.dispose();
			choosen(choice);
		}
		
	});
}
void choosen(String choice) {
	f5 = new JFrame("Bill");
	f5.setDefaultCloseOperation(f5.EXIT_ON_CLOSE);
	f5.setLayout(new FlowLayout());
	label6 = new JLabel();
	if(choice.equals("Crime High1")) {
   	 label6 = new JLabel("Your bill is 7 dollars ");
   }else if(choice.equals("Crime High2")) {
   	label6.setText("Your bill is 7 dollars ");
   }else if(choice.equals("Crime High3")) {
   	label6.setText("Your bill is 7 dollars ");
   }else if(choice.equals("Crime low1")) {
   	label6.setText("Your bill is 3 dollars ");
   }else if(choice.equals("Crime low2")) {
   	label6.setText("Your bill is 3 dollars ");
   }else if(choice.equals("Crime low3")) {
   	label6.setText("Your bill is 3 dollars ");
   }else if(choice.equals("Drama High1")) {
   	 label6 = new JLabel("Your bill is 9 dollars ");
   }
   else if(choice.equals("Drama High2")) {
   	label6.setText("Your bill is 9 dollars ");
   }else if(choice.equals("Drama High3")) {
   	label6.setText("Your bill is 9 dollars ");
   }else if(choice.equals("Drama low1")) {
   	label6.setText("Your bill is 5 dollars ");
   }else if(choice.equals("Drama low2")) {
   	label6.setText("Your bill is 5 dollars ");
   }else if(choice.equals("Drama low3")) {
   	label6.setText("Your bill is 5 dollars ");
   }else if(choice.equals("Kids High1")) {
   	 label6 = new JLabel("Your bill is 11 dollars ");
   }
   else if(choice.equals("Kids High2")) {
   	label6.setText("Your bill is 11 dollars ");
   }else if(choice.equals("Kids High3")) {
   	label6.setText("Your bill is 11 dollars ");
   }else if(choice.equals("Kids low1")) {
   	label6.setText("Your bill is 8 dollars ");
   }else if(choice.equals("Kids low2")) {
   	label6.setText("Your bill is 8 dollars ");
   }else if(choice.equals("Kids low3")) {
   	label6.setText("Your bill is 8 dollars ");
   }
   f5.add(label6);
   f5.setVisible(true);
   f5.setSize(new Dimension(480,200));
   
  
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
VirtualGui b = new VirtualGui ();

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
