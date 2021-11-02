//test california class

import javax.swing.*;
import javax.sound.sampled.*;
import java.io.File;

public class California{
   California(){

   }
   
   
   public void californiaPrompt(){
      California california = new California();
   
      String californiaObject[] = { "flag", "flower", "bird", "bird song", "go back", "exit" };
      
      ImageIcon californiaPromptImage = new ImageIcon("./img/flags/CaliforniaFlag.png");

      String californiaOption = (String) JOptionPane.showInputDialog(null, "Welcome to California \nThis is the California state flag \n \n Select an option for more information about California, go back to select another state, or exit", "CaliforniaPrompt",
            JOptionPane.PLAIN_MESSAGE, californiaPromptImage, californiaObject, californiaObject[0]);
      california.optionChooser(california, californiaOption, californiaObject);      
      
   }
   
   public void optionChooser(California california, String option, String[] object){
      FiftyStates fifty = new FiftyStates();
   
      switch(option){
         case "flag":
            california.californiaFlag(california, option, object);
            break;
         case "flower":
            california.californiaFlower(california, option, object);
            break;
         case "bird":
            california.californiaBird(california, option, object);
            break;
         case "bird song":
            california.californiaBirdSong(california, option, object);
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
   
   public void californiaFlag(California california, String option, String[] object){
      ImageIcon californiaFlagImage = new ImageIcon("./img/flags/CaliforniaFlag.png");

      String californiaFlagOption = (String) JOptionPane.showInputDialog(null, "This is the California state flag \n \n Select an option for more information about California, go back to select another state, or exit", "CaliforniaFlag",
            JOptionPane.PLAIN_MESSAGE, californiaFlagImage, object, object[0]);
      california.optionChooser(california, californiaFlagOption, object);
   }
   
   public void californiaFlower(California california, String option, String[] object){
      ImageIcon californiaFlowerImage = new ImageIcon("./img/flowers/CaliforniaFlower.jpeg");

      String californiaFlowerOption = (String) JOptionPane.showInputDialog(null, "This is the California state flower \n It is the California Poppy\n \n Select an option for more information about California, go back to select another state, or exit", "CaliforniaFlower",
            JOptionPane.PLAIN_MESSAGE, californiaFlowerImage, object, object[0]);
      california.optionChooser(california, californiaFlowerOption, object);
   }
   
   public void californiaBird(California california, String option, String[] object){
      ImageIcon californiaBirdImage = new ImageIcon("./img/birds/CaliforniaBird.jpeg");

      String californiaBirdOption = (String) JOptionPane.showInputDialog(null, "This is the California state bird \n It is the California Quail \n \n Select an option for more information about California, go back to select another state, or exit", "CaliforniaBird",
            JOptionPane.PLAIN_MESSAGE, californiaBirdImage, object, object[0]);
      california.optionChooser(california, californiaBirdOption, object);
   }
   
   public void californiaBirdSong(California california, String option, String[] object){
      ImageIcon californiaBirdSongImage = new ImageIcon("./img/birds/CaliforniaBird.jpeg");      
     
      JFrame frame = new JFrame("CaliforniaBirdSong");
      JPanel canvas = new JPanel();
      JLabel text = new JLabel("<html>This is California state Bird Song! <br> It is the California Quail Song <br> Click the play button to play the California state bird song <br> Select go back to go to the California state bird!<html>");
      JLabel picture = new JLabel(californiaBirdSongImage);
      JButton play = new JButton("Play Bird Song!");
      JButton back = new JButton("Go Back!");
      play.addActionListener(e-> california.sound());
      back.addActionListener(e-> california.backPrompt(california, option, object, frame));
      
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
         AudioInputStream input = AudioSystem.getAudioInputStream(new File("./sound/CaliforniaSong.wav"));
         Clip clip = AudioSystem.getClip();
         Thread.sleep(10); 
         clip.open(input);
         clip.loop(0);
         Thread.sleep(1500);
      } catch (Exception sound){
         System.out.println("Error occured when playing sound!");
      }
   }
   
   public void backPrompt(California california, String option, String[] object, JFrame frame){
      frame.dispose();
      california.californiaBird(california, option, object);
   }
      
      
}
   
