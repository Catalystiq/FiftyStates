//FiftyStates
//Hiba Sarwar
//Computer Programming I
//October 19, 2021
//Fifty States Project North Carolina

import javax.swing.*;
import javax.sound.sampled.*;
import java.io.File;

public class NorthCarolina{
   NorthCarolina(){

   }
   
   
   public void northCarolinaPrompt(){
      NorthCarolina northCarolina = new NorthCarolina();
   
      String northCarolinaObject[] = { "flag", "flower", "bird", "bird song", "go back", "exit" };
      
      ImageIcon northCarolinaPromptImage = new ImageIcon("./img/flags/NorthCarolinaFlag.png");

      String northCarolinaOption = (String) JOptionPane.showInputDialog(null, "Welcome to North Carolina \nThis is the North Carolina state flag \n \n Select an option for more information about North Carolina, go back to select another state, or exit", "NorthCarolinaPrompt",
            JOptionPane.PLAIN_MESSAGE, northCarolinaPromptImage, northCarolinaObject, northCarolinaObject[0]);
      northCarolina.optionChooser(northCarolina, northCarolinaOption, northCarolinaObject);      
      
   }
   
   public void optionChooser(NorthCarolina northCarolina, String option, String[] object){
      FiftyStates fifty = new FiftyStates();
      
      switch(option){
         case "flag":
            northCarolina.northCarolinaFlag(northCarolina, option, object);
            break;
         case "flower":
            northCarolina.northCarolinaFlower(northCarolina, option, object);
            break;
         case "bird":
            northCarolina.northCarolinaBird(northCarolina, option, object);
            break;
         case "bird song":
            northCarolina.northCarolinaBirdSong(northCarolina, option, object);
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
   
   public void northCarolinaFlag(NorthCarolina northCarolina, String option, String[] object){
      ImageIcon northCarolinaFlagImage = new ImageIcon("./img/flags/NorthCarolinaFlag.png");

      String northCarolinaFlagOption = (String) JOptionPane.showInputDialog(null, "This is the North Carolina state flag \n \n Select an option for more information about North Carolina, go back to select another state, or exit", "NorthCarolinaFlag",
            JOptionPane.PLAIN_MESSAGE, northCarolinaFlagImage, object, object[0]);
      northCarolina.optionChooser(northCarolina, northCarolinaFlagOption, object);
   }
   
   public void northCarolinaFlower(NorthCarolina northCarolina, String option, String[] object){
      ImageIcon northCarolinaFlowerImage = new ImageIcon("./img/flowers/NorthCarolinaFlower.jpeg");

      String northCarolinaFlowerOption = (String) JOptionPane.showInputDialog(null, "This is the North Carolina state flower \n It is the Flowering Dogwood\n \n Select an option for more information about North Carolina, go back to select another state, or exit", "NorthCarolinaFlower",
            JOptionPane.PLAIN_MESSAGE, northCarolinaFlowerImage, object, object[0]);
      northCarolina.optionChooser(northCarolina, northCarolinaFlowerOption, object);
   }
   
   public void northCarolinaBird(NorthCarolina northCarolina, String option, String[] object){
      ImageIcon northCarolinaBirdImage = new ImageIcon("./img/birds/NorthCarolinaBird.jpeg");

      String northCarolinaBirdOption = (String) JOptionPane.showInputDialog(null, "This is the North Carolina state bird \n It is the Northern Cardinal \n \n Select an option for more information about North Carolina, go back to select another state, or exit", "NorthCarolinaBird",
            JOptionPane.PLAIN_MESSAGE, northCarolinaBirdImage, object, object[0]);
      northCarolina.optionChooser(northCarolina, northCarolinaBirdOption, object);
   }
   
   public void northCarolinaBirdSong(NorthCarolina northCarolina, String option, String[] object){
      ImageIcon northCarolinaBirdSongImage = new ImageIcon("./img/birds/NorthCarolinaBird.jpeg");      
     
      JFrame frame = new JFrame("NorthCarolinaBirdSong");
      JPanel canvas = new JPanel();
      JLabel text = new JLabel("<html>This is North Carolina state Bird Song! <br> It is the Northern Cardinal Song <br> Click the play button to play the North Carolina state bird song <br> Select go back to go to the North Carolina state bird!<html>");
      JLabel picture = new JLabel(northCarolinaBirdSongImage);
      JButton play = new JButton("Play Bird Song!");
      JButton back = new JButton("Go Back!");
      play.addActionListener(e-> northCarolina.sound());
      back.addActionListener(e-> northCarolina.backPrompt(northCarolina, option, object, frame));
      
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
         AudioInputStream input = AudioSystem.getAudioInputStream(new File("./sound/NorthCarolinaSong.wav"));
         Clip clip = AudioSystem.getClip();
         Thread.sleep(10); 
         clip.open(input);
         clip.loop(0);
         Thread.sleep(1500);
      } catch (Exception sound){
         System.out.println("Error occured when playing sound!");
      }
   }
   
   public void backPrompt(NorthCarolina northCarolina, String option, String[] object, JFrame frame){
      frame.dispose();
      northCarolina.northCarolinaBird(northCarolina, option, object);
   }
      
      
}
   
