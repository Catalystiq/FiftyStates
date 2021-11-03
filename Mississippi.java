//test mississippi class

import javax.swing.*;
import javax.sound.sampled.*;
import java.io.File;

public class Mississippi{
   Mississippi(){

   }
   
   
   public void mississippiPrompt(){
      Mississippi mississippi = new Mississippi();
   
      String mississippiObject[] = { "flag", "flower", "bird", "bird song", "go back", "exit" };
      
      ImageIcon mississippiPromptImage = new ImageIcon("./img/flags/MississippiFlag.png");

      String mississippiOption = (String) JOptionPane.showInputDialog(null, "Welcome to Mississippi \nThis is the Mississippi state flag \n \n Select an option for more information about Mississippi, go back to select another state, or exit", "MississippiPrompt",
            JOptionPane.PLAIN_MESSAGE, mississippiPromptImage, mississippiObject, mississippiObject[0]);
      mississippi.optionChooser(mississippi, mississippiOption, mississippiObject);      
      
   }
   
   public void optionChooser(Mississippi mississippi, String option, String[] object){
      FiftyStates fifty = new FiftyStates();
   
      switch(option){
         case "flag":
            mississippi.mississippiFlag(mississippi, option, object);
            break;
         case "flower":
            mississippi.mississippiFlower(mississippi, option, object);
            break;
         case "bird":
            mississippi.mississippiBird(mississippi, option, object);
            break;
         case "bird song":
            mississippi.mississippiBirdSong(mississippi, option, object);
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
   
   public void mississippiFlag(Mississippi mississippi, String option, String[] object){
      ImageIcon mississippiFlagImage = new ImageIcon("./img/flags/MississippiFlag.png");

      String mississippiFlagOption = (String) JOptionPane.showInputDialog(null, "This is the Mississippi state flag \n \n Select an option for more information about Mississippi, go back to select another state, or exit", "MississippiFlag",
            JOptionPane.PLAIN_MESSAGE, mississippiFlagImage, object, object[0]);
      mississippi.optionChooser(mississippi, mississippiFlagOption, object);
   }
   
   public void mississippiFlower(Mississippi mississippi, String option, String[] object){
      ImageIcon mississippiFlowerImage = new ImageIcon("./img/flowers/MississippiFlower.jpeg");

      String mississippiFlowerOption = (String) JOptionPane.showInputDialog(null, "This is the Mississippi state flower \n It is the Magnolia\n \n Select an option for more information about Mississippi, go back to select another state, or exit", "MississippiFlower",
            JOptionPane.PLAIN_MESSAGE, mississippiFlowerImage, object, object[0]);
      mississippi.optionChooser(mississippi, mississippiFlowerOption, object);
   }
   
   public void mississippiBird(Mississippi mississippi, String option, String[] object){
      ImageIcon mississippiBirdImage = new ImageIcon("./img/birds/MississippiBird.jpeg");

      String mississippiBirdOption = (String) JOptionPane.showInputDialog(null, "This is the Mississippi state bird \n It is the Northern Mockingbird \n \n Select an option for more information about Mississippi, go back to select another state, or exit", "MississippiBird",
            JOptionPane.PLAIN_MESSAGE, mississippiBirdImage, object, object[0]);
      mississippi.optionChooser(mississippi, mississippiBirdOption, object);
   }
   
   public void mississippiBirdSong(Mississippi mississippi, String option, String[] object){
      ImageIcon mississippiBirdSongImage = new ImageIcon("./img/birds/MississippiBird.jpeg");      
     
      JFrame frame = new JFrame("MississippiBirdSong");
      JPanel canvas = new JPanel();
      JLabel text = new JLabel("<html>This is Mississippi state Bird Song! <br> It is the Northern Mockingbird Song <br> Click the play button to play the Mississippi state bird song <br> Select go back to go to the Mississippi state bird!<html>");
      JLabel picture = new JLabel(mississippiBirdSongImage);
      JButton play = new JButton("Play Bird Song!");
      JButton back = new JButton("Go Back!");
      play.addActionListener(e-> mississippi.sound());
      back.addActionListener(e-> mississippi.backPrompt(mississippi, option, object, frame));
      
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
         AudioInputStream input = AudioSystem.getAudioInputStream(new File("./sound/MississippiSong.wav"));
         Clip clip = AudioSystem.getClip();
         Thread.sleep(10); 
         clip.open(input);
         clip.loop(0);
         Thread.sleep(1500);
      } catch (Exception sound){
         System.out.println("Error occured when playing sound!");
      }
   }
   
   public void backPrompt(Mississippi mississippi, String option, String[] object, JFrame frame){
      frame.dispose();
      mississippi.mississippiBird(mississippi, option, object);
   }
      
      
}
   
