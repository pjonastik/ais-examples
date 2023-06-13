package org.example.inheritance;

import org.example.color.ColorUtil;
import org.example.color.ShapeColor;

public class Circle extends Shape {

    public Circle(ShapeColor color) {
        super(color);
    }

    @Override
    public void draw() {
        String circle =
            ColorUtil.colorText(getColor(), "         , - ~ ~ ~ - ,\n")  +
            ColorUtil.colorText(getColor(),"     , '               ' ,\n") +
            ColorUtil.colorText(getColor(),"   ,                       ,\n") +
            ColorUtil.colorText(getColor(),"  ,                         ,\n") +
            ColorUtil.colorText(getColor()," ,                           ,\n") +
            ColorUtil.colorText(getColor()," ,                           ,\n") +
            ColorUtil.colorText(getColor()," ,                           ,\n") +
            ColorUtil.colorText(getColor(),"  ,                         ,\n") +
            ColorUtil.colorText(getColor(),"   ,                       ,\n") +
            ColorUtil.colorText(getColor(),"     ,                  , '\n") +
            ColorUtil.colorText(getColor(),"       ' - , _ _ _ ,  '");
        System.out.println(circle);
    }

}
