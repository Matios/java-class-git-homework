package models;

import misc.Renderable;

abstract public class Model implements Renderable {
    private double x;
    private double y;
    private double xVelocity;
    private double yVelocity;
    private int height;
    private int width;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getxVelocity() {
        return xVelocity;
    }

    public void setxVelocity(double xVelocity) {
        this.xVelocity = xVelocity;
    }

    public double getyVelocity() {
        return yVelocity;
    }

    public void setyVelocity(double yVelocity) {
        this.yVelocity = yVelocity;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getLeftX() {
        return x;
    }

    public double getRightX() {
        return x + width;
    }

    public double getTopY() {
        return y + height;
    }

    public double getBottomY() {
        return y;
    }
}
