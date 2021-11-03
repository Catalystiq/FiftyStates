//FiftyStates
//James Nelson
//Computer Programming I
//October 19, 2021
//Fifty States Project Colorado

import javax.swing.*;
import javax.sound.sampled.*;
import java.io.File;

public class Colorado{
   Colorado(){

   }
   
   
   public void coloradoPrompt(){
      Colorado colorado = new Colorado();
   
      String coloradoObject[] = { "flag", "flower", "bird", "bird song", "go back", "exit" };
      
      ImageIcon coloradoPromptImage = new ImageIcon("./img/flags/ColoradoFlag.png");

      String coloradoOption = (String) JOptionPane.showInputDialog(null, "Welcome to Colorado \nThis is the Colorado state flag \n \n Select an option for more information about Colorado, go back to select another state, or exit", "ColoradoPrompt",
            JOptionPane.PLAIN_MESSAGE, coloradoPromptImage, coloradoObject, coloradoObject[0]);
      colorado.optionChooser(colorado, coloradoOption, coloradoObject);      
      
   }
   
   public void optionChooser(Colorado colorado, String option, String[] object){
      FiftyStates fifty = new FiftyStates();
   
      switch(option){
         case "flag":
            colorado.coloradoFlag(colorado, option, object);
            break;
         case "flower":
            colorado.coloradoFlower(colorado, option, object);
            break;
         case "bird":
            colorado.coloradoBird(colorado, option, object);
            break;
         case "bird song":
            colorado.coloradoBirdSong(colorado, option, object);
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
   
   public void coloradoFlag(Colorado colorado, String option, String[] object){
      ImageIcon coloradoFlagImage = new ImageIcon("./img/flags/ColoradoFlag.png");

      String coloradoFlagOption = (String) JOptionPane.showInputDialog(null, "This is the Colorado state flag \n \n Select an option for more information about Colorado, go back to select another state, or exit", "ColoradoFlag",
            JOptionPane.PLAIN_MESSAGE, coloradoFlagImage, object, object[0]);
      colorado.optionChooser(colorado, coloradoFlagOption, object);
   }
   
   public void coloradoFlower(Colorado colorado, String option, String[] object){
      ImageIcon coloradoFlowerImage = new ImageIcon("./img/flowers/ColoradoFlower.jpeg");

      String coloradoFlowerOption = (String) JOptionPane.showInputDialog(null, "This is the Colorado state flower \n It is the Rocky Mountain Columbine\n \n Select an option for more information about Colorado, go back to select another state, or exit", "ColoradoFlower",
            JOptionPane.PLAIN_MESSAGE, coloradoFlowerImage, object, object[0]);
      colorado.optionChooser(colorado, coloradoFlowerOption, object);
   }
   
   public void coloradoBird(Colorado colorado, String option, String[] object){
      ImageIcon coloradoBirdImage = new ImageIcon("./img/birds/ColoradoBird.jpeg");

      String coloradoBirdOption = (String) JOptionPane.showInputDialog(null, "This is the Colorado state bird \n It is the Lark Bunting \n \n Select an option for more information about Colorado, go back to select another state, or exit", "ColoradoBird",
            JOptionPane.PLAIN_MESSAGE, coloradoBirdImage, object, object[0]);
      colorado.optionChooser(colorado, coloradoBirdOption, object);
   }
   
   public void coloradoBirdSong(Colorado colorado, String option, String[] object){
      ImageIcon coloradoBirdSongImage = new ImageIcon("./img/birds/ColoradoBird.jpeg");      
     
      JFrame frame = new JFrame("ColoradoBirdSong");
      JPanel canvas = new JPanel();
      JLabel text = new JLabel("<html>This is Colorado state Bird Song! <br> It is the Lark Bunting Song <br> Click the play button to play the Colorado state bird song <br> Select go back to go to the Colorado state bird!<html>");
      JLabel picture = new JLabel(coloradoBirdSongImage);
      JButton play = new JButton("Play Bird Song!");
      JButton back = new JButton("Go Back!");
      play.addActionListener(e-> colorado.sound());
      back.addActionListener(e-> colorado.backPrompt(colorado, option, object, frame));
      
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
         AudioInputStream input = AudioSystem.getAudioInputStream(new File("./sound/ColoradoSong.wav"));
         Clip clip = AudioSystem.getClip();
         Thread.sleep(10); 
         clip.open(input);
         clip.loop(0);
         Thread.sleep(1500);
      } catch (Exception sound){
         System.out.println("Error occured when playing sound!");
      }
   }
   
   public void backPrompt(Colorado colorado, String option, String[] object, JFrame frame){
      frame.dispose();
      colorado.coloradoBird(colorado, option, object);
   }
      
      
}