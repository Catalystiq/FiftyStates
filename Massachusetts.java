//test massachusetts class

import javax.swing.*;
import javax.sound.sampled.*;
import java.io.File;

public class Massachusetts{
   Massachusetts(){

   }
   
   
   public void massachusettsPrompt(){
      Massachusetts massachusetts = new Massachusetts();
   
      String massachusettsObject[] = { "flag", "flower", "bird", "bird song", "go back", "exit" };
      
      ImageIcon massachusettsPromptImage = new ImageIcon("./img/flags/MassachusettsFlag.png");

      String massachusettsOption = (String) JOptionPane.showInputDialog(null, "Welcome to Massachusetts \nThis is the Massachusetts state flag \n \n Select an option for more information about Massachusetts, go back to select another state, or exit", "MassachusettsPrompt",
            JOptionPane.PLAIN_MESSAGE, massachusettsPromptImage, massachusettsObject, massachusettsObject[0]);
      massachusetts.optionChooser(massachusetts, massachusettsOption, massachusettsObject);      
      
   }
   
   public void optionChooser(Massachusetts massachusetts, String option, String[] object){
      FiftyStates fifty = new FiftyStates();
   
      switch(option){
         case "flag":
            massachusetts.massachusettsFlag(massachusetts, option, object);
            break;
         case "flower":
            massachusetts.massachusettsFlower(massachusetts, option, object);
            break;
         case "bird":
            massachusetts.massachusettsBird(massachusetts, option, object);
            break;
         case "bird song":
            massachusetts.massachusettsBirdSong(massachusetts, option, object);
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
   
   public void massachusettsFlag(Massachusetts massachusetts, String option, String[] object){
      ImageIcon massachusettsFlagImage = new ImageIcon("./img/flags/MassachusettsFlag.png");

      String massachusettsFlagOption = (String) JOptionPane.showInputDialog(null, "This is the Massachusetts state flag \n \n Select an option for more information about Massachusetts, go back to select another state, or exit", "MassachusettsFlag",
            JOptionPane.PLAIN_MESSAGE, massachusettsFlagImage, object, object[0]);
      massachusetts.optionChooser(massachusetts, massachusettsFlagOption, object);
   }
   
   public void massachusettsFlower(Massachusetts massachusetts, String option, String[] object){
      ImageIcon massachusettsFlowerImage = new ImageIcon("./img/flowers/MassachusettsFlower.jpeg");

      String massachusettsFlowerOption = (String) JOptionPane.showInputDialog(null, "This is the Massachusetts state flower \n It is the Mayflower \n \n Select an option for more information about Massachusetts, go back to select another state, or exit", "MassachusettsFlower",
            JOptionPane.PLAIN_MESSAGE, massachusettsFlowerImage, object, object[0]);
      massachusetts.optionChooser(massachusetts, massachusettsFlowerOption, object);
   }
   
   public void massachusettsBird(Massachusetts massachusetts, String option, String[] object){
      ImageIcon massachusettsBirdImage = new ImageIcon("./img/birds/MassachusettsBird.jpeg");

      String massachusettsBirdOption = (String) JOptionPane.showInputDialog(null, "This is the Massachusetts state bird \n It is the Black-Capped Chickadee \n \n Select an option for more information about Massachusetts, go back to select another state, or exit", "MassachusettsBird",
            JOptionPane.PLAIN_MESSAGE, massachusettsBirdImage, object, object[0]);
      massachusetts.optionChooser(massachusetts, massachusettsBirdOption, object);
   }
   
   public void massachusettsBirdSong(Massachusetts massachusetts, String option, String[] object){
      ImageIcon massachusettsBirdSongImage = new ImageIcon("./img/birds/MassachusettsBird.jpeg");      
     
      JFrame frame = new JFrame("MassachusettsBirdSong");
      JPanel canvas = new JPanel();
      JLabel text = new JLabel("<html>This is Massachusetts state Bird Song! <br> It is the Black-Capped Chickadee Song <br> Click the play button to play the Massachusetts state bird song <br> Select go back to go to the Massachusetts state bird!<html>");
      JLabel picture = new JLabel(massachusettsBirdSongImage);
      JButton play = new JButton("Play Bird Song!");
      JButton back = new JButton("Go Back!");
      play.addActionListener(e-> massachusetts.sound());
      back.addActionListener(e-> massachusetts.backPrompt(massachusetts, option, object, frame));
      
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
         AudioInputStream input = AudioSystem.getAudioInputStream(new File("./sound/MassachusettsSong.wav"));
         Clip clip = AudioSystem.getClip();
         Thread.sleep(10); 
         clip.open(input);
         clip.loop(0);
         Thread.sleep(1500);
      } catch (Exception sound){
         System.out.println("Error occured when playing sound!");
      }
   }
   
   public void backPrompt(Massachusetts massachusetts, String option, String[] object, JFrame frame){
      frame.dispose();
      massachusetts.massachusettsBird(massachusetts, option, object);
   }
      
      
}
   
