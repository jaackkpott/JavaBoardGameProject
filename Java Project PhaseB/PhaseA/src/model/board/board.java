package model.board;

import java.util.ArrayList;

import model.tiles.Amphoras;
import model.tiles.Landslides;
import model.tiles.MarbleStatues;
import model.tiles.Mosaics;
import model.tiles.Skeletons;
import model.tiles.marbleTypes;
import model.tiles.skeletonParts;
import model.tiles.tileColor;

/**
 * This class creates a new Board.
 * @version 1.0
 * @author Aleksandar - Mladenovic
 */
public class board{
	private ArrayList<Mosaics> MosaicsSortingArea;
	private ArrayList<MarbleStatues> MarbleSortingArea;
	private ArrayList<Amphoras> AmphorasSortingArea;
	private ArrayList<Skeletons> SkeletonsSortingArea;
	private ArrayList<Landslides> EntranceSpace;
	
	/**Constructor.
     * 
     * <b>Postcondition</b>Creates a new board with initialized arrays of Mosaics, MarbleStatues, Amphoras, Skeletons, Landslides.
     */
	public board() {
		MosaicsSortingArea = new ArrayList<Mosaics>();
		MarbleSortingArea = new ArrayList<MarbleStatues>();
		AmphorasSortingArea = new ArrayList<Amphoras>();
		SkeletonsSortingArea = new ArrayList<Skeletons>();
		EntranceSpace = new  ArrayList<Landslides>();
	}
	
	/**
     * <b>Observer:</b> Returns true if the game has ended.
     * <b>Postcondition:</b> Returns true if the Landslides are 16 in the Array.
     * @return true if Landslides array contains 16 Landslides
     */
	public boolean hasTheGameEnded() { return false; }
	
	/**
     * <b>Transformer:</b> Adds a mosaic to the list.
     * <b>Postcondition:</b> A Mosaic has been added to the list.
     * @param m
     */
	public void addMosaic(Mosaics m) {}
	
	/**
     * <b>Transformer:</b> Removes a Mosaic from the list.
     * <b>Postcondition:</b> A Mosaic has been removed from the list.
     * @return the removes Mosaic of the list
     */
	public Mosaics removeMosaic() {return null;}
	
	/**
     * <b>Transformer:</b> Adds a Marble to the list.
     * <b>Postcondition:</b> A Marble has been added to the list.
     * @param m
     */
	public void addMarbleStatues(MarbleStatues m) {}
	
	/**
     * <b>Transformer:</b> Removes a Marble from the list.
     * <b>Postcondition:</b> A Marble has been removed from the list.
     * @return the removes Marble of the list
     */
	public MarbleStatues removeMarbleStatues() { return null; }
	
	/**
     * <b>Transformer:</b> Adds an Amphoras to the list.
     * <b>Postcondition:</b> An Amphoras has been added to the list.
     * @param a
     */
	public void addAmphoras(Amphoras a) {}
	
	/**
     * <b>Transformer:</b> Removes an Amphoras from the list.
     * <b>Postcondition:</b> An Amphoras has been removed from the list.
     * @return the removes Amphoras of the list
     */
	public MarbleStatues removeAmphoras() { return null; }
	
	/**
     * <b>Transformer:</b> Adds a Skeleton to the list.
     * <b>Postcondition:</b> A Skeleton has been added to the list.
     * @param s
     */
	public void addSkeletons(Skeletons s) {}
	
	/**
     * <b>Transformer:</b> Removes a Skeleton from the list.
     * <b>Postcondition:</b> A Skeleton has been removed from the list.
     * @return the removes Skeletons of the list
     */
	public MarbleStatues removeSkeletons() { return null; }
	
	/**
     * <b>Transformer:</b> Adds a Landslide to the list.
     * <b>Postcondition:</b> A Landslide has been added to the list.
     * @param l
     */
	public void addLandslides(Landslides l) {}
	
	/**
     * <b>Transformer:</b> Removes a Landslide from the list.
     * <b>Postcondition:</b> A Landslide has been removed from the list.
     * @return the removes Landslide of the list
     */
	public Landslides removeLandslides() { return null; }
	
	/**
     * <b>Accessor:</b> Returns the number of a Landslide in the list.
     * <Postcondition:</b> The number of the Landslide in the list has been returned.
     * @return size of the Landslide list
     */
	public int getNumLandslides() {return 1;}
	
	/**
	 * The Type of the MarbleStatues we want to get the number of can be choosen with the parameter
     * <b>Accessor:</b> Returns the number of a MarbleStatues in the list.
     * <Postcondition:</b> The number of the MarbleStatues in the list has been returned.
     * @param marbleTypes
     * @return number of the MarbleStatues
     */
	public int getNumMarbleStatues(marbleTypes m) {return 1;}
	
	/**
     * <b>Accessor:</b> Returns the number of a Mosaics the color can be selected throw the parameter.
     * <Postcondition:</b> The number of the Mosaics that are Green in the list has been returned.
     * @param tileColor
     * @return the number of Mosaics that are Green
     */
	public int getNumMosaics(tileColor col) {return 1;}

	
	/**
     * <b>Accessor:</b> Returns the number of Skeletons depends of which we want .
     * <Postcondition:</b> The number of big Skeletons Upper parts in the list has been returned.
     * @param Part of the Skeletons size we want
     * @return the number of big Skeletons Upper parts
     */
	public int getNumSkeletons(skeletonParts part) {return 1;}
	
	/**
     * <b>Accessor:</b> Returns the number of Amphoras depends of which color we want we can pass as argument.
     * <Postcondition:</b> The number of big Amphoras Upper parts in the list has been returned.
     * @param tileColor of the Amphoras
     * @return the number of tileColor Amphoras
     */
	public int getNumAmphoras(tileColor col) {return 1;}
	
}
