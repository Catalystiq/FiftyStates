//FiftyStates
//James Nelson
//Computer Programming I
//October 19, 2021
//Fifty States Project Arizona

import javax.swing.*;
import javax.sound.sampled.*;
import java.io.File;

public class Arizona{
   Arizona(){

   }
   
   
   public void arizonaPrompt(){
      Arizona arizona = new Arizona();
   
      String arizonaObject[] = { "flag", "flower", "bird", "bird song", "go back", "exit" };
      
      ImageIcon arizonaPromptImage = new ImageIcon("./img/flags/ArizonaFlag.png");

      String arizonaOption = (String) JOptionPane.showInputDialog(null, "Welcome to Arizona \nThis is the Arizona state flag \n \n Select an option for more information about Arizona, go back to select another state, or exit", "ArizonaPrompt",
            JOptionPane.PLAIN_MESSAGE, arizonaPromptImage, arizonaObject, arizonaObject[0]);
      arizona.optionChooser(arizona, arizonaOption, arizonaObject);      
      
   }
   
   public void optionChooser(Arizona arizona, String option, String[] object){
      FiftyStates fifty = new FiftyStates();
   
      switch(option){
         case "flag":
            arizona.arizonaFlag(arizona, option, object);
            break;
         case "flower":
            arizona.arizonaFlower(arizona, option, object);
            break;
         case "bird":
            arizona.arizonaBird(arizona, option, object);
            break;
         case "bird song":
            arizona.arizonaBirdSong(arizona, option, object);
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
   
   public void arizonaFlag(Arizona arizona, String option, String[] object){
      ImageIcon arizonaFlagImage = new ImageIcon("./img/flags/ArizonaFlag.png");

      String arizonaFlagOption = (String) JOptionPane.showInputDialog(null, "This is the Arizona state flag \n \n Select an option for more information about Arizona, go back to select another state, or exit", "ArizonaFlag",
            JOptionPane.PLAIN_MESSAGE, arizonaFlagImage, object, object[0]);
      arizona.optionChooser(arizona, arizonaFlagOption, object);
   }
   
   public void arizonaFlower(Arizona arizona, String option, String[] object){
      ImageIcon arizonaFlowerImage = new ImageIcon("./img/flowers/ArizonaFlower.jpeg");

      String arizonaFlowerOption = (String) JOptionPane.showInputDialog(null, "This is the Arizona state flower \n It is the Saguaro Cactus Blossom\n \n Select an option for more information about Arizona, go back to select another state, or exit", "ArizonaFlower",
            JOptionPane.PLAIN_MESSAGE, arizonaFlowerImage, object, object[0]);
      arizona.optionChooser(arizona, arizonaFlowerOption, object);
   }
   
   public void arizonaBird(Arizona arizona, String option, String[] object){
      ImageIcon arizonaBirdImage = new ImageIcon("./img/birds/ArizonaBird.jpeg");

      String arizonaBirdOption = (String) JOptionPane.showInputDialog(null, "This is the Arizona state bird \n It is the Cactus Wren \n \n Select an option for more information about Arizona, go back to select another state, or exit", "ArizonaBird",
            JOptionPane.PLAIN_MESSAGE, arizonaBirdImage, object, object[0]);
      arizona.optionChooser(arizona, arizonaBirdOption, object);
   }
   
   public void arizonaBirdSong(Arizona arizona, String option, String[] object){
      ImageIcon arizonaBirdSongImage = new ImageIcon("./img/birds/ArizonaBird.jpeg");      
     
      JFrame frame = new JFrame("ArizonaBirdSong");
      JPanel canvas = new JPanel();
      JLabel text = new JLabel("<html>This is Arizona state Bird Song! <br> It is the Cactus Wren Song <br> Click the play button to play the Arizona state bird song <br> Select go back to go to the Arizona state bird!<html>");
      JLabel picture = new JLabel(arizonaBirdSongImage);
      JButton play = new JButton("Play Bird Song!");
      JButton back = new JButton("Go Back!");
      play.addActionListener(e-> arizona.sound());
      back.addActionListener(e-> arizona.backPrompt(arizona, option, object, frame));
      
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
         AudioInputStream input = AudioSystem.getAudioInputStream(new File("./sound/ArizonaSong.wav"));
         Clip clip = AudioSystem.getClip();
         Thread.sleep(10); 
         clip.open(input);
         clip.loop(0);
         Thread.sleep(1500);
      } catch (Exception sound){
         System.out.println("Error occured when playing sound!");
      }
   }
   
   public void backPrompt(Arizona arizona, String option, String[] object, JFrame frame){
      frame.dispose();
      arizona.arizonaBird(arizona, option, object);
   }
      
      
}
   
