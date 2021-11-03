//test maryland class

import javax.swing.*;
import javax.sound.sampled.*;
import java.io.File;

public class Maryland{
   Maryland(){

   }
   
   
   public void marylandPrompt(){
      Maryland maryland = new Maryland();
   
      String marylandObject[] = { "flag", "flower", "bird", "bird song", "go back", "exit" };
      
      ImageIcon marylandPromptImage = new ImageIcon("./img/flags/MarylandFlag.png");

      String marylandOption = (String) JOptionPane.showInputDialog(null, "Welcome to Maryland \nThis is the Maryland state flag \n \n Select an option for more information about Maryland, go back to select another state, or exit", "MarylandPrompt",
            JOptionPane.PLAIN_MESSAGE, marylandPromptImage, marylandObject, marylandObject[0]);
      maryland.optionChooser(maryland, marylandOption, marylandObject);      
      
   }
   
   public void optionChooser(Maryland maryland, String option, String[] object){
      FiftyStates fifty = new FiftyStates();
   
      switch(option){
         case "flag":
            maryland.marylandFlag(maryland, option, object);
            break;
         case "flower":
            maryland.marylandFlower(maryland, option, object);
            break;
         case "bird":
            maryland.marylandBird(maryland, option, object);
            break;
         case "bird song":
            maryland.marylandBirdSong(maryland, option, object);
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
   
   public void marylandFlag(Maryland maryland, String option, String[] object){
      ImageIcon marylandFlagImage = new ImageIcon("./img/flags/MarylandFlag.png");

      String marylandFlagOption = (String) JOptionPane.showInputDialog(null, "This is the Maryland state flag \n \n Select an option for more information about Maryland, go back to select another state, or exit", "MarylandFlag",
            JOptionPane.PLAIN_MESSAGE, marylandFlagImage, object, object[0]);
      maryland.optionChooser(maryland, marylandFlagOption, object);
   }
   
   public void marylandFlower(Maryland maryland, String option, String[] object){
      ImageIcon marylandFlowerImage = new ImageIcon("./img/flowers/MarylandFlower.jpeg");

      String marylandFlowerOption = (String) JOptionPane.showInputDialog(null, "This is the Maryland state flower \n It is the Black-Eyed Susan\n \n Select an option for more information about Maryland, go back to select another state, or exit", "MarylandFlower",
            JOptionPane.PLAIN_MESSAGE, marylandFlowerImage, object, object[0]);
      maryland.optionChooser(maryland, marylandFlowerOption, object);
   }
   
   public void marylandBird(Maryland maryland, String option, String[] object){
      ImageIcon marylandBirdImage = new ImageIcon("./img/birds/MarylandBird.jpeg");

      String marylandBirdOption = (String) JOptionPane.showInputDialog(null, "This is the Maryland state bird \n It is the Baltimore Oriole \n \n Select an option for more information about Maryland, go back to select another state, or exit", "MarylandBird",
            JOptionPane.PLAIN_MESSAGE, marylandBirdImage, object, object[0]);
      maryland.optionChooser(maryland, marylandBirdOption, object);
   }
   
   public void marylandBirdSong(Maryland maryland, String option, String[] object){
      ImageIcon marylandBirdSongImage = new ImageIcon("./img/birds/MarylandBird.jpeg");      
     
      JFrame frame = new JFrame("MarylandBirdSong");
      JPanel canvas = new JPanel();
      JLabel text = new JLabel("<html>This is Maryland state Bird Song! <br> It is the Baltimore Oriole Song <br> Click the play button to play the Maryland state bird song <br> Select go back to go to the Maryland state bird!<html>");
      JLabel picture = new JLabel(marylandBirdSongImage);
      JButton play = new JButton("Play Bird Song!");
      JButton back = new JButton("Go Back!");
      play.addActionListener(e-> maryland.sound());
      back.addActionListener(e-> maryland.backPrompt(maryland, option, object, frame));
      
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
         AudioInputStream input = AudioSystem.getAudioInputStream(new File("./sound/MarylandSong.wav"));
         Clip clip = AudioSystem.getClip();
         Thread.sleep(10); 
         clip.open(input);
         clip.loop(0);
         Thread.sleep(1500);
      } catch (Exception sound){
         System.out.println("Error occured when playing sound!");
      }
   }
   
   public void backPrompt(Maryland maryland, String option, String[] object, JFrame frame){
      frame.dispose();
      maryland.marylandBird(maryland, option, object);
   }
      
      
}
   
