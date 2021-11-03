//test kansas class

import javax.swing.*;
import javax.sound.sampled.*;
import java.io.File;

public class Kansas{
   Kansas(){

   }
   
   
   public void kansasPrompt(){
      Kansas kansas = new Kansas();
   
      String kansasObject[] = { "flag", "flower", "bird", "bird song", "go back", "exit" };
      
      ImageIcon kansasPromptImage = new ImageIcon("./img/flags/KansasFlag.png");

      String kansasOption = (String) JOptionPane.showInputDialog(null, "Welcome to Kansas \nThis is the Kansas state flag \n \n Select an option for more information about Kansas, go back to select another state, or exit", "KansasPrompt",
            JOptionPane.PLAIN_MESSAGE, kansasPromptImage, kansasObject, kansasObject[0]);
      kansas.optionChooser(kansas, kansasOption, kansasObject);      
      
   }
   
   public void optionChooser(Kansas kansas, String option, String[] object){
      FiftyStates fifty = new FiftyStates();
   
      switch(option){
         case "flag":
            kansas.kansasFlag(kansas, option, object);
            break;
         case "flower":
            kansas.kansasFlower(kansas, option, object);
            break;
         case "bird":
            kansas.kansasBird(kansas, option, object);
            break;
         case "bird song":
            kansas.kansasBirdSong(kansas, option, object);
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
   
   public void kansasFlag(Kansas kansas, String option, String[] object){
      ImageIcon kansasFlagImage = new ImageIcon("./img/flags/KansasFlag.png");

      String kansasFlagOption = (String) JOptionPane.showInputDialog(null, "This is the Kansas state flag \n \n Select an option for more information about Kansas, go back to select another state, or exit", "KansasFlag",
            JOptionPane.PLAIN_MESSAGE, kansasFlagImage, object, object[0]);
      kansas.optionChooser(kansas, kansasFlagOption, object);
   }
   
   public void kansasFlower(Kansas kansas, String option, String[] object){
      ImageIcon kansasFlowerImage = new ImageIcon("./img/flowers/KansasFlower.jpeg");

      String kansasFlowerOption = (String) JOptionPane.showInputDialog(null, "This is the Kansas state flower \n It is the Sunflower \n \n Select an option for more information about Kansas, go back to select another state, or exit", "KansasFlower",
            JOptionPane.PLAIN_MESSAGE, kansasFlowerImage, object, object[0]);
      kansas.optionChooser(kansas, kansasFlowerOption, object);
   }
   
   public void kansasBird(Kansas kansas, String option, String[] object){
      ImageIcon kansasBirdImage = new ImageIcon("./img/birds/KansasBird.jpeg");

      String kansasBirdOption = (String) JOptionPane.showInputDialog(null, "This is the Kansas state bird \n It is the Western Meadowlark \n \n Select an option for more information about Kansas, go back to select another state, or exit", "KansasBird",
            JOptionPane.PLAIN_MESSAGE, kansasBirdImage, object, object[0]);
      kansas.optionChooser(kansas, kansasBirdOption, object);
   }
   
   public void kansasBirdSong(Kansas kansas, String option, String[] object){
      ImageIcon kansasBirdSongImage = new ImageIcon("./img/birds/KansasBird.jpeg");      
     
      JFrame frame = new JFrame("KansasBirdSong");
      JPanel canvas = new JPanel();
      JLabel text = new JLabel("<html>This is Kansas state Bird Song! <br> It is the Western Meadowlark Song <br> Click the play button to play the Kansas state bird song <br> Select go back to go to the Kansas state bird!<html>");
      JLabel picture = new JLabel(kansasBirdSongImage);
      JButton play = new JButton("Play Bird Song!");
      JButton back = new JButton("Go Back!");
      play.addActionListener(e-> kansas.sound());
      back.addActionListener(e-> kansas.backPrompt(kansas, option, object, frame));
      
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
         AudioInputStream input = AudioSystem.getAudioInputStream(new File("./sound/KansasSong.wav"));
         Clip clip = AudioSystem.getClip();
         Thread.sleep(10); 
         clip.open(input);
         clip.loop(0);
         Thread.sleep(1500);
      } catch (Exception sound){
         System.out.println("Error occured when playing sound!");
      }
   }
   
   public void backPrompt(Kansas kansas, String option, String[] object, JFrame frame){
      frame.dispose();
      kansas.kansasBird(kansas, option, object);
   }
      
      
}
   
