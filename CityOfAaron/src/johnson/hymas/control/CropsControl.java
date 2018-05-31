/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnson.hymas.control;

/**
 *
 * @author lando
 */
import java.util.Random;
public class CropsControl {
    /**
     * Calculate the amount of bushels harvested in the given year
     *      - Must know the amount of acres owned
     *      - Must know the percentage of tithing given
     * 
     * Calculate the amount of bushels given to tithing
     *      - Must know the amount of bushels given to tithing
     * 
     * Calculate the total amount of bushels in storehouse
     *      - Add bushels harvested that year
     *      - Subtract bushels given to population
     *      - Subtract bushels given to tithes
     *      - Subtract bushels eaten by rats 
     *
     * 
     * Calculate the amount of bushels eaten by rats
     * @param tithes
     * @param acresOwned
     * @return 
     */
    public static double calcBushelsHarvested(double tithes, double acresOwned){
        //tithes = 10;
        //acresOwned = 100;
        Random bushels = new Random();
        double bushelsHarvested = 0;
        double bushelsPerAcre = 0;
        if (tithes < 0)
            bushelsHarvested = -1;
        else if (tithes > 100)
            bushelsHarvested = -1;
        else if (tithes >= 8 && tithes <= 12)
            bushelsPerAcre = 2 + bushels.nextInt(5);
        else if (tithes < 8 && tithes > 0)
            bushelsPerAcre = 1 + bushels.nextInt(4);
        else if (tithes > 12) 
            bushelsPerAcre = 2 + bushels.nextInt(6);
        
        bushelsHarvested = bushelsPerAcre * acresOwned;
    return bushelsHarvested;
    }
    
}




