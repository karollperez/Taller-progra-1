package co.edu.uptc.model;

// Esta clase representa un edificio municipal
// Es COMPOSICIÓN porque depende de la ciudad
public class MunicipalBuilding {

    private int buildingId;
    private String name;
    private int floors;
    private int yearBuilt;
    private String type;

    // Constructor
    public MunicipalBuilding(int buildingId, String name, int floors, int yearBuilt, String type) {
        this.buildingId = buildingId;
        this.name = name;
        this.floors = floors;
        this.yearBuilt = yearBuilt;
        this.type = type;
    }

    // GETTERS
    public int getBuildingId() { return buildingId; }
    public String getName() { return name; }
    public int getFloors() { return floors; }
    public int getYearBuilt() { return yearBuilt; }
    public String getType() { return type; }

    // SETTER
    public void setName(String name) { this.name = name; }

    @Override
    public String toString() {
        return "Building | ID: " + buildingId +
               " | Name: " + name +
               " | Floors: " + floors;
    }
}