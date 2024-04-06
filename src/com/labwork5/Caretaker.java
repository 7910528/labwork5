package com.labwork5;

/**
 * Manages the mementos for saving and restoring the state of a Character object.
 */
public class Caretaker
{
    private CharacterMemento memento;
    /**
     * Saves the current state of the character by creating a memento.
     * @param character the character whose state needs to be saved
     */
    public void saveState(Character character)
    {
        this.memento = character.save();
        System.out.println("State saved.");
    }
    /**
     * Restores the character's state from a previously saved memento.
     * @param character the character to restore state for
     */
    public void restoreState(Character character)
    {
        if (memento != null)
        {
            character.restore(memento);
            System.out.println("State restored.");
        }
    }
}