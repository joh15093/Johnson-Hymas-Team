package johnson.hymas.view;

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
        return "Main Menu\n"
                + "---------\n"
                + "N - Start a New Game\n"
                + "L - Load a Saved Game\n"
                + "H - Help Menu\n"
                + "Q - Quit\n";
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
                System.out.println("Thank you for playing. Good-bye");
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
        System.out.println("*** loadSavedGame() called. Implementation coming soon.");
    }
}
