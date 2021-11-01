//test oregon class

import javax.swing.*;
import java.awt.*;
import javax.sound.sampled.*;
import java.io.File;
import java.util.*;

public class Oregon{
   Oregon(){

   }
   
   
   public void oregonPrompt(){
      Oregon oregon = new Oregon();
   
      String oregonObject[] = { "flag", "flower", "bird", "bird song", "go back", "exit" };
      
      ImageIcon oregonPromptImage = new ImageIcon("./img/flags/OregonFlag.png");

      String oregonOption = (String) JOptionPane.showInputDialog(null, "Welcome to Oregon \nThis is the Oregon state flag \n \n Select an option for more information about Oregon, go back to select another state, or exit", "OregonPrompt",
            JOptionPane.PLAIN_MESSAGE, oregonPromptImage, oregonObject, oregonObject[0]);
      oregon.optionChooser(oregon, oregonOption, oregonObject);      
      
   }
   
   public void optionChooser(Oregon oregon, String option, String[] object){
      FiftyStates fifty = new FiftyStates();
   
      switch(option){
         case "flag":
            oregon.oregonFlag(oregon, option, object);
            break;
         case "flower":
            oregon.oregonFlower(oregon, option, object);
            break;
         case "bird":
            oregon.oregonBird(oregon, option, object);
            break;
         case "bird song":
            oregon.oregonBirdSong(oregon, option, object);
            break;
         case "go back":
            fifty.prompt(oregon);
            break;
         case "exit":
            System.exit(0);
            break;
         default:
            System.exit(0);
            break;
      }
   }
   
   public void oregonFlag(Oregon oregon, String option, String[] object){
      ImageIcon oregonFlagImage = new ImageIcon("./img/flags/OregonFlag.png");

      String oregonFlagOption = (String) JOptionPane.showInputDialog(null, "This is the Oregon state flag \n \n Select an option for more information about Oregon, go back to select another state, or exit", "OregonFlag",
            JOptionPane.PLAIN_MESSAGE, oregonFlagImage, object, object[0]);
      oregon.optionChooser(oregon, oregonFlagOption, object);
   }
   
   public void oregonFlower(Oregon oregon, String option, String[] object){
      ImageIcon oregonFlowerImage = new ImageIcon("./img/flowers/OregonFlower.jpeg");

      String oregonFlowerOption = (String) JOptionPane.showInputDialog(null, "This is the Oregon state flower \n It is the Oregon grape\n \n Select an option for more information about Oregon, go back to select another state, or exit", "OregonFlower",
            JOptionPane.PLAIN_MESSAGE, oregonFlowerImage, object, object[0]);
      oregon.optionChooser(oregon, oregonFlowerOption, object);
   }
   
   public void oregonBird(Oregon oregon, String option, String[] object){
      ImageIcon oregonBirdImage = new ImageIcon("./img/birds/OregonBird.jpeg");

      String oregonBirdOption = (String) JOptionPane.showInputDialog(null, "This is the Oregon state bird \n It is the Western meadowlark \n \n Select an option for more information about Oregon, go back to select another state, or exit", "OregonBird",
            JOptionPane.PLAIN_MESSAGE, oregonBirdImage, object, object[0]);
      oregon.optionChooser(oregon, oregonBirdOption, object);
   }
   
   public void oregonBirdSong(Oregon oregon, String option, String[] object){
      ImageIcon oregonBirdSongImage = new ImageIcon("./img/birds/OregonBird.jpeg");      
     
      JFrame frame = new JFrame("OregonBirdSong");
      JPanel canvas = new JPanel();
      JLabel text = new JLabel("<html>This is Oregon state Bird Song! <br> It is the Western meadowlark Song <br> Click the play button to play the Oregon state bird song <br> Select go back to go to the Oregon state bird!<html>");
      JLabel picture = new JLabel(oregonBirdSongImage);
      JButton play = new JButton("Play Bird Song!");
      JButton back = new JButton("Go Back!");
      play.addActionListener(e-> oregon.sound());
      back.addActionListener(e-> oregon.backPrompt(oregon, option, object, frame));
      
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
         AudioInputStream input = AudioSystem.getAudioInputStream(new File("./sound/OregonSong.wav"));
         Clip clip = AudioSystem.getClip();
         Thread.sleep(10); 
         clip.open(input);
         clip.loop(0);
         Thread.sleep(1500);
      } catch (Exception sound){
         System.out.println("Error occured when playing sound!");
      }
   }
   
   public void backPrompt(Oregon oregon, String option, String[] object, JFrame frame){
      frame.dispose();
      oregon.oregonBird(oregon, option, object);
   }
      
      
}
   