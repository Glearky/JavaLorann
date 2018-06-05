package motionless;

import model.Permeability;
import model.Sprite;

/**
 * <h1>CrystalBall Class</h1>
 *
 * @author group2
 * @version 1.0
 */

public class CrystalBall extends MotionlessElement {

	/** The Constant SPRITE. */
	private static final Sprite SPRITE = new Sprite('E', "crystal_ball.png");

	/**
	 * Instantiates a new crystalBall.
	 */
	public CrystalBall() {
		super(SPRITE, Permeability.OPENGATE);
	}

}
