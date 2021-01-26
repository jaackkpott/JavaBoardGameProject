package model.cards;


/**
 * Contains the methods signatures needed for 
 * creating a card of any kind
 * @version 1.0
 * @author Aleksandar - Mladenovic
 */
public abstract class card {
	protected boolean used = false;
	
	/**
     * <b>Transformer:</b> Users the card abillity and set used to true.
     * <b>Postcondition:</b> The card abillity has been activated and the card is used now.
     */
	public abstract void useCard();
	
	/**
     * <b>Observer:</b> Returns true if this Card is used.
     * <b>Postcondition:</b> Returns true if this Card is used.
     * @return true if this Card is used
     */
	public boolean isUsed() {return this.used;}
}
