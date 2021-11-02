//test idaho class

import javax.swing.*;
import javax.sound.sampled.*;
import java.io.File;

public class Idaho{
   Idaho(){

   }
   
   
   public void idahoPrompt(){
      Idaho idaho = new Idaho();
   
      String idahoObject[] = { "flag", "flower", "bird", "bird song", "go back", "exit" };
      
      ImageIcon idahoPromptImage = new ImageIcon("./img/flags/IdahoFlag.png");

      String idahoOption = (String) JOptionPane.showInputDialog(null, "Welcome to Idaho \nThis is the Idaho state flag \n \n Select an option for more information about Idaho, go back to select another state, or exit", "IdahoPrompt",
            JOptionPane.PLAIN_MESSAGE, idahoPromptImage, idahoObject, idahoObject[0]);
      idaho.optionChooser(idaho, idahoOption, idahoObject);      
      
   }
   
   public void optionChooser(Idaho idaho, String option, String[] object){
      FiftyStates fifty = new FiftyStates();
   
      switch(option){
         case "flag":
            idaho.idahoFlag(idaho, option, object);
            break;
         case "flower":
            idaho.idahoFlower(idaho, option, object);
            break;
         case "bird":
            idaho.idahoBird(idaho, option, object);
            break;
         case "bird song":
            idaho.idahoBirdSong(idaho, option, object);
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
   
   public void idahoFlag(Idaho idaho, String option, String[] object){
      ImageIcon idahoFlagImage = new ImageIcon("./img/flags/IdahoFlag.png");

      String idahoFlagOption = (String) JOptionPane.showInputDialog(null, "This is the Idaho state flag \n \n Select an option for more information about Idaho, go back to select another state, or exit", "IdahoFlag",
            JOptionPane.PLAIN_MESSAGE, idahoFlagImage, object, object[0]);
      idaho.optionChooser(idaho, idahoFlagOption, object);
   }
   
   public void idahoFlower(Idaho idaho, String option, String[] object){
      ImageIcon idahoFlowerImage = new ImageIcon("./img/flowers/IdahoFlower.jpeg");

      String idahoFlowerOption = (String) JOptionPane.showInputDialog(null, "This is the Idaho state flower \n It is the Syringa\n \n Select an option for more information about Idaho, go back to select another state, or exit", "IdahoFlower",
            JOptionPane.PLAIN_MESSAGE, idahoFlowerImage, object, object[0]);
      idaho.optionChooser(idaho, idahoFlowerOption, object);
   }
   
   public void idahoBird(Idaho idaho, String option, String[] object){
      ImageIcon idahoBirdImage = new ImageIcon("./img/birds/IdahoBird.jpeg");

      String idahoBirdOption = (String) JOptionPane.showInputDialog(null, "This is the Idaho state bird \n It is the Mountain Bluebird \n \n Select an option for more information about Idaho, go back to select another state, or exit", "IdahoBird",
            JOptionPane.PLAIN_MESSAGE, idahoBirdImage, object, object[0]);
      idaho.optionChooser(idaho, idahoBirdOption, object);
   }
   
   public void idahoBirdSong(Idaho idaho, String option, String[] object){
      ImageIcon idahoBirdSongImage = new ImageIcon("./img/birds/IdahoBird.jpeg");      
     
      JFrame frame = new JFrame("IdahoBirdSong");
      JPanel canvas = new JPanel();
      JLabel text = new JLabel("<html>This is Idaho state Bird Song! <br> It is the Mountain Bluebird Song <br> Click the play button to play the Idaho state bird song <br> Select go back to go to the Idaho state bird!<html>");
      JLabel picture = new JLabel(idahoBirdSongImage);
      JButton play = new JButton("Play Bird Song!");
      JButton back = new JButton("Go Back!");
      play.addActionListener(e-> idaho.sound());
      back.addActionListener(e-> idaho.backPrompt(idaho, option, object, frame));
      
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
         AudioInputStream input = AudioSystem.getAudioInputStream(new File("./sound/IdahoSong.wav"));
         Clip clip = AudioSystem.getClip();
         Thread.sleep(10); 
         clip.open(input);
         clip.loop(0);
         Thread.sleep(1500);
      } catch (Exception sound){
         System.out.println("Error occured when playing sound!");
      }
   }
   
   public void backPrompt(Idaho idaho, String option, String[] object, JFrame frame){
      frame.dispose();
      idaho.idahoBird(idaho, option, object);
   }
      
      
}