package co.edu.uptc.model;

// Esta clase representa un hospital
// Es un ejemplo de AGREGACIÓN porque puede existir independiente de la ciudad
public class Hospital {

    private int hospitalId;
    private String name;
    private String address;
    private int numberOfBeds;
    private String type;

    // Constructor
    public Hospital(int hospitalId, String name, String address, int numberOfBeds, String type) {
        this.hospitalId = hospitalId;
        this.name = name;
        this.address = address;
        this.numberOfBeds = numberOfBeds;
        this.type = type;
    }

    // GETTERS
    public int getHospitalId() { return hospitalId; }
    public String getName() { return name; }
    public String getAddress() { return address; }
    public int getNumberOfBeds() { return numberOfBeds; }
    public String getType() { return type; }

    // SETTER
    public void setName(String name) { this.name = name; }

    @Override
    public String toString() {
        return "Hospital | ID: " + hospitalId +
               " | Name: " + name +
               " | Beds: " + numberOfBeds;
    }
}