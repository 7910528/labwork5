package com.labwork5;

/**
 * Represents a snapshot of the state of the Character object.
 */
public class CharacterMemento
{
    private int health;
    private int mana;
    private int stamina;
    private int experience;
    /**
     * Constructs a CharacterMemento object with the given state values.
     * @param health the health of the character
     * @param mana the mana of the character
     * @param stamina the stamina of the character
     * @param experience the experience of the character
     */
    public CharacterMemento(int health, int mana, int stamina, int experience)
    {
        this.health = health;
        this.mana = mana;
        this.stamina = stamina;
        this.experience = experience;
    }
    /**
     * Retrieves the health value from the memento.
     * @return the health value
     */
    public int getHealth()
    {
        return health;
    }
    /**
     * Retrieves the mana value from the memento.
     * @return the mana value
     */
    public int getMana()
    {
        return mana;
    }
    /**
     * Retrieves the stamina value from the memento.
     * @return the stamina value
     */
    public int getStamina()
    {
        return stamina;
    }
    /**
     * Retrieves the experience value from the memento.
     * @return the experience value
     */
    public int getExperience()
    {
        return experience;
    }
}