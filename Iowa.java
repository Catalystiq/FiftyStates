//FiftyStates
//James Nelson
//Computer Programming I
//October 19, 2021
//Fifty States Project Iowa

import javax.swing.*;
import javax.sound.sampled.*;
import java.io.File;

public class Iowa{
   Iowa(){

   }
   
   
   public void iowaPrompt(){
      Iowa iowa = new Iowa();
   
      String iowaObject[] = { "flag", "flower", "bird", "bird song", "go back", "exit" };
      
      ImageIcon iowaPromptImage = new ImageIcon("./img/flags/IowaFlag.png");

      String iowaOption = (String) JOptionPane.showInputDialog(null, "Welcome to Iowa \nThis is the Iowa state flag \n \n Select an option for more information about Iowa, go back to select another state, or exit", "IowaPrompt",
            JOptionPane.PLAIN_MESSAGE, iowaPromptImage, iowaObject, iowaObject[0]);
      iowa.optionChooser(iowa, iowaOption, iowaObject);      
      
   }
   
   public void optionChooser(Iowa iowa, String option, String[] object){
      FiftyStates fifty = new FiftyStates();
   
      switch(option){
         case "flag":
            iowa.iowaFlag(iowa, option, object);
            break;
         case "flower":
            iowa.iowaFlower(iowa, option, object);
            break;
         case "bird":
            iowa.iowaBird(iowa, option, object);
            break;
         case "bird song":
            iowa.iowaBirdSong(iowa, option, object);
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
   
   public void iowaFlag(Iowa iowa, String option, String[] object){
      ImageIcon iowaFlagImage = new ImageIcon("./img/flags/IowaFlag.png");

      String iowaFlagOption = (String) JOptionPane.showInputDialog(null, "This is the Iowa state flag \n \n Select an option for more information about Iowa, go back to select another state, or exit", "IowaFlag",
            JOptionPane.PLAIN_MESSAGE, iowaFlagImage, object, object[0]);
      iowa.optionChooser(iowa, iowaFlagOption, object);
   }
   
   public void iowaFlower(Iowa iowa, String option, String[] object){
      ImageIcon iowaFlowerImage = new ImageIcon("./img/flowers/IowaFlower.jpeg");

      String iowaFlowerOption = (String) JOptionPane.showInputDialog(null, "This is the Iowa state flower \n It is the Wild Rose\n \n Select an option for more information about Iowa, go back to select another state, or exit", "IowaFlower",
            JOptionPane.PLAIN_MESSAGE, iowaFlowerImage, object, object[0]);
      iowa.optionChooser(iowa, iowaFlowerOption, object);
   }
   
   public void iowaBird(Iowa iowa, String option, String[] object){
      ImageIcon iowaBirdImage = new ImageIcon("./img/birds/IowaBird.jpeg");

      String iowaBirdOption = (String) JOptionPane.showInputDialog(null, "This is the Iowa state bird \n It is the Eastern Goldfinch \n \n Select an option for more information about Iowa, go back to select another state, or exit", "IowaBird",
            JOptionPane.PLAIN_MESSAGE, iowaBirdImage, object, object[0]);
      iowa.optionChooser(iowa, iowaBirdOption, object);
   }
   
   public void iowaBirdSong(Iowa iowa, String option, String[] object){
      ImageIcon iowaBirdSongImage = new ImageIcon("./img/birds/IowaBird.jpeg");      
     
      JFrame frame = new JFrame("IowaBirdSong");
      JPanel canvas = new JPanel();
      JLabel text = new JLabel("<html>This is Iowa state Bird Song! <br> It is the Eastern Goldfinch Song <br> Click the play button to play the Iowa state bird song <br> Select go back to go to the Iowa state bird!<html>");
      JLabel picture = new JLabel(iowaBirdSongImage);
      JButton play = new JButton("Play Bird Song!");
      JButton back = new JButton("Go Back!");
      play.addActionListener(e-> iowa.sound());
      back.addActionListener(e-> iowa.backPrompt(iowa, option, object, frame));
      
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
         AudioInputStream input = AudioSystem.getAudioInputStream(new File("./sound/IowaSong.wav"));
         Clip clip = AudioSystem.getClip();
         Thread.sleep(10); 
         clip.open(input);
         clip.loop(0);
         Thread.sleep(1500);
      } catch (Exception sound){
         System.out.println("Error occured when playing sound!");
      }
   }
   
   public void backPrompt(Iowa iowa, String option, String[] object, JFrame frame){
      frame.dispose();
      iowa.iowaBird(iowa, option, object);
   }
      
      
}