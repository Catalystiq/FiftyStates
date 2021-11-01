//Hiba
//New Mexico


import javax.swing.*;
import java.awt.*;
import javax.sound.sampled.*;
import java.io.File;
import java.util.*;

public class NewMexico{
   NewMexico(){

   }
   
   
   public void newMexicoPrompt(){
      NewMexico newMexico = new NewMexico();
   
      String newMexicoObject[] = { "flag", "flower", "bird", "bird song", "go back", "exit" };
      
      ImageIcon newMexicoPromptImage = new ImageIcon("./img/flags/NewMexicoFlag.png");

      String newMexicoOption = (String) JOptionPane.showInputDialog(null, "Welcome to New Mexico \nThis is the New Mexico state flag \n \n Select an option for more information about NewMexico, go back to select another state, or exit", "NewMexicoPrompt",
            JOptionPane.PLAIN_MESSAGE, newMexicoPromptImage, newMexicoObject, newMexicoObject[0]);
      newMexico.optionChooser(newMexico, newMexicoOption, newMexicoObject);      
      
   }
   
   public void optionChooser(NewMexico newMexico, String option, String[] object){
      FiftyStates fifty = new FiftyStates();
   
      switch(option){
         case "flag":
            newMexico.newMexicoFlag(newMexico, option, object);
            break;
         case "flower":
            newMexico.newMexicoFlower(newMexico, option, object);
            break;
         case "bird":
            newMexico.newMexicoBird(newMexico, option, object);
            break;
         case "bird song":
            newMexico.newMexicoBirdSong(newMexico, option, object);
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
   
   public void newMexicoFlag(NewMexico newMexico, String option, String[] object){
      ImageIcon newMexicoFlagImage = new ImageIcon("./img/flags/NewMexicoFlag.png");

      String newMexicoFlagOption = (String) JOptionPane.showInputDialog(null, "This is the New Mexico state flag \n \n Select an option for more information about New Mexico, go back to select another state, or exit", "NewMexicoFlag",
            JOptionPane.PLAIN_MESSAGE, newMexicoFlagImage, object, object[0]);
      newMexico.optionChooser(newMexico, newMexicoFlagOption, object);
   }
   
   public void newMexicoFlower(NewMexico newMexico, String option, String[] object){
      ImageIcon newMexicoFlowerImage = new ImageIcon("./img/flowers/NewMexicoFlower.jpeg");

      String newMexicoFlowerOption = (String) JOptionPane.showInputDialog(null, "This is the New Mexico state flower \n It is the Yucca\n \n Select an option for more information about New Mexico, go back to select another state, or exit", "NewMexicoFlower",
            JOptionPane.PLAIN_MESSAGE, newMexicoFlowerImage, object, object[0]);
      newMexico.optionChooser(newMexico, newMexicoFlowerOption, object);
   }
   
   public void newMexicoBird(NewMexico newMexico, String option, String[] object){
      ImageIcon newMexicoBirdImage = new ImageIcon("./img/birds/NewMexicoBird.jpeg");

      String newMexicoBirdOption = (String) JOptionPane.showInputDialog(null, "This is the New Mexico state bird \n It is the Greater roadrunner \n \n Select an option for more information about New Mexico, go back to select another state, or exit", "NewMexicoBird",
            JOptionPane.PLAIN_MESSAGE, newMexicoBirdImage, object, object[0]);
      newMexico.optionChooser(newMexico, newMexicoBirdOption, object);
   }
   
   public void newMexicoBirdSong(NewMexico newMexico, String option, String[] object){
      ImageIcon newMexicoBirdSongImage = new ImageIcon("./img/birds/NewMexicoBird.jpeg");      
     
      JFrame frame = new JFrame("NewMexicoBirdSong");
      JPanel canvas = new JPanel();
      JLabel text = new JLabel("<html>This is New Mexico state Bird Song! <br> It is the Greater roadrunner Song <br> Click the play button to play the New Mexico state bird song <br> Select go back to go to the New Mexico state bird!<html>");
      JLabel picture = new JLabel(newMexicoBirdSongImage);
      JButton play = new JButton("Play Bird Song!");
      JButton back = new JButton("Go Back!");
      play.addActionListener(e-> newMexico.sound());
      back.addActionListener(e-> newMexico.backPrompt(newMexico, option, object, frame));
      
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
         AudioInputStream input = AudioSystem.getAudioInputStream(new File("./sound/NewMexicoSong.wav"));
         Clip clip = AudioSystem.getClip();
         Thread.sleep(10); 
         clip.open(input);
         clip.loop(0);
         Thread.sleep(1500);
      } catch (Exception sound){
         System.out.println("Error occured when playing sound!");
      }
   }
   
   public void backPrompt(NewMexico newMexico, String option, String[] object, JFrame frame){
      frame.dispose();
      newMexico.newMexicoBird(newMexico, option, object);
   }
      
      
}
   