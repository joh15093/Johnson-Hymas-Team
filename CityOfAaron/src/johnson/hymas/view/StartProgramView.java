
package johnson.hymas.view;

import static java.lang.Thread.sleep;
import java.util.Scanner;

/**
 *
 * @author lando
 */
public class StartProgramView {
    
    
    /**
     * The message that will be displayed by this view.
     */
    protected String message;
    
    /**
     * Constructor
     */
    public StartProgramView(){
        
        message = "Welcome to the City of Aaron\n"
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
     * Get the user's input. Keep prompting them until they enter a value.
     * @param prompt
     * @param allowEmpty - determine whether the user can enter no value (just a return key)
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
        
    // The purpose of this class is to display the description
    // This class does not get input
        return null;
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
    
    
    // Define your action handlers here. These are the methods that your doAction()
    // method will call based on the user's input. We don't want to do a lot of 
    // complex game stuff in our doAction() method. It will get messy very quickly.
    
    
    public boolean doAction(String[] inputs){
         
        // Generally, though, this is where you will call into your Control
        // classes to do the work of the application.
        startMainMenuView();
        
        // This will stop this method from being called again
        return false;
    }
    
    private void startMainMenuView(){
        // Pause for a couple seconds
        try {
            Thread.sleep(2000);
        } catch(InterruptedException exception){
        //ignoring for now
        }
        
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.displayView();
        
        
    }
}

