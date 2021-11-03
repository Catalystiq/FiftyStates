//FiftyStates
//Hiba Sarwar
//Computer Programming I
//October 19, 2021
//Fifty States Project Ohio

import javax.swing.*;
import javax.sound.sampled.*;
import java.io.File;

public class Ohio{
   Ohio(){

   }
   
   
   public void ohioPrompt(){
      Ohio ohio = new Ohio();
   
      String ohioObject[] = { "flag", "flower", "bird", "bird song", "go back", "exit" };
      
      ImageIcon ohioPromptImage = new ImageIcon("./img/flags/OhioFlag.png");

      String ohioOption = (String) JOptionPane.showInputDialog(null, "Welcome to Ohio \nThis is the Ohio state flag \n \n Select an option for more information about Ohio, go back to select another state, or exit", "OhioPrompt",
            JOptionPane.PLAIN_MESSAGE, ohioPromptImage, ohioObject, ohioObject[0]);
      ohio.optionChooser(ohio, ohioOption, ohioObject);      
      
   }
   
   public void optionChooser(Ohio ohio, String option, String[] object){
      FiftyStates fifty = new FiftyStates();
   
      switch(option){
         case "flag":
            ohio.ohioFlag(ohio, option, object);
            break;
         case "flower":
            ohio.ohioFlower(ohio, option, object);
            break;
         case "bird":
            ohio.ohioBird(ohio, option, object);
            break;
         case "bird song":
            ohio.ohioBirdSong(ohio, option, object);
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
   
   public void ohioFlag(Ohio ohio, String option, String[] object){
      ImageIcon ohioFlagImage = new ImageIcon("./img/flags/OhioFlag.png");

      String ohioFlagOption = (String) JOptionPane.showInputDialog(null, "This is the Ohio state flag \n \n Select an option for more information about Ohio, go back to select another state, or exit", "OhioFlag",
            JOptionPane.PLAIN_MESSAGE, ohioFlagImage, object, object[0]);
      ohio.optionChooser(ohio, ohioFlagOption, object);
   }
   
   public void ohioFlower(Ohio ohio, String option, String[] object){
      ImageIcon ohioFlowerImage = new ImageIcon("./img/flowers/OhioFlower.jpeg");

      String ohioFlowerOption = (String) JOptionPane.showInputDialog(null, "This is the Ohio state flower \n It is the Scarlet Carnation\n \n Select an option for more information about Ohio, go back to select another state, or exit", "OhioFlower",
            JOptionPane.PLAIN_MESSAGE, ohioFlowerImage, object, object[0]);
      ohio.optionChooser(ohio, ohioFlowerOption, object);
   }
   
   public void ohioBird(Ohio ohio, String option, String[] object){
      ImageIcon ohioBirdImage = new ImageIcon("./img/birds/OhioBird.jpeg");

      String ohioBirdOption = (String) JOptionPane.showInputDialog(null, "This is the Ohio state bird \n It is the Northern Cardinal \n \n Select an option for more information about Ohio, go back to select another state, or exit", "OhioBird",
            JOptionPane.PLAIN_MESSAGE, ohioBirdImage, object, object[0]);
      ohio.optionChooser(ohio, ohioBirdOption, object);
   }
   
   public void ohioBirdSong(Ohio ohio, String option, String[] object){
      ImageIcon ohioBirdSongImage = new ImageIcon("./img/birds/OhioBird.jpeg");      
     
      JFrame frame = new JFrame("OhioBirdSong");
      JPanel canvas = new JPanel();
      JLabel text = new JLabel("<html>This is Ohio state Bird Song! <br> It is the Northern Cardinal Song <br> Click the play button to play the Ohio state bird song <br> Select go back to go to the Ohio state bird!<html>");
      JLabel picture = new JLabel(ohioBirdSongImage);
      JButton play = new JButton("Play Bird Song!");
      JButton back = new JButton("Go Back!");
      play.addActionListener(e-> ohio.sound());
      back.addActionListener(e-> ohio.backPrompt(ohio, option, object, frame));
      
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
         AudioInputStream input = AudioSystem.getAudioInputStream(new File("./sound/OhioSong.wav"));
         Clip clip = AudioSystem.getClip();
         Thread.sleep(10); 
         clip.open(input);
         clip.loop(0);
         Thread.sleep(1500);
      } catch (Exception sound){
         System.out.println("Error occured when playing sound!");
      }
   }
   
   public void backPrompt(Ohio ohio, String option, String[] object, JFrame frame){
      frame.dispose();
      ohio.ohioBird(ohio, option, object);
   }
      
      
}
   