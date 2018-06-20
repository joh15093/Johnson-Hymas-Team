package johnson.hymas.view;

import java.util.Scanner;

/**
 *
 * @author lando
 */
public class LoadGameView extends ViewBase{

 @Override
 protected String getMessage(){
     return "Loading Game...";
 }
    /**
     * Get the set of inputs from the user.
     *
     * @return
     */
    public String[] getInputs() {

        // The purpose of this class is to display the description
        // This class does not get input
        return null;
    }

    // complex game stuff in our doAction() method. It will get messy very quickly.
    public boolean doAction(String[] inputs) {

        // Generally, though, this is where you will call into your Control
        // classes to do the work of the application.
        // startMainMenuView();
        // This will stop this method from being called again
        return false;
    }

}
