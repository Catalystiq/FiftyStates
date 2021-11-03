//test newJersey class

import javax.swing.*;
import javax.sound.sampled.*;
import java.io.File;

public class NewJersey{
   NewJersey(){

   }
   
   
   public void newJerseyPrompt(){
      NewJersey newJersey = new NewJersey();
   
      String newJerseyObject[] = { "flag", "flower", "bird", "bird song", "go back", "exit" };
      
      ImageIcon newJerseyPromptImage = new ImageIcon("./img/flags/NewJerseyFlag.png");

      String newJerseyOption = (String) JOptionPane.showInputDialog(null, "Welcome to NewJersey \nThis is the NewJersey state flag \n \n Select an option for more information about NewJersey, go back to select another state, or exit", "NewJerseyPrompt",
            JOptionPane.PLAIN_MESSAGE, newJerseyPromptImage, newJerseyObject, newJerseyObject[0]);
      newJersey.optionChooser(newJersey, newJerseyOption, newJerseyObject);      
      
   }
   
   public void optionChooser(NewJersey newJersey, String option, String[] object){
      FiftyStates fifty = new FiftyStates();
   
      switch(option){
         case "flag":
            newJersey.newJerseyFlag(newJersey, option, object);
            break;
         case "flower":
            newJersey.newJerseyFlower(newJersey, option, object);
            break;
         case "bird":
            newJersey.newJerseyBird(newJersey, option, object);
            break;
         case "bird song":
            newJersey.newJerseyBirdSong(newJersey, option, object);
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
   
   public void newJerseyFlag(NewJersey newJersey, String option, String[] object){
      ImageIcon newJerseyFlagImage = new ImageIcon("./img/flags/NewJerseyFlag.png");

      String newJerseyFlagOption = (String) JOptionPane.showInputDialog(null, "This is the NewJersey state flag \n \n Select an option for more information about NewJersey, go back to select another state, or exit", "NewJerseyFlag",
            JOptionPane.PLAIN_MESSAGE, newJerseyFlagImage, object, object[0]);
      newJersey.optionChooser(newJersey, newJerseyFlagOption, object);
   }
   
   public void newJerseyFlower(NewJersey newJersey, String option, String[] object){
      ImageIcon newJerseyFlowerImage = new ImageIcon("./img/flowers/NewJerseyFlower.jpeg");

      String newJerseyFlowerOption = (String) JOptionPane.showInputDialog(null, "This is the NewJersey state flower \n It is the Violet \n \n Select an option for more information about NewJersey, go back to select another state, or exit", "NewJerseyFlower",
            JOptionPane.PLAIN_MESSAGE, newJerseyFlowerImage, object, object[0]);
      newJersey.optionChooser(newJersey, newJerseyFlowerOption, object);
   }
   
   public void newJerseyBird(NewJersey newJersey, String option, String[] object){
      ImageIcon newJerseyBirdImage = new ImageIcon("./img/birds/NewJerseyBird.jpeg");

      String newJerseyBirdOption = (String) JOptionPane.showInputDialog(null, "This is the NewJersey state bird \n It is the Eastern Goldfinch \n \n Select an option for more information about NewJersey, go back to select another state, or exit", "NewJerseyBird",
            JOptionPane.PLAIN_MESSAGE, newJerseyBirdImage, object, object[0]);
      newJersey.optionChooser(newJersey, newJerseyBirdOption, object);
   }
   
   public void newJerseyBirdSong(NewJersey newJersey, String option, String[] object){
      ImageIcon newJerseyBirdSongImage = new ImageIcon("./img/birds/NewJerseyBird.jpeg");      
     
      JFrame frame = new JFrame("NewJerseyBirdSong");
      JPanel canvas = new JPanel();
      JLabel text = new JLabel("<html>This is NewJersey state Bird Song! <br> It is the Eastern Goldfinch Song <br> Click the play button to play the NewJersey state bird song <br> Select go back to go to the NewJersey state bird!<html>");
      JLabel picture = new JLabel(newJerseyBirdSongImage);
      JButton play = new JButton("Play Bird Song!");
      JButton back = new JButton("Go Back!");
      play.addActionListener(e-> newJersey.sound());
      back.addActionListener(e-> newJersey.backPrompt(newJersey, option, object, frame));
      
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
         AudioInputStream input = AudioSystem.getAudioInputStream(new File("./sound/NewJerseySong.wav"));
         Clip clip = AudioSystem.getClip();
         Thread.sleep(10); 
         clip.open(input);
         clip.loop(0);
         Thread.sleep(1500);
      } catch (Exception sound){
         System.out.println("Error occured when playing sound!");
      }
   }
   
   public void backPrompt(NewJersey newJersey, String option, String[] object, JFrame frame){
      frame.dispose();
      newJersey.newJerseyBird(newJersey, option, object);
   }
      
      
}
   
