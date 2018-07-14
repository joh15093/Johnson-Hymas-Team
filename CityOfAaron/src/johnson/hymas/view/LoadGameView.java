package johnson.hymas.view;

import cityofaaron.CityOfAaron;
import java.util.Scanner;
import johnson.hymas.control.GameControl;
import johnson.hymas.model.Game;

/**
 *
 * @author lando
 */
public class LoadGameView extends ViewBase {

    @Override
    protected String getMessage() {
        return "Loading Game...";
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

        inputs[0] = getUserInput("What is the name of your saved game?");

        return inputs;
    }

    @Override
    public boolean doAction(String[] inputs) {

        String filePath = inputs[0];

        try {
            GameControl.getGame(filePath);
        } catch (Exception e) {
            ErrorView.display("Unable to find file: ", filePath);
            return true;
        }
        this.console.println("Load successfull for " + filePath);
        GameMenuView view = new GameMenuView();
        view.displayView();
        return false;
    }

}
