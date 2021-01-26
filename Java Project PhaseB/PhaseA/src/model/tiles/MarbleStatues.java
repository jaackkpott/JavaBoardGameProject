package model.tiles;

/**
 * Create a Marble with the specific type that it has
 * @version 1.0
 * @author Aleksandar - Mladenovic
 */
public class MarbleStatues implements tile {
	private marbleTypes type;
	
	/**
     * Constructor.
     * 
     * <b>Postcondition</b>Creates a new MarbleStatus Tile with 'type' type.
     *
     * @param type
     */
	public MarbleStatues(marbleTypes type) {this.type = type;}
	
	/**
     * <b>Accessor:</b> Returns the Type of the MarbleStatues.
     * <Postcondition:</b> The Type of the MarbleStatues has been returned.
     * @return Type of the MarbleStatues
     */
	public marbleTypes getType() {return this.type;}
}
