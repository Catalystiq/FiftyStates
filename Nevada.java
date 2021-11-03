//FiftyStates
//James Nelson
//Computer Programming I
//October 19, 2021
//Fifty States Project Nevada

import javax.swing.*;
import javax.sound.sampled.*;
import java.io.File;

public class Nevada{
   Nevada(){

   }
   
   
   public void nevadaPrompt(){
      Nevada nevada = new Nevada();
   
      String nevadaObject[] = { "flag", "flower", "bird", "bird song", "go back", "exit" };
      
      ImageIcon nevadaPromptImage = new ImageIcon("./img/flags/NevadaFlag.png");

      String nevadaOption = (String) JOptionPane.showInputDialog(null, "Welcome to Nevada \nThis is the Nevada state flag \n \n Select an option for more information about Nevada, go back to select another state, or exit", "NevadaPrompt",
            JOptionPane.PLAIN_MESSAGE, nevadaPromptImage, nevadaObject, nevadaObject[0]);
      nevada.optionChooser(nevada, nevadaOption, nevadaObject);      
      
   }
   
   public void optionChooser(Nevada nevada, String option, String[] object){
      FiftyStates fifty = new FiftyStates();
   
      switch(option){
         case "flag":
            nevada.nevadaFlag(nevada, option, object);
            break;
         case "flower":
            nevada.nevadaFlower(nevada, option, object);
            break;
         case "bird":
            nevada.nevadaBird(nevada, option, object);
            break;
         case "bird song":
            nevada.nevadaBirdSong(nevada, option, object);
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
   
   public void nevadaFlag(Nevada nevada, String option, String[] object){
      ImageIcon nevadaFlagImage = new ImageIcon("./img/flags/NevadaFlag.png");

      String nevadaFlagOption = (String) JOptionPane.showInputDialog(null, "This is the Nevada state flag \n \n Select an option for more information about Nevada, go back to select another state, or exit", "NevadaFlag",
            JOptionPane.PLAIN_MESSAGE, nevadaFlagImage, object, object[0]);
      nevada.optionChooser(nevada, nevadaFlagOption, object);
   }
   
   public void nevadaFlower(Nevada nevada, String option, String[] object){
      ImageIcon nevadaFlowerImage = new ImageIcon("./img/flowers/NevadaFlower.jpeg");

      String nevadaFlowerOption = (String) JOptionPane.showInputDialog(null, "This is the Nevada state flower \n It is the Sagebrush\n \n Select an option for more information about Nevada, go back to select another state, or exit", "NevadaFlower",
            JOptionPane.PLAIN_MESSAGE, nevadaFlowerImage, object, object[0]);
      nevada.optionChooser(nevada, nevadaFlowerOption, object);
   }
   
   public void nevadaBird(Nevada nevada, String option, String[] object){
      ImageIcon nevadaBirdImage = new ImageIcon("./img/birds/NevadaBird.jpeg");

      String nevadaBirdOption = (String) JOptionPane.showInputDialog(null, "This is the Nevada state bird \n It is the Mountain Bluebird \n \n Select an option for more information about Nevada, go back to select another state, or exit", "NevadaBird",
            JOptionPane.PLAIN_MESSAGE, nevadaBirdImage, object, object[0]);
      nevada.optionChooser(nevada, nevadaBirdOption, object);
   }
   
   public void nevadaBirdSong(Nevada nevada, String option, String[] object){
      ImageIcon nevadaBirdSongImage = new ImageIcon("./img/birds/NevadaBird.jpeg");      
     
      JFrame frame = new JFrame("NevadaBirdSong");
      JPanel canvas = new JPanel();
      JLabel text = new JLabel("<html>This is Nevada state Bird Song! <br> It is the Mountain Bluebird Song <br> Click the play button to play the Nevada state bird song <br> Select go back to go to the Nevada state bird!<html>");
      JLabel picture = new JLabel(nevadaBirdSongImage);
      JButton play = new JButton("Play Bird Song!");
      JButton back = new JButton("Go Back!");
      play.addActionListener(e-> nevada.sound());
      back.addActionListener(e-> nevada.backPrompt(nevada, option, object, frame));
      
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
         AudioInputStream input = AudioSystem.getAudioInputStream(new File("./sound/NevadaSong.wav"));
         Clip clip = AudioSystem.getClip();
         Thread.sleep(10); 
         clip.open(input);
         clip.loop(0);
         Thread.sleep(1500);
      } catch (Exception sound){
         System.out.println("Error occured when playing sound!");
      }
   }
   
   public void backPrompt(Nevada nevada, String option, String[] object, JFrame frame){
      frame.dispose();
      nevada.nevadaBird(nevada, option, object);
   }
      
      
}
   
