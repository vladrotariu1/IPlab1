package com.lab1;

public class Main {
    public static void main(String[] args) {

        int base_health = 100;
        int base_stamina = 100;

        Ninja n1 = new Ninja(base_health, base_stamina);
        Ninja n2 = new Ninja(base_health, base_stamina);

        n1.dialogue1("Ninja 1: Let's battle!");
        n2.dialogue1("Ninja 2: Ok!");
        System.out.println("Ninja 1 health: " + n1.get_health());
        System.out.println("Ninja 2 health: " + n2.get_health() + "\n");

        n1.attack(n2);
        n2.dialogue1();
        n2.dialogue2("Ninja 2: Ninja 1 hit me hard..now it's my turn");
        System.out.println("Ninja 1 health: " + n1.get_health());
        System.out.println("Ninja 2 health: " + n2.get_health() + "\n");

        n2.attack(n1);
        n1.dialogue2();
        n1.dialogue2("Ninja 1: Ninja 2 almost knocked me out with a head hit...let's buff!!!");
        System.out.println("Ninja 1 health: " + n1.get_health());
        System.out.println("Ninja 2 health: " + n2.get_health() + "\n");

        n1.buff();
        n1.dialogue2("Ninja 1: I buffed!!!");
        System.out.println("Ninja 1 health: " + n1.get_health());
        System.out.println("Ninja 2 health: " + n2.get_health() + "\n");

    }
}
