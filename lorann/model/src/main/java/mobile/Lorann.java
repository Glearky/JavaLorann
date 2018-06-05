package mobile;

import java.io.IOException;

import model.IMap;
import model.Permeability;
import model.Sprite;

public class Lorann extends Mobile {

	/** The Constant SpriteUL */
	private static final Sprite spriteUL = new Sprite('c', "lorann_ul.png");

	/** The Constant SpriteUR */
	private static final Sprite spriteUR = new Sprite('c', "lorann_ur.png");

	/** The Constant SpriteBR */
	private static final Sprite spriteBR = new Sprite('c', "lorann_br.png");

	/** The Constant SpriteBL */
	private static final Sprite spriteBL = new Sprite('c', "lorann_bl.png");

	/** The Constant spriteTurnLeft. */
	private static final Sprite spriteTurnLeft = new Sprite('c', "lorann_l.png");

	/** The Constant spriteTurnRight. */
	private static final Sprite spriteTurnRight = new Sprite('c', "lorann_r.png");

	/** The Constant spriteTurnUp. */
	private static final Sprite spriteTurnUp = new Sprite('c', "lorann_u.png");

	/** The Constant spriteTurnDown. */
	private static final Sprite spriteTurnDown = new Sprite('c', "lorann_b.png");

	public Lorann(final int x, final int y, IMap map) throws IOException {
		super(x, y, spriteUL, map, Permeability.BLOCKING);
		spriteUL.loadImage();
		spriteUR.loadImage();
		spriteBR.loadImage();
		spriteBL.loadImage();
		spriteTurnLeft.loadImage();
		spriteTurnRight.loadImage();
		spriteTurnDown.loadImage();
		spriteTurnUp.loadImage();
	}

	public void moveUp() throws IOException {
		super.moveUp();
		this.setSprite(spriteTurnUp);
	}

	public void moveLeft() throws IOException {
		super.moveLeft();
		this.setSprite(spriteTurnLeft);
	}

	public void moveDown() throws IOException {
		super.moveDown();
		this.setSprite(spriteTurnDown);
	}

	public void moveRight() throws IOException {
		super.moveRight();
		this.setSprite(spriteTurnRight);
	}

	public void doNothing() {

	}

	/**
	 * public void SpriteModif() {
	 * 
	 * if (getSprite() == Sprite.lorann_b ); this.setSprite(lorann_r); }
	 **/
}
