/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cityofaaron;

import johnson.hymas.model.Game;
import johnson.hymas.model.Player;
import johnson.hymas.view.StartProgramView;
import johnson.hymas.view.View;

/**
 *
 * @author lando
 */
public class CityOfAaron {

    private static Game currentGame = null;
    private static Player player = null;
    
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;
    
    public static PrintWriter getOutFile() {
        return outFile;
        
    }

    public static Player getPlayer() {
        return player;
    }

    public static void setPlayer(Player player) {
        CityOfAaron.player = player;
    }
    
    public static void setOutFile(PrintWriter outFile) {
        CityOfAaron.outFile = outFile;
    }
    
    public static BufferedReader getInFile() {
        return inFile;
        
    }

    public CityOfAaron() {
    }
    
    public static void setInFile(BufferedReader inFile) {
        CityOfAaron.inFile = inFile;
    }
    
    // Copy in main Class
    public static Game getCurrentGame = null;
    
    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game game) {
        currentGame = game;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
           
            // open charcter steam files for end user and output
            CityOfAaron.inFile =
                    new BufferedReader(new InputStreamReader(System.in));
            CityOfAaron.outFile = new PrintWriter(System.out, true);
            
            // create StartProgramView and start the program
            StartProgramView StartProgramView = new StartProgramView();
            StartProgramView.displayView();
            return;
            
        } catch (Throwable e) {
            
                System.out.println("Exception: " + e.toString() +
                                   "\nCause: " + e.getCause () +
                                   "\nMessage: " + e.getMessage());
                e.printStackTrace();;
        }
        finally {
            try {
                if (CityOfAaron.inFile != null)
                    CityOfAaron.inFile.close();
                
                if (CityOfAaron.outFile != null)
                    CityOfAaron.outFile.close();
        } catch (IOException ex) {
            System.out.println("Error closing files");
            return;
        }

    }

}
