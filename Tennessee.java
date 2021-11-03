//FiftyStates
//Joshua Hammond
//Computer Programming I
//October 19, 2021
//Fifty States Project Tennessee

import javax.swing.*;
import javax.sound.sampled.*;
import java.io.File;

public class Tennessee{
   Tennessee(){

   }
   
   
   public void tennesseePrompt(){
      Tennessee tennessee = new Tennessee();
   
      String tennesseeObject[] = { "flag", "flower", "bird", "bird song", "go back", "exit" };
      
      ImageIcon tennesseePromptImage = new ImageIcon("./img/flags/TennesseeFlag.png");

      String tennesseeOption = (String) JOptionPane.showInputDialog(null, "Welcome to Tennessee \nThis is the Tennessee state flag \n \n Select an option for more information about Tennessee, go back to select another state, or exit", "TennesseePrompt",
            JOptionPane.PLAIN_MESSAGE, tennesseePromptImage, tennesseeObject, tennesseeObject[0]);
      tennessee.optionChooser(tennessee, tennesseeOption, tennesseeObject);      
      
   }
   
   public void optionChooser(Tennessee tennessee, String option, String[] object){
      FiftyStates fifty = new FiftyStates();
   
      switch(option){
         case "flag":
            tennessee.tennesseeFlag(tennessee, option, object);
            break;
         case "flower":
            tennessee.tennesseeFlower(tennessee, option, object);
            break;
         case "bird":
            tennessee.tennesseeBird(tennessee, option, object);
            break;
         case "bird song":
            tennessee.tennesseeBirdSong(tennessee, option, object);
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
   
   public void tennesseeFlag(Tennessee tennessee, String option, String[] object){
      ImageIcon tennesseeFlagImage = new ImageIcon("./img/flags/TennesseeFlag.png");

      String tennesseeFlagOption = (String) JOptionPane.showInputDialog(null, "This is the Tennessee state flag \n \n Select an option for more information about Tennessee, go back to select another state, or exit", "TennesseeFlag",
            JOptionPane.PLAIN_MESSAGE, tennesseeFlagImage, object, object[0]);
      tennessee.optionChooser(tennessee, tennesseeFlagOption, object);
   }
   
   public void tennesseeFlower(Tennessee tennessee, String option, String[] object){
      ImageIcon tennesseeFlowerImage = new ImageIcon("./img/flowers/TennesseeFlower.jpeg");

      String tennesseeFlowerOption = (String) JOptionPane.showInputDialog(null, "This is the Tennessee state flower \n It is the Iris\n \n Select an option for more information about Tennessee, go back to select another state, or exit", "TennesseeFlower",
            JOptionPane.PLAIN_MESSAGE, tennesseeFlowerImage, object, object[0]);
      tennessee.optionChooser(tennessee, tennesseeFlowerOption, object);
   }
   
   public void tennesseeBird(Tennessee tennessee, String option, String[] object){
      ImageIcon tennesseeBirdImage = new ImageIcon("./img/birds/TennesseeBird.jpeg");

      String tennesseeBirdOption = (String) JOptionPane.showInputDialog(null, "This is the Tennessee state bird \n It is the Northern Mockingbird \n \n Select an option for more information about Tennessee, go back to select another state, or exit", "TennesseeBird",
            JOptionPane.PLAIN_MESSAGE, tennesseeBirdImage, object, object[0]);
      tennessee.optionChooser(tennessee, tennesseeBirdOption, object);
   }
   
   public void tennesseeBirdSong(Tennessee tennessee, String option, String[] object){
      ImageIcon tennesseeBirdSongImage = new ImageIcon("./img/birds/TennesseeBird.jpeg");      
     
      JFrame frame = new JFrame("TennesseeBirdSong");
      JPanel canvas = new JPanel();
      JLabel text = new JLabel("<html>This is Tennessee state Bird Song! <br> It is the Northern Mockingbird Song <br> Click the play button to play the Tennessee state bird song <br> Select go back to go to the Tennessee state bird!<html>");
      JLabel picture = new JLabel(tennesseeBirdSongImage);
      JButton play = new JButton("Play Bird Song!");
      JButton back = new JButton("Go Back!");
      play.addActionListener(e-> tennessee.sound());
      back.addActionListener(e-> tennessee.backPrompt(tennessee, option, object, frame));
      
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
         AudioInputStream input = AudioSystem.getAudioInputStream(new File("./sound/TennesseeSong.wav"));
         Clip clip = AudioSystem.getClip();
         Thread.sleep(10); 
         clip.open(input);
         clip.loop(0);
         Thread.sleep(1500);
      } catch (Exception sound){
         System.out.println("Error occured when playing sound!");
      }
   }
   
   public void backPrompt(Tennessee tennessee, String option, String[] object, JFrame frame){
      frame.dispose();
      tennessee.tennesseeBird(tennessee, option, object);
   }
      
      
}
   