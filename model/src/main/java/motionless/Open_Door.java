package motionless;

import model.Permeability;
import model.Sprite;

/**
 * <h1>Gate Class</h1>
 *
 * @author group2
 * @version 1.0
 */

public class Open_Door extends MotionlessElement {

	/** The Constant SPRITE. */
	private static final Sprite SPRITE = new Sprite('G', "gate_open.png");

	/**
	 * Instantiates a new gate.
	 */
	public Open_Door() {
		super(SPRITE, Permeability.OPENGATE);
	}

}
