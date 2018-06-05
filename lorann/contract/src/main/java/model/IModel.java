package model;

import java.sql.SQLException;

/**
 * <h1>The Interface IModel.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public interface IModel {

	/**
	 * Gets the level by id.
	 *
	 * @param id
	 *            the id
	 * @return the example by id
	 * @throws SQLException
	 *             the SQL exception
	 */
	void getLevelById(int id) throws SQLException;

	IMobile getLorann();

	//ArrayList<Golem> getMonster();

}
