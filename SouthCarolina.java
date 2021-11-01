//test southCarolina class

import javax.swing.*;
import java.awt.*;
import javax.sound.sampled.*;
import java.io.File;
import java.util.*;

public class SouthCarolina{
   SouthCarolina(){

   }
   
   
   public void southCarolinaPrompt(){
      SouthCarolina southCarolina = new SouthCarolina();
   
      String southCarolinaObject[] = { "flag", "flower", "bird", "bird song", "go back", "exit" };
      
      ImageIcon southCarolinaPromptImage = new ImageIcon("./img/flags/SouthCarolinaFlag.png");

      String southCarolinaOption = (String) JOptionPane.showInputDialog(null, "Welcome to SouthCarolina \nThis is the South Carolina state flag \n \n Select an option for more information about South Carolina, go back to select another state, or exit", "SouthCarolinaPrompt",
            JOptionPane.PLAIN_MESSAGE, southCarolinaPromptImage, southCarolinaObject, southCarolinaObject[0]);
      southCarolina.optionChooser(southCarolina, southCarolinaOption, southCarolinaObject);      
      
   }
   
   public void optionChooser(SouthCarolina southCarolina, String option, String[] object){
      FiftyStates fifty = new FiftyStates();
   
      switch(option){
         case "flag":
            southCarolina.southCarolinaFlag(southCarolina, option, object);
            break;
         case "flower":
            southCarolina.southCarolinaFlower(southCarolina, option, object);
            break;
         case "bird":
            southCarolina.southCarolinaBird(southCarolina, option, object);
            break;
         case "bird song":
            southCarolina.southCarolinaBirdSong(southCarolina, option, object);
            break;
         case "go back":
            fifty.prompt(southCarolina);
            break;
         case "exit":
            System.exit(0);
            break;
         default:
            System.exit(0);
            break;
      }
   }
   
   public void southCarolinaFlag(SouthCarolina southCarolina, String option, String[] object){
      ImageIcon southCarolinaFlagImage = new ImageIcon("./img/flags/SouthCarolinaFlag.png");

      String southCarolinaFlagOption = (String) JOptionPane.showInputDialog(null, "This is the South Carolina state flag \n \n Select an option for more information about South Carolina, go back to select another state, or exit", "SouthCarolinaFlag",
            JOptionPane.PLAIN_MESSAGE, southCarolinaFlagImage, object, object[0]);
      southCarolina.optionChooser(southCarolina, southCarolinaFlagOption, object);
   }
   
   public void southCarolinaFlower(SouthCarolina southCarolina, String option, String[] object){
      ImageIcon southCarolinaFlowerImage = new ImageIcon("./img/flowers/SouthCarolinaFlower.jpeg");

      String southCarolinaFlowerOption = (String) JOptionPane.showInputDialog(null, "This is the South Carolina state flower \n It is the Yellow jessamine\n \n Select an option for more information about South Carolina, go back to select another state, or exit", "SouthCarolinaFlower",
            JOptionPane.PLAIN_MESSAGE, southCarolinaFlowerImage, object, object[0]);
      southCarolina.optionChooser(southCarolina, southCarolinaFlowerOption, object);
   }
   
   public void southCarolinaBird(SouthCarolina southCarolina, String option, String[] object){
      ImageIcon southCarolinaBirdImage = new ImageIcon("./img/birds/SouthCarolinaBird.jpeg");

      String southCarolinaBirdOption = (String) JOptionPane.showInputDialog(null, "This is the South Carolina state bird \n It is the Carolina wren \n \n Select an option for more information about South Carolina, go back to select another state, or exit", "SouthCarolinaBird",
            JOptionPane.PLAIN_MESSAGE, southCarolinaBirdImage, object, object[0]);
      southCarolina.optionChooser(southCarolina, southCarolinaBirdOption, object);
   }
   
   public void southCarolinaBirdSong(SouthCarolina southCarolina, String option, String[] object){
      ImageIcon southCarolinaBirdSongImage = new ImageIcon("./img/birds/SouthCarolinaBird.jpeg");      
     
      JFrame frame = new JFrame("SouthCarolinaBirdSong");
      JPanel canvas = new JPanel();
      JLabel text = new JLabel("<html>This is South Carolina state Bird Song! <br> It is the Carolina wren Song <br> Click the play button to play the South Carolina state bird song <br> Select go back to go to the South Carolina state bird!<html>");
      JLabel picture = new JLabel(southCarolinaBirdSongImage);
      JButton play = new JButton("Play Bird Song!");
      JButton back = new JButton("Go Back!");
      play.addActionListener(e-> southCarolina.sound());
      back.addActionListener(e-> southCarolina.backPrompt(southCarolina, option, object, frame));
      
      canvas.add(picture);
      canvas.add(text);
      canvas.add(play);
      canvas.add(back);

      frame.add(canvas); 
      frame.setSize(600,600);
      frame.setVisible(true);
   }
   
    public void sound(){
      try{
         AudioInputStream input = AudioSystem.getAudioInputStream(new File("./sound/SouthCarolinaSong.wav"));
         Clip clip = AudioSystem.getClip();
         Thread.sleep(10); 
         clip.open(input);
         clip.loop(0);
         Thread.sleep(1500);
      } catch (Exception sound){
         System.out.println("Error occured when playing sound!");
      }
   }
   
   public void backPrompt(SouthCarolina southCarolina, String option, String[] object, JFrame frame){
      frame.dispose();
      southCarolina.southCarolinaBird(southCarolina, option, object);
   }
      
      
}
   