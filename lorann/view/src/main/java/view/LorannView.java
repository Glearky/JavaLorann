package view;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import controller.IOrderPerformer;
import controller.UserOrder;
import element.Element;
import mobile.Golem;
import mobile.Masked;
import model.IMap;
import model.IMobile;
import showboard.BoardFrame;
import showboard.IPawn;

/**
 * <h1>Class LorannView</h1>
 *
 * @author group1
 * @version 1.0
 */
public class LorannView implements Runnable, KeyListener, ILorannView, IPawn {

	/** The Constant length. */
	private int squareSize = 80;

	private Rectangle closeView;

	/** The map. */
	private IMap map;

	/** Lorann. */
	private IMobile Lorann;

	/** The order performer. */
	private IOrderPerformer orderPerformer;

	private ArrayList<Golem> monster;

	private ArrayList<Masked> monster1;

	/**
	 * Instantiates a new insane vehicles View.
	 *
	 * @param map
	 *            the map
	 * @param Lorann
	 *            the Lorann
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public LorannView(final IMap map, final IMobile Lorann, final ArrayList<Golem> monster, final ArrayList<Masked> monster1) throws IOException {
		this.setMap(map);
		this.setLorann(Lorann);
		this.setMonster(monster);
		this.setMonster1(monster1);
		this.getLorann().getSprite().loadImage();
		
		for (Golem monster2 : monster) {
			monster2.getSprite().loadImage();
		}
		for (Masked monster3 : monster1) {
			monster3.getSprite().loadImage();
		}
		
		this.setCloseView(new Rectangle(0, 0, this.getMap().getWidth(), this.getMap().getHeight()));
		SwingUtilities.invokeLater(this);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Runnable#run()
	 */
	public final void run() {
		final BoardFrame boardFrame = new BoardFrame("Lorann");
		boardFrame.setDimension(new Dimension(this.getMap().getWidth(), this.getMap().getHeight()));
		boardFrame.setSize(this.map.getWidth() * squareSize, this.map.getHeight() * squareSize);
		boardFrame.setDisplayFrame(this.closeView);
		boardFrame.setHeightLooped(false);
		boardFrame.addKeyListener(this);
		boardFrame.setFocusable(true);
		boardFrame.setFocusTraversalKeysEnabled(false);
		boardFrame.setLocationRelativeTo(null);

		boardFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);

		for (int x = 0; x < this.getMap().getWidth(); x++) {
			for (int y = 0; y < this.getMap().getHeight(); y++) {
				boardFrame.addSquare(this.map.getOnTheMapXY(x, y), x, y);
			}
		}

		boardFrame.addPawn(getLorann());

		for (Golem monster2 : monster) {
			boardFrame.addPawn(monster2);
		}

		for (Masked monster3 : monster1) {
			boardFrame.addPawn(monster3);
		}

		this.getMap().getObservable().addObserver(boardFrame.getObserver());

		boardFrame.setVisible(true);

	}

	/**
	 * Key code to user order.
	 *
	 * @param keyCode
	 *            the key code
	 * @return the user order
	 */
	private static UserOrder keyCodeToUserOrder(final int keyCode) {
		UserOrder userOrder;
		switch (keyCode) {
		case KeyEvent.VK_RIGHT:
			userOrder = UserOrder.RIGHT;
			break;
		case KeyEvent.VK_LEFT:
			userOrder = UserOrder.LEFT;
			break;
		case KeyEvent.VK_UP:
			userOrder = UserOrder.UP;
			break;
		case KeyEvent.VK_DOWN:
			userOrder = UserOrder.DOWN;
			break;
		default:
			userOrder = UserOrder.NOP;
			break;
		}
		return userOrder;
	}

	public final void keyPressed(final KeyEvent keyEvent) {
		try {
			this.getOrderPerformer().orderPerform(keyCodeToUserOrder(keyEvent.getKeyCode()));
		} catch (final IOException exception) {
			exception.printStackTrace();
		}
	}

	/**
	 * Gets the map.
	 *
	 * @return the map
	 */
	private IMap getMap() {
		return this.map;
	}

	/**
	 * Sets the map.
	 *
	 * @param map
	 *            the new map
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	private void setMap(final IMap map) throws IOException {
		this.map = map;
		this.getMap();
		for (int x = 0; x < (this.getMap().getWidth() - 1); x++) {
			for (int y = 0; y < (this.getMap().getHeight() - 1); y++) {

				Element e = this.getMap().getOnTheMapXY(x, y);
				e.getSprite().loadImage();

			}
		}
	}

	/**
	 * Gets Lorann.
	 *
	 * @return Lorann
	 */
	private IMobile getLorann() {
		return this.Lorann;
	}

	private void setLorann(final IMobile Lorann) {
		this.Lorann = Lorann;
	}

	/**
	 * Gets the order performer.
	 *
	 * @return the order performer
	 */
	private IOrderPerformer getOrderPerformer() {
		return this.orderPerformer;
	}

	/**
	 * Sets the order performer.
	 *
	 * @param orderPerformer
	 *            the new order performer
	 */
	/*
	 * public final void setOrderPerformer(final IOrderPerformer orderPerformer)
	 * { this.orderPerformer = orderPerformer; }
	 */

	public final void setOrderPerformer(final IOrderPerformer orderPerformer) {
		this.orderPerformer = orderPerformer;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * fr.exia.insanevehicles.view.IInsaneVehiclesView#displayMessage(java.lang.
	 * String)
	 */
	@Override
	public final void displayMessage(final String message) {
		JOptionPane.showMessageDialog(null, message);
	}

	@Override
	public void keyReleased(KeyEvent keyEvent) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent keyEvent) {
		// TODO Auto-generated method stub

	}

	public int getSquareSize() {
		return squareSize;
	}

	public void setSquareSize(int squareSize) {
		this.squareSize = squareSize;
	}

	public Rectangle getCloseView() {
		return closeView;
	}

	public void setCloseView(Rectangle closeView) {
		this.closeView = closeView;
	}

	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getX() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getY() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Point getPosition() {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Golem> getMonster() {
		return this.monster;
	}

	public void setMonster(ArrayList<Golem> monster) {
		this.monster = monster;
	}

	public ArrayList<Masked> getMonster1() {
		return monster1;
	}

	public void setMonster1(ArrayList<Masked> monster1) {
		this.monster1 = monster1;
	}

}
