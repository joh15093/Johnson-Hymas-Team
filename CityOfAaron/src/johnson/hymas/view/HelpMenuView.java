
package johnson.hymas.view;

import java.util.Scanner;
import johnson.hymas.view.MainMenuView;


/**
 *
 * @author joseph
 */
public class  HelpMenuView{
    
    /**
     * The message that will be displayed by this view.
     */
    protected String message;
    
    /**
     * Constructor
     */
    public HelpMenuView(){
        
        message = "Please select from the following options:\n"
                + "G - What are the Goals of the game?\n"
                + "W - Where is the city of Aaron?\n"
                + "V - How Do I view the map?\n"
                + "L - How do I move to another location?\n"
                + "D - How do I display a list of animals, provisions, and tools in the city storehouse?\n"
                + "M - Return back to the Main Menu\n";
                
    }
    /**
     * Get the user's input. Keep prompting them until they enter a value.
     * 
     * @param prompt
     * @param allowEmpty - determine whether the user can enter no value (just a 
     *                   return key)
     * @return 
     */
    protected String getUserInput(String prompt, boolean allowEmpty){
        
        Scanner keyboard = new Scanner(System.in);
        String input = "";
        boolean inputReceived = false;
        
        while(inputReceived == false){
            
            System.out.println(prompt);
            input = keyboard.nextLine();
            
            // Make sure we avoid a null-pointer error.
            if (input == null){
                input = "";
            }
            
            // Trim any trailing whitespace, including the carriage return.
            input = input.trim();
            
            if (input.equals("") == false || allowEmpty == true){
                inputReceived = true;
            }
        }
        
        return input;
    }
    
    
    /**
     * An overloaded version of getUserInput that sets allowEmpty to false so we don't have 
     * to type it ourselves.
     * @param prompt
     * @return 
     */
    protected String getUserInput(String prompt){
        return getUserInput(prompt, false);
    }
    
    /**
     * Get the set of inputs from the user.
     * @return 
     */
    public String[] getInputs() {
        
        String[] inputs = new String[1];
        inputs[0] = getUserInput("Your choice:");
        
        return inputs;
    }
    
    
    /**
     * Perform the action indicated by the user's input.
     * @param inputs
     * @return true if the view should repeat itself, and false if the view
     * should exit and return to the previous view.
     */
    public boolean doAction(String[] inputs){
        
        switch (inputs[0].trim().toUpperCase()) {
            case "G":
                System.out.println("What are the Goals of the game?\n"
                        + "------------"
                        + "The Goals of the game are as follows:\n"
                        + "1 - Manage Crops in a way that your people are adequately fed.\n"
                        + "2 - Have more land at the end of the game than you began with.\n");
                break;
            case "W":
                System.out.println("Where is the city of Aaron?\n"
                        + "------------\n"
                        + "The City of Aaron is located in the vicinity of Ammonihah, near the cities of Moroni and Nephihah.\n");
                break;
            case "V":
                System.out.println("How do I view the map?\n"
                        + "------------\n"
                        + "The map can be viewed inside the Game Menu.\n");
                break;
            case "L":
                System.out.println("How do I move to another location?\n"
                        + "------------\n"
                        + "The option to move to a new location can be found inside the Game Menu.\n"
                        + "You will be prompted for coordinates to where you would like to move.\n");
                break;
            case "D":
                System.out.println("How do I display a list of animals, provisions, and tools in the city storehouse?\n"
                        + "------------\n"
                        + "The option to display list of animals, provisions, and tools in the City Storehouse are found in the Game Menu.\n"
                        + "This option will give you the report for the current year.\n");
                break;
            case "M":
                System.out.println("Please wait, returning back to Main Menu...\n");
                return false;
        }
        
        return true;
    }
    
    
    /**
     * Control this view's display/prompt/action loop until the user
     * chooses and action that causes this view to close.
     */
    public void displayView(){
        
        boolean keepGoing = true;
        
        while(keepGoing == true){
            
            System.out.println(message);
            String[] inputs = getInputs();
            keepGoing = doAction(inputs);
        }
    }
    
}