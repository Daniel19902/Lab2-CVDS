package edu.eci.cvds.patterns.shape;
import edu.eci.cvds.patterns.shape.concrete.*;
public class ShapeFactory {


    public static Shapes create(RegularShapeType type) {
        switch(type){
            case Triangle:
                return new Triangle();
            case Quadrilateral:
                return new Quadrilateral();
            case Pentagon:
                return new Pentagon();
            case Hexagon:
                return new Hexagon();
            default:
                return null;
        }
    }
}
