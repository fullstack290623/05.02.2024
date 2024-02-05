package com.company.drawShape2D;

public  abstract class ShapeDrawer {
    public abstract void clear_shape();

    public abstract void draw_border();

    public abstract void fill_shape_with_color();

    public abstract void refine();


    public final void run() {
        clear_shape(); // 1
        draw_border(); // 2
        fill_shape_with_color(); // 3
        refine(); // 4
    }


}
