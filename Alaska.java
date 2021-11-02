//test alaska class

import javax.swing.*;
import javax.sound.sampled.*;
import java.io.File;

public class Alaska{
   Alaska(){

   }
   
   
   public void alaskaPrompt(){
      Alaska alaska = new Alaska();
   
      String alaskaObject[] = { "flag", "flower", "bird", "bird song", "go back", "exit" };
      
      ImageIcon alaskaPromptImage = new ImageIcon("./img/flags/AlaskaFlag.png");

      String alaskaOption = (String) JOptionPane.showInputDialog(null, "Welcome to Alaska \nThis is the Alaska state flag \n \n Select an option for more information about Alaska, go back to select another state, or exit", "AlaskaPrompt",
            JOptionPane.PLAIN_MESSAGE, alaskaPromptImage, alaskaObject, alaskaObject[0]);
      alaska.optionChooser(alaska, alaskaOption, alaskaObject);      
      
   }
   
   public void optionChooser(Alaska alaska, String option, String[] object){
      FiftyStates fifty = new FiftyStates();
   
      switch(option){
         case "flag":
            alaska.alaskaFlag(alaska, option, object);
            break;
         case "flower":
            alaska.alaskaFlower(alaska, option, object);
            break;
         case "bird":
            alaska.alaskaBird(alaska, option, object);
            break;
         case "bird song":
            alaska.alaskaBirdSong(alaska, option, object);
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
   
   public void alaskaFlag(Alaska alaska, String option, String[] object){
      ImageIcon alaskaFlagImage = new ImageIcon("./img/flags/AlaskaFlag.png");

      String alaskaFlagOption = (String) JOptionPane.showInputDialog(null, "This is the Alaska state flag \n \n Select an option for more information about Alaska, go back to select another state, or exit", "AlaskaFlag",
            JOptionPane.PLAIN_MESSAGE, alaskaFlagImage, object, object[0]);
      alaska.optionChooser(alaska, alaskaFlagOption, object);
   }
   
   public void alaskaFlower(Alaska alaska, String option, String[] object){
      ImageIcon alaskaFlowerImage = new ImageIcon("./img/flowers/AlaskaFlower.jpeg");

      String alaskaFlowerOption = (String) JOptionPane.showInputDialog(null, "This is the Alaska state flower \n It is the Forget-Me-Not\n \n Select an option for more information about Alaska, go back to select another state, or exit", "AlaskaFlower",
            JOptionPane.PLAIN_MESSAGE, alaskaFlowerImage, object, object[0]);
      alaska.optionChooser(alaska, alaskaFlowerOption, object);
   }
   
   public void alaskaBird(Alaska alaska, String option, String[] object){
      ImageIcon alaskaBirdImage = new ImageIcon("./img/birds/AlaskaBird.jpeg");

      String alaskaBirdOption = (String) JOptionPane.showInputDialog(null, "This is the Alaska state bird \n It is the Willow Ptarmigan \n \n Select an option for more information about Alaska, go back to select another state, or exit", "AlaskaBird",
            JOptionPane.PLAIN_MESSAGE, alaskaBirdImage, object, object[0]);
      alaska.optionChooser(alaska, alaskaBirdOption, object);
   }
   
   public void alaskaBirdSong(Alaska alaska, String option, String[] object){
      ImageIcon alaskaBirdSongImage = new ImageIcon("./img/birds/AlaskaBird.jpeg");      
     
      JFrame frame = new JFrame("AlaskaBirdSong");
      JPanel canvas = new JPanel();
      JLabel text = new JLabel("<html>This is Alaska state Bird Song! <br> It is the Willow Ptarmigan Song <br> Click the play button to play the Alaska state bird song <br> Select go back to go to the Alaska state bird!<html>");
      JLabel picture = new JLabel(alaskaBirdSongImage);
      JButton play = new JButton("Play Bird Song!");
      JButton back = new JButton("Go Back!");
      play.addActionListener(e-> alaska.sound());
      back.addActionListener(e-> alaska.backPrompt(alaska, option, object, frame));
      
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
         AudioInputStream input = AudioSystem.getAudioInputStream(new File("./sound/AlaskaSong.wav"));
         Clip clip = AudioSystem.getClip();
         Thread.sleep(10); 
         clip.open(input);
         clip.loop(0);
         Thread.sleep(1500);
      } catch (Exception sound){
         System.out.println("Error occured when playing sound!");
      }
   }
   
   public void backPrompt(Alaska alaska, String option, String[] object, JFrame frame){
      frame.dispose();
      alaska.alaskaBird(alaska, option, object);
   }
      
      
}
   