//Vermont
//Joshua Hammond
//October 28, 2021
//Computer Programming 1


import javax.swing.*;
import javax.sound.sampled.*;
import java.io.File;

public class Vermont{
   Vermont(){

   }
   
   
   public void vermontPrompt(){
      Vermont vermont = new Vermont();
   
      String vermontObject[] = { "flag", "flower", "bird", "bird song", "go back", "exit" };
      
      ImageIcon vermontPromptImage = new ImageIcon("./img/flags/VermontFlag.png");

      String vermontOption = (String) JOptionPane.showInputDialog(null, "Welcome to Vermont \nThis is the Vermont state flag \n \n Select an option for more information about Vermont, go back to select another state, or exit", "VermontPrompt",
            JOptionPane.PLAIN_MESSAGE, vermontPromptImage, vermontObject, vermontObject[0]);
      vermont.optionChooser(vermont, vermontOption, vermontObject);      
      
   }
   
   public void optionChooser(Vermont vermont, String option, String[] object){
      FiftyStates fifty = new FiftyStates();
   
      switch(option){
         case "flag":
            vermont.vermontFlag(vermont, option, object);
            break;
         case "flower":
            vermont.vermontFlower(vermont, option, object);
            break;
         case "bird":
            vermont.vermontBird(vermont, option, object);
            break;
         case "bird song":
            vermont.vermontBirdSong(vermont, option, object);
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
   
   public void vermontFlag(Vermont vermont, String option, String[] object){
      ImageIcon vermontFlagImage = new ImageIcon("./img/flags/VermontFlag.png");

      String vermontFlagOption = (String) JOptionPane.showInputDialog(null, "This is the Vermont state flag \n \n Select an option for more information about Vermont, go back to select another state, or exit", "VermontFlag",
            JOptionPane.PLAIN_MESSAGE, vermontFlagImage, object, object[0]);
      vermont.optionChooser(vermont, vermontFlagOption, object);
   }
   
   public void vermontFlower(Vermont vermont, String option, String[] object){
      ImageIcon vermontFlowerImage = new ImageIcon("./img/flowers/VermontFlower.jpeg");

      String vermontFlowerOption = (String) JOptionPane.showInputDialog(null, "This is the Vermont state \"flower\" \n It is the Red clover\n \n Select an option for more information about Vermont, go back to select another state, or exit", "VermontFlower",
            JOptionPane.PLAIN_MESSAGE, vermontFlowerImage, object, object[0]);
      vermont.optionChooser(vermont, vermontFlowerOption, object);
   }
   
   public void vermontBird(Vermont vermont, String option, String[] object){
      ImageIcon vermontBirdImage = new ImageIcon("./img/birds/VermontBird.jpeg");

      String vermontBirdOption = (String) JOptionPane.showInputDialog(null, "This is the Vermont state bird \n It is the Hermit Thrush \n \n Select an option for more information about Vermont, go back to select another state, or exit", "VermontBird",
            JOptionPane.PLAIN_MESSAGE, vermontBirdImage, object, object[0]);
      vermont.optionChooser(vermont, vermontBirdOption, object);
   }
   
   public void vermontBirdSong(Vermont vermont, String option, String[] object){
      ImageIcon vermontBirdSongImage = new ImageIcon("./img/birds/VermontBird.jpeg");      
     
      JFrame frame = new JFrame("VermontBirdSong");
      JPanel canvas = new JPanel();
      JLabel text = new JLabel("<html>This is Vermont state Bird Song! <br> It is the Hermit Thrush Song <br> Click the play button to play the Vermont state bird song <br> Select go back to go to the Vermont state bird!<html>");
      JLabel picture = new JLabel(vermontBirdSongImage);
      JButton play = new JButton("Play Bird Song!");
      JButton back = new JButton("Go Back!");
      play.addActionListener(e-> vermont.sound());
      back.addActionListener(e-> vermont.backPrompt(vermont, option, object, frame));
      
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
         AudioInputStream input = AudioSystem.getAudioInputStream(new File("./sound/VermontSong.wav"));
         Clip clip = AudioSystem.getClip();
         Thread.sleep(10); 
         clip.open(input);
         clip.loop(0);
         Thread.sleep(1500);
      } catch (Exception sound){
         System.out.println("Error occured when playing sound!");
      }
   }
   
   public void backPrompt(Vermont vermont, String option, String[] object, JFrame frame){
      frame.dispose();
      vermont.vermontBird(vermont, option, object);
   }
      
      
}
   