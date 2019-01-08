import javax.swing.JFrame
public class BasicElements {
	 

	public static void main(String args[]){
		 JFrame myFrame = new JFrame();
		 JButton myButton = new Jbutton();
        myFrame.setLayout(null);
		 myFrame.add(myButton);

         myFrame.setDeafultCLoseOperation(myFrame.EXIT_ON_CLose);
		 myFrame.setVisible(true);
		 myFrame.setSize(900, 600);
		System.out.println("basic java elements");
	}
}