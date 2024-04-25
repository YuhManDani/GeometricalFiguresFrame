package PackageGeometricalFigures;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class line extends GeometricalFigures implements Drawable {
    int x1,y1,x2,y2;

    public line(Color color, int x1, int y1, int x2, int y2) {
        super(color);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    
    @Override
    public void draw(Graphics g) {
            Graphics2D g2d = (Graphics2D)g;
            g2d.setColor(getColor());
            g2d.setStroke(new BasicStroke(GeometricalFigures.getThickness()));
            g.drawLine(x1, y1, x2, y2);
    }

    @Override
    public void printImprimir() {
      System.out.println("Soy una linea");
    }


}

