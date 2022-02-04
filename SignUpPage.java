import java.awt.Frame;
import java.awt.TextField;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Label;

public class SignUpPage extends Frame implements ActionListener {
	;
	TextField name =        new TextField(15);
	TextField email =       new TextField(15);
	TextField collegeName = new TextField(15);
	TextField userName  =   new TextField(15);
	TextField password =    new TextField(15);
	
	
	Button b1;
	public SignUpPage() {
		   setTitle("SIGNUP");
		   setSize(400,400);
		   setVisible(true);
		   setLayout(new FlowLayout());
		
		Label f1 =new Label("Name:");
		Label f2 = new Label("\nE-mail:");
		Label f3= new Label("\nCollege Name:");
		Label f4= new Label("\nUsername:");
		Label f5= new Label("\npassword:");
		
		f1.setAlignment(Label.CENTER);
		f2.setAlignment(Label.CENTER);
		f3.setAlignment(Label.CENTER);

		f4.setAlignment(Label.CENTER);
		f5.setAlignment(Label.CENTER);
		
		password.setEchoChar('.');
		
		b1= new Button("SUBMIT");
		b1.addActionListener(this);
		
		add(f1);
		add(name);
		add(f2);
		add(email);
		add(f3);
		add(collegeName);
		add(f4);
		add(userName);
		add(f5);
		add(password);
		add(b1);
		
		
		name.setText("ABCD ");
		email.setText("abcd@gmail.com");
		collegeName.setText("ABCD college");
		userName.setText("1q2w3e");
		password.setText("asdfgh123456");
		
		}
		
	
	public void actionPerformed(ActionEvent e) {
		System.out.println("Name   :"+name.getText());
		System.out.println("E-mail  :"+email.getText());
		System.out.println("College Name   :"+collegeName.getText());
		System.out.println("User Name  :"+userName.getText());
		System.out.println("Password  :"+password.getText());
		
	}
	
	
	public static void main (String [] args) {
		new SignUpPage();
		}
	
	
	
	
	
	

}
