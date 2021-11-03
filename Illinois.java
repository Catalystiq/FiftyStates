//FiftyStates
//James Nelson
//Computer Programming I
//October 19, 2021
//Fifty States Project Illinois

import javax.swing.*;
import javax.sound.sampled.*;
import java.io.File;

public class Illinois{
   Illinois(){

   }
   
   
   public void illinoisPrompt(){
      Illinois illinois = new Illinois();
   
      String illinoisObject[] = { "flag", "flower", "bird", "bird song", "go back", "exit" };
      
      ImageIcon illinoisPromptImage = new ImageIcon("./img/flags/IllinoisFlag.png");

      String illinoisOption = (String) JOptionPane.showInputDialog(null, "Welcome to Illinois \nThis is the Illinois state flag \n \n Select an option for more information about Illinois, go back to select another state, or exit", "IllinoisPrompt",
            JOptionPane.PLAIN_MESSAGE, illinoisPromptImage, illinoisObject, illinoisObject[0]);
      illinois.optionChooser(illinois, illinoisOption, illinoisObject);      
      
   }
   
   public void optionChooser(Illinois illinois, String option, String[] object){
      FiftyStates fifty = new FiftyStates();
   
      switch(option){
         case "flag":
            illinois.illinoisFlag(illinois, option, object);
            break;
         case "flower":
            illinois.illinoisFlower(illinois, option, object);
            break;
         case "bird":
            illinois.illinoisBird(illinois, option, object);
            break;
         case "bird song":
            illinois.illinoisBirdSong(illinois, option, object);
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
   
   public void illinoisFlag(Illinois illinois, String option, String[] object){
      ImageIcon illinoisFlagImage = new ImageIcon("./img/flags/IllinoisFlag.png");

      String illinoisFlagOption = (String) JOptionPane.showInputDialog(null, "This is the Illinois state flag \n \n Select an option for more information about Illinois, go back to select another state, or exit", "IllinoisFlag",
            JOptionPane.PLAIN_MESSAGE, illinoisFlagImage, object, object[0]);
      illinois.optionChooser(illinois, illinoisFlagOption, object);
   }
   
   public void illinoisFlower(Illinois illinois, String option, String[] object){
      ImageIcon illinoisFlowerImage = new ImageIcon("./img/flowers/IllinoisFlower.jpeg");

      String illinoisFlowerOption = (String) JOptionPane.showInputDialog(null, "This is the Illinois state flower \n It is the Violet\n \n Select an option for more information about Illinois, go back to select another state, or exit", "IllinoisFlower",
            JOptionPane.PLAIN_MESSAGE, illinoisFlowerImage, object, object[0]);
      illinois.optionChooser(illinois, illinoisFlowerOption, object);
   }
   
   public void illinoisBird(Illinois illinois, String option, String[] object){
      ImageIcon illinoisBirdImage = new ImageIcon("./img/birds/IllinoisBird.jpeg");

      String illinoisBirdOption = (String) JOptionPane.showInputDialog(null, "This is the Illinois state bird \n It is the Northern Cardinal \n \n Select an option for more information about Illinois, go back to select another state, or exit", "IllinoisBird",
            JOptionPane.PLAIN_MESSAGE, illinoisBirdImage, object, object[0]);
      illinois.optionChooser(illinois, illinoisBirdOption, object);
   }
   
   public void illinoisBirdSong(Illinois illinois, String option, String[] object){
      ImageIcon illinoisBirdSongImage = new ImageIcon("./img/birds/IllinoisBird.jpeg");      
     
      JFrame frame = new JFrame("IllinoisBirdSong");
      JPanel canvas = new JPanel();
      JLabel text = new JLabel("<html>This is Illinois state Bird Song! <br> It is the Northern Cardinal Song <br> Click the play button to play the Illinois state bird song <br> Select go back to go to the Illinois state bird!<html>");
      JLabel picture = new JLabel(illinoisBirdSongImage);
      JButton play = new JButton("Play Bird Song!");
      JButton back = new JButton("Go Back!");
      play.addActionListener(e-> illinois.sound());
      back.addActionListener(e-> illinois.backPrompt(illinois, option, object, frame));
      
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
         AudioInputStream input = AudioSystem.getAudioInputStream(new File("./sound/IllinoisSong.wav"));
         Clip clip = AudioSystem.getClip();
         Thread.sleep(10); 
         clip.open(input);
         clip.loop(0);
         Thread.sleep(1500);
      } catch (Exception sound){
         System.out.println("Error occured when playing sound!");
      }
   }
   
   public void backPrompt(Illinois illinois, String option, String[] object, JFrame frame){
      frame.dispose();
      illinois.illinoisBird(illinois, option, object);
   }
      
      
}