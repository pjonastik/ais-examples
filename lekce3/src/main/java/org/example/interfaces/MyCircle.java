package org.example.interfaces;

import org.example.color.ColorUtil;
import org.example.color.ShapeColor;

import java.util.Objects;

public class MyCircle implements IShape {

    private ShapeColor color;

    public MyCircle(ShapeColor color) {
        this.color = color;
    }

    @Override
    public void draw() {
        String circle =
                ColorUtil.colorText(color, "         , - ~ ~ ~ - ,\n")  +
                ColorUtil.colorText(color,"     , '               ' ,\n") +
                ColorUtil.colorText(color,"   ,                       ,\n") +
                ColorUtil.colorText(color,"  ,                         ,\n") +
                ColorUtil.colorText(color," ,                           ,\n") +
                ColorUtil.colorText(color," ,                           ,\n") +
                ColorUtil.colorText(color," ,                           ,\n") +
                ColorUtil.colorText(color,"  ,                         ,\n") +
                ColorUtil.colorText(color,"   ,                       ,\n") +
                ColorUtil.colorText(color,"     ,                  , '\n") +
                ColorUtil.colorText(color,"       ' - , _ _ _ ,  '");
        System.out.println(circle);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyCircle myCircle = (MyCircle) o;
        return color == myCircle.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }

    @Override
    public String toString() {
        return "MyCircle{" +
                "color=" + color +
                '}';
    }
}
