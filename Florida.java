//test florida class

import javax.swing.*;
import javax.sound.sampled.*;
import java.io.File;

public class Florida{
   Florida(){

   }
   
   
   public void floridaPrompt(){
      Florida florida = new Florida();
   
      String floridaObject[] = { "flag", "flower", "bird", "bird song", "go back", "exit" };
      
      ImageIcon floridaPromptImage = new ImageIcon("./img/flags/FloridaFlag.png");

      String floridaOption = (String) JOptionPane.showInputDialog(null, "Welcome to Florida \nThis is the Florida state flag \n \n Select an option for more information about Florida, go back to select another state, or exit", "FloridaPrompt",
            JOptionPane.PLAIN_MESSAGE, floridaPromptImage, floridaObject, floridaObject[0]);
      florida.optionChooser(florida, floridaOption, floridaObject);      
      
   }
   
   public void optionChooser(Florida florida, String option, String[] object){
      FiftyStates fifty = new FiftyStates();
   
      switch(option){
         case "flag":
            florida.floridaFlag(florida, option, object);
            break;
         case "flower":
            florida.floridaFlower(florida, option, object);
            break;
         case "bird":
            florida.floridaBird(florida, option, object);
            break;
         case "bird song":
            florida.floridaBirdSong(florida, option, object);
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
   
   public void floridaFlag(Florida florida, String option, String[] object){
      ImageIcon floridaFlagImage = new ImageIcon("./img/flags/FloridaFlag.png");

      String floridaFlagOption = (String) JOptionPane.showInputDialog(null, "This is the Florida state flag \n \n Select an option for more information about Florida, go back to select another state, or exit", "FloridaFlag",
            JOptionPane.PLAIN_MESSAGE, floridaFlagImage, object, object[0]);
      florida.optionChooser(florida, floridaFlagOption, object);
   }
   
   public void floridaFlower(Florida florida, String option, String[] object){
      ImageIcon floridaFlowerImage = new ImageIcon("./img/flowers/FloridaFlower.jpeg");

      String floridaFlowerOption = (String) JOptionPane.showInputDialog(null, "This is the Florida state flower \n It is the Orange Blossom\n \n Select an option for more information about Florida, go back to select another state, or exit", "FloridaFlower",
            JOptionPane.PLAIN_MESSAGE, floridaFlowerImage, object, object[0]);
      florida.optionChooser(florida, floridaFlowerOption, object);
   }
   
   public void floridaBird(Florida florida, String option, String[] object){
      ImageIcon floridaBirdImage = new ImageIcon("./img/birds/FloridaBird.jpeg");

      String floridaBirdOption = (String) JOptionPane.showInputDialog(null, "This is the Florida state bird \n It is the Northern Mockingbird \n \n Select an option for more information about Florida, go back to select another state, or exit", "FloridaBird",
            JOptionPane.PLAIN_MESSAGE, floridaBirdImage, object, object[0]);
      florida.optionChooser(florida, floridaBirdOption, object);
   }
   
   public void floridaBirdSong(Florida florida, String option, String[] object){
      ImageIcon floridaBirdSongImage = new ImageIcon("./img/birds/FloridaBird.jpeg");      
     
      JFrame frame = new JFrame("FloridaBirdSong");
      JPanel canvas = new JPanel();
      JLabel text = new JLabel("<html>This is Florida state Bird Song! <br> It is the Northern Mockingbird Song <br> Click the play button to play the Florida state bird song <br> Select go back to go to the Florida state bird!<html>");
      JLabel picture = new JLabel(floridaBirdSongImage);
      JButton play = new JButton("Play Bird Song!");
      JButton back = new JButton("Go Back!");
      play.addActionListener(e-> florida.sound());
      back.addActionListener(e-> florida.backPrompt(florida, option, object, frame));
      
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
         AudioInputStream input = AudioSystem.getAudioInputStream(new File("./sound/FloridaSong.wav"));
         Clip clip = AudioSystem.getClip();
         Thread.sleep(10); 
         clip.open(input);
         clip.loop(0);
         Thread.sleep(1500);
      } catch (Exception sound){
         System.out.println("Error occured when playing sound!");
      }
   }
   
   public void backPrompt(Florida florida, String option, String[] object, JFrame frame){
      frame.dispose();
      florida.floridaBird(florida, option, object);
   }
      
      
}