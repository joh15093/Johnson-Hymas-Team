package johnson.hymas.view;

import java.util.Scanner;
import cityofaaron.CityOfAaron;
import johnson.hymas.model.Location;

/**
 *
 * @author lando
 */
public class ShowMapView extends ViewBase {

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

        // The purpose of this class is to display the description
        // This class does not get input
        return null;
    }

    // complex game stuff in our doAction() method. It will get messy very quickly.
    @Override
    public boolean doAction(String[] inputs) {

        Location[][] locations = CityOfAaron.getCurrentGame().getTheMap().getLocations();
        for (int row = 0; row < locations.length; row++) {
            for (int col = 0; col < locations[row].length; col++) {
                System.out.print(locations[row][col].getMapSymbol());
                System.out.print(" ");
            }
            this.console.println();
        }

        return false;
    }

}
