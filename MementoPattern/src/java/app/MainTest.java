package app;
import javax.swing.*;

import java.awt.event.*;

public class MainTest extends JFrame{

	private JButton saveButton,undoButton,redoButton;
	private JTextArea articleArea;

	private CareTaker careTaker = new CareTaker();
	private Originator originator = new Originator();

	private int addedArticles = 0, overallArticles = 0;

	public static void main(String[] args){
	  new MainTest();
	}

	public MainTest(){

          setVisible(true);
	  setSize(580,400);
	  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  setTitle("Memento Patter test");

	  saveButton = new JButton("Zapisz");
	  undoButton = new JButton("Cofnij");
	  redoButton = new JButton("Ponow");

	  articleArea = new JTextArea(20,20);

	  JPanel articlePanel = new JPanel();

          articlePanel.add(articleArea);  
          articlePanel.add(saveButton);  
          articlePanel.add(redoButton);  
          articlePanel.add(undoButton);  
	
	  saveButton.addActionListener(new ButtonsListener());
	  redoButton.addActionListener(new ButtonsListener());
	  undoButton.addActionListener(new ButtonsListener());

	  add(articlePanel);
	  pack();

	}

	private class ButtonsListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {

        	       if(e.getSource() == saveButton){

	                   String article = articleArea.getText();
		           originator.setArticle(article);
	                     

	                   careTaker.addMemento(originator.createMemento());
		           addedArticles++;
		   	   overallArticles++;
			  undoButton.setEnabled(true);	
			}else if(e.getSource() == undoButton){
			  if(addedArticles  >= 1){
			   addedArticles--;
			   String textRestored = originator.restoreMemento(careTaker.getMemento(addedArticles ));
			   articleArea.setText(textRestored);
			   redoButton.setEnabled(true);
			  }else{
 			   undoButton.setEnabled(false);
			  }
			}else if(e.getSource() == redoButton){
			  if(overallArticles - 1 > addedArticles){	
			   addedArticles++; 	  
			   String restoredArticle = originator.restoreMemento(careTaker.getMemento(addedArticles));	                         articleArea.setText(restoredArticle);
			   undoButton.setEnabled(true);
			  }else{
			   redoButton.setEnabled(false);
			  }
			  }

		  System.out.println("Sum of articles = " + overallArticles + "\n addedArticles = " + addedArticles);


		}

	}

}
