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
import johnson.hymas.model.Condition;
import johnson.hymas.model.ItemType;
import johnson.hymas.model.Location;
import cityofaaron.CityOfAaron;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import johnson.hymas.view.SaveGameView;

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
        CityOfAaron.setCurrentGame(game);

        InventoryItem[] items = createItems();
        game.setInventory(items);

        Map map = createMap();
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
        return null;
    }

    public static Map createMap() {

        Map map = new Map();

        Location[][] locations = createLocations();
        map.setLocations(locations);

        return map;
    }

    private static Location[][] createLocations() {
        String[] tips = {"Tip 1", "Tip 2", "Tip 3"};

        Location[][] locations = new Location[5][5];
        locations[0][0] = new Location("U", "Undeveloped Land", "Undeveloped Land", tips);
        locations[0][1] = new Location("U", "Undeveloped Land", "Undeveloped Land", tips);
        locations[0][2] = new Location("U", "Undeveloped Land", "Undeveloped Land", tips);
        locations[0][3] = new Location("U", "Undeveloped Land", "Undeveloped Land", tips);
        locations[0][4] = new Location("U", "Undeveloped Land", "Undeveloped Land", tips);

        locations[1][0] = new Location("U", "Undeveloped Land", "Undeveloped Land", tips);
        locations[1][1] = new Location("U", "Undeveloped Land", "Undeveloped Land", tips);
        locations[1][2] = new Location("U", "Undeveloped Land", "Undeveloped Land", tips);
        locations[1][3] = new Location("U", "Undeveloped Land", "Undeveloped Land", tips);
        locations[1][4] = new Location("U", "Undeveloped Land", "Undeveloped Land", tips);

        locations[2][0] = new Location("U", "Undeveloped Land", "Undeveloped Land", tips);
        locations[2][1] = new Location("U", "Undeveloped Land", "Undeveloped Land", tips);
        locations[2][2] = new Location("*", "Undeveloped Land", "Undeveloped Land", tips);
        locations[2][3] = new Location("U", "Undeveloped Land", "Undeveloped Land", tips);
        locations[2][4] = new Location("U", "Undeveloped Land", "Undeveloped Land", tips);

        locations[3][0] = new Location("U", "Undeveloped Land", "Undeveloped Land", tips);
        locations[3][1] = new Location("U", "Undeveloped Land", "Undeveloped Land", tips);
        locations[3][2] = new Location("U", "Undeveloped Land", "Undeveloped Land", tips);
        locations[3][3] = new Location("U", "Undeveloped Land", "Undeveloped Land", tips);
        locations[3][4] = new Location("U", "Undeveloped Land", "Undeveloped Land", tips);

        locations[4][0] = new Location("U", "Undeveloped Land", "Undeveloped Land", tips);
        locations[4][1] = new Location("U", "Undeveloped Land", "Undeveloped Land", tips);
        locations[4][2] = new Location("U", "Undeveloped Land", "Undeveloped Land", tips);
        locations[4][3] = new Location("U", "Undeveloped Land", "Undeveloped Land", tips);
        locations[4][4] = new Location("U", "Undeveloped Land", "Undeveloped Land", tips);

        return locations;
    }

    public static void saveGame(Game game, String filePath) {
        if (filePath == null || game == null) {
            System.out.println("Error Reading File or Game.");
        }

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(filePath))) {
            out.writeObject(game);
        } catch (IOException ex) {
            System.out.println("I/O Error: " + ex.getMessage());
        }
    }

    public static Game getGame(String filePath) {
        if (filePath == null || filePath.length() < 1) {
            System.out.println("Error reading file in getGame()");
        }
        Game game = null;
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(filePath))) {
            game = (Game) in.readObject();
            CityOfAaron.setCurrentGame(game);
            game.setThePlayer(game.getThePlayer());
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }

        return game;
    }

    private void saveGame() {
        SaveGameView saveView = new SaveGameView();
        saveView.displayView();
    }
}
