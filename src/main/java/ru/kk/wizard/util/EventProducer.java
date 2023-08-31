package ru.kk.wizard.util;

import ru.kk.wizard.entity.Wizard;

import java.util.Random;

public class EventProducer {
    Random random = new Random();

    private void healthPotion(Wizard wizard) {
        int health = wizard.getHealth();
        health += 20;
        if (health > 100) {
            health = 100;
        }
        wizard.setHealth(health);
        System.out.println("Зелье здоровья: Волшебник находит зелье здоровья, которое восстанавливает его здоровье на 20 единиц.");
    }

    private void meditation(Wizard wizard) {
        int mana = wizard.getMana();
        mana += 20;
        if (mana > 100) {
            mana = 100;
        }
        wizard.setMana(mana);
        System.out.println("Медитация: Волшебник медитирует, чтобы восстановить 20 единиц маны.");

    }

    private void encounteredGoblin(Wizard wizard) {
        int mana = wizard.getMana();
        int health = wizard.getHealth();
        if (mana >= 15) {
            mana -= 15;
            health -= 20;
        } else {
            health = 0;
        }
        wizard.setHealth(health);
        wizard.setMana(mana);
        System.out.println("Встреча с Гоблином: Волшебник столкнулся с гоблином, что уменьшило его здоровье на 20 единиц.");

    }

    private void magicCrystal(Wizard wizard) {
        int mana = wizard.getMana();
        mana += 15;
        wizard.setMana(mana);
        System.out.println("Магический кристалл: Волшебник обнаружил магический кристалл, который увеличил его ману на 15 единиц.");

    }

    private void poisonTrap(Wizard wizard) {
        int health = wizard.getHealth();
        health -= 15;
        wizard.setHealth(health);
        System.out.println("Ядовитая ловушка: Волшебник наступил на ядовитую ловушку, что уменьшило его здоровье на 15 единиц.");

    }

    private void sleepingDragon(Wizard wizard) {
        int mana = wizard.getMana();
        int health = wizard.getHealth();
        if (mana >= 15) {
            mana -= 15;
            health -= 25;
        } else {
            health = 0;
        }
        wizard.setHealth(health);
        wizard.setMana(mana);
        System.out.println("Спящий дракон: Волшебник пробудил спящего дракона, что уменьшило его здоровье на 25 единиц.");

    }

    private void magicSource(Wizard wizard) {
        int mana = wizard.getMana();
        mana += 30;
        wizard.setMana(mana);
        System.out.println("Магический источник: Волшебник обнаружил магический источник, который восстановил его ману на 30 единиц.");

    }

    private void manaPotion(Wizard wizard) {
        int mana = wizard.getMana();
        mana += 20;
        wizard.setMana(mana);
        System.out.println("Зелье маны: Волшебник нашел зелье маны, которое восстановило его ману на 20 единиц.");

    }

    private void oldHealer(Wizard wizard) {
        int health = wizard.getHealth();
        health += 25;

        wizard.setHealth(health);
        System.out.println("Старый знахарь: Волшебник встретился со старым знахарем, который восстановил его здоровье на 25 единиц.");

    }

    private void witchCurse(Wizard wizard) {
        int mana = wizard.getMana();
        mana -= 30;
        wizard.setMana(mana);
        System.out.println("Проклятие ведьмы: Волшебник нарвался на проклятие ведьмы, что уменьшило его ману на 30 единиц.");

    }

    public void randomEvent(Wizard wizard) {
        int event = random.nextInt(10);
        switch (event) {
            case 0:
                healthPotion(wizard);
                break;
            case 1:
                meditation(wizard);
                break;
            case 2:
                encounteredGoblin(wizard);
                break;
            case 3:
                magicCrystal(wizard);
                break;
            case 4:
                poisonTrap(wizard);
                break;
            case 5:
                sleepingDragon(wizard);
                break;
            case 6:
                magicSource(wizard);
                break;
            case 7:
                manaPotion(wizard);
                break;
            case 8:
                oldHealer(wizard);
                break;
            case 9:
                witchCurse(wizard);
                break;
        }
    }

    public boolean isAlive(Wizard wizard) {

        if (wizard.getHealth() <= 0) {
            return false;
        } else {
            return true;
        }
    }

    public void live(Wizard wizard) {
        while (isAlive(wizard)) {
            randomEvent(wizard);
            System.out.println("Здоровье: " + wizard.getHealth() + ", Мана: " + wizard.getMana());
        }
        System.out.println("Волшебник погиб.");
    }
}
