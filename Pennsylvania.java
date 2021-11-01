//test pennsylvania class

import javax.swing.*;
import java.awt.*;
import javax.sound.sampled.*;
import java.io.File;
import java.util.*;

public class Pennsylvania{
   Pennsylvania(){

   }
   
   
   public void pennsylvaniaPrompt(){
      Pennsylvania pennsylvania = new Pennsylvania();
   
      String pennsylvaniaObject[] = { "flag", "flower", "bird", "bird song", "go back", "exit" };
      
      ImageIcon pennsylvaniaPromptImage = new ImageIcon("./img/flags/PennsylvaniaFlag.png");

      String pennsylvaniaOption = (String) JOptionPane.showInputDialog(null, "Welcome to Pennsylvania \nThis is the Pennsylvania state flag \n \n Select an option for more information about Pennsylvania, go back to select another state, or exit", "PennsylvaniaPrompt",
            JOptionPane.PLAIN_MESSAGE, pennsylvaniaPromptImage, pennsylvaniaObject, pennsylvaniaObject[0]);
      pennsylvania.optionChooser(pennsylvania, pennsylvaniaOption, pennsylvaniaObject);      
      
   }
   
   public void optionChooser(Pennsylvania pennsylvania, String option, String[] object){
      FiftyStates fifty = new FiftyStates();
   
      switch(option){
         case "flag":
            pennsylvania.pennsylvaniaFlag(pennsylvania, option, object);
            break;
         case "flower":
            pennsylvania.pennsylvaniaFlower(pennsylvania, option, object);
            break;
         case "bird":
            pennsylvania.pennsylvaniaBird(pennsylvania, option, object);
            break;
         case "bird song":
            pennsylvania.pennsylvaniaBirdSong(pennsylvania, option, object);
            break;
         case "go back":
            fifty.prompt(pennsylvania);
            break;
         case "exit":
            System.exit(0);
            break;
         default:
            System.exit(0);
            break;
      }
   }
   
   public void pennsylvaniaFlag(Pennsylvania pennsylvania, String option, String[] object){
      ImageIcon pennsylvaniaFlagImage = new ImageIcon("./img/flags/PennsylvaniaFlag.png");

      String pennsylvaniaFlagOption = (String) JOptionPane.showInputDialog(null, "This is the Pennsylvania state flag \n \n Select an option for more information about Pennsylvania, go back to select another state, or exit", "PennsylvaniaFlag",
            JOptionPane.PLAIN_MESSAGE, pennsylvaniaFlagImage, object, object[0]);
      pennsylvania.optionChooser(pennsylvania, pennsylvaniaFlagOption, object);
   }
   
   public void pennsylvaniaFlower(Pennsylvania pennsylvania, String option, String[] object){
      ImageIcon pennsylvaniaFlowerImage = new ImageIcon("./img/flowers/PennsylvaniaFlower.jpeg");

      String pennsylvaniaFlowerOption = (String) JOptionPane.showInputDialog(null, "This is the Pennsylvania state flower \n It is the Mountain laurel\n \n Select an option for more information about Pennsylvania, go back to select another state, or exit", "PennsylvaniaFlower",
            JOptionPane.PLAIN_MESSAGE, pennsylvaniaFlowerImage, object, object[0]);
      pennsylvania.optionChooser(pennsylvania, pennsylvaniaFlowerOption, object);
   }
   
   public void pennsylvaniaBird(Pennsylvania pennsylvania, String option, String[] object){
      ImageIcon pennsylvaniaBirdImage = new ImageIcon("./img/birds/PennsylvaniaBird.jpeg");

      String pennsylvaniaBirdOption = (String) JOptionPane.showInputDialog(null, "This is the Pennsylvania state bird \n It is the Ruffed grouse \n \n Select an option for more information about Pennsylvania, go back to select another state, or exit", "PennsylvaniaBird",
            JOptionPane.PLAIN_MESSAGE, pennsylvaniaBirdImage, object, object[0]);
      pennsylvania.optionChooser(pennsylvania, pennsylvaniaBirdOption, object);
   }
   
   public void pennsylvaniaBirdSong(Pennsylvania pennsylvania, String option, String[] object){
      ImageIcon pennsylvaniaBirdSongImage = new ImageIcon("./img/birds/PennsylvaniaBird.jpeg");      
     
      JFrame frame = new JFrame("PennsylvaniaBirdSong");
      JPanel canvas = new JPanel();
      JLabel text = new JLabel("<html>This is Pennsylvania state Bird Song! <br> It is the Ruffed grouse Song <br> Click the play button to play the Pennsylvania state bird song <br> Select go back to go to the Pennsylvania state bird!<html>");
      JLabel picture = new JLabel(pennsylvaniaBirdSongImage);
      JButton play = new JButton("Play Bird Song!");
      JButton back = new JButton("Go Back!");
      play.addActionListener(e-> pennsylvania.sound());
      back.addActionListener(e-> pennsylvania.backPrompt(pennsylvania, option, object, frame));
      
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
         AudioInputStream input = AudioSystem.getAudioInputStream(new File("./sound/PennsylvaniaSong.wav"));
         Clip clip = AudioSystem.getClip();
         Thread.sleep(10); 
         clip.open(input);
         clip.loop(0);
         Thread.sleep(1500);
      } catch (Exception sound){
         System.out.println("Error occured when playing sound!");
      }
   }
   
   public void backPrompt(Pennsylvania pennsylvania, String option, String[] object, JFrame frame){
      frame.dispose();
      pennsylvania.pennsylvaniaBird(pennsylvania, option, object);
   }
      
      
}
   