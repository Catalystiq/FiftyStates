//FiftyStates
//Hiba Sarwar
//Computer Programming I
//October 19, 2021
//Fifty States Project Oklahoma

import javax.swing.*;
import javax.sound.sampled.*;
import java.io.File;

public class Oklahoma{
   Oklahoma(){

   }
   
   
   public void oklahomaPrompt(){
      Oklahoma oklahoma = new Oklahoma();
   
      String oklahomaObject[] = { "flag", "flower", "bird", "bird song", "go back", "exit" };
      
      ImageIcon oklahomaPromptImage = new ImageIcon("./img/flags/OklahomaFlag.png");

      String oklahomaOption = (String) JOptionPane.showInputDialog(null, "Welcome to Oklahoma \nThis is the Oklahoma state flag \n \n Select an option for more information about Oklahoma, go back to select another state, or exit", "OklahomaPrompt",
            JOptionPane.PLAIN_MESSAGE, oklahomaPromptImage, oklahomaObject, oklahomaObject[0]);
      oklahoma.optionChooser(oklahoma, oklahomaOption, oklahomaObject);      
      
   }
   
   public void optionChooser(Oklahoma oklahoma, String option, String[] object){
      FiftyStates fifty = new FiftyStates();
   
      switch(option){
         case "flag":
            oklahoma.oklahomaFlag(oklahoma, option, object);
            break;
         case "flower":
            oklahoma.oklahomaFlower(oklahoma, option, object);
            break;
         case "bird":
            oklahoma.oklahomaBird(oklahoma, option, object);
            break;
         case "bird song":
            oklahoma.oklahomaBirdSong(oklahoma, option, object);
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
   
   public void oklahomaFlag(Oklahoma oklahoma, String option, String[] object){
      ImageIcon oklahomaFlagImage = new ImageIcon("./img/flags/OklahomaFlag.png");

      String oklahomaFlagOption = (String) JOptionPane.showInputDialog(null, "This is the Oklahoma state flag \n \n Select an option for more information about Oklahoma, go back to select another state, or exit", "OklahomaFlag",
            JOptionPane.PLAIN_MESSAGE, oklahomaFlagImage, object, object[0]);
      oklahoma.optionChooser(oklahoma, oklahomaFlagOption, object);
   }
   
   public void oklahomaFlower(Oklahoma oklahoma, String option, String[] object){
      ImageIcon oklahomaFlowerImage = new ImageIcon("./img/flowers/OklahomaFlower.jpeg");

      String oklahomaFlowerOption = (String) JOptionPane.showInputDialog(null, "This is the Oklahoma state flower \n It is the Oklahoma Rose\n \n Select an option for more information about Oklahoma, go back to select another state, or exit", "OklahomaFlower",
            JOptionPane.PLAIN_MESSAGE, oklahomaFlowerImage, object, object[0]);
      oklahoma.optionChooser(oklahoma, oklahomaFlowerOption, object);
   }
   
   public void oklahomaBird(Oklahoma oklahoma, String option, String[] object){
      ImageIcon oklahomaBirdImage = new ImageIcon("./img/birds/OklahomaBird.jpeg");

      String oklahomaBirdOption = (String) JOptionPane.showInputDialog(null, "This is the Oklahoma state bird \n It is the Scissor-Tailed Flycatcher \n \n Select an option for more information about Oklahoma, go back to select another state, or exit", "OklahomaBird",
            JOptionPane.PLAIN_MESSAGE, oklahomaBirdImage, object, object[0]);
      oklahoma.optionChooser(oklahoma, oklahomaBirdOption, object);
   }
   
   public void oklahomaBirdSong(Oklahoma oklahoma, String option, String[] object){
      ImageIcon oklahomaBirdSongImage = new ImageIcon("./img/birds/OklahomaBird.jpeg");      
     
      JFrame frame = new JFrame("OklahomaBirdSong");
      JPanel canvas = new JPanel();
      JLabel text = new JLabel("<html>This is Oklahoma state Bird Song! <br> It is the Scissor-Tailed Flycatcher Song <br> Click the play button to play the Oklahoma state bird song <br> Select go back to go to the Oklahoma state bird!<html>");
      JLabel picture = new JLabel(oklahomaBirdSongImage);
      JButton play = new JButton("Play Bird Song!");
      JButton back = new JButton("Go Back!");
      play.addActionListener(e-> oklahoma.sound());
      back.addActionListener(e-> oklahoma.backPrompt(oklahoma, option, object, frame));
      
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
         AudioInputStream input = AudioSystem.getAudioInputStream(new File("./sound/OklahomaSong.wav"));
         Clip clip = AudioSystem.getClip();
         Thread.sleep(10); 
         clip.open(input);
         clip.loop(0);
         Thread.sleep(1500);
      } catch (Exception sound){
         System.out.println("Error occured when playing sound!");
      }
   }
   
   public void backPrompt(Oklahoma oklahoma, String option, String[] object, JFrame frame){
      frame.dispose();
      oklahoma.oklahomaBird(oklahoma, option, object);
   }
      
      
}
   