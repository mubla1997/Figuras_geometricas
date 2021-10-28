package org.practica.Figures_Geometriques.Services;

import org.practica.Figures_Geometriques.DAOs.FigureDAO;
import org.practica.Figures_Geometriques.DAOs.FigureDAOImpl;
import org.practica.Figures_Geometriques.Models.Figure;

import java.util.List;

public class FigureService {
    FigureDAO figureDAO = new FigureDAOImpl();

    public Figure ObtainFigure(String name, String typeFigure, String color, int size, int coordenateX, int coordenateY){

        return figureDAO.saveFigure(name,typeFigure,color,size,coordenateX,coordenateY);
    }
    public List <Figure> ObtainAllFigure(){

        return figureDAO.showFigures();
    }
}
