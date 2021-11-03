//FiftyStates
//James Nelson
//Computer Programming I
//October 19, 2021
//Fifty States Project Maine

import javax.swing.*;
import javax.sound.sampled.*;
import java.io.File;

public class Maine{
   Maine(){

   }
   
   
   public void mainePrompt(){
      Maine maine = new Maine();
   
      String maineObject[] = { "flag", "flower", "bird", "bird song", "go back", "exit" };
      
      ImageIcon mainePromptImage = new ImageIcon("./img/flags/MaineFlag.png");

      String maineOption = (String) JOptionPane.showInputDialog(null, "Welcome to Maine \nThis is the Maine state flag \n \n Select an option for more information about Maine, go back to select another state, or exit", "MainePrompt",
            JOptionPane.PLAIN_MESSAGE, mainePromptImage, maineObject, maineObject[0]);
      maine.optionChooser(maine, maineOption, maineObject);      
      
   }
   
   public void optionChooser(Maine maine, String option, String[] object){
      FiftyStates fifty = new FiftyStates();
   
      switch(option){
         case "flag":
            maine.maineFlag(maine, option, object);
            break;
         case "flower":
            maine.maineFlower(maine, option, object);
            break;
         case "bird":
            maine.maineBird(maine, option, object);
            break;
         case "bird song":
            maine.maineBirdSong(maine, option, object);
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
   
   public void maineFlag(Maine maine, String option, String[] object){
      ImageIcon maineFlagImage = new ImageIcon("./img/flags/MaineFlag.png");

      String maineFlagOption = (String) JOptionPane.showInputDialog(null, "This is the Maine state flag \n \n Select an option for more information about Maine, go back to select another state, or exit", "MaineFlag",
            JOptionPane.PLAIN_MESSAGE, maineFlagImage, object, object[0]);
      maine.optionChooser(maine, maineFlagOption, object);
   }
   
   public void maineFlower(Maine maine, String option, String[] object){
      ImageIcon maineFlowerImage = new ImageIcon("./img/flowers/MaineFlower.jpeg");

      String maineFlowerOption = (String) JOptionPane.showInputDialog(null, "This is the Maine state flower \n It is the White Pine Cone and Tassel\n \n Select an option for more information about Maine, go back to select another state, or exit", "MaineFlower",
            JOptionPane.PLAIN_MESSAGE, maineFlowerImage, object, object[0]);
      maine.optionChooser(maine, maineFlowerOption, object);
   }
   
   public void maineBird(Maine maine, String option, String[] object){
      ImageIcon maineBirdImage = new ImageIcon("./img/birds/MaineBird.jpeg");

      String maineBirdOption = (String) JOptionPane.showInputDialog(null, "This is the Maine state bird \n It is the Chickadee \n \n Select an option for more information about Maine, go back to select another state, or exit", "MaineBird",
            JOptionPane.PLAIN_MESSAGE, maineBirdImage, object, object[0]);
      maine.optionChooser(maine, maineBirdOption, object);
   }
   
   public void maineBirdSong(Maine maine, String option, String[] object){
      ImageIcon maineBirdSongImage = new ImageIcon("./img/birds/MaineBird.jpeg");      
     
      JFrame frame = new JFrame("MaineBirdSong");
      JPanel canvas = new JPanel();
      JLabel text = new JLabel("<html>This is Maine state Bird Song! <br> It is the Chickadee Song <br> Click the play button to play the Maine state bird song <br> Select go back to go to the Maine state bird!<html>");
      JLabel picture = new JLabel(maineBirdSongImage);
      JButton play = new JButton("Play Bird Song!");
      JButton back = new JButton("Go Back!");
      play.addActionListener(e-> maine.sound());
      back.addActionListener(e-> maine.backPrompt(maine, option, object, frame));
      
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
         AudioInputStream input = AudioSystem.getAudioInputStream(new File("./sound/MaineSong.wav"));
         Clip clip = AudioSystem.getClip();
         Thread.sleep(10); 
         clip.open(input);
         clip.loop(0);
         Thread.sleep(1500);
      } catch (Exception sound){
         System.out.println("Error occured when playing sound!");
      }
   }
   
   public void backPrompt(Maine maine, String option, String[] object, JFrame frame){
      frame.dispose();
      maine.maineBird(maine, option, object);
   }
      
      
}
   
