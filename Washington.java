//FiftyStates
//Joshua Hammond
//Computer Programming I
//October 19, 2021
//Fifty States Project Washington

import javax.swing.*;
import javax.sound.sampled.*;
import java.io.File;

public class Washington{
   Washington(){

   }
   
   
   public void washingtonPrompt(){
      Washington washington = new Washington();
   
      String washingtonObject[] = { "flag", "flower", "bird", "bird song", "go back", "exit" };
      
      ImageIcon washingtonPromptImage = new ImageIcon("./img/flags/WashingtonFlag.png");

      String washingtonOption = (String) JOptionPane.showInputDialog(null, "Welcome to Washington \nThis is the Washington state flag \n \n Select an option for more information about Washington, go back to select another state, or exit", "WashingtonPrompt",
            JOptionPane.PLAIN_MESSAGE, washingtonPromptImage, washingtonObject, washingtonObject[0]);
      washington.optionChooser(washington, washingtonOption, washingtonObject);      
      
   }
   
   public void optionChooser(Washington washington, String option, String[] object){
      FiftyStates fifty = new FiftyStates();
   
      switch(option){
         case "flag":
            washington.washingtonFlag(washington, option, object);
            break;
         case "flower":
            washington.washingtonFlower(washington, option, object);
            break;
         case "bird":
            washington.washingtonBird(washington, option, object);
            break;
         case "bird song":
            washington.washingtonBirdSong(washington, option, object);
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
   
   public void washingtonFlag(Washington washington, String option, String[] object){
      ImageIcon washingtonFlagImage = new ImageIcon("./img/flags/WashingtonFlag.png");

      String washingtonFlagOption = (String) JOptionPane.showInputDialog(null, "This is the Washington state flag \n \n Select an option for more information about Washington, go back to select another state, or exit", "WashingtonFlag",
            JOptionPane.PLAIN_MESSAGE, washingtonFlagImage, object, object[0]);
      washington.optionChooser(washington, washingtonFlagOption, object);
   }
   
   public void washingtonFlower(Washington washington, String option, String[] object){
      ImageIcon washingtonFlowerImage = new ImageIcon("./img/flowers/WashingtonFlower.jpeg");

      String washingtonFlowerOption = (String) JOptionPane.showInputDialog(null, "This is the Washington state flower \n It is the Coast Rhododendron\n \n Select an option for more information about Washington, go back to select another state, or exit", "WashingtonFlower",
            JOptionPane.PLAIN_MESSAGE, washingtonFlowerImage, object, object[0]);
      washington.optionChooser(washington, washingtonFlowerOption, object);
   }
   
   public void washingtonBird(Washington washington, String option, String[] object){
      ImageIcon washingtonBirdImage = new ImageIcon("./img/birds/WashingtonBird.jpeg");

      String washingtonBirdOption = (String) JOptionPane.showInputDialog(null, "This is the Washington state bird \n It is the Willow Goldfinch \n \n Select an option for more information about Washington, go back to select another state, or exit", "WashingtonBird",
            JOptionPane.PLAIN_MESSAGE, washingtonBirdImage, object, object[0]);
      washington.optionChooser(washington, washingtonBirdOption, object);
   }
   
   public void washingtonBirdSong(Washington washington, String option, String[] object){
      ImageIcon washingtonBirdSongImage = new ImageIcon("./img/birds/WashingtonBird.jpeg");      
     
      JFrame frame = new JFrame("WashingtonBirdSong");
      JPanel canvas = new JPanel();
      JLabel text = new JLabel("<html>This is Washington state Bird Song! <br> It is the Willow Goldfinch Song <br> Click the play button to play the Washington state bird song <br> Select go back to go to the Washington state bird!<html>");
      JLabel picture = new JLabel(washingtonBirdSongImage);
      JButton play = new JButton("Play Bird Song!");
      JButton back = new JButton("Go Back!");
      play.addActionListener(e-> washington.sound());
      back.addActionListener(e-> washington.backPrompt(washington, option, object, frame));
      
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
         AudioInputStream input = AudioSystem.getAudioInputStream(new File("./sound/WashingtonSong.wav"));
         Clip clip = AudioSystem.getClip();
         Thread.sleep(10); 
         clip.open(input);
         clip.loop(0);
         Thread.sleep(1500);
      } catch (Exception sound){
         System.out.println("Error occured when playing sound!");
      }
   }
   
   public void backPrompt(Washington washington, String option, String[] object, JFrame frame){
      frame.dispose();
      washington.washingtonBird(washington, option, object);
   }
      
      
}
   
