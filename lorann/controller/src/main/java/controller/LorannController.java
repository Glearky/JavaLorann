package controller;

import java.io.IOException;
import java.sql.SQLException;

import java.util.List;

import model.IModel;
import view.ILorannView;

/**
 * <h1>The Class ControllerFacade provides a facade of the Controller
 * component.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public class LorannController implements ILorannController, IOrderPerformer {

	private static final int speed = 200;
	/** The view. */
	private ILorannView view;

	/** The model. */
	private IModel model;

	private UserOrder stackOrder;

	private static final int speedMonster = 200;

	/**
	 * Instantiates a new controller facade.
	 *
	 * @param view
	 *            the view
	 * @param model
	 *            the model
	 */
	public LorannController(final ILorannView view, final IModel model) {
		this.view = view;
		this.model = model;
		this.clearStackOrder();
	}

	@Override
	public final void moove() throws InterruptedException, IOException {
		while (this.getModel().getLorann().isAlive()) {
			Thread.sleep(speed);
			switch (this.getStackOrder()) {
			case RIGHT:
				this.getModel().getLorann().moveRight();
				break;
			case LEFT:
				this.getModel().getLorann().moveLeft();
				break;
			case UP:
				this.getModel().getLorann().moveUp();
				break;
			case DOWN:
				this.getModel().getLorann().moveDown();
				break;
			/*
			 * case SPACE: this.getModel().getLorann().magic(); // "Magic" need
			 * rename break;
			 */
			case NOP:
			default:
				this.getModel().getLorann().doNothing();
				break;
			}
			this.clearStackOrder();

		}

	}

	
	/**public final void mooveMonster() throws InterruptedException, IOException {
		while (this.getModel().getMonster().isAlive()) {
			Thread.sleep(speed);
			switch (this.getStackOrder()) {
			case RIGHT:
				this.getModel().getLorann().moveRightM();
				break;
			case LEFT:
				this.getModel().getLorann().moveLeftM();
				break;
			case UP:
				this.getModel().getLorann().moveUpM();
				break;
			case DOWN:
				this.getModel().getLorann().moveDownM();
				break;
				
			}
		}
	}
	**/
	/**
	 * Gets the view.
	 *
	 * @return the view
	 */
	public ILorannView getView() {
		return this.view;
	}

	@Override
	public final void orderPerform(final UserOrder userOrder) throws IOException {
		this.setStackOrder(userOrder);
	}

	private void setView(final ILorannView view) {
		this.view = view;
	}

	/**
	 * Gets the model.
	 *
	 * @return the model
	 */
	public IModel getModel() {
		return this.model;
	}

	private void setModel(final IModel model) {
		this.model = model;
	}

	/**
	 * Gets the stack order.
	 *
	 * @return the stack order
	 */
	private UserOrder getStackOrder() {
		return this.stackOrder;
	}

	/**
	 * Sets the stack order.
	 *
	 * @param stackOrder
	 *            the new stack order
	 */
	private void setStackOrder(final UserOrder stackOrder) {
		this.stackOrder = stackOrder;
	}

	/**
	 * Clear stack order.
	 */
	private void clearStackOrder() {
		this.stackOrder = UserOrder.NOP;
	}

	@Override
	public IOrderPerformer getOrderPeformer() {
		return this;
	}

}
