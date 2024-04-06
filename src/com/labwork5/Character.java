package com.labwork5;

/**
 * Represents a character in the game space with attributes such as health, mana, stamina, and experience.
 * Provides methods to display status, set and get attributes, and save/restore state.
 */
public class Character
{
    private int health;
    private int mana;
    private int stamina;
    private int experience;
    /**
     * Constructs a Character object with the specified initial attributes.
     * @param health the health of the character
     * @param mana the mana of the character
     * @param stamina the stamina of the character
     * @param experience the experience of the character
     */
    public Character(int health, int mana, int stamina, int experience)
    {
        this.health = health;
        this.mana = mana;
        this.stamina = stamina;
        this.experience = experience;
    }
    /**
     * Displays the current status of the character including health, mana, stamina, and experience.
     */
    public void displayStatus()
    {
        System.out.println("Health: " + health + ", Mana: " + mana + ", Stamina: " + stamina + ", Experience: " + experience);
    }
    /**
     * Sets the health of the character.
     * @param health the new health value
     */
    public void setHealth(int health)
    {
        this.health = health;
    }
    /**
     * Retrieves the health of the character.
     * @return the health value
     */
    public int getHealth()
    {
        return health;
    }
    /**
     * Sets the mana of the character.
     * @param mana the new mana value
     */
    public void setMana(int mana)
    {
        this.mana = mana;
    }
    /**
     * Retrieves the mana of the character.
     * @return the mana value
     */
    public int getMana()
    {
        return mana;
    }
    /**
     * Sets the stamina of the character.
     * @param stamina the new stamina value
     */
    public void setStamina(int stamina)
    {
        this.stamina = stamina;
    }
    /**
     * Retrieves the stamina of the character.
     * @return the stamina value
     */
    public int getStamina()
    {
        return stamina;
    }
    /**
     * Sets the experience of the character.
     * @param experience the new experience value
     */
    public void setExperience(int experience)
    {
        this.experience = experience;
    }
    /**
     * Retrieves the experience of the character.
     * @return the experience value
     */
    public int getExperience()
    {
        return experience;
    }
    /**
     * Saves the current state of the character by creating a memento.
     * @return a CharacterMemento object representing the current state
     */
    public CharacterMemento save()
    {
        return new CharacterMemento(health, mana, stamina, experience);
    }
    /**
     * Restores the character's state from a previously saved memento.
     * @param memento the memento containing the state to restore
     */
    public void restore(CharacterMemento memento)
    {
        this.health = memento.getHealth();
        this.mana = memento.getMana();
        this.stamina = memento.getStamina();
        this.experience = memento.getExperience();
    }
}