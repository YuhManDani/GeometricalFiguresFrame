package PackageGeometricalFigures;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;


public class Rectangle extends GeometricalFigures implements Drawable {
    
    int x1,y1,width,height;

    public Rectangle(Color color, int x1, int y1, int width, int height) {
        super(color);
        this.x1 = x1;
        this.y1 = y1;
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics g) {
      Graphics2D g2d = (Graphics2D)g;
      g2d.setColor(getColor());
      g2d.setStroke(new BasicStroke(GeometricalFigures.getThickness()));
      g.drawRect(x1, y1, width, height);
    }

    @Override
    public void printImprimir() {
     System.out.println("Soy un rectangulo");
    }
    
    

}
