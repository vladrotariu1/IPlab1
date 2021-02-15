package com.lab1;

public class Ninja extends Enemy implements Dialogue {

    public Ninja(int health, int stamina) {
        super(health, stamina);
    }

    void attack(Enemy E) {
        E.health -= base_damage;
    }

    @Override
    public void dialogue1() {
        System.out.println("Ninja took a body hit");
    }

    public void dialogue1(String s) {
        System.out.println(s);
    }

    @Override
    public void dialogue2() {
        System.out.println("Ninja took a head hit");
    }

    public void dialogue2(String s) {
        System.out.println(s);
    }

    @Override
    public void buff() {
        health += 0.1 * health;
        stamina += 0.3 * stamina;
    }
}
