/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnson.hymas.view;

import cityofaaron.CityOfAaron;
import johnson.hymas.model.Game;
import johnson.hymas.control.GameControl;

/**
 *
 * @author joh15
 */
public class SaveGameView extends ViewBase {

    /**
     * Get the set of inputs from the user.
     *
     * @return
     */
    @Override
    public String[] getInputs() {

        // Declare the array to have the number of elements you intend to get 
        // from the user.
        String[] inputs = new String[1];

        inputs[0] = getUserInput("Where would you like to save"
                + " your game? ");

        return inputs;
    }

    /**
     * Perform the action indicated by the user's input.
     *
     * @param inputs
     * @return true if the view should repeat itself, and false if the view
     * should exit and return to the previous view.
     */
    @Override
    public boolean doAction(String[] inputs) {

        String filePath = inputs[0];
        Game game = CityOfAaron.getCurrentGame();

        try {
            GameControl.saveGame(game, filePath);
        } catch (Exception e) {
            ErrorView.display("Error in SaveGame: ", filePath);
            return true;
        }
        this.console.println("Save Successful! File saved to " + filePath);
        return false;
    }

    @Override
    protected String getMessage() {
        return null;
    }
}
