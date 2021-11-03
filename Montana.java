//FiftyStates
//James Nelson
//Computer Programming I
//October 19, 2021
//Fifty States Project Montana

import javax.swing.*;
import javax.sound.sampled.*;
import java.io.File;

public class Montana{
   Montana(){

   }
   
   
   public void montanaPrompt(){
      Montana montana = new Montana();
   
      String montanaObject[] = { "flag", "flower", "bird", "bird song", "go back", "exit" };
      
      ImageIcon montanaPromptImage = new ImageIcon("./img/flags/MontanaFlag.png");

      String montanaOption = (String) JOptionPane.showInputDialog(null, "Welcome to Montana \nThis is the Montana state flag \n \n Select an option for more information about Montana, go back to select another state, or exit", "MontanaPrompt",
            JOptionPane.PLAIN_MESSAGE, montanaPromptImage, montanaObject, montanaObject[0]);
      montana.optionChooser(montana, montanaOption, montanaObject);      
      
   }
   
   public void optionChooser(Montana montana, String option, String[] object){
      FiftyStates fifty = new FiftyStates();
   
      switch(option){
         case "flag":
            montana.montanaFlag(montana, option, object);
            break;
         case "flower":
            montana.montanaFlower(montana, option, object);
            break;
         case "bird":
            montana.montanaBird(montana, option, object);
            break;
         case "bird song":
            montana.montanaBirdSong(montana, option, object);
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
   
   public void montanaFlag(Montana montana, String option, String[] object){
      ImageIcon montanaFlagImage = new ImageIcon("./img/flags/MontanaFlag.png");

      String montanaFlagOption = (String) JOptionPane.showInputDialog(null, "This is the Montana state flag \n \n Select an option for more information about Montana, go back to select another state, or exit", "MontanaFlag",
            JOptionPane.PLAIN_MESSAGE, montanaFlagImage, object, object[0]);
      montana.optionChooser(montana, montanaFlagOption, object);
   }
   
   public void montanaFlower(Montana montana, String option, String[] object){
      ImageIcon montanaFlowerImage = new ImageIcon("./img/flowers/MontanaFlower.jpeg");

      String montanaFlowerOption = (String) JOptionPane.showInputDialog(null, "This is the Montana state flower \n It is the Sagebrush \n \n Select an option for more information about Montana, go back to select another state, or exit", "MontanaFlower",
            JOptionPane.PLAIN_MESSAGE, montanaFlowerImage, object, object[0]);
      montana.optionChooser(montana, montanaFlowerOption, object);
   }
   
   public void montanaBird(Montana montana, String option, String[] object){
      ImageIcon montanaBirdImage = new ImageIcon("./img/birds/MontanaBird.jpeg");

      String montanaBirdOption = (String) JOptionPane.showInputDialog(null, "This is the Montana state bird \n It is the Western Meadowlark \n \n Select an option for more information about Montana, go back to select another state, or exit", "MontanaBird",
            JOptionPane.PLAIN_MESSAGE, montanaBirdImage, object, object[0]);
      montana.optionChooser(montana, montanaBirdOption, object);
   }
   
   public void montanaBirdSong(Montana montana, String option, String[] object){
      ImageIcon montanaBirdSongImage = new ImageIcon("./img/birds/MontanaBird.jpeg");      
     
      JFrame frame = new JFrame("MontanaBirdSong");
      JPanel canvas = new JPanel();
      JLabel text = new JLabel("<html>This is Montana state Bird Song! <br> It is the Western Meadowlark Song <br> Click the play button to play the Montana state bird song <br> Select go back to go to the Montana state bird!<html>");
      JLabel picture = new JLabel(montanaBirdSongImage);
      JButton play = new JButton("Play Bird Song!");
      JButton back = new JButton("Go Back!");
      play.addActionListener(e-> montana.sound());
      back.addActionListener(e-> montana.backPrompt(montana, option, object, frame));
      
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
         AudioInputStream input = AudioSystem.getAudioInputStream(new File("./sound/MontanaSong.wav"));
         Clip clip = AudioSystem.getClip();
         Thread.sleep(10); 
         clip.open(input);
         clip.loop(0);
         Thread.sleep(1500);
      } catch (Exception sound){
         System.out.println("Error occured when playing sound!");
      }
   }
   
   public void backPrompt(Montana montana, String option, String[] object, JFrame frame){
      frame.dispose();
      montana.montanaBird(montana, option, object);
   }
      
      
}
   
