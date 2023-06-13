package org.example.inheritance;

import org.example.color.ColorUtil;
import org.example.color.ShapeColor;

public class Rectangle extends Shape {
    public Rectangle(ShapeColor color) {
        super(color);
    }

    @Override
    public void draw() {
        String circle =
                ColorUtil.colorText(color, "+--------------------------+\n")  +
                ColorUtil.colorText(color, "+                          +\n")  +
                ColorUtil.colorText(color, "+                          +\n")  +
                ColorUtil.colorText(color, "+--------------------------+\n");
        System.out.println(circle);
    }
}
