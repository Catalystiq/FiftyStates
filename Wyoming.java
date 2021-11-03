//test wyoming class

import javax.swing.*;
import javax.sound.sampled.*;
import java.io.File;

public class Wyoming{
   Wyoming(){

   }
   
   
   public void wyomingPrompt(){
      Wyoming wyoming = new Wyoming();
   
      String wyomingObject[] = { "flag", "flower", "bird", "bird song", "go back", "exit" };
      
      ImageIcon wyomingPromptImage = new ImageIcon("./img/flags/WyomingFlag.png");

      String wyomingOption = (String) JOptionPane.showInputDialog(null, "Welcome to Wyoming \nThis is the Wyoming state flag \n \n Select an option for more information about Wyoming, go back to select another state, or exit", "WyomingPrompt",
            JOptionPane.PLAIN_MESSAGE, wyomingPromptImage, wyomingObject, wyomingObject[0]);
      wyoming.optionChooser(wyoming, wyomingOption, wyomingObject);      
      
   }
   
   public void optionChooser(Wyoming wyoming, String option, String[] object){
      FiftyStates fifty = new FiftyStates();
   
      switch(option){
         case "flag":
            wyoming.wyomingFlag(wyoming, option, object);
            break;
         case "flower":
            wyoming.wyomingFlower(wyoming, option, object);
            break;
         case "bird":
            wyoming.wyomingBird(wyoming, option, object);
            break;
         case "bird song":
            wyoming.wyomingBirdSong(wyoming, option, object);
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
   
   public void wyomingFlag(Wyoming wyoming, String option, String[] object){
      ImageIcon wyomingFlagImage = new ImageIcon("./img/flags/WyomingFlag.png");

      String wyomingFlagOption = (String) JOptionPane.showInputDialog(null, "This is the Wyoming state flag \n \n Select an option for more information about Wyoming, go back to select another state, or exit", "WyomingFlag",
            JOptionPane.PLAIN_MESSAGE, wyomingFlagImage, object, object[0]);
      wyoming.optionChooser(wyoming, wyomingFlagOption, object);
   }
   
   public void wyomingFlower(Wyoming wyoming, String option, String[] object){
      ImageIcon wyomingFlowerImage = new ImageIcon("./img/flowers/WyomingFlower.jpeg");

      String wyomingFlowerOption = (String) JOptionPane.showInputDialog(null, "This is the Wyoming state flower \n It is the Indian Paintbrush\n \n Select an option for more information about Wyoming, go back to select another state, or exit", "WyomingFlower",
            JOptionPane.PLAIN_MESSAGE, wyomingFlowerImage, object, object[0]);
      wyoming.optionChooser(wyoming, wyomingFlowerOption, object);
   }
   
   public void wyomingBird(Wyoming wyoming, String option, String[] object){
      ImageIcon wyomingBirdImage = new ImageIcon("./img/birds/WyomingBird.jpeg");

      String wyomingBirdOption = (String) JOptionPane.showInputDialog(null, "This is the Wyoming state bird \n It is the Western Meadowlark \n \n Select an option for more information about Wyoming, go back to select another state, or exit", "WyomingBird",
            JOptionPane.PLAIN_MESSAGE, wyomingBirdImage, object, object[0]);
      wyoming.optionChooser(wyoming, wyomingBirdOption, object);
   }
   
   public void wyomingBirdSong(Wyoming wyoming, String option, String[] object){
      ImageIcon wyomingBirdSongImage = new ImageIcon("./img/birds/WyomingBird.jpeg");      
     
      JFrame frame = new JFrame("WyomingBirdSong");
      JPanel canvas = new JPanel();
      JLabel text = new JLabel("<html>This is Wyoming state Bird Song! <br> It is the Western Meadowlark Song <br> Click the play button to play the Wyoming state bird song <br> Select go back to go to the Wyoming state bird!<html>");
      JLabel picture = new JLabel(wyomingBirdSongImage);
      JButton play = new JButton("Play Bird Song!");
      JButton back = new JButton("Go Back!");
      play.addActionListener(e-> wyoming.sound());
      back.addActionListener(e-> wyoming.backPrompt(wyoming, option, object, frame));
      
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
         AudioInputStream input = AudioSystem.getAudioInputStream(new File("./sound/WyomingSong.wav"));
         Clip clip = AudioSystem.getClip();
         Thread.sleep(10); 
         clip.open(input);
         clip.loop(0);
         Thread.sleep(1500);
      } catch (Exception sound){
         System.out.println("Error occured when playing sound!");
      }
   }
   
   public void backPrompt(Wyoming wyoming, String option, String[] object, JFrame frame){
      frame.dispose();
      wyoming.wyomingBird(wyoming, option, object);
   }
      
      
}
   
