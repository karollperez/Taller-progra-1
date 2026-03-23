package co.edu.uptc.model;

// Esta clase representa una ciudad dentro del sistema
// Uso el código postal como identificador único (ID)
public class City {

    private int postalCode;
    private String name;
    private String country;
    private int population;
    private double area;
    private String climate;

    // Constructor
    public City(int postalCode, String name, String country, int population, double area, String climate) {
        this.postalCode = postalCode;
        this.name = name;
        this.country = country;
        this.population = population;
        this.area = area;
        this.climate = climate;
    }

    // GETTERS
    public int getPostalCode() { return postalCode; }
    public String getName() { return name; }
    public String getCountry() { return country; }
    public int getPopulation() { return population; }
    public double getArea() { return area; }
    public String getClimate() { return climate; }

    // SETTERS
    public void setName(String name) { this.name = name; }
    public void setCountry(String country) { this.country = country; }
    public void setPopulation(int population) { this.population = population; }
    public void setArea(double area) { this.area = area; }
    public void setClimate(String climate) { this.climate = climate; }

    // Método para mostrar la información de forma organizada
    @Override
    public String toString() {
        return "City | Code: " + postalCode +
               " | Name: " + name +
               " | Country: " + country +
               " | Population: " + population;
    }
}