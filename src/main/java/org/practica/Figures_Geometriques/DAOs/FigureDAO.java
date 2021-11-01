package org.practica.Figures_Geometriques.DAOs;

import org.practica.Figures_Geometriques.Models.Figure;


import java.util.List;

public interface FigureDAO {
    Figure getFigure(String nameFigure, String username_own);
    List<Figure> showFigures();
    List<Figure> showFiguresUser(String username);
    void createFigure(Figure figure);
    void deleteFigure(Figure figure);


}
