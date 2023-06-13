package org.example.inheritance;

import org.example.color.ColorUtil;
import org.example.color.ShapeColor;

import java.awt.*;

public class Rectangle extends Shape{
    public Rectangle(ShapeColor color) {
        super(color);
    }

    @Override
    public void draw() {
        String circle =
                ColorUtil.colorText(getColor(), "+--------------------------+\n")  +
                ColorUtil.colorText(getColor(), "+                          +\n")  +
                ColorUtil.colorText(getColor(), "+                          +\n")  +
                ColorUtil.colorText(getColor(), "+--------------------------+\n");
        System.out.println(circle);
    }
}
