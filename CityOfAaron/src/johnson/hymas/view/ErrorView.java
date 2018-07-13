/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package johnson.hymas.view;

/**
 *
 * @author joh15
 */
public class ErrorView {
    private static PrintWriter console = CityOfAaron.getOutput();
    private static PrintWriter log = CityOfAaron.getlogFile();
    
    public static void display(String className, String errorMessage) {
        
        console.println(
            "\n---ERROR -------------------------------------------------------"
           +"\n" + errorMessage
           +"\n---------------------------------------------------------------");
        
        log.printf("%n%n%s", className + " - " + errorMessage);
    }
    
}
