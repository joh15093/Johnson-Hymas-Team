/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cityofaaron;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import johnson.hymas.model.Game;
import johnson.hymas.model.Player;
import johnson.hymas.view.ErrorView;
import johnson.hymas.view.StartProgramView;
import johnson.hymas.view.View;

/**
 *
 * @author lando
 */
public class CityOfAaron {

    private static Game currentGame = null;
    private static PrintWriter logFile = null;
    private static PrintWriter outFile = null;
    private static BufferedReader inFile = null;

    // Copy in main Class
    public static Game getCurrentGame = null;

    public static Game getCurrentGame() {
        return currentGame;
    }

    public static void setCurrentGame(Game game) {
        currentGame = game;
    }

    public static PrintWriter getOutFile() {
        return outFile;
    }

    public static void setOutFile(PrintWriter outFile) {
        CityOfAaron.outFile = outFile;
    }

    public static BufferedReader getInFile() {
        return inFile;
    }

    public static void setInFile(BufferedReader inFile) {
        CityOfAaron.inFile = inFile;
    }

    public static PrintWriter getLogFile() {
        return logFile;
    }

    public static void setLogFile(PrintWriter logFile) {
        CityOfAaron.logFile = logFile;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            // open charcter steam files for end user and output
            inFile = new BufferedReader(new InputStreamReader(System.in));
            outFile = new PrintWriter(System.out, true);
            logFile = new PrintWriter("C:logFile.txt");

            // create StartProgramView and start the program
            StartProgramView StartProgramView = new StartProgramView();
            StartProgramView.displayView();
            return;

        } catch (Throwable e) {

            System.out.println("Exception: " + e.toString()
                    + "\nCause: " + e.getCause()
                    + "\nMessage: " + e.getMessage());
            e.printStackTrace();;
        } finally {
            try {
                if (inFile != null) {
                    inFile.close();
                }

                if (outFile != null) {
                    outFile.close();
                }

                if (logFile != null) {
                    logFile.close();
                }

            } catch (IOException ex) {
                ErrorView.display("CityOfAaron", "Error closing file");
                return;
            }

        }

    }

    public static PrintWriter getlogFile() {
        ErrorView.display("CityOfAaron", "Error with Log");
        return null;

    }
}
