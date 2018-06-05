package model;

import java.io.IOException;

import showboard.IPawn;

public interface IMobile extends IPawn, IElement {

	/**
	 * Move up.
	 * 
	 * @throws IOException
	 */
	void moveUp() throws IOException;

	/**
	 * Move left.
	 */
	void moveLeft() throws IOException;

	/**
	 * Move down.
	 */
	void moveDown() throws IOException;

	/**
	 * Move right.
	 */
	void moveRight() throws IOException;

	/**
	 * Do nothing.
	 */
	void doNothing();
	
	void moveUpM() throws IOException;

	/**
	 * Move left.
	 */
	void moveLeftM() throws IOException;

	/**
	 * Move down.
	 */
	void moveDownM() throws IOException;

	/**
	 * Move right.
	 */
	void moveRightM() throws IOException;
	

	/**
	 * Gets the x.
	 *
	 * @return the x
	 */
	@Override
	int getX();

	/**
	 * Gets the y.
	 *
	 * @return the y
	 */
	@Override
	int getY();
	

	/**
	 * Checks if is alive.
	 *
	 * @return the alive
	 */
	Boolean isAlive();

	/**
	 * Checks if the lorann crashed in a monster.
	 *
	 * @return the boolean
	 */
	Boolean isCrashed();

}
