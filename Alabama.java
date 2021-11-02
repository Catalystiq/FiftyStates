//FiftyStates
//James Nelson
//Computer Programming I
//October 19, 2021
//Fifty States Project Alabama

import javax.swing.*;
import javax.sound.sampled.*;
import java.io.File;

public class Alabama{
   Alabama(){

   }
   
   
   public void alabamaPrompt(){
      Alabama alabama = new Alabama();
   
      String alabamaObject[] = { "flag", "flower", "bird", "bird song", "go back", "exit" };
      
      ImageIcon alabamaPromptImage = new ImageIcon("./img/flags/AlabamaFlag.png");

      String alabamaOption = (String) JOptionPane.showInputDialog(null, "Welcome to Alabama \nThis is the Alabama state flag \n \n Select an option for more information about Alabama, go back to select another state, or exit", "AlabamaPrompt",
            JOptionPane.PLAIN_MESSAGE, alabamaPromptImage, alabamaObject, alabamaObject[0]);
      alabama.optionChooser(alabama, alabamaOption, alabamaObject);      
      
   }
   
   public void optionChooser(Alabama alabama, String option, String[] object){
      FiftyStates fifty = new FiftyStates();
   
      switch(option){
         case "flag":
            alabama.alabamaFlag(alabama, option, object);
            break;
         case "flower":
            alabama.alabamaFlower(alabama, option, object);
            break;
         case "bird":
            alabama.alabamaBird(alabama, option, object);
            break;
         case "bird song":
            alabama.alabamaBirdSong(alabama, option, object);
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
   
   public void alabamaFlag(Alabama alabama, String option, String[] object){
      ImageIcon alabamaFlagImage = new ImageIcon("./img/flags/AlabamaFlag.png");

      String alabamaFlagOption = (String) JOptionPane.showInputDialog(null, "This is the Alabama state flag \n \n Select an option for more information about Alabama, go back to select another state, or exit", "AlabamaFlag",
            JOptionPane.PLAIN_MESSAGE, alabamaFlagImage, object, object[0]);
      alabama.optionChooser(alabama, alabamaFlagOption, object);
   }
   
   public void alabamaFlower(Alabama alabama, String option, String[] object){
      ImageIcon alabamaFlowerImage = new ImageIcon("./img/flowers/AlabamaFlower.jpeg");

      String alabamaFlowerOption = (String) JOptionPane.showInputDialog(null, "This is the Alabama state flower \n It is the Camillia\n \n Select an option for more information about Alabama, go back to select another state, or exit", "AlabamaFlower",
            JOptionPane.PLAIN_MESSAGE, alabamaFlowerImage, object, object[0]);
      alabama.optionChooser(alabama, alabamaFlowerOption, object);
   }
   
   public void alabamaBird(Alabama alabama, String option, String[] object){
      ImageIcon alabamaBirdImage = new ImageIcon("./img/birds/AlabamaBird.jpeg");

      String alabamaBirdOption = (String) JOptionPane.showInputDialog(null, "This is the Alabama state bird \n It is the Yellowhammer \n \n Select an option for more information about Alabama, go back to select another state, or exit", "AlabamaBird",
            JOptionPane.PLAIN_MESSAGE, alabamaBirdImage, object, object[0]);
      alabama.optionChooser(alabama, alabamaBirdOption, object);
   }
   
   public void alabamaBirdSong(Alabama alabama, String option, String[] object){
      ImageIcon alabamaBirdSongImage = new ImageIcon("./img/birds/AlabamaBird.jpeg");      
     
      JFrame frame = new JFrame("AlabamaBirdSong");
      JPanel canvas = new JPanel();
      JLabel text = new JLabel("<html>This is Alabama state Bird Song! <br> It is the Yellowhammer Song <br> Click the play button to play the Alabama state bird song <br> Select go back to go to the Alabama state bird!<html>");
      JLabel picture = new JLabel(alabamaBirdSongImage);
      JButton play = new JButton("Play Bird Song!");
      JButton back = new JButton("Go Back!");
      play.addActionListener(e-> alabama.sound());
      back.addActionListener(e-> alabama.backPrompt(alabama, option, object, frame));
      
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
         AudioInputStream input = AudioSystem.getAudioInputStream(new File("./sound/AlabamaSong.wav"));
         Clip clip = AudioSystem.getClip();
         Thread.sleep(10); 
         clip.open(input);
         clip.loop(0);
         Thread.sleep(1500);
      } catch (Exception sound){
         System.out.println("Error occured when playing sound!");
      }
   }
   
   public void backPrompt(Alabama alabama, String option, String[] object, JFrame frame){
      frame.dispose();
      alabama.alabamaBird(alabama, option, object);
   }
      
      
}
   