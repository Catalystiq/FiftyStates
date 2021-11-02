//test rhodeIsland class

import javax.swing.*;
import javax.sound.sampled.*;
import java.io.File;

public class RhodeIsland{
   RhodeIsland(){

   }
   
   
   public void rhodeIslandPrompt(){
      RhodeIsland rhodeIsland = new RhodeIsland();
   
      String rhodeIslandObject[] = { "flag", "flower", "bird", "bird song", "go back", "exit" };
      
      ImageIcon rhodeIslandPromptImage = new ImageIcon("./img/flags/RhodeIslandFlag.png");

      String rhodeIslandOption = (String) JOptionPane.showInputDialog(null, "Welcome to Rhode Island \nThis is the Rhode Island state flag \n \n Select an option for more information about Rhode Island, go back to select another state, or exit", "RhodeIslandPrompt",
            JOptionPane.PLAIN_MESSAGE, rhodeIslandPromptImage, rhodeIslandObject, rhodeIslandObject[0]);
      rhodeIsland.optionChooser(rhodeIsland, rhodeIslandOption, rhodeIslandObject);      
      
   }
   
   public void optionChooser(RhodeIsland rhodeIsland, String option, String[] object){
      FiftyStates fifty = new FiftyStates();
   
      switch(option){
         case "flag":
            rhodeIsland.rhodeIslandFlag(rhodeIsland, option, object);
            break;
         case "flower":
            rhodeIsland.rhodeIslandFlower(rhodeIsland, option, object);
            break;
         case "bird":
            rhodeIsland.rhodeIslandBird(rhodeIsland, option, object);
            break;
         case "bird song":
            rhodeIsland.rhodeIslandBirdSong(rhodeIsland, option, object);
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
   
   public void rhodeIslandFlag(RhodeIsland rhodeIsland, String option, String[] object){
      ImageIcon rhodeIslandFlagImage = new ImageIcon("./img/flags/RhodeIslandFlag.png");

      String rhodeIslandFlagOption = (String) JOptionPane.showInputDialog(null, "This is the Rhode Island state flag \n \n Select an option for more information about Rhode Island, go back to select another state, or exit", "RhodeIslandFlag",
            JOptionPane.PLAIN_MESSAGE, rhodeIslandFlagImage, object, object[0]);
      rhodeIsland.optionChooser(rhodeIsland, rhodeIslandFlagOption, object);
   }
   
   public void rhodeIslandFlower(RhodeIsland rhodeIsland, String option, String[] object){
      ImageIcon rhodeIslandFlowerImage = new ImageIcon("./img/flowers/RhodeIslandFlower.jpeg");

      String rhodeIslandFlowerOption = (String) JOptionPane.showInputDialog(null, "This is the Rhode Island state flower \n It is the Violet\n \n Select an option for more information about Rhode Island, go back to select another state, or exit", "RhodeIslandFlower",
            JOptionPane.PLAIN_MESSAGE, rhodeIslandFlowerImage, object, object[0]);
      rhodeIsland.optionChooser(rhodeIsland, rhodeIslandFlowerOption, object);
   }
   
   public void rhodeIslandBird(RhodeIsland rhodeIsland, String option, String[] object){
      ImageIcon rhodeIslandBirdImage = new ImageIcon("./img/birds/RhodeIslandBird.jpeg");

      String rhodeIslandBirdOption = (String) JOptionPane.showInputDialog(null, "This is the Rhode Island state bird \n It is the Rhode Island Red \n \n Select an option for more information about Rhode Island, go back to select another state, or exit", "RhodeIslandBird",
            JOptionPane.PLAIN_MESSAGE, rhodeIslandBirdImage, object, object[0]);
      rhodeIsland.optionChooser(rhodeIsland, rhodeIslandBirdOption, object);
   }
   
   public void rhodeIslandBirdSong(RhodeIsland rhodeIsland, String option, String[] object){
      ImageIcon rhodeIslandBirdSongImage = new ImageIcon("./img/birds/RhodeIslandBird.jpeg");      
     
      JFrame frame = new JFrame("RhodeIslandBirdSong");
      JPanel canvas = new JPanel();
      JLabel text = new JLabel("<html>This is Rhode Island state Bird Song! <br> It is the Rhode Island Red Song <br> Click the play button to play the Rhode Island state bird song <br> Select go back to go to the Rhode Island state bird!<html>");
      JLabel picture = new JLabel(rhodeIslandBirdSongImage);
      JButton play = new JButton("Play Bird Song!");
      JButton back = new JButton("Go Back!");
      play.addActionListener(e-> rhodeIsland.sound());
      back.addActionListener(e-> rhodeIsland.backPrompt(rhodeIsland, option, object, frame));
      
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
         AudioInputStream input = AudioSystem.getAudioInputStream(new File("./sound/RhodeIslandSong.wav"));
         Clip clip = AudioSystem.getClip();
         Thread.sleep(10); 
         clip.open(input);
         clip.loop(0);
         Thread.sleep(1500);
      } catch (Exception sound){
         System.out.println("Error occured when playing sound!");
      }
   }
   
   public void backPrompt(RhodeIsland rhodeIsland, String option, String[] object, JFrame frame){
      frame.dispose();
      rhodeIsland.rhodeIslandBird(rhodeIsland, option, object);
   }
      
      
}
   