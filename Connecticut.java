//test connecticut class

import javax.swing.*;
import javax.sound.sampled.*;
import java.io.File;

public class Connecticut{
   Connecticut(){

   }
   
   
   public void connecticutPrompt(){
      Connecticut connecticut = new Connecticut();
   
      String connecticutObject[] = { "flag", "flower", "bird", "bird song", "go back", "exit" };
      
      ImageIcon connecticutPromptImage = new ImageIcon("./img/flags/ConnecticutFlag.png");

      String connecticutOption = (String) JOptionPane.showInputDialog(null, "Welcome to Connecticut \nThis is the Connecticut state flag \n \n Select an option for more information about Connecticut, go back to select another state, or exit", "ConnecticutPrompt",
            JOptionPane.PLAIN_MESSAGE, connecticutPromptImage, connecticutObject, connecticutObject[0]);
      connecticut.optionChooser(connecticut, connecticutOption, connecticutObject);      
      
   }
   
   public void optionChooser(Connecticut connecticut, String option, String[] object){
      FiftyStates fifty = new FiftyStates();
   
      switch(option){
         case "flag":
            connecticut.connecticutFlag(connecticut, option, object);
            break;
         case "flower":
            connecticut.connecticutFlower(connecticut, option, object);
            break;
         case "bird":
            connecticut.connecticutBird(connecticut, option, object);
            break;
         case "bird song":
            connecticut.connecticutBirdSong(connecticut, option, object);
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
   
   public void connecticutFlag(Connecticut connecticut, String option, String[] object){
      ImageIcon connecticutFlagImage = new ImageIcon("./img/flags/ConnecticutFlag.png");

      String connecticutFlagOption = (String) JOptionPane.showInputDialog(null, "This is the Connecticut state flag \n \n Select an option for more information about Connecticut, go back to select another state, or exit", "ConnecticutFlag",
            JOptionPane.PLAIN_MESSAGE, connecticutFlagImage, object, object[0]);
      connecticut.optionChooser(connecticut, connecticutFlagOption, object);
   }
   
   public void connecticutFlower(Connecticut connecticut, String option, String[] object){
      ImageIcon connecticutFlowerImage = new ImageIcon("./img/flowers/ConnecticutFlower.jpeg");

      String connecticutFlowerOption = (String) JOptionPane.showInputDialog(null, "This is the Connecticut state flower \n It is the Mountain Laurel\n \n Select an option for more information about Connecticut, go back to select another state, or exit", "ConnecticutFlower",
            JOptionPane.PLAIN_MESSAGE, connecticutFlowerImage, object, object[0]);
      connecticut.optionChooser(connecticut, connecticutFlowerOption, object);
   }
   
   public void connecticutBird(Connecticut connecticut, String option, String[] object){
      ImageIcon connecticutBirdImage = new ImageIcon("./img/birds/ConnecticutBird.jpeg");

      String connecticutBirdOption = (String) JOptionPane.showInputDialog(null, "This is the Connecticut state bird \n It is the American Robin \n \n Select an option for more information about Connecticut, go back to select another state, or exit", "ConnecticutBird",
            JOptionPane.PLAIN_MESSAGE, connecticutBirdImage, object, object[0]);
      connecticut.optionChooser(connecticut, connecticutBirdOption, object);
   }
   
   public void connecticutBirdSong(Connecticut connecticut, String option, String[] object){
      ImageIcon connecticutBirdSongImage = new ImageIcon("./img/birds/ConnecticutBird.jpeg");      
     
      JFrame frame = new JFrame("ConnecticutBirdSong");
      JPanel canvas = new JPanel();
      JLabel text = new JLabel("<html>This is Connecticut state Bird Song! <br> It is the American Robin Song <br> Click the play button to play the Connecticut state bird song <br> Select go back to go to the Connecticut state bird!<html>");
      JLabel picture = new JLabel(connecticutBirdSongImage);
      JButton play = new JButton("Play Bird Song!");
      JButton back = new JButton("Go Back!");
      play.addActionListener(e-> connecticut.sound());
      back.addActionListener(e-> connecticut.backPrompt(connecticut, option, object, frame));
      
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
         AudioInputStream input = AudioSystem.getAudioInputStream(new File("./sound/ConnecticutSong.wav"));
         Clip clip = AudioSystem.getClip();
         Thread.sleep(10); 
         clip.open(input);
         clip.loop(0);
         Thread.sleep(1500);
      } catch (Exception sound){
         System.out.println("Error occured when playing sound!");
      }
   }
   
   public void backPrompt(Connecticut connecticut, String option, String[] object, JFrame frame){
      frame.dispose();
      connecticut.connecticutBird(connecticut, option, object);
   }
      
      
}