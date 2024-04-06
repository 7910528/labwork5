package com.labwork5;

public class Main
{
    public static void main(String[] args)
    {
        Character character = new Character(18000, 30000, 12000, 700000);
        character.displayStatus();
        Caretaker caretaker = new Caretaker();
        caretaker.saveState(character);
        System.out.println("Changing the character's attributes...");
        character.setHealth(10000);
        character.setMana(10000);
        character.setStamina(10000);
        character.setExperience(10000);
        System.out.println("New attributes:");
        character.displayStatus();
        caretaker.restoreState(character);
        System.out.println("Restored attributes:");
        character.displayStatus();
    }
}