package org.example.inheritance;

import org.example.color.ColorUtil;
import org.example.color.ShapeColor;

import java.util.Objects;

public abstract class Shape {
    protected final ShapeColor color;

    public Shape(ShapeColor color) {
        this.color = color;
    }


    public ShapeColor getColor() {
        return color;
    }

    public abstract void draw();
//    {
//        String coloredCircle = ColorUtil.colorText(color, "Shape.draw()");
//        System.out.println(coloredCircle);
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return Objects.equals(color, shape.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color=" + color +
                '}';
    }
}
