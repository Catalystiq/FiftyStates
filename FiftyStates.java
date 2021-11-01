//FiftyStates
//James, Josh, Hiba
//Computer Programming I
//October 19, 2021
//Fifty States Project

import javax.swing.*;

public class FiftyStates{
   public static void main(String args[]){
      FiftyStates states = new FiftyStates();
      states.prompt();
   }
   
   public void prompt(){
      ImageIcon map = new ImageIcon("./img/other/map.jpg");
      Alabama alabama = new Alabama();
      Alaska alaska = new Alaska();
      NewMexico newMexico = new NewMexico();
      
      String promptOption = (String) JOptionPane.showInputDialog(null, "Enter a State: ", "FiftyStates", JOptionPane.PLAIN_MESSAGE,
            map, null, null);
            
      switch(promptOption.toLowerCase()){
         case "alabama":
            alabama.alabamaPrompt();
            break;
         case "alaska":
            alaska.alaskaPrompt();
            break;
         case "new mexico":
            newMexico.newMexicoPrompt();
            break;
         case "new york":
            alabama.alabamaPrompt();
            break;
         case "north carolina":
            alabama.alabamaPrompt();
            break;
         case "ohio":
            alabama.alabamaPrompt();
            break;
         case "oklahoma":
            alabama.alabamaPrompt();
            break;
         case "oregon":
            alabama.alabamaPrompt();
            break;
         case "pennsylvania":
            alabama.alabamaPrompt();
            break;
         case "rhode island":
            alabama.alabamaPrompt();
            break;
         case "south carolina":
            alabama.alabamaPrompt();
            break;
         case "south dakota":
            alabama.alabamaPrompt();
            break;
         case "exit":
            System.exit(0);
            break;
            
      }
   }
}