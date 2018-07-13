package johnson.hymas.view;

import static johnson.hymas.view.ViewBase.pause;

/**
 *
 * @author lando
 */
public class StartProgramView extends ViewBase {

    /**
     * Constructor
     *
     * @return
     */
    @Override
    protected String getMessage() {
        return "Welcome to the City of Aaron.\n"
                + "\n"
                + "You have been chosen to lead the people of Aaron through \n"
                + "managing their resources. You will need to feed your people,\n"
                + "pay tithes to the Lord, and buy and sell land to build \n"
                + "prosperity among your people. If you fail to manage your wheat \n"
                + "correctly your people will starve, your wheat will diminish\n"
                + "and you will be removed from office. Manage your resources \n"
                + "correctly and you will prosper, and will be known as King \n"
                + "Benjamin is known, a holy man who did reign over his people \n"
                + "in righteousness.\n";
    }

    /**
     * Get the set of inputs from the user.
     *
     * @return
     */
    @Override
    public String[] getInputs() {

        // The purpose of this class is to display the description
        // This class does not get input
        return null;
    }

    // Define your action handlers here. These are the methods that your doAction()
    // method will call based on the user's input. We don't want to do a lot of 
    // complex game stuff in our doAction() method. It will get messy very quickly.
    @Override
    public boolean doAction(String[] inputs) {

        // Generally, though, this is where you will call into your Control
        // classes to do the work of the application.
        startMainMenuView();

        // This will stop this method from being called again
        return false;
    }

    private void startMainMenuView() {
        // Pause for a couple seconds
        pause(2000);
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.displayView();
    }
}
