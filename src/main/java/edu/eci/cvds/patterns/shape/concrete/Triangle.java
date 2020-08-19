package edu.eci.cvds.patterns.shape.concrete;
import edu.eci.cvds.patterns.shape.Shapes;
import java.awt.*;

public class Triangle implements Shapes {

    @Override
    public int getNumberOfEdges() {
        return 3;
    }
}
