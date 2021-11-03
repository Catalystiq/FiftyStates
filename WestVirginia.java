//FiftyStates
//Joshua Hammond
//Computer Programming I
//October 19, 2021
//Fifty States Project West Virginia

import javax.swing.*;
import javax.sound.sampled.*;
import java.io.File;

public class WestVirginia{
   WestVirginia(){

   }
   
   
   public void westVirginiaPrompt(){
      WestVirginia westVirginia = new WestVirginia();
   
      String westVirginiaObject[] = { "flag", "flower", "bird", "bird song", "go back", "exit" };
      
      ImageIcon westVirginiaPromptImage = new ImageIcon("./img/flags/WestVirginiaFlag.png");

      String westVirginiaOption = (String) JOptionPane.showInputDialog(null, "Welcome to WestVirginia \nThis is the WestVirginia state flag \n \n Select an option for more information about WestVirginia, go back to select another state, or exit", "WestVirginiaPrompt",
            JOptionPane.PLAIN_MESSAGE, westVirginiaPromptImage, westVirginiaObject, westVirginiaObject[0]);
      westVirginia.optionChooser(westVirginia, westVirginiaOption, westVirginiaObject);      
      
   }
   
   public void optionChooser(WestVirginia westVirginia, String option, String[] object){
      FiftyStates fifty = new FiftyStates();
   
      switch(option){
         case "flag":
            westVirginia.westVirginiaFlag(westVirginia, option, object);
            break;
         case "flower":
            westVirginia.westVirginiaFlower(westVirginia, option, object);
            break;
         case "bird":
            westVirginia.westVirginiaBird(westVirginia, option, object);
            break;
         case "bird song":
            westVirginia.westVirginiaBirdSong(westVirginia, option, object);
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
   
   public void westVirginiaFlag(WestVirginia westVirginia, String option, String[] object){
      ImageIcon westVirginiaFlagImage = new ImageIcon("./img/flags/WestVirginiaFlag.png");

      String westVirginiaFlagOption = (String) JOptionPane.showInputDialog(null, "This is the WestVirginia state flag \n \n Select an option for more information about WestVirginia, go back to select another state, or exit", "WestVirginiaFlag",
            JOptionPane.PLAIN_MESSAGE, westVirginiaFlagImage, object, object[0]);
      westVirginia.optionChooser(westVirginia, westVirginiaFlagOption, object);
   }
   
   public void westVirginiaFlower(WestVirginia westVirginia, String option, String[] object){
      ImageIcon westVirginiaFlowerImage = new ImageIcon("./img/flowers/WestVirginiaFlower.jpeg");

      String westVirginiaFlowerOption = (String) JOptionPane.showInputDialog(null, "This is the WestVirginia state flower \n It is the Rhododendron \n \n Select an option for more information about WestVirginia, go back to select another state, or exit", "WestVirginiaFlower",
            JOptionPane.PLAIN_MESSAGE, westVirginiaFlowerImage, object, object[0]);
      westVirginia.optionChooser(westVirginia, westVirginiaFlowerOption, object);
   }
   
   public void westVirginiaBird(WestVirginia westVirginia, String option, String[] object){
      ImageIcon westVirginiaBirdImage = new ImageIcon("./img/birds/WestVirginiaBird.jpeg");

      String westVirginiaBirdOption = (String) JOptionPane.showInputDialog(null, "This is the WestVirginia state bird \n It is the Northern Cardinal \n \n Select an option for more information about WestVirginia, go back to select another state, or exit", "WestVirginiaBird",
            JOptionPane.PLAIN_MESSAGE, westVirginiaBirdImage, object, object[0]);
      westVirginia.optionChooser(westVirginia, westVirginiaBirdOption, object);
   }
   
   public void westVirginiaBirdSong(WestVirginia westVirginia, String option, String[] object){
      ImageIcon westVirginiaBirdSongImage = new ImageIcon("./img/birds/WestVirginiaBird.jpeg");      
     
      JFrame frame = new JFrame("WestVirginiaBirdSong");
      JPanel canvas = new JPanel();
      JLabel text = new JLabel("<html>This is WestVirginia state Bird Song! <br> It is the Northern Cardinal Song <br> Click the play button to play the WestVirginia state bird song <br> Select go back to go to the WestVirginia state bird!<html>");
      JLabel picture = new JLabel(westVirginiaBirdSongImage);
      JButton play = new JButton("Play Bird Song!");
      JButton back = new JButton("Go Back!");
      play.addActionListener(e-> westVirginia.sound());
      back.addActionListener(e-> westVirginia.backPrompt(westVirginia, option, object, frame));
      
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
         AudioInputStream input = AudioSystem.getAudioInputStream(new File("./sound/WestVirginiaSong.wav"));
         Clip clip = AudioSystem.getClip();
         Thread.sleep(10); 
         clip.open(input);
         clip.loop(0);
         Thread.sleep(1500);
      } catch (Exception sound){
         System.out.println("Error occured when playing sound!");
      }
   }
   
   public void backPrompt(WestVirginia westVirginia, String option, String[] object, JFrame frame){
      frame.dispose();
      westVirginia.westVirginiaBird(westVirginia, option, object);
   }
      
      
}
   
