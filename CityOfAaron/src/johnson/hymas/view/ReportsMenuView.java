package johnson.hymas.view;

import java.util.Scanner;

/**
 *
 * @author lando
 */
public class ReportsMenuView extends ViewBase {

    /**
     * Constructor
     */
    public ReportsMenuView() {

    }

    @Override
    protected String getMessage() {
        return null;

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
            case "V":
                viewAuthors();
                break;
            case "A":
                viewAnimals();
                break;
            case "T":
                viewTools();
                break;
            case "P":
                viewProvisions();
                break;
            case "M":
                return false;
            default:
                System.out.println("Invalid Option: Please select a valid option");
        }

        return true;
    }

    private void showReports() {
        System.out.println("showReports Function Called and coming soon, returning to Game Menu");
    }

    private void viewAuthors() {
        LoadGameView viewAuthors = new LoadGameView();
        viewAuthors.displayView();
    }

    private void viewAnimals() {
        LoadGameView viewAnimals = new LoadGameView();
        viewAnimals.displayView();
    }

    private void viewTools() {
        LoadGameView viewTools = new LoadGameView();
        viewTools.displayView();
    }

    private void viewProvisions() {
        LoadGameView viewProvisions = new LoadGameView();
        viewProvisions.displayView();
    }
}
