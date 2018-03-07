package app;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.*;
class FlyWeightTest extends JFrame 
{
 private static final long serialVersionUID = 12211212;

 private int width = 1000;
   private int height = 700;
 private final JButton button;
private Color[] colors = {Color.BLACK,Color.BLUE,Color.CYAN,Color.DARK_GRAY,Color.GREEN,Color.MAGENTA,Color.ORANGE,
			  Color.PINK,Color.RED};


 public static void main(String[] args)
	{
	  new FlyWeightTest();
	}

	public FlyWeightTest()
	{
	  setSize(width,height);
	 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLocationRelativeTo(null);
	setTitle("Test");
	 JPanel contentPanel = new JPanel();
	 JPanel drawingPanel = new JPanel();
	contentPanel.setLayout(new BorderLayout());

	 contentPanel.add(drawingPanel,BorderLayout.CENTER);

	 JPanel buttonPanel = new JPanel();

	 contentPanel.add(buttonPanel,BorderLayout.SOUTH);
		button = new JButton("Rysuj");
		buttonPanel.add(button);
		
		button.addActionListener(e->{
		long startTime = System.currentTimeMillis();
	      		for(int i = 0 ; i < 100000;i++){
  			Graphics g = drawingPanel.getGraphics();

			MyRect rect = RectFactory.createRect(randomColor());

			rect.draw(g,randomX(),randomY(),randomX(),randomY());	
		  } 
		long endTime = System.currentTimeMillis();
		System.out.println((endTime - startTime));
		});

	this.add(contentPanel);
	this.setVisible(true);

	}
	
	private int randomX()
	{
	  
	 return (int)(Math.random() * width);
	}
	private int randomY()
	{
	 return (int)(Math.random() * width);
	}

	private Color randomColor()
	{
	  Random random = new Random();
	  int  randomColor = random.nextInt(colors.length);
	  return colors[randomColor];

	}

}
