package org.practica.Figures_Geometriques.DAOs;

import org.practica.Figures_Geometriques.Models.Figure;

public interface FigureDAO {
    Figure getFigure(String name,String typeFigure,String color,int size,int coordenateX,int coordenateY);
}
