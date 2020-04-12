package GameObjects;

import GIS.Map;
import GUI.Gui_dialog;
import Geom.Point2D;
import game.GameBoard;

/**

 */
public class Player extends game_object {

	public static String picture = "player.jpg";
	private double degree = 30;

	public Player(int id, Map map, Point2D location, double d) {
		super(id, map.global2pixel(location));
	}

	public double getDegree() {
		return degree;
	}
		
	public void setDegree(double degree) {
		this.degree = degree;
	}


}
