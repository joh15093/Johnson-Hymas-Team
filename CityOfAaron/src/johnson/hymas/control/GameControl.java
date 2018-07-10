/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnson.hymas.control;

import johnson.hymas.model.Game;
import johnson.hymas.model.Player;
import johnson.hymas.model.InventoryItem;
import johnson.hymas.model.Map;
import static cityofaaron.CityOfAaron.setCurrentGame;
import johnson.hymas.model.Condition;
import johnson.hymas.model.ItemType;
import johnson.hymas.model.Location;

/**
 *
 * @author lando
 */
public class GameControl {

    public static int createNewGame(Player player) {
        if (player == null) {
            return -1;
        }
        Game game = new Game();
        game.setThePlayer(player);
        setCurrentGame(game);

        InventoryItem[] items = createItems();
        game.setInventory(items);

        Map map = createMap(5, 5);
        if (map == null) {
            return -1;
        }

        game.setTheMap(map);
        return 1;

    }

    public static InventoryItem[] createItems() {
        InventoryItem[] items = new InventoryItem[3];
        items[0] = new InventoryItem(ItemType.animal, 1, Condition.Good);
        items[1] = new InventoryItem(ItemType.provisions, 1, Condition.Poor);
        items[2] = new InventoryItem(ItemType.tool, 1, Condition.Fair);

        System.out.println("Create Items Called..");
        return null;
    }

    public static Map createMap(int numRows, int numCol, InventoryItem[] items) {
        if (numRows < 0 || numCol < 0) {
            return null;
        }
        if (items == null || items.length < 1) {
            return null;
        }

        Map map[][] = new Map[numRows][numCol];
        // How do I save the numer of rows and columns inside the map object?

        Location[][] = createLocations(numRows, numCol);
        // How do I assign this?
        
        
        System.out.println("Create Map Called..");
        return null;
    }
}
