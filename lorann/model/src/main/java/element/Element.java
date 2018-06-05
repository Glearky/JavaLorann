package element;

import java.awt.Image;

import model.IElement;
import model.Permeability;
import model.Sprite;

/**
 * <h1>Element Class</h1>
 *
 * @author group2
 * @version 1.0
 * @see ISquare
 */

public class Element implements IElement {

	/** The sprite. */
	private Sprite sprite;

	/** The permeability. */
	private Permeability permeability;

	/**
	 * Instantiates a new element.
	 *
	 * @param sprite
	 *            the sprite
	 * @param permeability
	 *            the permeability
	 */
	public Element(final Sprite sprite, final Permeability permeability) {
		this.setSprite(sprite);
		this.setPermeability(permeability);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.exia.showboard.ISquare#getImage()
	 */
	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.exia.insanevehicles.model.element.IElement#getImage()
	 */
	@Override
	public Image getImage() {
		return this.getSprite().getImage();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.exia.insanevehicles.model.element.IElement#getSprite()
	 */
	@Override
	public Sprite getSprite() {
		return this.sprite;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see fr.exia.insanevehicles.model.element.IElement#getPermeability()
	 */
	@Override
	public Permeability getPermeability() {
		// TODO Auto-generated method stub
		return this.permeability;
	}

	/**
	 * Sets the sprite.
	 *
	 * @param sprite
	 *            the new sprite
	 */
	public void setSprite(Sprite sprite) {
		this.sprite = sprite;
	}

	/**
	 * Sets the permeability.
	 *
	 * @param permeability
	 *            the new permeability
	 */
	public void setPermeability(Permeability permeability) {
		this.permeability = permeability;
	}

}
