package entities;

import entities.enums.Color;

public abstract class Shape implements Form {

    private Color color;


    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }


}
