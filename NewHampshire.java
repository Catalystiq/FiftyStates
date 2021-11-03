//FiftyStates
//James Nelson
//Computer Programming I
//October 19, 2021
//Fifty States Project New Hampshire

import javax.swing.*;
import javax.sound.sampled.*;
import java.io.File;

public class NewHampshire{
   NewHampshire(){

   }
   
   
   public void newHampshirePrompt(){
      NewHampshire newHampshire = new NewHampshire();
   
      String newHampshireObject[] = { "flag", "flower", "bird", "bird song", "go back", "exit" };
      
      ImageIcon newHampshirePromptImage = new ImageIcon("./img/flags/NewHampshireFlag.png");

      String newHampshireOption = (String) JOptionPane.showInputDialog(null, "Welcome to NewHampshire \nThis is the NewHampshire state flag \n \n Select an option for more information about NewHampshire, go back to select another state, or exit", "NewHampshirePrompt",
            JOptionPane.PLAIN_MESSAGE, newHampshirePromptImage, newHampshireObject, newHampshireObject[0]);
      newHampshire.optionChooser(newHampshire, newHampshireOption, newHampshireObject);      
      
   }
   
   public void optionChooser(NewHampshire newHampshire, String option, String[] object){
      FiftyStates fifty = new FiftyStates();
   
      switch(option){
         case "flag":
            newHampshire.newHampshireFlag(newHampshire, option, object);
            break;
         case "flower":
            newHampshire.newHampshireFlower(newHampshire, option, object);
            break;
         case "bird":
            newHampshire.newHampshireBird(newHampshire, option, object);
            break;
         case "bird song":
            newHampshire.newHampshireBirdSong(newHampshire, option, object);
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
   
   public void newHampshireFlag(NewHampshire newHampshire, String option, String[] object){
      ImageIcon newHampshireFlagImage = new ImageIcon("./img/flags/NewHampshireFlag.png");

      String newHampshireFlagOption = (String) JOptionPane.showInputDialog(null, "This is the NewHampshire state flag \n \n Select an option for more information about NewHampshire, go back to select another state, or exit", "NewHampshireFlag",
            JOptionPane.PLAIN_MESSAGE, newHampshireFlagImage, object, object[0]);
      newHampshire.optionChooser(newHampshire, newHampshireFlagOption, object);
   }
   
   public void newHampshireFlower(NewHampshire newHampshire, String option, String[] object){
      ImageIcon newHampshireFlowerImage = new ImageIcon("./img/flowers/NewHampshireFlower.jpeg");

      String newHampshireFlowerOption = (String) JOptionPane.showInputDialog(null, "This is the NewHampshire state flower \n It is the Purple Lilac\n \n Select an option for more information about NewHampshire, go back to select another state, or exit", "NewHampshireFlower",
            JOptionPane.PLAIN_MESSAGE, newHampshireFlowerImage, object, object[0]);
      newHampshire.optionChooser(newHampshire, newHampshireFlowerOption, object);
   }
   
   public void newHampshireBird(NewHampshire newHampshire, String option, String[] object){
      ImageIcon newHampshireBirdImage = new ImageIcon("./img/birds/NewHampshireBird.jpeg");

      String newHampshireBirdOption = (String) JOptionPane.showInputDialog(null, "This is the NewHampshire state bird \n It is the Purple Finch \n \n Select an option for more information about NewHampshire, go back to select another state, or exit", "NewHampshireBird",
            JOptionPane.PLAIN_MESSAGE, newHampshireBirdImage, object, object[0]);
      newHampshire.optionChooser(newHampshire, newHampshireBirdOption, object);
   }
   
   public void newHampshireBirdSong(NewHampshire newHampshire, String option, String[] object){
      ImageIcon newHampshireBirdSongImage = new ImageIcon("./img/birds/NewHampshireBird.jpeg");      
     
      JFrame frame = new JFrame("NewHampshireBirdSong");
      JPanel canvas = new JPanel();
      JLabel text = new JLabel("<html>This is NewHampshire state Bird Song! <br> It is the Purple Finch Song <br> Click the play button to play the NewHampshire state bird song <br> Select go back to go to the NewHampshire state bird!<html>");
      JLabel picture = new JLabel(newHampshireBirdSongImage);
      JButton play = new JButton("Play Bird Song!");
      JButton back = new JButton("Go Back!");
      play.addActionListener(e-> newHampshire.sound());
      back.addActionListener(e-> newHampshire.backPrompt(newHampshire, option, object, frame));
      
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
         AudioInputStream input = AudioSystem.getAudioInputStream(new File("./sound/NewHampshireSong.wav"));
         Clip clip = AudioSystem.getClip();
         Thread.sleep(10); 
         clip.open(input);
         clip.loop(0);
         Thread.sleep(1500);
      } catch (Exception sound){
         System.out.println("Error occured when playing sound!");
      }
   }
   
   public void backPrompt(NewHampshire newHampshire, String option, String[] object, JFrame frame){
      frame.dispose();
      newHampshire.newHampshireBird(newHampshire, option, object);
   }
      
      
}
   
