package showboard;

import java.awt.Point;
import java.util.Random;

import showboard.IPawn;

/**
 * <h1>The Class Monster.</h1>
 *
 * @author Anne-Emilie DIET
 * @version 1.0
 */
public class Monster extends Tile implements IPawn {

    /** The position. */
    private Point        position;

    /** The random. */
    private final Random random = new Random();

    /**
     * Instantiates a new monster.
     *
     * @param imageName
     *            the image name
     */
    public Monster(final String imageName) {
        super(imageName);
    }

    /*
     * (non-Javadoc)
     * @see fr.exia.showboard.IPawn#getX()
     */
    @Override
    public final int getX() {
        return this.getPosition().x;
    }

    /*
     * (non-Javadoc)
     * @see fr.exia.showboard.IPawn#getY()
     */
    @Override
    public final int getY() {
        return this.getPosition().y;
    }

    /*
     * (non-Javadoc)
     * @see fr.exia.showboard.IPawn#getPosition()
     */
    @Override
    public final Point getPosition() {
        return this.position;
    }

    /**
     * Sets the position.
     *
     * @param position
     *            the position to set
     */
    public final void setPosition(final Point position) {
        this.position = position;
    }

    /**
     * Sets the position.
     *
     * @param x
     *            the x
     * @param y
     *            the y
     */
    public final void setPosition(final int x, final int y) {
        this.position = new Point(x, y);
    }

    /**
     * <p>
     * Move randomly the monster on the board.
     * </p>
     */
    public final void move() {
        this.getPosition().x = this.getPosition().x + (this.random.nextInt() % 2);
        if (this.getPosition().x < 0) {
            this.getPosition().x = 0;
        }
        if (this.getPosition().x >= Showboarddemo.width) {
            this.getPosition().x = Showboarddemo.width - 1;
        }
        this.getPosition().y = this.getPosition().y + (this.random.nextInt() % 2);
        if (this.getPosition().y < 0) {
            this.getPosition().y = 0;
        }
        if (this.getPosition().y >= Showboarddemo.height) {
            this.getPosition().y = Showboarddemo.height - 1;
        }
    }
}
