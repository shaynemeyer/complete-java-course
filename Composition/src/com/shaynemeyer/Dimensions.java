package com.shaynemeyer;

/**
 * Created by shayne on 3/4/17.
 */
public class Dimensions {
    private int width;
    private int height;
    private int depth;

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }

    public Dimensions(int width, int height, int depth) {

        this.width = width;
        this.height = height;
        this.depth = depth;
    }
}
