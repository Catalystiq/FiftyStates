//FiftyStates
//James Nelson
//Computer Programming I
//October 19, 2021
//Fifty States Project Missouri

import javax.swing.*;
import javax.sound.sampled.*;
import java.io.File;

public class Missouri{
   Missouri(){

   }
   
   
   public void missouriPrompt(){
      Missouri missouri = new Missouri();
   
      String missouriObject[] = { "flag", "flower", "bird", "bird song", "go back", "exit" };
      
      ImageIcon missouriPromptImage = new ImageIcon("./img/flags/MissouriFlag.png");

      String missouriOption = (String) JOptionPane.showInputDialog(null, "Welcome to Missouri \nThis is the Missouri state flag \n \n Select an option for more information about Missouri, go back to select another state, or exit", "MissouriPrompt",
            JOptionPane.PLAIN_MESSAGE, missouriPromptImage, missouriObject, missouriObject[0]);
      missouri.optionChooser(missouri, missouriOption, missouriObject);      
      
   }
   
   public void optionChooser(Missouri missouri, String option, String[] object){
      FiftyStates fifty = new FiftyStates();
   
      switch(option){
         case "flag":
            missouri.missouriFlag(missouri, option, object);
            break;
         case "flower":
            missouri.missouriFlower(missouri, option, object);
            break;
         case "bird":
            missouri.missouriBird(missouri, option, object);
            break;
         case "bird song":
            missouri.missouriBirdSong(missouri, option, object);
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
   
   public void missouriFlag(Missouri missouri, String option, String[] object){
      ImageIcon missouriFlagImage = new ImageIcon("./img/flags/MissouriFlag.png");

      String missouriFlagOption = (String) JOptionPane.showInputDialog(null, "This is the Missouri state flag \n \n Select an option for more information about Missouri, go back to select another state, or exit", "MissouriFlag",
            JOptionPane.PLAIN_MESSAGE, missouriFlagImage, object, object[0]);
      missouri.optionChooser(missouri, missouriFlagOption, object);
   }
   
   public void missouriFlower(Missouri missouri, String option, String[] object){
      ImageIcon missouriFlowerImage = new ImageIcon("./img/flowers/MissouriFlower.jpeg");

      String missouriFlowerOption = (String) JOptionPane.showInputDialog(null, "This is the Missouri state flower \n It is the Hawthorne \n \n Select an option for more information about Missouri, go back to select another state, or exit", "MissouriFlower",
            JOptionPane.PLAIN_MESSAGE, missouriFlowerImage, object, object[0]);
      missouri.optionChooser(missouri, missouriFlowerOption, object);
   }
   
   public void missouriBird(Missouri missouri, String option, String[] object){
      ImageIcon missouriBirdImage = new ImageIcon("./img/birds/MissouriBird.jpeg");

      String missouriBirdOption = (String) JOptionPane.showInputDialog(null, "This is the Missouri state bird \n It is the Eastern Bluebird \n \n Select an option for more information about Missouri, go back to select another state, or exit", "MissouriBird",
            JOptionPane.PLAIN_MESSAGE, missouriBirdImage, object, object[0]);
      missouri.optionChooser(missouri, missouriBirdOption, object);
   }
   
   public void missouriBirdSong(Missouri missouri, String option, String[] object){
      ImageIcon missouriBirdSongImage = new ImageIcon("./img/birds/MissouriBird.jpeg");      
     
      JFrame frame = new JFrame("MissouriBirdSong");
      JPanel canvas = new JPanel();
      JLabel text = new JLabel("<html>This is Missouri state Bird Song! <br> It is the Eastern Bluebird Song <br> Click the play button to play the Missouri state bird song <br> Select go back to go to the Missouri state bird!<html>");
      JLabel picture = new JLabel(missouriBirdSongImage);
      JButton play = new JButton("Play Bird Song!");
      JButton back = new JButton("Go Back!");
      play.addActionListener(e-> missouri.sound());
      back.addActionListener(e-> missouri.backPrompt(missouri, option, object, frame));
      
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
         AudioInputStream input = AudioSystem.getAudioInputStream(new File("./sound/MissouriSong.wav"));
         Clip clip = AudioSystem.getClip();
         Thread.sleep(10); 
         clip.open(input);
         clip.loop(0);
         Thread.sleep(1500);
      } catch (Exception sound){
         System.out.println("Error occured when playing sound!");
      }
   }
   
   public void backPrompt(Missouri missouri, String option, String[] object, JFrame frame){
      frame.dispose();
      missouri.missouriBird(missouri, option, object);
   }
      
      
}
   
