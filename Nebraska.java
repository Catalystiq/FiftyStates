//test nebraska class

import javax.swing.*;
import javax.sound.sampled.*;
import java.io.File;

public class Nebraska{
   Nebraska(){

   }
   
   
   public void nebraskaPrompt(){
      Nebraska nebraska = new Nebraska();
   
      String nebraskaObject[] = { "flag", "flower", "bird", "bird song", "go back", "exit" };
      
      ImageIcon nebraskaPromptImage = new ImageIcon("./img/flags/NebraskaFlag.png");

      String nebraskaOption = (String) JOptionPane.showInputDialog(null, "Welcome to Nebraska \nThis is the Nebraska state flag \n \n Select an option for more information about Nebraska, go back to select another state, or exit", "NebraskaPrompt",
            JOptionPane.PLAIN_MESSAGE, nebraskaPromptImage, nebraskaObject, nebraskaObject[0]);
      nebraska.optionChooser(nebraska, nebraskaOption, nebraskaObject);      
      
   }
   
   public void optionChooser(Nebraska nebraska, String option, String[] object){
      FiftyStates fifty = new FiftyStates();
   
      switch(option){
         case "flag":
            nebraska.nebraskaFlag(nebraska, option, object);
            break;
         case "flower":
            nebraska.nebraskaFlower(nebraska, option, object);
            break;
         case "bird":
            nebraska.nebraskaBird(nebraska, option, object);
            break;
         case "bird song":
            nebraska.nebraskaBirdSong(nebraska, option, object);
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
   
   public void nebraskaFlag(Nebraska nebraska, String option, String[] object){
      ImageIcon nebraskaFlagImage = new ImageIcon("./img/flags/NebraskaFlag.png");

      String nebraskaFlagOption = (String) JOptionPane.showInputDialog(null, "This is the Nebraska state flag \n \n Select an option for more information about Nebraska, go back to select another state, or exit", "NebraskaFlag",
            JOptionPane.PLAIN_MESSAGE, nebraskaFlagImage, object, object[0]);
      nebraska.optionChooser(nebraska, nebraskaFlagOption, object);
   }
   
   public void nebraskaFlower(Nebraska nebraska, String option, String[] object){
      ImageIcon nebraskaFlowerImage = new ImageIcon("./img/flowers/NebraskaFlower.jpeg");

      String nebraskaFlowerOption = (String) JOptionPane.showInputDialog(null, "This is the Nebraska state flower \n It is the Goldenrod\n \n Select an option for more information about Nebraska, go back to select another state, or exit", "NebraskaFlower",
            JOptionPane.PLAIN_MESSAGE, nebraskaFlowerImage, object, object[0]);
      nebraska.optionChooser(nebraska, nebraskaFlowerOption, object);
   }
   
   public void nebraskaBird(Nebraska nebraska, String option, String[] object){
      ImageIcon nebraskaBirdImage = new ImageIcon("./img/birds/NebraskaBird.jpeg");

      String nebraskaBirdOption = (String) JOptionPane.showInputDialog(null, "This is the Nebraska state bird \n It is the Western Meadowlark \n \n Select an option for more information about Nebraska, go back to select another state, or exit", "NebraskaBird",
            JOptionPane.PLAIN_MESSAGE, nebraskaBirdImage, object, object[0]);
      nebraska.optionChooser(nebraska, nebraskaBirdOption, object);
   }
   
   public void nebraskaBirdSong(Nebraska nebraska, String option, String[] object){
      ImageIcon nebraskaBirdSongImage = new ImageIcon("./img/birds/NebraskaBird.jpeg");      
     
      JFrame frame = new JFrame("NebraskaBirdSong");
      JPanel canvas = new JPanel();
      JLabel text = new JLabel("<html>This is Nebraska state Bird Song! <br> It is the Western Meadowlark Song <br> Click the play button to play the Nebraska state bird song <br> Select go back to go to the Nebraska state bird!<html>");
      JLabel picture = new JLabel(nebraskaBirdSongImage);
      JButton play = new JButton("Play Bird Song!");
      JButton back = new JButton("Go Back!");
      play.addActionListener(e-> nebraska.sound());
      back.addActionListener(e-> nebraska.backPrompt(nebraska, option, object, frame));
      
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
         AudioInputStream input = AudioSystem.getAudioInputStream(new File("./sound/NebraskaSong.wav"));
         Clip clip = AudioSystem.getClip();
         Thread.sleep(10); 
         clip.open(input);
         clip.loop(0);
         Thread.sleep(1500);
      } catch (Exception sound){
         System.out.println("Error occured when playing sound!");
      }
   }
   
   public void backPrompt(Nebraska nebraska, String option, String[] object, JFrame frame){
      frame.dispose();
      nebraska.nebraskaBird(nebraska, option, object);
   }
      
      
}
   
