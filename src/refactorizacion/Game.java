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
public class Game {

    Player p;

    public void movement(String m) {
        m = m.toLowerCase();
        switch (m) {
            case "derecha":
                p.setX(p.getX() + 1);
                break;
            case "izquierda":
                p.setX(p.getX() - 1);
                break;
            case "arriba":
                p.setY(p.getY() + 1);
                break;
            case "abajo":
                p.setY(p.getY() - 1);
                break;
        }
    }
}
