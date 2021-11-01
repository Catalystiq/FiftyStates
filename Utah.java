//Utah
//Joshua Hammond
//October 28, 2021
//Computer Programming 1


import javax.swing.*;
import java.awt.*;
import javax.sound.sampled.*;
import java.io.File;
import java.util.*;

public class Utah{
   Utah(){

   }
   
   
   public void utahPrompt(){
      Utah utah = new Utah();
   
      String utahObject[] = { "flag", "flower", "bird", "bird song", "go back", "exit" };
      
      ImageIcon utahPromptImage = new ImageIcon("./img/flags/UtahFlag.png");

      String utahOption = (String) JOptionPane.showInputDialog(null, "Welcome to Utah \nThis is the Utah state flag \n \n Select an option for more information about Utah, go back to select another state, or exit", "UtahPrompt",
            JOptionPane.PLAIN_MESSAGE, utahPromptImage, utahObject, utahObject[0]);
      utah.optionChooser(utah, utahOption, utahObject);      
      
   }
   
   public void optionChooser(Utah utah, String option, String[] object){
      FiftyStates fifty = new FiftyStates();
   
      switch(option){
         case "flag":
            utah.utahFlag(utah, option, object);
            break;
         case "flower":
            utah.utahFlower(utah, option, object);
            break;
         case "bird":
            utah.utahBird(utah, option, object);
            break;
         case "bird song":
            utah.utahBirdSong(utah, option, object);
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
   
   public void utahFlag(Utah utah, String option, String[] object){
      ImageIcon utahFlagImage = new ImageIcon("./img/flags/UtahFlag.png");

      String utahFlagOption = (String) JOptionPane.showInputDialog(null, "This is the Utah state flag \n \n Select an option for more information about Utah, go back to select another state, or exit", "UtahFlag",
            JOptionPane.PLAIN_MESSAGE, utahFlagImage, object, object[0]);
      utah.optionChooser(utah, utahFlagOption, object);
   }
   
   public void utahFlower(Utah utah, String option, String[] object){
      ImageIcon utahFlowerImage = new ImageIcon("./img/flowers/UtahFlower.jpeg");

      String utahFlowerOption = (String) JOptionPane.showInputDialog(null, "This is the Utah state flower \n It is the Sego Lily\n \n Select an option for more information about Utah, go back to select another state, or exit", "UtahFlower",
            JOptionPane.PLAIN_MESSAGE, utahFlowerImage, object, object[0]);
      utah.optionChooser(utah, utahFlowerOption, object);
   }
   
   public void utahBird(Utah utah, String option, String[] object){
      ImageIcon utahBirdImage = new ImageIcon("./img/birds/UtahBird.jpeg");

      String utahBirdOption = (String) JOptionPane.showInputDialog(null, "This is the Utah state bird \n It is the California Gull \n \n Select an option for more information about Utah, go back to select another state, or exit", "UtahBird",
            JOptionPane.PLAIN_MESSAGE, utahBirdImage, object, object[0]);
      utah.optionChooser(utah, utahBirdOption, object);
   }
   
   public void utahBirdSong(Utah utah, String option, String[] object){
      ImageIcon utahBirdSongImage = new ImageIcon("./img/birds/UtahBird.jpeg");      
     
      JFrame frame = new JFrame("UtahBirdSong");
      JPanel canvas = new JPanel();
      JLabel text = new JLabel("<html>This is Utah state Bird Song! <br> It is the California Gull Song <br> Click the play button to play the Utah state bird song <br> Select go back to go to the Utah state bird!<html>");
      JLabel picture = new JLabel(utahBirdSongImage);
      JButton play = new JButton("Play Bird Song!");
      JButton back = new JButton("Go Back!");
      play.addActionListener(e-> utah.sound());
      back.addActionListener(e-> utah.backPrompt(utah, option, object, frame));
      
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
         AudioInputStream input = AudioSystem.getAudioInputStream(new File("./sound/UtahSong.wav"));
         Clip clip = AudioSystem.getClip();
         Thread.sleep(10); 
         clip.open(input);
         clip.loop(0);
         Thread.sleep(1500);
      } catch (Exception sound){
         System.out.println("Error occured when playing sound!");
      }
   }
   
   public void backPrompt(Utah utah, String option, String[] object, JFrame frame){
      frame.dispose();
      utah.utahBird(utah, option, object);
   }
      
      
}
   