import javax.swing.*; 
public class Cha2Sample1 {
	public static void main(String[] args) {
		final String myvar;
		myvar = "Johnson";
		JFrame /* comments */ myWindow;
		myWindow = new JFrame();
		myWindow.setSize(300,200);
		myWindow.setTitle("My first Java Program");
		myWindow.setVisible(true);
		System.out.println("Hello World " + myvar);
		} 
	}