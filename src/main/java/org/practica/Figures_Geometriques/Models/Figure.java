package org.practica.Figures_Geometriques.Models;

import java.util.Date;

public class Figure {
    String name;
    String typeFigure;
    String color;
    int size;
    int coordenateX;
    int coordenateY;
    String username_own;
    Date date;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeFigure() {
        return typeFigure;
    }

    public void setTypeFigure(String typeFigure) {
        this.typeFigure = typeFigure;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCoordenateX() {
        return coordenateX;
    }

    public void setCoordenateX(int coordenateX) {
        this.coordenateX = coordenateX;
    }

    public int getCoordenateY() {
        return coordenateY;
    }

    public void setCoordenateY(int coordenateY) {
        this.coordenateY = coordenateY;
    }

    public String getUsername_own() {
        return username_own;
    }

    public void setUsername_own(String username_own) {
        this.username_own = username_own;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
