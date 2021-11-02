//SouthDakota
//Joshua Hammond
//October 28, 2021
//Computer Programming 1
//States South Dakota-Vermont



import javax.swing.*;
import javax.sound.sampled.*;
import java.io.File;

public class SouthDakota{
   SouthDakota(){

   }
   
   
   public void southDakotaPrompt(){
      SouthDakota southDakota = new SouthDakota();
   
      String southDakotaObject[] = { "flag", "flower", "bird", "bird song", "go back", "exit" };
      
      ImageIcon southDakotaPromptImage = new ImageIcon("./img/flags/SouthDakotaFlag.png");

      String southDakotaOption = (String) JOptionPane.showInputDialog(null, "Welcome to SouthDakota \nThis is the SouthDakota state flag \n \n Select an option for more information about SouthDakota, go back to select another state, or exit", "SouthDakotaPrompt",
            JOptionPane.PLAIN_MESSAGE, southDakotaPromptImage, southDakotaObject, southDakotaObject[0]);
      southDakota.optionChooser(southDakota, southDakotaOption, southDakotaObject);      
      
   }
   
   public void optionChooser(SouthDakota southDakota, String option, String[] object){
      FiftyStates fifty = new FiftyStates();
   
      switch(option){
         case "flag":
            southDakota.southDakotaFlag(southDakota, option, object);
            break;
         case "flower":
            southDakota.southDakotaFlower(southDakota, option, object);
            break;
         case "bird":
            southDakota.southDakotaBird(southDakota, option, object);
            break;
         case "bird song":
            southDakota.southDakotaBirdSong(southDakota, option, object);
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
   
   public void southDakotaFlag(SouthDakota southDakota, String option, String[] object){
      ImageIcon southDakotaFlagImage = new ImageIcon("./img/flags/SouthDakotaFlag.png");

      String southDakotaFlagOption = (String) JOptionPane.showInputDialog(null, "This is the SouthDakota state flag \n \n Select an option for more information about SouthDakota, go back to select another state, or exit", "SouthDakotaFlag",
            JOptionPane.PLAIN_MESSAGE, southDakotaFlagImage, object, object[0]);
      southDakota.optionChooser(southDakota, southDakotaFlagOption, object);
   }
   
   public void southDakotaFlower(SouthDakota southDakota, String option, String[] object){
      ImageIcon southDakotaFlowerImage = new ImageIcon("./img/flowers/SouthDakotaFlower.jpeg");

      String southDakotaFlowerOption = (String) JOptionPane.showInputDialog(null, "This is the SouthDakota state flower \n It is the Pasque\n \n Select an option for more information about SouthDakota, go back to select another state, or exit", "SouthDakotaFlower",
            JOptionPane.PLAIN_MESSAGE, southDakotaFlowerImage, object, object[0]);
      southDakota.optionChooser(southDakota, southDakotaFlowerOption, object);
   }
   
   public void southDakotaBird(SouthDakota southDakota, String option, String[] object){
      ImageIcon southDakotaBirdImage = new ImageIcon("./img/birds/SouthDakotaBird.jpeg");

      String southDakotaBirdOption = (String) JOptionPane.showInputDialog(null, "This is the SouthDakota state bird \n It is the Ring-Necked Pheasant\n \n Select an option for more information about SouthDakota, go back to select another state, or exit", "SouthDakotaBird",
            JOptionPane.PLAIN_MESSAGE, southDakotaBirdImage, object, object[0]);
      southDakota.optionChooser(southDakota, southDakotaBirdOption, object);
   }
   
   public void southDakotaBirdSong(SouthDakota southDakota, String option, String[] object){
      ImageIcon southDakotaBirdSongImage = new ImageIcon("./img/birds/SouthDakotaBird.jpeg");      
     
      JFrame frame = new JFrame("SouthDakotaBirdSong");
      JPanel canvas = new JPanel();
      JLabel text = new JLabel("<html>This is SouthDakota state Bird Song! <br> It is the Ring-Necked Pheasant Song <br> Click the play button to play the SouthDakota state bird song <br> Select go back to go to the SouthDakota state bird!<html>");
      JLabel picture = new JLabel(southDakotaBirdSongImage);
      JButton play = new JButton("Play Bird Song!");
      JButton back = new JButton("Go Back!");
      play.addActionListener(e-> southDakota.sound());
      back.addActionListener(e-> southDakota.backPrompt(southDakota, option, object, frame));
      
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
         AudioInputStream input = AudioSystem.getAudioInputStream(new File("./sound/SouthDakotaSong.wav"));
         Clip clip = AudioSystem.getClip();
         Thread.sleep(10); 
         clip.open(input);
         clip.loop(0);
         Thread.sleep(1500);
      } catch (Exception sound){
         System.out.println("Error occured when playing sound!");
      }
   }
   
   public void backPrompt(SouthDakota southDakota, String option, String[] object, JFrame frame){
      frame.dispose();
      southDakota.southDakotaBird(southDakota, option, object);
   }
      
      
}
   