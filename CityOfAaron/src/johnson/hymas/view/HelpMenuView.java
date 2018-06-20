package johnson.hymas.view;

/**
 *
 * @author joseph
 */
public class HelpMenuView extends ViewBase {

    @Override
    protected String getMessage() {
        return "Please select from the following options:\n"
                + "G - What are the Goals of the game?\n"
                + "W - Where is the city of Aaron?\n"
                + "V - How Do I view the map?\n"
                + "L - How do I move to another location?\n"
                + "D - How do I display a list of animals, provisions, and tools in the city storehouse?\n"
                + "M - Return back to the Main Menu\n";
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
            case "G":
                System.out.println("What are the Goals of the game?\n"
                        + "------------\n"
                        + "The Goals of the game are as follows:\n"
                        + "1 - Manage Crops in a way that your people are adequately fed.\n"
                        + "2 - Have more land at the end of the game than you began with.\n");
                pause(2000);
                break;
            case "W":
                System.out.println("Where is the city of Aaron?\n"
                        + "------------\n"
                        + "The City of Aaron is located in the vicinity of Ammonihah, near the cities of Moroni and Nephihah.\n");
                pause(2000);
                break;
            case "V":
                System.out.println("How do I view the map?\n"
                        + "------------\n"
                        + "The map can be viewed inside the Game Menu.\n");
                pause(2000);
                break;
            case "L":
                System.out.println("How do I move to another location?\n"
                        + "------------\n"
                        + "The option to move to a new location can be found inside the Game Menu.\n"
                        + "You will be prompted for coordinates to where you would like to move.\n");
                pause(2000);
                break;
            case "D":
                System.out.println("How do I display a list of animals, provisions, and tools in the city storehouse?\n"
                        + "------------\n"
                        + "The option to display list of animals, provisions, and tools in the City Storehouse are found in the Game Menu.\n"
                        + "This option will give you the report for the current year.\n");
                pause(2000);
                break;
            case "M":
                System.out.println("Please wait, returning back to Main Menu...\n");
                pause(2000);
                return false;
        }

        return true;
    }

}
