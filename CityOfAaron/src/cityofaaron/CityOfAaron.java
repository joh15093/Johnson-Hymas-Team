/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cityofaaron;

import johnson.hymas.model.Condition;
import johnson.hymas.model.Location;
import johnson.hymas.model.Player;
import johnson.hymas.model.Author;
import johnson.hymas.model.Game;
import johnson.hymas.model.InventoryItem;
import johnson.hymas.model.Provision;
import johnson.hymas.model.Map;



/**
 *
 * @author lando
 */
public class CityOfAaron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Joseph Johnson");
        
        String playerOneName = playerOne.getName();
        
        System.out.println(playerOne.toString());
        System.out.println(Condition.Fair);
//        System.out.println(Location.toString());
                
        
    }

}
