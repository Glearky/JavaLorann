package motionless;

import model.Permeability;
import model.Sprite;

/**
 * <h1>HorizontalBone Class</h1>
 *
 * @author group2
 * @version 1.0
 */

public class HorizontalBone extends MotionlessElement {

	/** The Constant SPRITE. */
	private static final Sprite SPRITE = new Sprite('/', "horizontal_bone.png");

	/**
	 * Instantiates a new horizontalBone.
	 */
	public HorizontalBone() {
		super(SPRITE, Permeability.BLOCKING);
	}

}
