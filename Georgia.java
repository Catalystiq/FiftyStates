//FiftyStates
//James Nelson
//Computer Programming I
//October 19, 2021
//Fifty States Project Georgia

import javax.swing.*;
import javax.sound.sampled.*;
import java.io.File;

public class Georgia{
   Georgia(){

   }
   
   
   public void georgiaPrompt(){
      Georgia georgia = new Georgia();
   
      String georgiaObject[] = { "flag", "flower", "bird", "bird song", "go back", "exit" };
      
      ImageIcon georgiaPromptImage = new ImageIcon("./img/flags/GeorgiaFlag.png");

      String georgiaOption = (String) JOptionPane.showInputDialog(null, "Welcome to Georgia \nThis is the Georgia state flag \n \n Select an option for more information about Georgia, go back to select another state, or exit", "GeorgiaPrompt",
            JOptionPane.PLAIN_MESSAGE, georgiaPromptImage, georgiaObject, georgiaObject[0]);
      georgia.optionChooser(georgia, georgiaOption, georgiaObject);      
      
   }
   
   public void optionChooser(Georgia georgia, String option, String[] object){
      FiftyStates fifty = new FiftyStates();
   
      switch(option){
         case "flag":
            georgia.georgiaFlag(georgia, option, object);
            break;
         case "flower":
            georgia.georgiaFlower(georgia, option, object);
            break;
         case "bird":
            georgia.georgiaBird(georgia, option, object);
            break;
         case "bird song":
            georgia.georgiaBirdSong(georgia, option, object);
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
   
   public void georgiaFlag(Georgia georgia, String option, String[] object){
      ImageIcon georgiaFlagImage = new ImageIcon("./img/flags/GeorgiaFlag.png");

      String georgiaFlagOption = (String) JOptionPane.showInputDialog(null, "This is the Georgia state flag \n \n Select an option for more information about Georgia, go back to select another state, or exit", "GeorgiaFlag",
            JOptionPane.PLAIN_MESSAGE, georgiaFlagImage, object, object[0]);
      georgia.optionChooser(georgia, georgiaFlagOption, object);
   }
   
   public void georgiaFlower(Georgia georgia, String option, String[] object){
      ImageIcon georgiaFlowerImage = new ImageIcon("./img/flowers/GeorgiaFlower.jpeg");

      String georgiaFlowerOption = (String) JOptionPane.showInputDialog(null, "This is the Georgia state flower \n It is the Cherokee Rose\n \n Select an option for more information about Georgia, go back to select another state, or exit", "GeorgiaFlower",
            JOptionPane.PLAIN_MESSAGE, georgiaFlowerImage, object, object[0]);
      georgia.optionChooser(georgia, georgiaFlowerOption, object);
   }
   
   public void georgiaBird(Georgia georgia, String option, String[] object){
      ImageIcon georgiaBirdImage = new ImageIcon("./img/birds/GeorgiaBird.jpeg");

      String georgiaBirdOption = (String) JOptionPane.showInputDialog(null, "This is the Georgia state bird \n It is the Brown Thrasher \n \n Select an option for more information about Georgia, go back to select another state, or exit", "GeorgiaBird",
            JOptionPane.PLAIN_MESSAGE, georgiaBirdImage, object, object[0]);
      georgia.optionChooser(georgia, georgiaBirdOption, object);
   }
   
   public void georgiaBirdSong(Georgia georgia, String option, String[] object){
      ImageIcon georgiaBirdSongImage = new ImageIcon("./img/birds/GeorgiaBird.jpeg");      
     
      JFrame frame = new JFrame("GeorgiaBirdSong");
      JPanel canvas = new JPanel();
      JLabel text = new JLabel("<html>This is Georgia state Bird Song! <br> It is the Brown Thrasher Song <br> Click the play button to play the Georgia state bird song <br> Select go back to go to the Georgia state bird!<html>");
      JLabel picture = new JLabel(georgiaBirdSongImage);
      JButton play = new JButton("Play Bird Song!");
      JButton back = new JButton("Go Back!");
      play.addActionListener(e-> georgia.sound());
      back.addActionListener(e-> georgia.backPrompt(georgia, option, object, frame));
      
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
         AudioInputStream input = AudioSystem.getAudioInputStream(new File("./sound/GeorgiaSong.wav"));
         Clip clip = AudioSystem.getClip();
         Thread.sleep(10); 
         clip.open(input);
         clip.loop(0);
         Thread.sleep(1500);
      } catch (Exception sound){
         System.out.println("Error occured when playing sound!");
      }
   }
   
   public void backPrompt(Georgia georgia, String option, String[] object, JFrame frame){
      frame.dispose();
      georgia.georgiaBird(georgia, option, object);
   }
      
      
}