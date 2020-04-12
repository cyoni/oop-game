package GIS;

import Geom.Geom_element;
import Geom.Point2D;

/**
 * This interface represents a GIS element with geometric representation and meta data such as:
 * Orientation, color, string, timing
 *
 */
public interface GIS_element {
	public Geom_element getGeom();
	public Meta_data getData();
	public void translate(Point2D vec);
}
