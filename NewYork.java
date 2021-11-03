//FiftyStates
//Hiba Sarwar
//Computer Programming I
//October 19, 2021
//Fifty States Project New York

import javax.swing.*;
import javax.sound.sampled.*;
import java.io.File;

public class NewYork{
   NewYork(){

   }
   
   
   public void newYorkPrompt(){
      NewYork newYork = new NewYork();
   
      String newYorkObject[] = { "flag", "flower", "bird", "bird song", "go back", "exit" };
      
      ImageIcon newYorkPromptImage = new ImageIcon("./img/flags/NewYorkFlag.png");

      String newYorkOption = (String) JOptionPane.showInputDialog(null, "Welcome to New York \nThis is the New York state flag \n \n Select an option for more information about New York, go back to select another state, or exit", "NewYorkPrompt",
            JOptionPane.PLAIN_MESSAGE, newYorkPromptImage, newYorkObject, newYorkObject[0]);
      newYork.optionChooser(newYork, newYorkOption, newYorkObject);      
      
   }
   
   public void optionChooser(NewYork newYork, String option, String[] object){
      FiftyStates fifty = new FiftyStates();
   
      switch(option){
         case "flag":
            newYork.newYorkFlag(newYork, option, object);
            break;
         case "flower":
            newYork.newYorkFlower(newYork, option, object);
            break;
         case "bird":
            newYork.newYorkBird(newYork, option, object);
            break;
         case "bird song":
            newYork.newYorkBirdSong(newYork, option, object);
            break;
         case "go back":
            fifty.prompt();
            break;
         case "exit":
            System.exit(0);
            break;
         default:
            System.exit(0);
            break;
      }
   }
   
   public void newYorkFlag(NewYork newYork, String option, String[] object){
      ImageIcon newYorkFlagImage = new ImageIcon("./img/flags/NewYorkFlag.png");

      String newYorkFlagOption = (String) JOptionPane.showInputDialog(null, "This is the New York state flag \n \n Select an option for more information about New York, go back to select another state, or exit", "NewYorkFlag",
            JOptionPane.PLAIN_MESSAGE, newYorkFlagImage, object, object[0]);
      newYork.optionChooser(newYork, newYorkFlagOption, object);
   }
   
   public void newYorkFlower(NewYork newYork, String option, String[] object){
      ImageIcon newYorkFlowerImage = new ImageIcon("./img/flowers/NewYorkFlower.jpeg");

      String newYorkFlowerOption = (String) JOptionPane.showInputDialog(null, "This is the New York state flower \n It is the Rose\n \n Select an option for more information about New York, go back to select another state, or exit", "NewYorkFlower",
            JOptionPane.PLAIN_MESSAGE, newYorkFlowerImage, object, object[0]);
      newYork.optionChooser(newYork, newYorkFlowerOption, object);
   }
   
   public void newYorkBird(NewYork newYork, String option, String[] object){
      ImageIcon newYorkBirdImage = new ImageIcon("./img/birds/NewYorkBird.jpeg");

      String newYorkBirdOption = (String) JOptionPane.showInputDialog(null, "This is the New York state bird \n It is the Eastern Bluebird \n \n Select an option for more information about New York, go back to select another state, or exit", "NewYorkBird",
            JOptionPane.PLAIN_MESSAGE, newYorkBirdImage, object, object[0]);
      newYork.optionChooser(newYork, newYorkBirdOption, object);
   }
   
   public void newYorkBirdSong(NewYork newYork, String option, String[] object){
      ImageIcon newYorkBirdSongImage = new ImageIcon("./img/birds/NewYorkBird.jpeg");      
     
      JFrame frame = new JFrame("NewYorkBirdSong");
      JPanel canvas = new JPanel();
      JLabel text = new JLabel("<html>This is New York state Bird Song! <br> It is the Eastern Bluebird Song <br> Click the play button to play the New York state bird song <br> Select go back to go to the NewYork state bird!<html>");
      JLabel picture = new JLabel(newYorkBirdSongImage);
      JButton play = new JButton("Play Bird Song!");
      JButton back = new JButton("Go Back!");
      play.addActionListener(e-> newYork.sound());
      back.addActionListener(e-> newYork.backPrompt(newYork, option, object, frame));
      
      canvas.add(picture);
      canvas.add(text);
      canvas.add(play);
      canvas.add(back);

      frame.add(canvas); 
      frame.setSize(600,450);
      frame.setVisible(true);
   }
   
    public void sound(){
      try{
         AudioInputStream input = AudioSystem.getAudioInputStream(new File("./sound/NewYorkSong.wav"));
         Clip clip = AudioSystem.getClip();
         Thread.sleep(10); 
         clip.open(input);
         clip.loop(0);
         Thread.sleep(1500);
      } catch (Exception sound){
         System.out.println("Error occured when playing sound!");
      }
   }
   
   public void backPrompt(NewYork newYork, String option, String[] object, JFrame frame){
      frame.dispose();
      newYork.newYorkBird(newYork, option, object);
   }
      
      
}
   