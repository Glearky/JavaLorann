package motionless;

/**
 * <h1>A factory to create MotionlessElements objects.</h1>
 *
 * @author group1
 * @version 1.0
 */

public class MotionlessElementFactory {

	/** The Constant crystalBall. */
	private static final CrystalBall crystalBall = new CrystalBall();

	/** The Constant gate. */
	private static final Open_Door OD = new Open_Door();
	private static final Closed_Door CD = new Closed_Door();

	/** The Constant bone. */
	private static final Bone bone = new Bone();

	/** The Constant horizontalBone. */
	private static final HorizontalBone horizontalBone = new HorizontalBone();

	/** The Constant verticalBone. */
	private static final VerticalBone verticalBone = new VerticalBone();

	/** The Constant purse. */
	private static final Coins2Map1 coins2 = new Coins2Map1();
	
	private static final Coins1Map1 coins1 = new Coins1Map1();
	
	private static final Coins3Map1 coins3 = new Coins3Map1();
	
	private static final Coins4Map1 coins4 = new Coins4Map1();
	
	private static final Coins5Map1 coins5 = new Coins5Map1();

	private static final Dirt dirt = new Dirt();

	/**
	 * The motionless elements is an array of all possible MotionlessElement.
	 */

	private static MotionlessElement[] motionlessElements = { crystalBall, CD, OD, bone, horizontalBone, verticalBone,
			coins1, coins2, coins3, coins4, coins5, dirt };

	/**
	 * Creates a new MotionlessElements object.
	 *
	 * @return the motionless element
	 */
	public static MotionlessElement createCrystalBall() {
		return crystalBall;
	}

	/**
	 * Creates a new MotionlessElements object.
	 *
	 * @return the motionless element
	 */
	public static MotionlessElement createOpenDoor() {
		return OD;
	}
	/**
	 * Creates a new MotionlessElements object.
	 *
	 * @return the motionless element
	 */
	
	public static MotionlessElement createClosedDoor() {
		return CD;
	}

	/**
	 * Creates a new MotionlessElements object.
	 *
	 * @return the motionless element
	 */
	public static MotionlessElement createBone() {
		return bone;
	}

	/**
	 * Creates a new MotionlessElements object.
	 *
	 * @return the motionless element
	 */
	public static MotionlessElement createHorizontalBone() {
		return horizontalBone;
	}

	/**
	 * Creates a new MotionlessElements object.
	 *
	 * @return the motionless element
	 */
	public static MotionlessElement createVerticalBone() {
		return verticalBone;
	}

	/**
	 * Creates a new MotionlessElements object.
	 *
	 * @return the motionless element
	 */
	public static MotionlessElement createCoins1() {
		return coins1;
	}
	public static MotionlessElement createCoins2() {
		return coins2;
	}
	
	public static MotionlessElement createCoins3() {
		return coins3;
	}

	public static MotionlessElement createCoins4() {
		return coins4;
	}
	
	public static MotionlessElement createCoins5() {
		return coins5;
	}
	/**
	 * Creates a new MotionlessElements object.
	 *
	 * @return the motionless element
	 */
	public static MotionlessElement createGround() {
		return dirt;
	}

	public static MotionlessElement getFromFileSymbol(final char fileSymbol) {
		for (final MotionlessElement motionlessElement : motionlessElements) {
			if (motionlessElement.getSprite().getConsoleImage() == fileSymbol) {
				return motionlessElement;
			}
		}
		return null;
	}
}
