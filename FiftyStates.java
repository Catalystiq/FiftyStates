//FiftyStates
//James, Josh, Hiba
//Computer Programming I
//October 19, 2021
//Fifty States Project

import javax.swing.*;

public class FiftyStates{
   public static void main(String args[]){
      FiftyStates states = new FiftyStates();
      State layout = new State();
      states.prompt(layout);
   }
   
   public void prompt(State test){
      ImageIcon map = new ImageIcon("./img/other/map.jpg");
      
      String promptOption = (String) JOptionPane.showInputDialog(null, "Enter a State: ", "FiftyStates", JOptionPane.PLAIN_MESSAGE,
            map, null, null);
            
      switch(promptOption.toLowerCase()){
         case "state":
            test.statePrompt();
            break;
      }
   }
}