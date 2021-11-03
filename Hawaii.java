//FiftyStates
//James Nelson
//Computer Programming I
//October 19, 2021
//Fifty States Project Hawaii

import javax.swing.*;
import javax.sound.sampled.*;
import java.io.File;

public class Hawaii{
   Hawaii(){

   }
   
   
   public void hawaiiPrompt(){
      Hawaii hawaii = new Hawaii();
   
      String hawaiiObject[] = { "flag", "flower", "bird", "bird song", "go back", "exit" };
      
      ImageIcon hawaiiPromptImage = new ImageIcon("./img/flags/HawaiiFlag.png");

      String hawaiiOption = (String) JOptionPane.showInputDialog(null, "Welcome to Hawaii \nThis is the Hawaii state flag \n \n Select an option for more information about Hawaii, go back to select another state, or exit", "HawaiiPrompt",
            JOptionPane.PLAIN_MESSAGE, hawaiiPromptImage, hawaiiObject, hawaiiObject[0]);
      hawaii.optionChooser(hawaii, hawaiiOption, hawaiiObject);      
      
   }
   
   public void optionChooser(Hawaii hawaii, String option, String[] object){
      FiftyStates fifty = new FiftyStates();
   
      switch(option){
         case "flag":
            hawaii.hawaiiFlag(hawaii, option, object);
            break;
         case "flower":
            hawaii.hawaiiFlower(hawaii, option, object);
            break;
         case "bird":
            hawaii.hawaiiBird(hawaii, option, object);
            break;
         case "bird song":
            hawaii.hawaiiBirdSong(hawaii, option, object);
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
   
   public void hawaiiFlag(Hawaii hawaii, String option, String[] object){
      ImageIcon hawaiiFlagImage = new ImageIcon("./img/flags/HawaiiFlag.png");

      String hawaiiFlagOption = (String) JOptionPane.showInputDialog(null, "This is the Hawaii state flag \n \n Select an option for more information about Hawaii, go back to select another state, or exit", "HawaiiFlag",
            JOptionPane.PLAIN_MESSAGE, hawaiiFlagImage, object, object[0]);
      hawaii.optionChooser(hawaii, hawaiiFlagOption, object);
   }
   
   public void hawaiiFlower(Hawaii hawaii, String option, String[] object){
      ImageIcon hawaiiFlowerImage = new ImageIcon("./img/flowers/HawaiiFlower.jpeg");

      String hawaiiFlowerOption = (String) JOptionPane.showInputDialog(null, "This is the Hawaii state flower \n It is the Hawaiian Hibiscus\n \n Select an option for more information about Hawaii, go back to select another state, or exit", "HawaiiFlower",
            JOptionPane.PLAIN_MESSAGE, hawaiiFlowerImage, object, object[0]);
      hawaii.optionChooser(hawaii, hawaiiFlowerOption, object);
   }
   
   public void hawaiiBird(Hawaii hawaii, String option, String[] object){
      ImageIcon hawaiiBirdImage = new ImageIcon("./img/birds/HawaiiBird.jpeg");

      String hawaiiBirdOption = (String) JOptionPane.showInputDialog(null, "This is the Hawaii state bird \n It is the Hawaiian Goose \n \n Select an option for more information about Hawaii, go back to select another state, or exit", "HawaiiBird",
            JOptionPane.PLAIN_MESSAGE, hawaiiBirdImage, object, object[0]);
      hawaii.optionChooser(hawaii, hawaiiBirdOption, object);
   }
   
   public void hawaiiBirdSong(Hawaii hawaii, String option, String[] object){
      ImageIcon hawaiiBirdSongImage = new ImageIcon("./img/birds/HawaiiBird.jpeg");      
     
      JFrame frame = new JFrame("HawaiiBirdSong");
      JPanel canvas = new JPanel();
      JLabel text = new JLabel("<html>This is Hawaii state Bird Song! <br> It is the Hawaiian Goose Song <br> Click the play button to play the Hawaii state bird song <br> Select go back to go to the Hawaii state bird!<html>");
      JLabel picture = new JLabel(hawaiiBirdSongImage);
      JButton play = new JButton("Play Bird Song!");
      JButton back = new JButton("Go Back!");
      play.addActionListener(e-> hawaii.sound());
      back.addActionListener(e-> hawaii.backPrompt(hawaii, option, object, frame));
      
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
         AudioInputStream input = AudioSystem.getAudioInputStream(new File("./sound/HawaiiSong.wav"));
         Clip clip = AudioSystem.getClip();
         Thread.sleep(10); 
         clip.open(input);
         clip.loop(0);
         Thread.sleep(1500);
      } catch (Exception sound){
         System.out.println("Error occured when playing sound!");
      }
   }
   
   public void backPrompt(Hawaii hawaii, String option, String[] object, JFrame frame){
      frame.dispose();
      hawaii.hawaiiBird(hawaii, option, object);
   }
      
      
}