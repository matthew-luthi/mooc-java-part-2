package movingfigure;

import java.awt.Graphics;

public class Box extends Figure {
    private int width, height;
    
    public Box(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.fillRect(getX(), getY(), width, height);
    }
    
}
