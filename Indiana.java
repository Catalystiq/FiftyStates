//FiftyStates
//James Nelson
//Computer Programming I
//October 19, 2021
//Fifty States Project Indiana

import javax.swing.*;
import javax.sound.sampled.*;
import java.io.File;

public class Indiana{
   Indiana(){

   }
   
   
   public void indianaPrompt(){
      Indiana indiana = new Indiana();
   
      String indianaObject[] = { "flag", "flower", "bird", "bird song", "go back", "exit" };
      
      ImageIcon indianaPromptImage = new ImageIcon("./img/flags/IndianaFlag.png");

      String indianaOption = (String) JOptionPane.showInputDialog(null, "Welcome to Indiana \nThis is the Indiana state flag \n \n Select an option for more information about Indiana, go back to select another state, or exit", "IndianaPrompt",
            JOptionPane.PLAIN_MESSAGE, indianaPromptImage, indianaObject, indianaObject[0]);
      indiana.optionChooser(indiana, indianaOption, indianaObject);      
      
   }
   
   public void optionChooser(Indiana indiana, String option, String[] object){
      FiftyStates fifty = new FiftyStates();
   
      switch(option){
         case "flag":
            indiana.indianaFlag(indiana, option, object);
            break;
         case "flower":
            indiana.indianaFlower(indiana, option, object);
            break;
         case "bird":
            indiana.indianaBird(indiana, option, object);
            break;
         case "bird song":
            indiana.indianaBirdSong(indiana, option, object);
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
   
   public void indianaFlag(Indiana indiana, String option, String[] object){
      ImageIcon indianaFlagImage = new ImageIcon("./img/flags/IndianaFlag.png");

      String indianaFlagOption = (String) JOptionPane.showInputDialog(null, "This is the Indiana state flag \n \n Select an option for more information about Indiana, go back to select another state, or exit", "IndianaFlag",
            JOptionPane.PLAIN_MESSAGE, indianaFlagImage, object, object[0]);
      indiana.optionChooser(indiana, indianaFlagOption, object);
   }
   
   public void indianaFlower(Indiana indiana, String option, String[] object){
      ImageIcon indianaFlowerImage = new ImageIcon("./img/flowers/IndianaFlower.jpeg");

      String indianaFlowerOption = (String) JOptionPane.showInputDialog(null, "This is the Indiana state flower \n It is the Peony\n \n Select an option for more information about Indiana, go back to select another state, or exit", "IndianaFlower",
            JOptionPane.PLAIN_MESSAGE, indianaFlowerImage, object, object[0]);
      indiana.optionChooser(indiana, indianaFlowerOption, object);
   }
   
   public void indianaBird(Indiana indiana, String option, String[] object){
      ImageIcon indianaBirdImage = new ImageIcon("./img/birds/IndianaBird.jpeg");

      String indianaBirdOption = (String) JOptionPane.showInputDialog(null, "This is the Indiana state bird \n It is the Northern Cardinal \n \n Select an option for more information about Indiana, go back to select another state, or exit", "IndianaBird",
            JOptionPane.PLAIN_MESSAGE, indianaBirdImage, object, object[0]);
      indiana.optionChooser(indiana, indianaBirdOption, object);
   }
   
   public void indianaBirdSong(Indiana indiana, String option, String[] object){
      ImageIcon indianaBirdSongImage = new ImageIcon("./img/birds/IndianaBird.jpeg");      
     
      JFrame frame = new JFrame("IndianaBirdSong");
      JPanel canvas = new JPanel();
      JLabel text = new JLabel("<html>This is Indiana state Bird Song! <br> It is the Northern Cardinal Song <br> Click the play button to play the Indiana state bird song <br> Select go back to go to the Indiana state bird!<html>");
      JLabel picture = new JLabel(indianaBirdSongImage);
      JButton play = new JButton("Play Bird Song!");
      JButton back = new JButton("Go Back!");
      play.addActionListener(e-> indiana.sound());
      back.addActionListener(e-> indiana.backPrompt(indiana, option, object, frame));
      
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
         AudioInputStream input = AudioSystem.getAudioInputStream(new File("./sound/IndianaSong.wav"));
         Clip clip = AudioSystem.getClip();
         Thread.sleep(10); 
         clip.open(input);
         clip.loop(0);
         Thread.sleep(1500);
      } catch (Exception sound){
         System.out.println("Error occured when playing sound!");
      }
   }
   
   public void backPrompt(Indiana indiana, String option, String[] object, JFrame frame){
      frame.dispose();
      indiana.indianaBird(indiana, option, object);
   }
      
      
}