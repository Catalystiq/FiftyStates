//FiftyStates
//Joshua Hammond
//Computer Programming I
//October 19, 2021
//Fifty States Project Wisconsin

import javax.swing.*;
import javax.sound.sampled.*;
import java.io.File;

public class Wisconsin{
   Wisconsin(){

   }
   
   
   public void wisconsinPrompt(){
      Wisconsin wisconsin = new Wisconsin();
   
      String wisconsinObject[] = { "flag", "flower", "bird", "bird song", "go back", "exit" };
      
      ImageIcon wisconsinPromptImage = new ImageIcon("./img/flags/WisconsinFlag.png");

      String wisconsinOption = (String) JOptionPane.showInputDialog(null, "Welcome to Wisconsin \nThis is the Wisconsin state flag \n \n Select an option for more information about Wisconsin, go back to select another state, or exit", "WisconsinPrompt",
            JOptionPane.PLAIN_MESSAGE, wisconsinPromptImage, wisconsinObject, wisconsinObject[0]);
      wisconsin.optionChooser(wisconsin, wisconsinOption, wisconsinObject);      
      
   }
   
   public void optionChooser(Wisconsin wisconsin, String option, String[] object){
      FiftyStates fifty = new FiftyStates();
   
      switch(option){
         case "flag":
            wisconsin.wisconsinFlag(wisconsin, option, object);
            break;
         case "flower":
            wisconsin.wisconsinFlower(wisconsin, option, object);
            break;
         case "bird":
            wisconsin.wisconsinBird(wisconsin, option, object);
            break;
         case "bird song":
            wisconsin.wisconsinBirdSong(wisconsin, option, object);
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
   
   public void wisconsinFlag(Wisconsin wisconsin, String option, String[] object){
      ImageIcon wisconsinFlagImage = new ImageIcon("./img/flags/WisconsinFlag.png");

      String wisconsinFlagOption = (String) JOptionPane.showInputDialog(null, "This is the Wisconsin state flag \n \n Select an option for more information about Wisconsin, go back to select another state, or exit", "WisconsinFlag",
            JOptionPane.PLAIN_MESSAGE, wisconsinFlagImage, object, object[0]);
      wisconsin.optionChooser(wisconsin, wisconsinFlagOption, object);
   }
   
   public void wisconsinFlower(Wisconsin wisconsin, String option, String[] object){
      ImageIcon wisconsinFlowerImage = new ImageIcon("./img/flowers/WisconsinFlower.jpeg");

      String wisconsinFlowerOption = (String) JOptionPane.showInputDialog(null, "This is the Wisconsin state flower \n It is the Wood Violet\n \n Select an option for more information about Wisconsin, go back to select another state, or exit", "WisconsinFlower",
            JOptionPane.PLAIN_MESSAGE, wisconsinFlowerImage, object, object[0]);
      wisconsin.optionChooser(wisconsin, wisconsinFlowerOption, object);
   }
   
   public void wisconsinBird(Wisconsin wisconsin, String option, String[] object){
      ImageIcon wisconsinBirdImage = new ImageIcon("./img/birds/WisconsinBird.jpeg");

      String wisconsinBirdOption = (String) JOptionPane.showInputDialog(null, "This is the Wisconsin state bird \n It is the American Robin \n \n Select an option for more information about Wisconsin, go back to select another state, or exit", "WisconsinBird",
            JOptionPane.PLAIN_MESSAGE, wisconsinBirdImage, object, object[0]);
      wisconsin.optionChooser(wisconsin, wisconsinBirdOption, object);
   }
   
   public void wisconsinBirdSong(Wisconsin wisconsin, String option, String[] object){
      ImageIcon wisconsinBirdSongImage = new ImageIcon("./img/birds/WisconsinBird.jpeg");      
     
      JFrame frame = new JFrame("WisconsinBirdSong");
      JPanel canvas = new JPanel();
      JLabel text = new JLabel("<html>This is Wisconsin state Bird Song! <br> It is the American Robin Song <br> Click the play button to play the Wisconsin state bird song <br> Select go back to go to the Wisconsin state bird!<html>");
      JLabel picture = new JLabel(wisconsinBirdSongImage);
      JButton play = new JButton("Play Bird Song!");
      JButton back = new JButton("Go Back!");
      play.addActionListener(e-> wisconsin.sound());
      back.addActionListener(e-> wisconsin.backPrompt(wisconsin, option, object, frame));
      
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
         AudioInputStream input = AudioSystem.getAudioInputStream(new File("./sound/WisconsinSong.wav"));
         Clip clip = AudioSystem.getClip();
         Thread.sleep(10); 
         clip.open(input);
         clip.loop(0);
         Thread.sleep(1500);
      } catch (Exception sound){
         System.out.println("Error occured when playing sound!");
      }
   }
   
   public void backPrompt(Wisconsin wisconsin, String option, String[] object, JFrame frame){
      frame.dispose();
      wisconsin.wisconsinBird(wisconsin, option, object);
   }
      
      
}
   
