package johnson.hymas.view;

import java.util.Scanner;
import cityofaaron.CityOfAaron;
import java.io.BufferedReader;
import java.io.PrintWriter;

/**
 *
 * @author lando
 */
public abstract class ViewBase implements View {

    private String message;

    protected final BufferedReader keyboard = cityofaaron.CityOfAaron.getInFile();
    protected final PrintWriter console = CityOfAaron.getOutFile();

    /**
     * Constructor
     */
    public ViewBase() {
    }

    /**
     * Get the view's content.This will allow the view to have dynamic content
     *
     * @return
     */
    protected abstract String getMessage();

    /**
     * Get the set of inputs from the user
     *
     * @return
     */
    protected abstract String[] getInputs();

    /**
     * Perform the action indicated by the user's input.
     *
     * @param inputs
     * @return true if the view should repeat itself, and false if the view exit
     * and return to the previous view.
     */
    public abstract boolean doAction(String[] inputs);

    /**
     * Control this view's display/prompt/action loop until the user chooses and
     * action that causes this view to close
     */
    @Override
    public void displayView() {

        boolean keepGoing = true;

        while (keepGoing == true) {

            // get the message that should be displayed
            // Only print it if it is non-null
            String message = getMessage();
            if (message != null) {
                this.console.println(getMessage());
            }

            String[] inputs = getInputs();
            keepGoing = doAction(inputs);

        }
    }

    /**
     * Get the user's input. Keep prompting them until they enter a value.
     *
     * @param prompt
     * @param allowEmpty - determine whether the user can enter no value
     * @return
     */
    protected String getUserInput(String prompt, boolean allowEmpty) {

        String input = "";
        boolean inputReceived = false;
        try {

            while (inputReceived == false) {

                this.console.println(prompt);
                input = keyboard.readLine();

                // Make sure we aboide null pointer error.
                if (input == null) {
                    input = "";
                }

                //Trim any trailing whitespace, including carriage return
                input = input.trim();

                if (input.equals("") == false || allowEmpty == true) {
                    inputReceived = true;
                }
            }
        } catch (Exception e) {
            ErrorView.display("ViewBase", "Error reading file");

        }
        return input;
    }

    /**
     * An overloaded version of getUserInput that sets allowEmpty to false so we
     * don't have to type it out ourselves.
     *
     * @param prompt
     * @return
     */
    protected String getUserInput(String prompt) {
        return getUserInput(prompt, false);
    }

    /**
     * pause the program for the specified number of milliseconds
     *
     * @param milliseconds
     */
    protected static void pause(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException exception) {
            // do nothing
        }
    }
}
