//Texas
//Joshua Hammond
//October 28, 2021
//Computer Programming 1


import javax.swing.*;
import java.awt.*;
import javax.sound.sampled.*;
import java.io.File;
import java.util.*;

public class Texas{
   Texas(){

   }
   
   
   public void texasPrompt(){
      Texas texas = new Texas();
   
      String texasObject[] = { "flag", "flower", "bird", "bird song", "go back", "exit" };
      
      ImageIcon texasPromptImage = new ImageIcon("./img/flags/TexasFlag.png");

      String texasOption = (String) JOptionPane.showInputDialog(null, "Welcome to Texas \nThis is the Texas state flag \n \n Select an option for more information about Texas, go back to select another state, or exit", "TexasPrompt",
            JOptionPane.PLAIN_MESSAGE, texasPromptImage, texasObject, texasObject[0]);
      texas.optionChooser(texas, texasOption, texasObject);      
      
   }
   
   public void optionChooser(Texas texas, String option, String[] object){
      FiftyStates fifty = new FiftyStates();
   
      switch(option){
         case "flag":
            texas.texasFlag(texas, option, object);
            break;
         case "flower":
            texas.texasFlower(texas, option, object);
            break;
         case "bird":
            texas.texasBird(texas, option, object);
            break;
         case "bird song":
            texas.texasBirdSong(texas, option, object);
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
   
   public void texasFlag(Texas texas, String option, String[] object){
      ImageIcon texasFlagImage = new ImageIcon("./img/flags/TexasFlag.png");

      String texasFlagOption = (String) JOptionPane.showInputDialog(null, "This is the Texas state flag \n \n Select an option for more information about Texas, go back to select another state, or exit", "TexasFlag",
            JOptionPane.PLAIN_MESSAGE, texasFlagImage, object, object[0]);
      texas.optionChooser(texas, texasFlagOption, object);
   }
   
   public void texasFlower(Texas texas, String option, String[] object){
      ImageIcon texasFlowerImage = new ImageIcon("./img/flowers/TexasFlower.jpeg");

      String texasFlowerOption = (String) JOptionPane.showInputDialog(null, "This is the Texas state flower \n It is the Bluebonnet\n \n Select an option for more information about Texas, go back to select another state, or exit", "TexasFlower",
            JOptionPane.PLAIN_MESSAGE, texasFlowerImage, object, object[0]);
      texas.optionChooser(texas, texasFlowerOption, object);
   }
   
   public void texasBird(Texas texas, String option, String[] object){
      ImageIcon texasBirdImage = new ImageIcon("./img/birds/TexasBird.jpeg");

      String texasBirdOption = (String) JOptionPane.showInputDialog(null, "This is the Texas state bird \n It is the Northern Mockingbird \n \n Select an option for more information about Texas, go back to select another state, or exit", "TexasBird",
            JOptionPane.PLAIN_MESSAGE, texasBirdImage, object, object[0]);
      texas.optionChooser(texas, texasBirdOption, object);
   }
   
   public void texasBirdSong(Texas texas, String option, String[] object){
      ImageIcon texasBirdSongImage = new ImageIcon("./img/birds/TexasBird.jpeg");      
     
      JFrame frame = new JFrame("TexasBirdSong");
      JPanel canvas = new JPanel();
      JLabel text = new JLabel("<html>This is Texas state Bird Song! <br> It is the Northern Mockingbird Song <br> Click the play button to play the Texas state bird song <br> Select go back to go to the Texas state bird!<html>");
      JLabel picture = new JLabel(texasBirdSongImage);
      JButton play = new JButton("Play Bird Song!");
      JButton back = new JButton("Go Back!");
      play.addActionListener(e-> texas.sound());
      back.addActionListener(e-> texas.backPrompt(texas, option, object, frame));
      
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
         AudioInputStream input = AudioSystem.getAudioInputStream(new File("./sound/TexasSong.wav"));
         Clip clip = AudioSystem.getClip();
         Thread.sleep(10); 
         clip.open(input);
         clip.loop(0);
         Thread.sleep(1500);
      } catch (Exception sound){
         System.out.println("Error occured when playing sound!");
      }
   }
   
   public void backPrompt(Texas texas, String option, String[] object, JFrame frame){
      frame.dispose();
      texas.texasBird(texas, option, object);
   }
      
      
}
   