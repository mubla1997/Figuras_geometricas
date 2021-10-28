package org.practica.Figures_Geometriques.DAOs;

import org.practica.Figures_Geometriques.Models.Figure;

import java.util.List;

public interface FigureDAO {
    Figure saveFigure(String name, String typeFigure, String color, int size, int coordenateX, int coordenateY);
    List<Figure> showFigures();
}
