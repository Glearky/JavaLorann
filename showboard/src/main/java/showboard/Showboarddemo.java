package showboard;


import java.awt.Dimension;
import java.awt.Rectangle;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Random;

import javax.swing.SwingUtilities;

import showboard.BoardFrame;

/**
 * <h1>A simple demo to explain how use the showboard package.</h1>
 * <p>
 * There're four frames (but it's just to illustrate, you can use just one). All the frames display
 * the same board, but with different views.
 * </p>
 * <ul>
 * <li>The first frame displays a close view of the board.</li>
 * <li>The second displays the all board.</li>
 * <li>The third displays the all board but with a loop, as if the board was a sphere.</li>
 * <li>The fourth displays the all board two, but as if the board was a cylinder.</li>
 * </ul>
 * <p>
 * There are monsters on the board. They move at random and can not get out of the board.They do not
 * bounce one over the other.
 * </p>
 * <p>
 * You can change some static fields for better understand.
 * </p>
 *
 * @author Anne-Emilie DIET
 * @version 1.0
 */
public class Showboarddemo extends Observable implements Runnable {

    /** The Constant width of the board. */
    public static final int        width               = 30;

    /** The Constant height of the board. */
    public static final int        height              = 30;

    /** The Constant timeLoop represents the time in millisecond for each loop. */
    private static final int       timeLoop            = 300;

    /** The Constant sizeFrameCloseView is the size of the view frames. */
    private static final int       sizeFrame           = 400;

    /** The Constant widthBetweenFrame. */
    private static final int       widthBetweenFrame   = 20;



    /** The Constant closeView is the cadre of the board displayed in the close view frame. */
    private static final Rectangle fullView            = new Rectangle(0, 0, width, height);


    /** The Constant monstersNumber is the number of monsters instantiated on the board. */
    private static final int       monstersNumber      = 20;

    /**
     * The Constant imageMonstersNumber is the number of images used. All the images of monster have
     * to be named "Monster&lt;9&gt;.png"
     */
    private static final int       imageMonstersNumber = 4;

    /** The white tile. */
    private final Tile             whiteTile           = new Tile("104779.jpg");

    /** The black tile. */
    private final Tile             blackTile           = new Tile("BlackTile.jpg");

    /** The light gray tile. */
    private final Tile             lightGrayTile       = new Tile("LightGrayTile.jpg");

    /** The monsters. */
    private final List<Monster>    monsters;

    /**
     * <h2>Explanation of how the method works</h2>
     * <p>
     * Load the image in each tile used.
     * </p>
     *
     * <pre>
     * {@code
     * this.whiteTile.loadImage();
     * this.blackTile.loadImage();
     * this.lightGrayTile.loadImage();
     * }
     * </pre>
     * <p>
     * A loop for create all the monsters and add them to the list.
     * </p>
     *
     * <pre>
     * {@code
     * for (int i = 1; i <= monstersNumber; i++) {
     *     final Monster monster = new Monster("Monster" + ((i % imageMonstersNumber) + 1) + ".png");
     *     monster.loadImage();
     *     monster.setPosition(random.nextInt(width), random.nextInt(height));
     *     this.monsters.add(monster);
     * }
     * }
     * </pre>
     * <p>
     * <code>SwingUtilities.invokeLater(this)</code> is used for the window not to be instantiated
     * by the constructor but in a separate thread {@link #run() run()}.
     * </p>
     *
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public Showboarddemo() throws IOException {
        super();
        final Random random = new Random();
        this.whiteTile.loadImage();
        this.blackTile.loadImage();
        this.lightGrayTile.loadImage();
        this.monsters = new ArrayList<Monster>();
        for (int i = 1; i <= monstersNumber; i++) {
            final Monster monster = new Monster("Monster" + ((i % imageMonstersNumber) + 1) + ".png");
            monster.loadImage();
            monster.setPosition(random.nextInt(width), random.nextInt(height));
            this.monsters.add(monster);
        }

        SwingUtilities.invokeLater(this);
    }

    /*
     * (non-Javadoc)
     * @see java.lang.Runnable#run()
     */
    /**
     * <h2>Explanation of how the method works</h2>
     * <p>
     * The first frame displays a close view of the board.
     * </p>
     *
     * <pre>
     * {
     *     &#64;code
     *     final BoardFrame frameCloseView = new BoardFrame("Close view");
     *     frameCloseView.setDimension(new Dimension(width, height));
     *     frameCloseView.setDisplayFrame(closeView);
     *     frameCloseView.setSize(sizeFrame, sizeFrame);
     * }
     * </pre>
     * <p>
     * The second displays the all board.
     * </p>
     *
     * <pre>
     * {
     *     &#64;code
     *     final BoardFrame frameAllView = new BoardFrame("All view");
     *     frameAllView.setDimension(new Dimension(width, height));
     *     frameAllView.setDisplayFrame(fullView);
     *     frameAllView.setLocation(frameCloseView.getX() + frameCloseView.getWidth() + widthBetweenFrame,
     *             frameCloseView.getY());
     *     frameAllView.setSize(sizeFrame, sizeFrame);
     * }
     * </pre>
     * <p>
     * The third displays the all board but with a loop, as if the board was a sphere.
     * </p>
     *
     * <pre>
     * {
     *     &#64;code
     *     final BoardFrame frameLoopView = new BoardFrame("Loop view");
     *     frameLoopView.setDimension(new Dimension(width, height));
     *     frameLoopView.setDisplayFrame(loopView);
     *     frameLoopView.setLocation(frameCloseView.getX(),
     *             frameCloseView.getY() + frameCloseView.getHeight() + widthBetweenFrame);
     *     frameLoopView.setSize(sizeFrame, sizeFrame);
     *     frameLoopView.setWidthLooped(true);
     *     frameLoopView.setHeightLooped(true);
     * }
     * </pre>
     * <p>
     * The fourth display the all board two, but as if the board was a cylinder.
     * </p>
     *
     * <pre>
     * {
     *     &#64;code
     *     final BoardFrame frameWidthLoopView = new BoardFrame("Width loop view");
     *     frameWidthLoopView.setDimension(new Dimension(width, height));
     *     frameWidthLoopView.setDisplayFrame(widthLoopView);
     *     frameWidthLoopView.setLocation(frameAllView.getX(), frameLoopView.getY());
     *     frameWidthLoopView.setSize(sizeFrame, sizeFrame);
     *     frameWidthLoopView.setWidthLooped(true);
     * }
     * </pre>
     * <p>
     * Configuration of the 4 frames
     * </p>
     *
     * <pre>
     * {@code
        this.frameConfigure(frameCloseView);
        this.frameConfigure(frameAllView);
        this.frameConfigure(frameLoopView);
        this.frameConfigure(frameWidthLoopView);
     * }
     * </pre>
     */
    @Override
    public final void run() {
        final BoardFrame frameAllView = new BoardFrame("All view");
        frameAllView.setDimension(new Dimension(width, height));
        frameAllView.setDisplayFrame(fullView);
        frameAllView.setLocation(frameAllView.getX() + frameAllView.getWidth() + widthBetweenFrame,
                frameAllView.getY());
        frameAllView.setSize(sizeFrame, sizeFrame);

                   
        this.frameConfigure(frameAllView);
    }

    /**
     * <h2>Explanation of how the method works</h2>
     * <p>
     * An infinite loop for :
     * </p>
     *
     * <pre>
     * {@code
     * for (;;) {
     *     [...]
     * }
     * }
     * </pre>
     * <p>
     * moving the monsters.
     * </p>
     *
     * <pre>
     * {@code
     *     for (final Monster monster : this.monsters) {
     *         monster.move();
     *     }
     * }
     * </pre>
     * <p>
     * notify the observers that there's something has changed in the observer.
     * </p>
     *
     * <pre>
     * {@code
     * this.setChanged();
     * this.notifyObservers();
     * }
     * </pre>
     * <p>
     * a pause between each loop.
     * </p>
     *
     * <pre>
     * {@code
     * Thread.sleep(timeLoop);
     * }
     * </pre>
     *
     * @throws InterruptedException
     *             the interrupted exception
     */
    public final void move() throws InterruptedException {
        for (;;) {
            for (final Monster monster : this.monsters) {
                monster.move();
            }
            this.setChanged();
            this.notifyObservers();

            Thread.sleep(timeLoop);
        }
    }

    /**
     * <h2>Explanation of how the method works.</h2>
     * <p>
     * A double loop to add all square to the frame.
     * </p>
     *
     * <pre>
     * {@code
     *         for (int x = 0; x < width; x++) {
     *             for (int y = 0; y < height; y++) {
     *                 [...]
     *              }
     *         }
     * }
     * </pre>
     * <p>
     * To have a different colored border.
     * </p>
     *
     * <pre>
     * {@code
     *                 if ((x == 0) || (x == (width - 1)) || (y == 0) || (y == (height - 1))) {
     *                     frame.addSquare(this.lightGrayTile, x, y);
     *                 }
     * }
     * </pre>
     * <p>
     * To switch between white
     * </p>
     *
     * <pre>
     * {@code
     *                 else if (((x + y) % 2) == 0) {
     *                     frame.addSquare(this.whiteTile, x, y);
     *                 }
     * }
     * </pre>
     * <p>
     * and black tiles.
     * </p>
     *
     * <pre>
     * {@code
     *                 } else {
     *                     frame.addSquare(this.blackTile, x, y);
     *                 }
     * }
     * </pre>
     * <p>
     * The monsters are added to the frame.
     * </p>
     *
     * <pre>
     * {@code
     *         for (final Monster monster : this.monsters) {
     *             frame.addPawn(monster);
     *         }
     * }
     * </pre>
     * <p>
     * Add the frame as observer to refresh display.
     * </p>
     *
     * <pre>
     * {@code
     *         this.addObserver(frame.getObserver());
     * }
     * </pre>
     * <p>
     * Fiat lux ! The frame becomes visible.
     * </p>
     *
     * <pre>
     * {@code
     *         frame.setVisible(true);
     * }
     * </pre>
     *
     * @param frame
     *            the frame
     */
    public final void frameConfigure(final BoardFrame frame) {
        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                if ((x == 0) || (x == (width - 1)) || (y == 0) || (y == (height - 1))) {
                    frame.addSquare(this.lightGrayTile, x, y);
                } else if (((x + y) % 2) == 0) {
                    frame.addSquare(this.whiteTile, x, y);
                } else {
                    frame.addSquare(this.blackTile, x, y);
                }
            }
        }

        for (final Monster monster : this.monsters) {
            frame.addPawn(monster);
        }

        this.addObserver(frame.getObserver());

        frame.setVisible(true);
    }
}
