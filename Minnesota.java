//test minnesota class

import javax.swing.*;
import javax.sound.sampled.*;
import java.io.File;

public class Minnesota{
   Minnesota(){

   }
   
   
   public void minnesotaPrompt(){
      Minnesota minnesota = new Minnesota();
   
      String minnesotaObject[] = { "flag", "flower", "bird", "bird song", "go back", "exit" };
      
      ImageIcon minnesotaPromptImage = new ImageIcon("./img/flags/MinnesotaFlag.png");

      String minnesotaOption = (String) JOptionPane.showInputDialog(null, "Welcome to Minnesota \nThis is the Minnesota state flag \n \n Select an option for more information about Minnesota, go back to select another state, or exit", "MinnesotaPrompt",
            JOptionPane.PLAIN_MESSAGE, minnesotaPromptImage, minnesotaObject, minnesotaObject[0]);
      minnesota.optionChooser(minnesota, minnesotaOption, minnesotaObject);      
      
   }
   
   public void optionChooser(Minnesota minnesota, String option, String[] object){
      FiftyStates fifty = new FiftyStates();
   
      switch(option){
         case "flag":
            minnesota.minnesotaFlag(minnesota, option, object);
            break;
         case "flower":
            minnesota.minnesotaFlower(minnesota, option, object);
            break;
         case "bird":
            minnesota.minnesotaBird(minnesota, option, object);
            break;
         case "bird song":
            minnesota.minnesotaBirdSong(minnesota, option, object);
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
   
   public void minnesotaFlag(Minnesota minnesota, String option, String[] object){
      ImageIcon minnesotaFlagImage = new ImageIcon("./img/flags/MinnesotaFlag.png");

      String minnesotaFlagOption = (String) JOptionPane.showInputDialog(null, "This is the Minnesota state flag \n \n Select an option for more information about Minnesota, go back to select another state, or exit", "MinnesotaFlag",
            JOptionPane.PLAIN_MESSAGE, minnesotaFlagImage, object, object[0]);
      minnesota.optionChooser(minnesota, minnesotaFlagOption, object);
   }
   
   public void minnesotaFlower(Minnesota minnesota, String option, String[] object){
      ImageIcon minnesotaFlowerImage = new ImageIcon("./img/flowers/MinnesotaFlower.jpeg");

      String minnesotaFlowerOption = (String) JOptionPane.showInputDialog(null, "This is the Minnesota state flower \n It is the Pink and White Lady's Slipper\n \n Select an option for more information about Minnesota, go back to select another state, or exit", "MinnesotaFlower",
            JOptionPane.PLAIN_MESSAGE, minnesotaFlowerImage, object, object[0]);
      minnesota.optionChooser(minnesota, minnesotaFlowerOption, object);
   }
   
   public void minnesotaBird(Minnesota minnesota, String option, String[] object){
      ImageIcon minnesotaBirdImage = new ImageIcon("./img/birds/MinnesotaBird.jpeg");

      String minnesotaBirdOption = (String) JOptionPane.showInputDialog(null, "This is the Minnesota state bird \n It is the Common Loon \n \n Select an option for more information about Minnesota, go back to select another state, or exit", "MinnesotaBird",
            JOptionPane.PLAIN_MESSAGE, minnesotaBirdImage, object, object[0]);
      minnesota.optionChooser(minnesota, minnesotaBirdOption, object);
   }
   
   public void minnesotaBirdSong(Minnesota minnesota, String option, String[] object){
      ImageIcon minnesotaBirdSongImage = new ImageIcon("./img/birds/MinnesotaBird.jpeg");      
     
      JFrame frame = new JFrame("MinnesotaBirdSong");
      JPanel canvas = new JPanel();
      JLabel text = new JLabel("<html>This is Minnesota state Bird Song! <br> It is the Common Loon Song <br> Click the play button to play the Minnesota state bird song <br> Select go back to go to the Minnesota state bird!<html>");
      JLabel picture = new JLabel(minnesotaBirdSongImage);
      JButton play = new JButton("Play Bird Song!");
      JButton back = new JButton("Go Back!");
      play.addActionListener(e-> minnesota.sound());
      back.addActionListener(e-> minnesota.backPrompt(minnesota, option, object, frame));
      
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
         AudioInputStream input = AudioSystem.getAudioInputStream(new File("./sound/MinnesotaSong.wav"));
         Clip clip = AudioSystem.getClip();
         Thread.sleep(10); 
         clip.open(input);
         clip.loop(0);
         Thread.sleep(1500);
      } catch (Exception sound){
         System.out.println("Error occured when playing sound!");
      }
   }
   
   public void backPrompt(Minnesota minnesota, String option, String[] object, JFrame frame){
      frame.dispose();
      minnesota.minnesotaBird(minnesota, option, object);
   }
      
      
}
   
