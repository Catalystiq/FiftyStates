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
      Arizona arizona = new Arizona();
      Arkansas arkansas = new Arkansas();
      California california = new California();
      Colorado colorado = new Colorado();
      Connecticut connecticut = new Connecticut();
      Delaware delaware = new Delaware();
      Florida florida = new Florida();
      Georgia georgia = new Georgia();
      Hawaii hawaii = new Hawaii();
      Idaho idaho = new Idaho();
      Illinois illinois = new Illinois();
      Indiana indiana = new Indiana();
      Iowa iowa = new Iowa();
      NewMexico newMexico = new NewMexico();
      NewYork newYork = new NewYork();
      NorthCarolina northCarolina = new NorthCarolina();
      Ohio ohio = new Ohio();
      Oklahoma oklahoma = new Oklahoma();
      Oregon oregon = new Oregon();
      Pennsylvania pennsylvania = new Pennsylvania();
      RhodeIsland rhodeIsland = new RhodeIsland();
      SouthCarolina southCarolina = new SouthCarolina();
      SouthDakota southDakota = new SouthDakota();
      Tennessee tennessee = new Tennessee();
      Texas texas = new Texas();
      Utah utah = new Utah();
      Vermont vermont = new Vermont();
      Virginia virginia = new Virginia();
      
      String promptOption = (String) JOptionPane.showInputDialog(null, "Enter a State: ", "FiftyStates", JOptionPane.PLAIN_MESSAGE,
            map, null, null);
            
      switch(promptOption.toLowerCase()){
         case "alabama":
            alabama.alabamaPrompt();
            break;
         case "alaska":
            alaska.alaskaPrompt();
            break;
         case "arizona":
            arizona.arizonaPrompt();
            break;
         case "arkansas":
            arkansas.arkansasPrompt();
            break;
         case "california":
            california.californiaPrompt();
            break;
         case "colorado":
            colorado.coloradoPrompt();
            break;
         case "connecticut":
            connecticut.connecticutPrompt();
            break;
         case "delaware":
            delaware.delawarePrompt();
            break;
         case "florida":
            florida.floridaPrompt();
            break;
         case "georgia":
            georgia.georgiaPrompt();
            break;
         case "hawaii":
            hawaii.hawaiiPrompt();
            break;
         case "idaho":
            idaho.idahoPrompt();
            break;
         case "illinois":
            illinois.illinoisPrompt();
            break;
         case "indiana":
            indiana.indianaPrompt();
            break;
         case "iowa":
            iowa.iowaPrompt();
            break;
         case "new mexico":
            newMexico.newMexicoPrompt();
            break;
         case "new york":
            newYork.newYorkPrompt();
            break;
         case "north carolina":
            northCarolina.northCarolinaPrompt();
            break;
         case "ohio":
            ohio.ohioPrompt();
            break;
         case "oklahoma":
            oklahoma.oklahomaPrompt();
            break;
         case "oregon":
            oregon.oregonPrompt();
            break;
         case "pennsylvania":
            pennsylvania.pennsylvaniaPrompt();
            break;
         case "rhode island":
            rhodeIsland.rhodeIslandPrompt();
            break;
         case "south carolina":
            southCarolina.southCarolinaPrompt();
            break;
         case "south dakota":
            southDakota.southDakotaPrompt();
            break;
         case "tennessee":
            tennessee.tennesseePrompt();
            break;
         case "texas":
            texas.texasPrompt();
            break;
         case "utah":
            utah.utahPrompt();
            break;
         case "vermont":
            vermont.vermontPrompt();
            break;
         case "virginia":
            virginia.virginiaPrompt();
            break;
         case "exit":
            System.exit(0);
            break;
            
      }
   }
}
