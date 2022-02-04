import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;


public class ActionListenerDemo extends Frame implements ActionListener,WindowListener {
	TextField textField = new TextField(20);
	Button button;
	private int numClicks=0;
	ActionListenerDemo(){
		//Frame Settings
		setTitle("My First Window");
		setSize(350, 100);
		setVisible(true);
		
		//setting the Layout
		setLayout(new FlowLayout());
		
		button = new Button("Click Me");
		
		//Adding the components in the frame
		add(button);
		add(textField);
		//Register the source of event with the listener
		button.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e) {
		numClicks++;
		textField.setText("Button Clickeed"+numClicks+"times");
	}
	public void windowClosing(WindowEvent e) {
		dispose();
		System.exit(0);
	}


	
public static void main(String[] args) {
		ActionListenerDemo demo = new ActionListenerDemo();

	}

}