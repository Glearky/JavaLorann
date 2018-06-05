package motionless;

import model.Permeability;
import model.Sprite;

/**
 * <h1>Bone Class</h1>
 *
 * @author group2
 * @version 1.0
 */

public class Bone extends MotionlessElement {

	/** The Constant SPRITE. */
	private static final Sprite SPRITE = new Sprite('!', "bone.png");

	/**
	 * Instantiates a new bone.
	 */
	public Bone() {
		super(SPRITE, Permeability.BLOCKING);
	}

}
