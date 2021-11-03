//FiftyStates
//Joshua Hammond
//Computer Programming I
//October 19, 2021
//Fifty States Project Virginia

import javax.swing.*;
import javax.sound.sampled.*;
import java.io.File;

public class Virginia{
   Virginia(){

   }
   
   
   public void virginiaPrompt(){
      Virginia virginia = new Virginia();
   
      String virginiaObject[] = { "flag", "flower", "bird", "bird song", "go back", "exit" };
      
      ImageIcon virginiaPromptImage = new ImageIcon("./img/flags/VirginiaFlag.png");

      String virginiaOption = (String) JOptionPane.showInputDialog(null, "Welcome to Virginia \nThis is the Virginia state flag \n \n Select an option for more information about Virginia, go back to select another state, or exit", "VirginiaPrompt",
            JOptionPane.PLAIN_MESSAGE, virginiaPromptImage, virginiaObject, virginiaObject[0]);
      virginia.optionChooser(virginia, virginiaOption, virginiaObject);      
      
   }
   
   public void optionChooser(Virginia virginia, String option, String[] object){
      FiftyStates fifty = new FiftyStates();
   
      switch(option){
         case "flag":
            virginia.virginiaFlag(virginia, option, object);
            break;
         case "flower":
            virginia.virginiaFlower(virginia, option, object);
            break;
         case "bird":
            virginia.virginiaBird(virginia, option, object);
            break;
         case "bird song":
            virginia.virginiaBirdSong(virginia, option, object);
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
   
   public void virginiaFlag(Virginia virginia, String option, String[] object){
      ImageIcon virginiaFlagImage = new ImageIcon("./img/flags/VirginiaFlag.png");

      String virginiaFlagOption = (String) JOptionPane.showInputDialog(null, "This is the Virginia state flag \n \n Select an option for more information about Virginia, go back to select another state, or exit", "VirginiaFlag",
            JOptionPane.PLAIN_MESSAGE, virginiaFlagImage, object, object[0]);
      virginia.optionChooser(virginia, virginiaFlagOption, object);
   }
   
   public void virginiaFlower(Virginia virginia, String option, String[] object){
      ImageIcon virginiaFlowerImage = new ImageIcon("./img/flowers/VirginiaFlower.jpeg");

      String virginiaFlowerOption = (String) JOptionPane.showInputDialog(null, "This is the Virginia state flower \n It is the American Dogwood\n \n Select an option for more information about Virginia, go back to select another state, or exit", "VirginiaFlower",
            JOptionPane.PLAIN_MESSAGE, virginiaFlowerImage, object, object[0]);
      virginia.optionChooser(virginia, virginiaFlowerOption, object);
   }
   
   public void virginiaBird(Virginia virginia, String option, String[] object){
      ImageIcon virginiaBirdImage = new ImageIcon("./img/birds/VirginiaBird.jpeg");

      String virginiaBirdOption = (String) JOptionPane.showInputDialog(null, "This is the Virginia state bird \n It is the Northern Cardinal \n \n Select an option for more information about Virginia, go back to select another state, or exit", "VirginiaBird",
            JOptionPane.PLAIN_MESSAGE, virginiaBirdImage, object, object[0]);
      virginia.optionChooser(virginia, virginiaBirdOption, object);
   }
   
   public void virginiaBirdSong(Virginia virginia, String option, String[] object){
      ImageIcon virginiaBirdSongImage = new ImageIcon("./img/birds/VirginiaBird.jpeg");      
     
      JFrame frame = new JFrame("VirginiaBirdSong");
      JPanel canvas = new JPanel();
      JLabel text = new JLabel("<html>This is Virginia state Bird Song! <br> It is the Northern Cardinal Song <br> Click the play button to play the Virginia state bird song <br> Select go back to go to the Virginia state bird!<html>");
      JLabel picture = new JLabel(virginiaBirdSongImage);
      JButton play = new JButton("Play Bird Song!");
      JButton back = new JButton("Go Back!");
      play.addActionListener(e-> virginia.sound());
      back.addActionListener(e-> virginia.backPrompt(virginia, option, object, frame));
      
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
         AudioInputStream input = AudioSystem.getAudioInputStream(new File("./sound/VirginiaSong.wav"));
         Clip clip = AudioSystem.getClip();
         Thread.sleep(10); 
         clip.open(input);
         clip.loop(0);
         Thread.sleep(1500);
      } catch (Exception sound){
         System.out.println("Error occured when playing sound!");
      }
   }
   
   public void backPrompt(Virginia virginia, String option, String[] object, JFrame frame){
      frame.dispose();
      virginia.virginiaBird(virginia, option, object);
   }
      
      
}
   