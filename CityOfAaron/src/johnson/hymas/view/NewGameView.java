package johnson.hymas.view;

import cityofaaron.CityOfAaron;
import johnson.hymas.control.GameControl;
import johnson.hymas.model.Game;
import johnson.hymas.model.Player;

/**
 *
 * @author lando
 */
public class NewGameView extends ViewBase {

    @Override
    protected String getMessage() {
        return "Starting new game...";
    }

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

        inputs[0] = getUserInput("Please enter your name or press 'Enter' to return to the Main Menu:", true);

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
            this.console.println("No player name entered, Returning to the Main Menu...");
            pause(2000);
            return false;
        }

        String playerName = inputs[0];
        createAndStartGame(playerName);

        // False will stop us from looping
        return false;
    }

    private void createAndStartGame(String playerName) {
        // This will all be worked on later

        Player player = new Player();
        player.setName(playerName);
        GameControl.createNewGame(player);

        this.console.println("Welcome to the game, " + CityOfAaron.getCurrentGame().getThePlayer().getName() + "!\n");
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayView();
    }

}
