//FiftyStates
//James Nelson
//Computer Programming I
//October 19, 2021
//Fifty States Project Michigan

import javax.swing.*;
import javax.sound.sampled.*;
import java.io.File;

public class Michigan{
   Michigan(){

   }
   
   
   public void michiganPrompt(){
      Michigan michigan = new Michigan();
   
      String michiganObject[] = { "flag", "flower", "bird", "bird song", "go back", "exit" };
      
      ImageIcon michiganPromptImage = new ImageIcon("./img/flags/MichiganFlag.png");

      String michiganOption = (String) JOptionPane.showInputDialog(null, "Welcome to Michigan \nThis is the Michigan state flag \n \n Select an option for more information about Michigan, go back to select another state, or exit", "MichiganPrompt",
            JOptionPane.PLAIN_MESSAGE, michiganPromptImage, michiganObject, michiganObject[0]);
      michigan.optionChooser(michigan, michiganOption, michiganObject);      
      
   }
   
   public void optionChooser(Michigan michigan, String option, String[] object){
      FiftyStates fifty = new FiftyStates();
   
      switch(option){
         case "flag":
            michigan.michiganFlag(michigan, option, object);
            break;
         case "flower":
            michigan.michiganFlower(michigan, option, object);
            break;
         case "bird":
            michigan.michiganBird(michigan, option, object);
            break;
         case "bird song":
            michigan.michiganBirdSong(michigan, option, object);
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
   
   public void michiganFlag(Michigan michigan, String option, String[] object){
      ImageIcon michiganFlagImage = new ImageIcon("./img/flags/MichiganFlag.png");

      String michiganFlagOption = (String) JOptionPane.showInputDialog(null, "This is the Michigan state flag \n \n Select an option for more information about Michigan, go back to select another state, or exit", "MichiganFlag",
            JOptionPane.PLAIN_MESSAGE, michiganFlagImage, object, object[0]);
      michigan.optionChooser(michigan, michiganFlagOption, object);
   }
   
   public void michiganFlower(Michigan michigan, String option, String[] object){
      ImageIcon michiganFlowerImage = new ImageIcon("./img/flowers/MichiganFlower.jpeg");

      String michiganFlowerOption = (String) JOptionPane.showInputDialog(null, "This is the Michigan state flower \n It is the Apple Blossom\n \n Select an option for more information about Michigan, go back to select another state, or exit", "MichiganFlower",
            JOptionPane.PLAIN_MESSAGE, michiganFlowerImage, object, object[0]);
      michigan.optionChooser(michigan, michiganFlowerOption, object);
   }
   
   public void michiganBird(Michigan michigan, String option, String[] object){
      ImageIcon michiganBirdImage = new ImageIcon("./img/birds/MichiganBird.jpeg");

      String michiganBirdOption = (String) JOptionPane.showInputDialog(null, "This is the Michigan state bird \n It is the American Robin \n \n Select an option for more information about Michigan, go back to select another state, or exit", "MichiganBird",
            JOptionPane.PLAIN_MESSAGE, michiganBirdImage, object, object[0]);
      michigan.optionChooser(michigan, michiganBirdOption, object);
   }
   
   public void michiganBirdSong(Michigan michigan, String option, String[] object){
      ImageIcon michiganBirdSongImage = new ImageIcon("./img/birds/MichiganBird.jpeg");      
     
      JFrame frame = new JFrame("MichiganBirdSong");
      JPanel canvas = new JPanel();
      JLabel text = new JLabel("<html>This is Michigan state Bird Song! <br> It is the American Robin Song <br> Click the play button to play the Michigan state bird song <br> Select go back to go to the Michigan state bird!<html>");
      JLabel picture = new JLabel(michiganBirdSongImage);
      JButton play = new JButton("Play Bird Song!");
      JButton back = new JButton("Go Back!");
      play.addActionListener(e-> michigan.sound());
      back.addActionListener(e-> michigan.backPrompt(michigan, option, object, frame));
      
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
         AudioInputStream input = AudioSystem.getAudioInputStream(new File("./sound/MichiganSong.wav"));
         Clip clip = AudioSystem.getClip();
         Thread.sleep(10); 
         clip.open(input);
         clip.loop(0);
         Thread.sleep(1500);
      } catch (Exception sound){
         System.out.println("Error occured when playing sound!");
      }
   }
   
   public void backPrompt(Michigan michigan, String option, String[] object, JFrame frame){
      frame.dispose();
      michigan.michiganBird(michigan, option, object);
   }
      
      
}
   
