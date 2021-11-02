//test northDakota class

import javax.swing.*;
import javax.sound.sampled.*;
import java.io.File;

public class NorthDakota{
   NorthDakota(){

   }
   
   
   public void northDakotaPrompt(){
      NorthDakota northDakota = new NorthDakota();
   
      String northDakotaObject[] = { "flag", "flower", "bird", "bird song", "go back", "exit" };
      
      ImageIcon northDakotaPromptImage = new ImageIcon("./img/flags/NorthDakotaFlag.png");

      String northDakotaOption = (String) JOptionPane.showInputDialog(null, "Welcome to North Dakota \nThis is the North Dakota state flag \n \n Select an option for more information about North Dakota, go back to select another state, or exit", "NorthDakotaPrompt",
            JOptionPane.PLAIN_MESSAGE, northDakotaPromptImage, northDakotaObject, northDakotaObject[0]);
      northDakota.optionChooser(northDakota, northDakotaOption, northDakotaObject);      
      
   }
   
   public void optionChooser(NorthDakota northDakota, String option, String[] object){
      FiftyStates fifty = new FiftyStates();
   
      switch(option){
         case "flag":
            northDakota.northDakotaFlag(northDakota, option, object);
            break;
         case "flower":
            northDakota.northDakotaFlower(northDakota, option, object);
            break;
         case "bird":
            northDakota.northDakotaBird(northDakota, option, object);
            break;
         case "bird song":
            northDakota.northDakotaBirdSong(northDakota, option, object);
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
   
   public void northDakotaFlag(NorthDakota northDakota, String option, String[] object){
      ImageIcon northDakotaFlagImage = new ImageIcon("./img/flags/NorthDakotaFlag.png");

      String northDakotaFlagOption = (String) JOptionPane.showInputDialog(null, "This is the North Dakota state flag \n \n Select an option for more information about North Dakota, go back to select another state, or exit", "NorthDakotaFlag",
            JOptionPane.PLAIN_MESSAGE, northDakotaFlagImage, object, object[0]);
      northDakota.optionChooser(northDakota, northDakotaFlagOption, object);
   }
   
   public void northDakotaFlower(NorthDakota northDakota, String option, String[] object){
      ImageIcon northDakotaFlowerImage = new ImageIcon("./img/flowers/NorthDakotaFlower.jpeg");

      String northDakotaFlowerOption = (String) JOptionPane.showInputDialog(null, "This is the North Dakota state flower \n It is the Wild Prairie Rose\n \n Select an option for more information about North Dakota, go back to select another state, or exit", "NorthDakotaFlower",
            JOptionPane.PLAIN_MESSAGE, northDakotaFlowerImage, object, object[0]);
      northDakota.optionChooser(northDakota, northDakotaFlowerOption, object);
   }
   
   public void northDakotaBird(NorthDakota northDakota, String option, String[] object){
      ImageIcon northDakotaBirdImage = new ImageIcon("./img/birds/NorthDakotaBird.jpeg");

      String northDakotaBirdOption = (String) JOptionPane.showInputDialog(null, "This is the North Dakota state bird \n It is the Western Meadowlark \n \n Select an option for more information about North Dakota, go back to select another state, or exit", "NorthDakotaBird",
            JOptionPane.PLAIN_MESSAGE, northDakotaBirdImage, object, object[0]);
      northDakota.optionChooser(northDakota, northDakotaBirdOption, object);
   }
   
   public void northDakotaBirdSong(NorthDakota northDakota, String option, String[] object){
      ImageIcon northDakotaBirdSongImage = new ImageIcon("./img/birds/NorthDakotaBird.jpeg");      
     
      JFrame frame = new JFrame("NorthDakotaBirdSong");
      JPanel canvas = new JPanel();
      JLabel text = new JLabel("<html>This is North Dakota state Bird Song! <br> It is the Western Meadowlark Song <br> Click the play button to play the North Dakota state bird song <br> Select go back to go to the North Dakota state bird!<html>");
      JLabel picture = new JLabel(northDakotaBirdSongImage);
      JButton play = new JButton("Play Bird Song!");
      JButton back = new JButton("Go Back!");
      play.addActionListener(e-> northDakota.sound());
      back.addActionListener(e-> northDakota.backPrompt(northDakota, option, object, frame));
      
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
         AudioInputStream input = AudioSystem.getAudioInputStream(new File("./sound/NorthDakotaSong.wav"));
         Clip clip = AudioSystem.getClip();
         Thread.sleep(10); 
         clip.open(input);
         clip.loop(0);
         Thread.sleep(1500);
      } catch (Exception sound){
         System.out.println("Error occured when playing sound!");
      }
   }
   
   public void backPrompt(NorthDakota northDakota, String option, String[] object, JFrame frame){
      frame.dispose();
      northDakota.northDakotaBird(northDakota, option, object);
   }
      
      
}
   