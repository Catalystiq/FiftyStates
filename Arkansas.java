//test arkansas class

import javax.swing.*;
import javax.sound.sampled.*;
import java.io.File;

public class Arkansas{
   Arkansas(){

   }
   
   
   public void arkansasPrompt(){
      Arkansas arkansas = new Arkansas();
   
      String arkansasObject[] = { "flag", "flower", "bird", "bird song", "go back", "exit" };
      
      ImageIcon arkansasPromptImage = new ImageIcon("./img/flags/ArkansasFlag.png");

      String arkansasOption = (String) JOptionPane.showInputDialog(null, "Welcome to Arkansas \nThis is the Arkansas state flag \n \n Select an option for more information about Arkansas, go back to select another state, or exit", "ArkansasPrompt",
            JOptionPane.PLAIN_MESSAGE, arkansasPromptImage, arkansasObject, arkansasObject[0]);
      arkansas.optionChooser(arkansas, arkansasOption, arkansasObject);      
      
   }
   
   public void optionChooser(Arkansas arkansas, String option, String[] object){
      FiftyStates fifty = new FiftyStates();
   
      switch(option){
         case "flag":
            arkansas.arkansasFlag(arkansas, option, object);
            break;
         case "flower":
            arkansas.arkansasFlower(arkansas, option, object);
            break;
         case "bird":
            arkansas.arkansasBird(arkansas, option, object);
            break;
         case "bird song":
            arkansas.arkansasBirdSong(arkansas, option, object);
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
   
   public void arkansasFlag(Arkansas arkansas, String option, String[] object){
      ImageIcon arkansasFlagImage = new ImageIcon("./img/flags/ArkansasFlag.png");

      String arkansasFlagOption = (String) JOptionPane.showInputDialog(null, "This is the Arkansas state flag \n \n Select an option for more information about Arkansas, go back to select another state, or exit", "ArkansasFlag",
            JOptionPane.PLAIN_MESSAGE, arkansasFlagImage, object, object[0]);
      arkansas.optionChooser(arkansas, arkansasFlagOption, object);
   }
   
   public void arkansasFlower(Arkansas arkansas, String option, String[] object){
      ImageIcon arkansasFlowerImage = new ImageIcon("./img/flowers/ArkansasFlower.jpeg");

      String arkansasFlowerOption = (String) JOptionPane.showInputDialog(null, "This is the Arkansas state flower \n It is the Apple Blossom\n \n Select an option for more information about Arkansas, go back to select another state, or exit", "ArkansasFlower",
            JOptionPane.PLAIN_MESSAGE, arkansasFlowerImage, object, object[0]);
      arkansas.optionChooser(arkansas, arkansasFlowerOption, object);
   }
   
   public void arkansasBird(Arkansas arkansas, String option, String[] object){
      ImageIcon arkansasBirdImage = new ImageIcon("./img/birds/ArkansasBird.jpeg");

      String arkansasBirdOption = (String) JOptionPane.showInputDialog(null, "This is the Arkansas state bird \n It is the Northern Mockingbird \n \n Select an option for more information about Arkansas, go back to select another state, or exit", "ArkansasBird",
            JOptionPane.PLAIN_MESSAGE, arkansasBirdImage, object, object[0]);
      arkansas.optionChooser(arkansas, arkansasBirdOption, object);
   }
   
   public void arkansasBirdSong(Arkansas arkansas, String option, String[] object){
      ImageIcon arkansasBirdSongImage = new ImageIcon("./img/birds/ArkansasBird.jpeg");      
     
      JFrame frame = new JFrame("ArkansasBirdSong");
      JPanel canvas = new JPanel();
      JLabel text = new JLabel("<html>This is Arkansas state Bird Song! <br> It is the Northern Mockingbird Song <br> Click the play button to play the Arkansas state bird song <br> Select go back to go to the Arkansas state bird!<html>");
      JLabel picture = new JLabel(arkansasBirdSongImage);
      JButton play = new JButton("Play Bird Song!");
      JButton back = new JButton("Go Back!");
      play.addActionListener(e-> arkansas.sound());
      back.addActionListener(e-> arkansas.backPrompt(arkansas, option, object, frame));
      
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
         AudioInputStream input = AudioSystem.getAudioInputStream(new File("./sound/ArkansasSong.wav"));
         Clip clip = AudioSystem.getClip();
         Thread.sleep(10); 
         clip.open(input);
         clip.loop(0);
         Thread.sleep(1500);
      } catch (Exception sound){
         System.out.println("Error occured when playing sound!");
      }
   }
   
   public void backPrompt(Arkansas arkansas, String option, String[] object, JFrame frame){
      frame.dispose();
      arkansas.arkansasBird(arkansas, option, object);
   }
      
      
}
   
