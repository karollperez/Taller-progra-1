package co.edu.uptc.model;

// Esta clase representa al alcalde
// Uso la cédula como identificador único (ID)
public class Mayor {

    private int id;
    private String name;
    private int age;
    private String politicalParty;
    private int yearsInOffice;

    // Constructor
    public Mayor(int id, String name, int age, String politicalParty, int yearsInOffice) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.politicalParty = politicalParty;
        this.yearsInOffice = yearsInOffice;
    }

    // GETTERS
    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getPoliticalParty() { return politicalParty; }
    public int getYearsInOffice() { return yearsInOffice; }

    // SETTER
    public void setName(String name) { this.name = name; }

    @Override
    public String toString() {
        return "Mayor | ID: " + id +
               " | Name: " + name +
               " | Party: " + politicalParty;
    }
}