package mobile;

import java.awt.Point;
import java.io.IOException;
import java.util.Random;

import javax.swing.JOptionPane;

import element.Element;
import element.Score;
import model.IMap;
import model.IMobile;
import model.Permeability;
import model.Sprite;
import showboard.IBoard;

public abstract class Mobile extends Element implements IMobile {

	/**
	 * The x.
	 */
	private Point position;

	/** The alive. */
	private Boolean alive = true;

	/** The road. */
	private IMap map;

	/** The board. */
	private IBoard board;

	private int score = 0;

	/**
	 * Instantiates a new mobile.
	 *
	 * @param sprite
	 *            the sprite
	 * @param road
	 *            the road
	 * @param permeability
	 *            the permeability
	 */
	Mobile(final Sprite sprite, final IMap map, final Permeability permeability) {
		super(sprite, permeability);
		this.setMap(map);
		this.position = new Point();
	}

	/**
	 * Instantiates a new mobile.
	 *
	 * @param x
	 *            the x
	 * @param y
	 *            the y
	 * @param sprite
	 *            the sprite
	 * @param road
	 *            the road
	 * @param permeability
	 *            the permeability
	 */
	Mobile(final int x, final int y, final Sprite sprite, final IMap map, final Permeability permeability) {
		this(sprite, map, permeability);
		this.setX(x);
		this.setY(y);
	}

	public void moveUp() throws IOException {
		if (this.getY() != 0) {
			if (this.getMap().getOnTheMapXY(this.getX(), this.getY() - 1)
					.getPermeability() == Permeability.PENETRABLE) {
				this.setY(this.getY() - 1);
				this.setHasMoved();
			}
			if (this.getY() != 0) {
				try {
					if (this.getMap().getOnTheMapXY(this.getX(), this.getY() - 1)
							.getPermeability() == Permeability.OPENGATE) {
						this.ImmobilhasChanged(getX(), getY() - 1);
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else if (this.getMap().getOnTheMapXY(this.getX(), this.getY() - 1)
					.getPermeability() == Permeability.COINS) {
				this.CoinsHasbeenTaken(this.getX(), this.getY() - 1);
			} else if (this.getMap().getOnTheMapXY(this.getX(), this.getY() - 1)
					.getPermeability() == Permeability.WIN) {
				GGWP();

			} else if (this.getMap().getOnTheMapXY(this.getX(), this.getY() - 1)
					.getPermeability() == Permeability.MONSTER) {
				die();
			}
		}
	}

	@Override
	public void moveLeft() throws IOException {
		if (this.getX() != 0) {
			if (this.getMap().getOnTheMapXY(this.getX() - 1, this.getY())
					.getPermeability() == Permeability.PENETRABLE) {
				this.setX(this.getX() - 1);
				this.setHasMoved();
			} else if (this.getMap().getOnTheMapXY(this.getX() - 1, this.getY())
					.getPermeability() == Permeability.OPENGATE) {

				this.ImmobilhasChanged(this.getX() - 1, this.getY());

			} else if (this.getMap().getOnTheMapXY(this.getX() - 1, this.getY())
					.getPermeability() == Permeability.COINS) {
				this.CoinsHasbeenTaken(this.getX() - 1, this.getY());
			} else if (this.getMap().getOnTheMapXY(this.getX() - 1, this.getY())
					.getPermeability() == Permeability.WIN) {
				GGWP();

			} else if (this.getMap().getOnTheMapXY(this.getX() - 1, this.getY())
					.getPermeability() == Permeability.MONSTER) {
				die();

			}
		}
	}

	@Override
	public void moveDown() throws IOException {
		if (this.getY() != this.getMap().getHeight()) {
			if (this.getMap().getOnTheMapXY(this.getX(), this.getY() + 1)
					.getPermeability() == Permeability.PENETRABLE) {
				this.setY(this.getY() + 1);
				this.setHasMoved();
			} else if (this.getMap().getOnTheMapXY(this.getX(), this.getY() + 1)
					.getPermeability() == Permeability.OPENGATE) {
				this.ImmobilhasChanged(this.getX(), this.getY() + 1);
			} else if (this.getMap().getOnTheMapXY(this.getX(), this.getY() + 1)
					.getPermeability() == Permeability.COINS) {
				this.CoinsHasbeenTaken(this.getX(), this.getY() + 1);
			} else if (this.getMap().getOnTheMapXY(this.getX(), this.getY() + 1)
					.getPermeability() == Permeability.WIN) {
				GGWP();

			} else if (this.getMap().getOnTheMapXY(this.getX(), this.getY() + 1)
					.getPermeability() == Permeability.MONSTER) {
				die();

			}
		}
	}

	public void moveRight() throws IOException {
		if (this.getX() != this.getMap().getWidth()) {
			if (this.getMap().getOnTheMapXY(this.getX() + 1, this.getY())
					.getPermeability() == Permeability.PENETRABLE) {
				this.setX(this.getX() + 1);
				this.setHasMoved();
			} else if (this.getMap().getOnTheMapXY(this.getX() + 1, this.getY())
					.getPermeability() == Permeability.OPENGATE) {
				this.ImmobilhasChanged(this.getX() + 1, this.getY());
			} else if (this.getMap().getOnTheMapXY(this.getX() + 1, this.getY())
					.getPermeability() == Permeability.COINS) {
				this.CoinsHasbeenTaken(this.getX() + 1, this.getY());
			} else if (this.getMap().getOnTheMapXY(this.getX() + 1, this.getY())
					.getPermeability() == Permeability.WIN) {
				GGWP();

			} else if (this.getMap().getOnTheMapXY(this.getX() + 1, this.getY())
					.getPermeability() == Permeability.MONSTER) {
				die();

			}
		}
	}

	public void moveRightM() throws IOException {
		if (this.getX() != this.getMap().getWidth()) {
			if (this.getMap().getOnTheMapXY(this.getX() + 1, this.getY())
					.getPermeability() == Permeability.PENETRABLE) {
				this.setX(this.getX() + 1);
				this.setHasMoved();
			}
		}
	}

	public void moveDownM() throws IOException {
		if (this.getY() != this.getMap().getHeight()) {
			if (this.getMap().getOnTheMapXY(this.getX(), this.getY() + 1)
					.getPermeability() == Permeability.PENETRABLE) {
				this.setY(this.getY() + 1);
				this.setHasMoved();
			}
		}
	}

	public void moveLeftM() throws IOException {
		if (this.getX() != 0) {
			if (this.getMap().getOnTheMapXY(this.getX() - 1, this.getY())
					.getPermeability() == Permeability.PENETRABLE) {
				this.setX(this.getX() - 1);
				this.setHasMoved();
			}
		}
	}

	public void moveUpM() throws IOException {
		if (this.getY() != 0) {
			if (this.getMap().getOnTheMapXY(this.getX(), this.getY() - 1)
					.getPermeability() == Permeability.PENETRABLE) {
				this.setY(this.getY() - 1);
				this.setHasMoved();
			}
		}
	}

	/*
	 * public void IA1(int px, int py) { px = setpx.random(); }
	 */
	public void doNothing() {
		this.setHasMoved();
	}

	protected void setY(int y) {
		this.getPosition().y = y;
		if (this.isCrashed()) {
			this.die();
		}
	}

	protected void setX(int x) {
		this.getPosition().x = x;
		if (this.isCrashed()) {
			this.die();
		}
	}

	public final int getY() {

		return this.getPosition().y;
	}

	public final int getX() {
		return this.getPosition().x;
	}

	protected void setHasMoved() {
		this.getMap().setMobileHasChanged();
	}

	public IMap getMap() {
		return map;
	}

	public void setMap(IMap map) {
		this.map = map;
	}

	public Boolean isAlive() {
		return alive;
	}

	public void die() {
		this.alive = false;
		this.setHasMoved();
		JOptionPane.showMessageDialog(null, "You loose");
		System.exit(0);

	}

	public Boolean isCrashed() {
		return false;
	}

	public Point getPosition() {
		return this.position;
	}

	public void GGWP() {
		JOptionPane.showMessageDialog(null, "You Win, your score is");
		JOptionPane.showMessageDialog(null, getScore());
		System.exit(0);
	}

	/**
	 * Sets the position.
	 *
	 * @param position
	 *            the position to set
	 */
	public void setPosition(final Point position) {
		this.position = position;
	}

	protected void ImmobilhasChanged(int x, int y) throws IOException {
		this.getMap().getOnTheMapXY(x, y).setSprite(new Sprite(' ', "ground.png"));
		this.getMap().getOnTheMapXY(x, y).setPermeability(Permeability.PENETRABLE);
		this.getMap().getOnTheMapXY(x, y).getSprite().loadImage();

		for (int a = 0; a < this.getMap().getWidth(); a++) {

			for (int z = 0; z < this.getMap().getHeight(); z++) {

				if (this.getMap().getOnTheMapXY(a, z).getSprite().getConsoleImage() == ',') {

					this.getMap().getOnTheMapXY(a, z).setSprite(new Sprite('G', "gate_open.png"));
					this.getMap().getOnTheMapXY(a, z).getSprite().loadImage();
					this.getMap().getOnTheMapXY(a, z).setPermeability(Permeability.WIN);

				}

				else if (this.getMap().getOnTheMapXY(this.getX(), this.getY())
						.getPermeability() == Permeability.OPENGATE) {
					try {
						this.ImmobilhasChanged(this.getX() + 1, this.getY());
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					this.setX(this.getX() + 1);
					this.setHasMoved();

				}
			}

		}
	}

	protected void CoinsHasbeenTaken(int x, int y) throws IOException {
		this.getMap().getOnTheMapXY(x, y).setSprite(new Sprite(' ', "ground.png"));
		this.getMap().getOnTheMapXY(x, y).setPermeability(Permeability.PENETRABLE);
		this.getMap().getOnTheMapXY(x, y).getSprite().loadImage();
		score = score + 1;
		System.out.print("Your score : ");
		System.out.println(score);

	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	/**
	 * Gets the board.
	 *
	 * @return the board
	 */
	protected IBoard getBoard() {
		return this.board;
	}

}
