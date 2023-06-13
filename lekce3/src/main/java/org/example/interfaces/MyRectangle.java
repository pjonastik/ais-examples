package org.example.interfaces;

import org.example.color.ColorUtil;
import org.example.color.ShapeColor;

import java.util.Objects;

public class MyRectangle implements IShape {

    private ShapeColor color;

    public MyRectangle(ShapeColor color) {
        this.color = color;
    }

    @Override
    public void draw() {
        String rectangle =
                ColorUtil.colorText(color, "+--------------------------+\n")  +
                ColorUtil.colorText(color, "+                          +\n")  +
                ColorUtil.colorText(color, "+                          +\n")  +
                ColorUtil.colorText(color, "+--------------------------+\n");
        System.out.println(rectangle);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyRectangle myCircle = (MyRectangle) o;
        return color == myCircle.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }

    @Override
    public String toString() {
        return "MyRectangle{" +
                "color=" + color +
                '}';
    }
}
