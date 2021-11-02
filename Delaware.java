//test delaware class

import javax.swing.*;
import javax.sound.sampled.*;
import java.io.File;

public class Delaware{
   Delaware(){

   }
   
   
   public void delawarePrompt(){
      Delaware delaware = new Delaware();
   
      String delawareObject[] = { "flag", "flower", "bird", "bird song", "go back", "exit" };
      
      ImageIcon delawarePromptImage = new ImageIcon("./img/flags/DelawareFlag.png");

      String delawareOption = (String) JOptionPane.showInputDialog(null, "Welcome to Delaware \nThis is the Delaware state flag \n \n Select an option for more information about Delaware, go back to select another state, or exit", "DelawarePrompt",
            JOptionPane.PLAIN_MESSAGE, delawarePromptImage, delawareObject, delawareObject[0]);
      delaware.optionChooser(delaware, delawareOption, delawareObject);      
      
   }
   
   public void optionChooser(Delaware delaware, String option, String[] object){
      FiftyStates fifty = new FiftyStates();
   
      switch(option){
         case "flag":
            delaware.delawareFlag(delaware, option, object);
            break;
         case "flower":
            delaware.delawareFlower(delaware, option, object);
            break;
         case "bird":
            delaware.delawareBird(delaware, option, object);
            break;
         case "bird song":
            delaware.delawareBirdSong(delaware, option, object);
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
   
   public void delawareFlag(Delaware delaware, String option, String[] object){
      ImageIcon delawareFlagImage = new ImageIcon("./img/flags/DelawareFlag.png");

      String delawareFlagOption = (String) JOptionPane.showInputDialog(null, "This is the Delaware state flag \n \n Select an option for more information about Delaware, go back to select another state, or exit", "DelawareFlag",
            JOptionPane.PLAIN_MESSAGE, delawareFlagImage, object, object[0]);
      delaware.optionChooser(delaware, delawareFlagOption, object);
   }
   
   public void delawareFlower(Delaware delaware, String option, String[] object){
      ImageIcon delawareFlowerImage = new ImageIcon("./img/flowers/DelawareFlower.jpeg");

      String delawareFlowerOption = (String) JOptionPane.showInputDialog(null, "This is the Delaware state flower \n It is the Peach Blossom\n \n Select an option for more information about Delaware, go back to select another state, or exit", "DelawareFlower",
            JOptionPane.PLAIN_MESSAGE, delawareFlowerImage, object, object[0]);
      delaware.optionChooser(delaware, delawareFlowerOption, object);
   }
   
   public void delawareBird(Delaware delaware, String option, String[] object){
      ImageIcon delawareBirdImage = new ImageIcon("./img/birds/DelawareBird.jpeg");

      String delawareBirdOption = (String) JOptionPane.showInputDialog(null, "This is the Delaware state bird \n It is the Delaware Blue Hen \n \n Select an option for more information about Delaware, go back to select another state, or exit", "DelawareBird",
            JOptionPane.PLAIN_MESSAGE, delawareBirdImage, object, object[0]);
      delaware.optionChooser(delaware, delawareBirdOption, object);
   }
   
   public void delawareBirdSong(Delaware delaware, String option, String[] object){
      ImageIcon delawareBirdSongImage = new ImageIcon("./img/birds/DelawareBird.jpeg");      
     
      JFrame frame = new JFrame("DelawareBirdSong");
      JPanel canvas = new JPanel();
      JLabel text = new JLabel("<html>This is Delaware state Bird Song! <br> It is the Delaware Blue Hen Song <br> Click the play button to play the Delaware state bird song <br> Select go back to go to the Delaware state bird!<html>");
      JLabel picture = new JLabel(delawareBirdSongImage);
      JButton play = new JButton("Play Bird Song!");
      JButton back = new JButton("Go Back!");
      play.addActionListener(e-> delaware.sound());
      back.addActionListener(e-> delaware.backPrompt(delaware, option, object, frame));
      
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
         AudioInputStream input = AudioSystem.getAudioInputStream(new File("./sound/DelawareSong.wav"));
         Clip clip = AudioSystem.getClip();
         Thread.sleep(10); 
         clip.open(input);
         clip.loop(0);
         Thread.sleep(1500);
      } catch (Exception sound){
         System.out.println("Error occured when playing sound!");
      }
   }
   
   public void backPrompt(Delaware delaware, String option, String[] object, JFrame frame){
      frame.dispose();
      delaware.delawareBird(delaware, option, object);
   }
      
      
}