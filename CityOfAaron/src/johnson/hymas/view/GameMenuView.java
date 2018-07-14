package johnson.hymas.view;

/**
 *
 * @author lando
 */
public class GameMenuView extends ViewBase {

    @Override
    protected String getMessage() {
        return "Game Menu\n"
                + "---------\n"
                + "V - View the Map\n"
                + "L - Move to a new location\n"
                + "C - Manage Crops\n"
                + "S - Save Game\n"
                + "Y - Live the year\n"
                + "R - Reports Menu\n"
                + "M - Return Main Menu";
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
                this.console.println("Loading Map...");
                pause(2000);
                viewMap();
                pause(2000);
                break;
            case "L":
                this.console.println("Packing items for journey...");
                pause(2000);
                moveLocation();
                break;
            case "C":
                manageCrops();
                break;
            case "S":
                saveGame();
                break;
            case "Y":
                this.console.println("Living the year...");
                pause(3000);
                liveYear();
                pause(2000);
                break;
            case "R":
                showReports();
                pause(2000);
                break;
            case "M":
                this.console.println("Returning to Main Menu. Please wait...");
                return false;
            default:
                this.console.println("Invalid Option: Please select a valid option");
        }

        return true;
    }

    private void liveYear() {
        this.console.println("liveYear Function Called and coming soon, returning to Game Menu");
    }

    private void viewMap() {
        ShowMapView viewMap = new ShowMapView();
        viewMap.displayView();
    }

    private void moveLocation() {
        this.console.println("MoveLocation Function Called and coming soon, returning to Game Menu");
    }

    private void manageCrops() {
        this.console.println("manageCrops Function Called and coming soon, returning to Game Menu");
    }

    private void showReports() {
        this.console.println("showReports Function Called and coming soon, returning to Game Menu");
    }

    private void saveGame() {
        StartSavedGameView viewSave = new StartSavedGameView();
        viewSave.displayView();
    }
}
