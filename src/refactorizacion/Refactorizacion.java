/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactorizacion;

/**
 *
 * @author DAW
 */
public class Refactorizacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String hyphen="";
        for (int i = 0; i < 70; i++) {
            hyphen+="-";
        }
        
        String leftAlignFormat = "| %-68s | %-4d |%n";

        
System.out.printf("+"+hyphen+"+------+%n");
System.out.format("| Column name                                      | ID   |%n");
System.out.format("+"+hyphen+"+------+%n");
for (int i = 0; i < 5; i++) {
    System.out.format(leftAlignFormat, "some data" + i, i * i);
}
System.out.format("+"+hyphen+"+------+%n");
    }
    
}
