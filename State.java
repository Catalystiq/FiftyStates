//test state class

import javax.swing.*;
import java.awt.*;
import javax.sound.sampled.*;
import java.io.File;
import java.util.*;

public class State{
   State(){

   }
   
   
   public void statePrompt(){
      State state = new State();
   
      String stateObject[] = { "flag", "flower", "bird", "bird song", "go back", "exit" };
      
      ImageIcon statePromptImage = new ImageIcon("./img/flags/AlabamaFlag.png");

      String stateOption = (String) JOptionPane.showInputDialog(null, "Welcome to State \nThis is State state flag \n \n Select an option for more information about State, go back to select another state, or exit", "StatePrompt",
            JOptionPane.PLAIN_MESSAGE, statePromptImage, stateObject, stateObject[0]);
      state.optionChooser(state, stateOption, stateObject);      
      
   }
   
   public void optionChooser(State state, String option, String[] object){
      FiftyStates fifty = new FiftyStates();
   
      switch(option){
         case "flag":
            state.stateFlag(state, option, object);
            break;
         case "flower":
            state.stateFlower(state, option, object);
            break;
         case "bird":
            state.stateBird(state, option, object);
            break;
         case "bird song":
            state.stateBirdSong(state, option, object);
            break;
         case "go back":
            fifty.prompt(state);
            break;
         case "exit":
            System.exit(0);
            break;
         default:
            System.exit(0);
            break;
      }
   }
   
   public void stateFlag(State state, String option, String[] object){
      ImageIcon stateFlagImage = new ImageIcon("./img/flags/AlabamaFlag.png");

      String stateFlagOption = (String) JOptionPane.showInputDialog(null, "This is State state flag \n \n Select an option for more information about State, go back to select another state, or exit", "StateFlag",
            JOptionPane.PLAIN_MESSAGE, stateFlagImage, object, object[0]);
      state.optionChooser(state, stateFlagOption, object);
   }
   
   public void stateFlower(State state, String option, String[] object){
      ImageIcon stateFlowerImage = new ImageIcon("./img/flowers/AlabamaFlower.jpeg");

      String stateFlowerOption = (String) JOptionPane.showInputDialog(null, "This is State flower \n It is the [name]\n \n Select an option for more information about State, go back to select another state, or exit", "StateFlower",
            JOptionPane.PLAIN_MESSAGE, stateFlowerImage, object, object[0]);
      state.optionChooser(state, stateFlowerOption, object);
   }
   
   public void stateBird(State state, String option, String[] object){
      ImageIcon stateBirdImage = new ImageIcon("./img/birds/AlabamaBird.jpeg");

      String stateBirdOption = (String) JOptionPane.showInputDialog(null, "This is State bird \n It is the [name] \n \n Select an option for more information about State, go back to select another state, or exit", "StateBird",
            JOptionPane.PLAIN_MESSAGE, stateBirdImage, object, object[0]);
      state.optionChooser(state, stateBirdOption, object);
   }
   
   public void stateBirdSong(State state, String option, String[] object){
      ImageIcon stateBirdSongImage = new ImageIcon("./img/birds/AlabamaBird.jpeg");      
     
      JFrame frame = new JFrame("StateBirdSong");
      JPanel canvas = new JPanel();
      JLabel text = new JLabel("<html>This is State Bird Song! <br> Click the play button to play State bird song <br> Select go back to go to the State bird!<html>");
      JLabel picture = new JLabel(stateBirdSongImage);
      JButton play = new JButton("Play Bird Song!");
      JButton back = new JButton("Go Back!");
      play.addActionListener(e-> state.sound());
      back.addActionListener(e-> state.backPrompt(state, option, object, frame));
      
      canvas.add(picture);
      canvas.add(text);
      canvas.add(play);
      canvas.add(back);

      frame.add(canvas); 
      frame.setSize(600,600);
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
   
   public void backPrompt(State state, String option, String[] object, JFrame frame){
      frame.dispose();
      state.stateBird(state, option, object);
   }
      
      
}
   