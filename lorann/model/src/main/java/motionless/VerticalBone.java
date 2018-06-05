package motionless;

import model.Permeability;
import model.Sprite;

/**
 * <h1>VerticalBone Class</h1>
 *
 * @author group2
 * @version 1.0
 */

public class VerticalBone extends MotionlessElement {

	/** The Constant SPRITE. */
	private static final Sprite SPRITE = new Sprite(':', "vertical_bone.png");

	/**
	 * Instantiates a new verticalBone.
	 */
	public VerticalBone() {
		super(SPRITE, Permeability.BLOCKING);
	}

}
