//test kentucky class

import javax.swing.*;
import javax.sound.sampled.*;
import java.io.File;

public class Kentucky{
   Kentucky(){

   }
   
   
   public void kentuckyPrompt(){
      Kentucky kentucky = new Kentucky();
   
      String kentuckyObject[] = { "flag", "flower", "bird", "bird song", "go back", "exit" };
      
      ImageIcon kentuckyPromptImage = new ImageIcon("./img/flags/KentuckyFlag.png");

      String kentuckyOption = (String) JOptionPane.showInputDialog(null, "Welcome to Kentucky \nThis is the Kentucky state flag \n \n Select an option for more information about Kentucky, go back to select another state, or exit", "KentuckyPrompt",
            JOptionPane.PLAIN_MESSAGE, kentuckyPromptImage, kentuckyObject, kentuckyObject[0]);
      kentucky.optionChooser(kentucky, kentuckyOption, kentuckyObject);      
      
   }
   
   public void optionChooser(Kentucky kentucky, String option, String[] object){
      FiftyStates fifty = new FiftyStates();
   
      switch(option){
         case "flag":
            kentucky.kentuckyFlag(kentucky, option, object);
            break;
         case "flower":
            kentucky.kentuckyFlower(kentucky, option, object);
            break;
         case "bird":
            kentucky.kentuckyBird(kentucky, option, object);
            break;
         case "bird song":
            kentucky.kentuckyBirdSong(kentucky, option, object);
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
   
   public void kentuckyFlag(Kentucky kentucky, String option, String[] object){
      ImageIcon kentuckyFlagImage = new ImageIcon("./img/flags/KentuckyFlag.png");

      String kentuckyFlagOption = (String) JOptionPane.showInputDialog(null, "This is the Kentucky state flag \n \n Select an option for more information about Kentucky, go back to select another state, or exit", "KentuckyFlag",
            JOptionPane.PLAIN_MESSAGE, kentuckyFlagImage, object, object[0]);
      kentucky.optionChooser(kentucky, kentuckyFlagOption, object);
   }
   
   public void kentuckyFlower(Kentucky kentucky, String option, String[] object){
      ImageIcon kentuckyFlowerImage = new ImageIcon("./img/flowers/KentuckyFlower.jpeg");

      String kentuckyFlowerOption = (String) JOptionPane.showInputDialog(null, "This is the Kentucky state flower \n It is the Goldenrod \n \n Select an option for more information about Kentucky, go back to select another state, or exit", "KentuckyFlower",
            JOptionPane.PLAIN_MESSAGE, kentuckyFlowerImage, object, object[0]);
      kentucky.optionChooser(kentucky, kentuckyFlowerOption, object);
   }
   
   public void kentuckyBird(Kentucky kentucky, String option, String[] object){
      ImageIcon kentuckyBirdImage = new ImageIcon("./img/birds/KentuckyBird.jpeg");

      String kentuckyBirdOption = (String) JOptionPane.showInputDialog(null, "This is the Kentucky state bird \n It is the Northern Cardinal \n \n Select an option for more information about Kentucky, go back to select another state, or exit", "KentuckyBird",
            JOptionPane.PLAIN_MESSAGE, kentuckyBirdImage, object, object[0]);
      kentucky.optionChooser(kentucky, kentuckyBirdOption, object);
   }
   
   public void kentuckyBirdSong(Kentucky kentucky, String option, String[] object){
      ImageIcon kentuckyBirdSongImage = new ImageIcon("./img/birds/KentuckyBird.jpeg");      
     
      JFrame frame = new JFrame("KentuckyBirdSong");
      JPanel canvas = new JPanel();
      JLabel text = new JLabel("<html>This is Kentucky state Bird Song! <br> It is the Northern Cardinal Song <br> Click the play button to play the Kentucky state bird song <br> Select go back to go to the Kentucky state bird!<html>");
      JLabel picture = new JLabel(kentuckyBirdSongImage);
      JButton play = new JButton("Play Bird Song!");
      JButton back = new JButton("Go Back!");
      play.addActionListener(e-> kentucky.sound());
      back.addActionListener(e-> kentucky.backPrompt(kentucky, option, object, frame));
      
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
         AudioInputStream input = AudioSystem.getAudioInputStream(new File("./sound/KentuckySong.wav"));
         Clip clip = AudioSystem.getClip();
         Thread.sleep(10); 
         clip.open(input);
         clip.loop(0);
         Thread.sleep(1500);
      } catch (Exception sound){
         System.out.println("Error occured when playing sound!");
      }
   }
   
   public void backPrompt(Kentucky kentucky, String option, String[] object, JFrame frame){
      frame.dispose();
      kentucky.kentuckyBird(kentucky, option, object);
   }
      
      
}
   
