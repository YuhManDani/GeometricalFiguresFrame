package PackageGeometricalFigures;
import java.awt.Color;

public abstract class GeometricalFigures {
    private Color color;
    private static int thickness = 4;
    static int zoom = 0;

    

    public GeometricalFigures(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public static int getThickness() {
        return thickness;
    }

    public static int getZoom() {
        return zoom;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public static void setThickness(int thickness) {
        GeometricalFigures.thickness = thickness;
    }

    public static void setZoom(int zoom) {
        GeometricalFigures.zoom = zoom;
    }
    
    
}