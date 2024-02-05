package com.company.drawShape2D;

public class DrawShape2D extends ShapeDrawer {

    @Override
    public void clear_shape() {
        System.out.println("DrawShape2D clear_shape");
    }

    @Override
    public void draw_border() {
        System.out.println("DrawShape2D draw_border");

    }

    @Override
    public void fill_shape_with_color() {
        System.out.println("DrawShape2D fill_shape_with_color");

    }

    @Override
    public void refine() {
        System.out.println("DrawShape2D refine");

    }
}
