package model;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import mobile.Lorann;
import mobile.Masked;
import mobile.Golem;

public class LorannModel implements IModel {

	private IMap map;

	private IMobile lorann;

	private ArrayList<Golem> monster = new ArrayList<Golem>();

	private ArrayList<Masked> monster1 = new ArrayList<Masked>();

	public LorannModel(final int level, final int lorannX, final int lorannY, final int monsterX, final int monsterY)
			throws IOException, SQLException {
		this.setMap(new Map(level));
		this.setLorann(new Lorann(lorannX, lorannY, this.getMap()));

		this.getMonster().add(new Golem(10, 8, map, Permeability.MONSTER));
		this.getMonster1().add(new Masked(5, 5, map, Permeability.MONSTER));

	}

	@Override
	public void getLevelById(int id) throws SQLException {

	}

	public IMobile getLorann() {
		return this.lorann;
	}

	private void setLorann(Lorann lorann) {
		this.lorann = (IMobile) lorann;
	}

	public IMap getMap() {
		return map;
	}

	public void setMap(IMap map) {
		this.map = map;
	}

	public ArrayList<Masked> getMonster1() {
		return monster1;
	}

	public void setMonster1(ArrayList<Masked> monster1) {
		this.monster1 = monster1;
	}

	public ArrayList<Golem> getMonster() {
		return monster;
	}

	public void setMonster(ArrayList<Golem> monster) {
		this.monster = monster;
	}
}
