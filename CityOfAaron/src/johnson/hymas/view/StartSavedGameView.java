/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnson.hymas.view;

/**
 *
 * @author joh15
 */
public class StartSavedGameView extends ViewBase {

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

        inputs[0] = getUserInput("Please, enter the name under which"
                + "you would like to save your game: ", true);

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

        if (inputs[0] == null || inputs[0].equals("")) {
            this.console.println("E");
            pause(2000);
            return false;
        }

        String playerName = inputs[0];

        // False will stop us from looping
        return false;
    }

    @Override
    protected String getMessage() {
        return "ohBoy!";
                
    }

}
