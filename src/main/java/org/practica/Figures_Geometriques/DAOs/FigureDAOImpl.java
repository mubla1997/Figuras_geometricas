package org.practica.Figures_Geometriques.DAOs;

import org.practica.Figures_Geometriques.Models.Figure;

import java.util.ArrayList;
import java.util.List;

public class FigureDAOImpl implements FigureDAO {

    List<Figure> listFigure = new ArrayList <>();

    @Override
    public Figure getFigure(String name, String typeFigure, String color, int size, int coordenateX, int coordenateY) {

        Figure figure = new Figure();
        figure.setName(name);
        figure.setTypeFigure(typeFigure);
        figure.setColor(color);
        figure.setSize(size);
        figure.setCoordenateX(coordenateX);
        figure.setCoordenateY(coordenateY);
        listFigure.add(figure);
        return figure;
    }

    @Override
    public List <Figure> showFigures() {
        return listFigure;
    }
}
