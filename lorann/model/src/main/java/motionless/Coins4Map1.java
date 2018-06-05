package motionless;

import model.Permeability;
import model.Sprite;

/**
 * <h1>Purse Class</h1>
 *
 * @author group2
 * @version 1.0
 */

public class Coins4Map1 extends MotionlessElement {

	/** The Constant SPRITE. */
	private static final Sprite SPRITE = new Sprite('D', "purse.png");

	/**
	 * Instantiates a new purse.
	 */
	public Coins4Map1() {
		super(SPRITE, Permeability.COINS);
	}

}
