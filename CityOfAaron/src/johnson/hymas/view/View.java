/**
 * This Class defines the interface that is common to all views
 */
package johnson.hymas.view;

/**
 *
 * @author lando
 */
public interface View {

    /**
     * Display the view. When this function returns the view has exited
     */
    public void displayView();
    
public abstract class View implements ViewInterface {
    
    private String message;
    
    protected final BufferedReader keyboard = CityOfAaron.getInFile();
    protected final PrintWriter console = CityOfAaron.getOutFile();
    
    public View(){
}    
}
