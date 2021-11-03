//FiftyStates
//James Nelson
//Computer Programming I
//October 19, 2021
//Fifty States Project Louisiana

import javax.swing.*;
import javax.sound.sampled.*;
import java.io.File;

public class Louisiana{
   Louisiana(){

   }
   
   
   public void louisianaPrompt(){
      Louisiana louisiana = new Louisiana();
   
      String louisianaObject[] = { "flag", "flower", "bird", "bird song", "go back", "exit" };
      
      ImageIcon louisianaPromptImage = new ImageIcon("./img/flags/LouisianaFlag.png");

      String louisianaOption = (String) JOptionPane.showInputDialog(null, "Welcome to Louisiana \nThis is the Louisiana state flag \n \n Select an option for more information about Louisiana, go back to select another state, or exit", "LouisianaPrompt",
            JOptionPane.PLAIN_MESSAGE, louisianaPromptImage, louisianaObject, louisianaObject[0]);
      louisiana.optionChooser(louisiana, louisianaOption, louisianaObject);      
      
   }
   
   public void optionChooser(Louisiana louisiana, String option, String[] object){
      FiftyStates fifty = new FiftyStates();
   
      switch(option){
         case "flag":
            louisiana.louisianaFlag(louisiana, option, object);
            break;
         case "flower":
            louisiana.louisianaFlower(louisiana, option, object);
            break;
         case "bird":
            louisiana.louisianaBird(louisiana, option, object);
            break;
         case "bird song":
            louisiana.louisianaBirdSong(louisiana, option, object);
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
   
   public void louisianaFlag(Louisiana louisiana, String option, String[] object){
      ImageIcon louisianaFlagImage = new ImageIcon("./img/flags/LouisianaFlag.png");

      String louisianaFlagOption = (String) JOptionPane.showInputDialog(null, "This is the Louisiana state flag \n \n Select an option for more information about Louisiana, go back to select another state, or exit", "LouisianaFlag",
            JOptionPane.PLAIN_MESSAGE, louisianaFlagImage, object, object[0]);
      louisiana.optionChooser(louisiana, louisianaFlagOption, object);
   }
   
   public void louisianaFlower(Louisiana louisiana, String option, String[] object){
      ImageIcon louisianaFlowerImage = new ImageIcon("./img/flowers/LouisianaFlower.jpeg");

      String louisianaFlowerOption = (String) JOptionPane.showInputDialog(null, "This is the Louisiana state flower \n It is the Magnolia \n \n Select an option for more information about Louisiana, go back to select another state, or exit", "LouisianaFlower",
            JOptionPane.PLAIN_MESSAGE, louisianaFlowerImage, object, object[0]);
      louisiana.optionChooser(louisiana, louisianaFlowerOption, object);
   }
   
   public void louisianaBird(Louisiana louisiana, String option, String[] object){
      ImageIcon louisianaBirdImage = new ImageIcon("./img/birds/LouisianaBird.jpeg");

      String louisianaBirdOption = (String) JOptionPane.showInputDialog(null, "This is the Louisiana state bird \n It is the Brown Pelican \n \n Select an option for more information about Louisiana, go back to select another state, or exit", "LouisianaBird",
            JOptionPane.PLAIN_MESSAGE, louisianaBirdImage, object, object[0]);
      louisiana.optionChooser(louisiana, louisianaBirdOption, object);
   }
   
   public void louisianaBirdSong(Louisiana louisiana, String option, String[] object){
      ImageIcon louisianaBirdSongImage = new ImageIcon("./img/birds/LouisianaBird.jpeg");      
     
      JFrame frame = new JFrame("LouisianaBirdSong");
      JPanel canvas = new JPanel();
      JLabel text = new JLabel("<html>This is Louisiana state Bird Song! <br> It is the Brown Pelican Song <br> Click the play button to play the Louisiana state bird song <br> Select go back to go to the Louisiana state bird!<html>");
      JLabel picture = new JLabel(louisianaBirdSongImage);
      JButton play = new JButton("Play Bird Song!");
      JButton back = new JButton("Go Back!");
      play.addActionListener(e-> louisiana.sound());
      back.addActionListener(e-> louisiana.backPrompt(louisiana, option, object, frame));
      
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
         AudioInputStream input = AudioSystem.getAudioInputStream(new File("./sound/LouisianaSong.wav"));
         Clip clip = AudioSystem.getClip();
         Thread.sleep(10); 
         clip.open(input);
         clip.loop(0);
         Thread.sleep(1500);
      } catch (Exception sound){
         System.out.println("Error occured when playing sound!");
      }
   }
   
   public void backPrompt(Louisiana louisiana, String option, String[] object, JFrame frame){
      frame.dispose();
      louisiana.louisianaBird(louisiana, option, object);
   }
      
      
}
   
