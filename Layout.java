//FiftyStates
//James Nelson
//Computer Programming I
//October 19, 2021
//Fifty States Project State Layout

import javax.swing.*;
import javax.sound.sampled.*;
import java.io.File;

public class Layout{
   Layout(){

   }
   
   
   public void layoutPrompt(){
      Layout layout = new Layout();
   
      String layoutObject[] = { "flag", "flower", "bird", "bird song", "go back", "exit" };
      
      ImageIcon layoutPromptImage = new ImageIcon("./img/flags/LayoutFlag.png");

      String layoutOption = (String) JOptionPane.showInputDialog(null, "Welcome to Layout \nThis is the Layout state flag \n \n Select an option for more information about Layout, go back to select another state, or exit", "LayoutPrompt",
            JOptionPane.PLAIN_MESSAGE, layoutPromptImage, layoutObject, layoutObject[0]);
      layout.optionChooser(layout, layoutOption, layoutObject);      
      
   }
   
   public void optionChooser(Layout layout, String option, String[] object){
      FiftyStates fifty = new FiftyStates();
   
      switch(option){
         case "flag":
            layout.layoutFlag(layout, option, object);
            break;
         case "flower":
            layout.layoutFlower(layout, option, object);
            break;
         case "bird":
            layout.layoutBird(layout, option, object);
            break;
         case "bird song":
            layout.layoutBirdSong(layout, option, object);
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
   
   public void layoutFlag(Layout layout, String option, String[] object){
      ImageIcon layoutFlagImage = new ImageIcon("./img/flags/LayoutFlag.png");

      String layoutFlagOption = (String) JOptionPane.showInputDialog(null, "This is the Layout state flag \n \n Select an option for more information about Layout, go back to select another state, or exit", "LayoutFlag",
            JOptionPane.PLAIN_MESSAGE, layoutFlagImage, object, object[0]);
      layout.optionChooser(layout, layoutFlagOption, object);
   }
   
   public void layoutFlower(Layout layout, String option, String[] object){
      ImageIcon layoutFlowerImage = new ImageIcon("./img/flowers/LayoutFlower.jpeg");

      String layoutFlowerOption = (String) JOptionPane.showInputDialog(null, "This is the Layout state flower \n It is the [name]\n \n Select an option for more information about Layout, go back to select another state, or exit", "LayoutFlower",
            JOptionPane.PLAIN_MESSAGE, layoutFlowerImage, object, object[0]);
      layout.optionChooser(layout, layoutFlowerOption, object);
   }
   
   public void layoutBird(Layout layout, String option, String[] object){
      ImageIcon layoutBirdImage = new ImageIcon("./img/birds/LayoutBird.jpeg");

      String layoutBirdOption = (String) JOptionPane.showInputDialog(null, "This is the Layout state bird \n It is the [name] \n \n Select an option for more information about Layout, go back to select another state, or exit", "LayoutBird",
            JOptionPane.PLAIN_MESSAGE, layoutBirdImage, object, object[0]);
      layout.optionChooser(layout, layoutBirdOption, object);
   }
   
   public void layoutBirdSong(Layout layout, String option, String[] object){
      ImageIcon layoutBirdSongImage = new ImageIcon("./img/birds/LayoutBird.jpeg");      
     
      JFrame frame = new JFrame("LayoutBirdSong");
      JPanel canvas = new JPanel();
      JLabel text = new JLabel("<html>This is Layout state Bird Song! <br> It is the [name] Song <br> Click the play button to play the Layout state bird song <br> Select go back to go to the Layout state bird!<html>");
      JLabel picture = new JLabel(layoutBirdSongImage);
      JButton play = new JButton("Play Bird Song!");
      JButton back = new JButton("Go Back!");
      play.addActionListener(e-> layout.sound());
      back.addActionListener(e-> layout.backPrompt(layout, option, object, frame));
      
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
         AudioInputStream input = AudioSystem.getAudioInputStream(new File("./sound/LayoutSong.wav"));
         Clip clip = AudioSystem.getClip();
         Thread.sleep(10); 
         clip.open(input);
         clip.loop(0);
         Thread.sleep(1500);
      } catch (Exception sound){
         System.out.println("Error occured when playing sound!");
      }
   }
   
   public void backPrompt(Layout layout, String option, String[] object, JFrame frame){
      frame.dispose();
      layout.layoutBird(layout, option, object);
   }
      
      
}
   
