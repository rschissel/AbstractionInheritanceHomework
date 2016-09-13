/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractioninheritancehomework;

/**
 *
 * @author Ryan Schissel
 */
public abstract class Fighter {

    private int health;

    public final int getHealth() {
        return health;
    }

    public final void revive(int health) {
        this.health += health;
    }

    public final void takeDamage(int health) {
        this.health -= health;
    }

    public abstract void Attack();

    public abstract void Defend();

}
