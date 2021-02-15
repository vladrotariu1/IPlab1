package com.lab1;

public abstract class Enemy {

    protected int health;
    protected int stamina;
    protected int base_damage;

    abstract void attack (Enemy E);

    public Enemy (int health, int stamina) {
        this.health = health;
        this.stamina = stamina;
        base_damage = 10;
    }


    /*
    *  Getters
    * */
    public int get_health() {
        return health;
    }

    public int get_stamina() {
        return stamina;
    }


    /*
    *  Setters
    * */
    public void set_health(int health) {
        this.health = health;
    }

    public void set_stamina(int stamina) {
        this.stamina = stamina;
    }


    public void buff() {
        health += 0.1 * health;
        stamina += 0.1 * stamina;
    }

}
