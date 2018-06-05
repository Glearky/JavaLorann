package motionless;

import model.Permeability;
import model.Sprite;

/**
 * <h1>Ground Class</h1>
 *
 * @author group1
 * @version 1.0
 */

public class Dirt extends MotionlessElement {

	/** The Constant SPRITE. */
	private static final Sprite SPRITE = new Sprite(' ', "ground.png");

	/**
	 * Instantiates a new ground.
	 */
	public Dirt() {
		super(SPRITE, Permeability.PENETRABLE);
	}

}
