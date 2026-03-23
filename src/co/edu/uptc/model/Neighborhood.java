package co.edu.uptc.model;

// Esta clase representa un barrio
// Aplico HERENCIA porque un barrio también es una ciudad pero con más atributos
public class Neighborhood extends City {

    private int neighborhoodId;
    private int averageStratum;
    private double neighborhoodArea;

    // Constructor
    public Neighborhood(int neighborhoodId, int postalCode, String name, String country,
                        int population, double area, String climate,
                        int averageStratum, double neighborhoodArea) {

        super(postalCode, name, country, population, area, climate);
        this.neighborhoodId = neighborhoodId;
        this.averageStratum = averageStratum;
        this.neighborhoodArea = neighborhoodArea;
    }

    // GETTERS
    public int getNeighborhoodId() { return neighborhoodId; }
    public int getAverageStratum() { return averageStratum; }
    public double getNeighborhoodArea() { return neighborhoodArea; }

    // Método toString sobrescrito
    @Override
    public String toString() {
        return "Neighborhood | ID: " + neighborhoodId +
               " | Name: " + getName() +
               " | Stratum: " + averageStratum;
    }
}