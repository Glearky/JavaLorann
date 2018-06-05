package model;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * <h1>Sprite Class</h1>
 *
 * @author group2
 * @version 1.0
 */
public class Sprite {

	/** The image. */
	private Image image;

	/** The image name. */
	private String imageName;

	/** The console image. */
	private char consoleImage;

	/** The is image loaded. */
	private boolean imageLoaded;

	/**
	 * Instantiates a new sprite.
	 *
	 * @param character
	 *            the character
	 * @param imageName
	 *            the image name
	 */
	public Sprite(final char character, final String imageName) {
		this.setConsoleImage(character);
		this.setImageName(imageName);
	}

	/**
	 * Gets the image.
	 *
	 * @return the image
	 */
	public final Image getImage() {
		return this.image;
	}

	/**
	 * Loads image.
	 *
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public final void loadImage() throws IOException {
		this.setImage(ImageIO.read(new File("../sprite/" + this.getImageName())));
	}

	/**
	 * Gets the console image.
	 *
	 * @return the consoleImage
	 */
	public final char getConsoleImage() {
		return this.consoleImage;
	}

	/**
	 * Sets the image.
	 *
	 * @param bufferedImage
	 *            the new image
	 */
	private void setImage(BufferedImage bufferedImage) {
		this.image = bufferedImage;
	}

	/**
	 * Sets the console image.
	 *
	 * @param consoleImage
	 *            the consoleImage to set
	 */
	private void setConsoleImage(final char consoleImage) {
		this.consoleImage = consoleImage;
	}

	/**
	 * Gets the image name.
	 *
	 * @return the imageName
	 */
	public final String getImageName() {
		return this.imageName;
	}

	/**
	 * Sets the image name.
	 *
	 * @param imageName
	 *            the imageName to set
	 */
	private void setImageName(final String imageName) {
		this.imageName = imageName;
	}

	/**
	 * Checks if is image loaded.
	 *
	 * @return true, if is image loaded
	 */
	public final boolean isImageLoaded() {
		return this.imageLoaded;
	}

	/**
	 * Sets the image loaded.
	 *
	 * @param isImageLoaded
	 *            the new image loaded
	 */
	public final void setImageLoaded(final boolean isImageLoaded) {
		this.imageLoaded = isImageLoaded;
	}

}
