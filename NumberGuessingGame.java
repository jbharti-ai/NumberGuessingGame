import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
import java.lang.Math;

class NumberGuessingGame extends JFrame{
	public void showGUI(){
		JFrame frame = new JFrame("Score Board");
		Scanner scan = new Scanner(System.in);
		int uservalue = 0;
		int score = 100;
		
		 int cpuvalue = (int)(Math.random() * 100);
		
		while(uservalue!=cpuvalue)
		{
			score= score-1;
			
			String value = JOptionPane.showInputDialog("Enter number");
			uservalue = Integer.parseInt(value);
			if(cpuvalue==uservalue)
			{ 
				frame.setLayout(null);
				frame.setSize(400,370);
				JLabel lbl = new JLabel("Congratulation!!!");
				JLabel lbl_values = new JLabel("the values are same" + " " + " CPU : " + cpuvalue + " YOUR VALUE : " + uservalue);
				JLabel lbl_score = new JLabel("The Score :  " + score);
				lbl.setBounds(60,80,200,30);
				lbl_values.setBounds(60,100,300,100);
				lbl_score.setBounds(60,190,100,40);
				frame.add(lbl);
				frame.add(lbl_values);
				frame.add(lbl_score);
				frame.setBackground(Color.PINK);
				//System.out.println("the values are same" + cpuvalue + uservalue + score);
			}
			else if(cpuvalue>uservalue)
			{
				System.out.println("your number is smaller");
			}
			else if(cpuvalue<uservalue)
			{
				System.out.println("your number is greater");
			}
		}
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);	
	}
	public static void main(String[] args)
	{
		NumberGuessingGame game = new NumberGuessingGame();
		game.showGUI();
	}
}