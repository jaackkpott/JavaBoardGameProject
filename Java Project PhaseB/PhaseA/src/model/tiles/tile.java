package model.tiles;

/**
 * Contains the methods signatures needed for 
 * creating a tile of any kind
 * @version 1.0
 * @author Aleksandar - Mladenovic
 */
public abstract interface tile{
	/**
     * Returns the string representation of a tile
     * <b>Postcondition:</b> The string representation of a tile is returned
     * @return The string representation of a tile
     */
    @Override
    public String toString();
}

