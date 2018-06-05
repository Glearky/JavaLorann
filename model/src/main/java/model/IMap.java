package model;

import java.util.ArrayList;
import java.util.Observable;

import element.Element;

public interface IMap {

	void setMobileHasChanged();

	int getHeight();

	Element getOnTheMapXY(int x, int y);

	Observable getObservable();

	int getWidth();
	
	ArrayList<Element> getMonster();

}
