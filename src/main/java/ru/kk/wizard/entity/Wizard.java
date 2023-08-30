package ru.kk.wizard.entity;

public class Wizard {
    private int health = 100;
    private int mana = 100;

    public void setCharacter() {
        System.out.println("Волшебник является таинственной и загадочной личностью." + "\n" + "У него есть способность контролировать магическую энергию (ману) и использовать ее для защиты своего здоровья.");
    }


    public void setHealth(int health) {

        this.health = health;
    }

    public int getHealth() {

        return this.health;
    }

    public void setMana(int mana) {

        this.mana = mana;
    }

    public int getMana() {

        return this.mana;
    }
}
