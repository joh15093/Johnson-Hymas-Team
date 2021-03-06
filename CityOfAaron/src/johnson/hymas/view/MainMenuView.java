package johnson.hymas.view;

import johnson.hymas.control.GameControl;

/**
 *
 * @author lando
 */
public class MainMenuView extends ViewBase {

    /**
     * Constructor
     */
    public MainMenuView() {

    }

    @Override
    protected String getMessage() {
        return "\n"
                + "\n----------------------------------------------------------"
                + "\n| Main Menu                                              |"
                + "\n----------------------------------------------------------"
                + "\nN - Start new game"
                + "\nL - Load saved game"
                + "\nH - Get help on how to play the game"
                + "\nQ - Quit"
                + "\n----------------------------------------------------------";
    }

    /**
     * Get the set of inputs from the user.
     *
     * @return
     */
    @Override
    public String[] getInputs() {
        String[] inputs = new String[1];

        inputs[0] = getUserInput("Your choice:");

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

        switch (inputs[0].trim().toUpperCase()) {
            case "N":
                startNewGame();
                break;
            case "L":
                loadSavedGame();
                break;
            case "H":
                helpMenu();
                break;
            case "Q":
                this.console.println("Thank you for playing. Good-bye");
                return false;
        }

        return true;
    }

    private void startNewGame() {
        View view = new NewGameView();
        view.displayView();
    }

    private void helpMenu() {
        HelpMenuView viewHelp = new HelpMenuView();
        viewHelp.displayView();
    }

    private void loadSavedGame() {
        LoadGameView viewLoad = new LoadGameView();
        viewLoad.displayView();
    }
}
