package co.edu.uptc.run;

import java.util.ArrayList;
import java.util.Scanner;
import co.edu.uptc.model.*;

// Clase principal del sistema
// Aquí manejo todas las operaciones CRUD de cada entidad
public class Main {

    // Listas dinámicas donde guardo la información
    static ArrayList<City> cities = new ArrayList<>();
    static ArrayList<Hospital> hospitals = new ArrayList<>();
    static ArrayList<Mayor> mayors = new ArrayList<>();
    static ArrayList<MunicipalBuilding> buildings = new ArrayList<>();
    static ArrayList<Neighborhood> neighborhoods = new ArrayList<>();

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int option;

        // Menú principal en español como pidió el profe
        do {
            System.out.println("\n===== SISTEMA DE CIUDADES =====");
            System.out.println("1. Crear registro");
            System.out.println("2. Consultar registro");
            System.out.println("3. Actualizar registro");
            System.out.println("4. Eliminar registro");
            System.out.println("5. Mostrar todos los registros");
            System.out.println("0. Salir");

            option = readInt("Seleccione una opción: ");

            switch (option) {
                case 1: createMenu(); break;
                case 2: searchMenu(); break;
                case 3: updateMenu(); break;
                case 4: deleteMenu(); break;
                case 5: showAll(); break;
                case 0: System.out.println("Programa finalizado."); break;
                default: System.out.println("Opción inválida.");
            }

        } while(option != 0);
    }

    // ================= VALIDACIONES =================

    // Valido IDs (solo números)
    public static int readId(String msg) {
        while (true) {
            System.out.print(msg);
            String input = scanner.nextLine();

            if (!input.matches("\\d+")) {
                System.out.println("Error: solo números.");
                continue;
            }
            return Integer.parseInt(input);
        }
    }

    public static int readPostalCode() {
        while (true) {
            System.out.print("Código postal (6 dígitos): ");
            String input = scanner.nextLine();

            if (!input.matches("\\d{6}")) {
                System.out.println("Error: deben ser 6 números.");
                continue;
            }
            return Integer.parseInt(input);
        }
    }

    public static String readString(String msg) {
        while (true) {
            System.out.print(msg);
            String value = scanner.nextLine();

            if (!value.matches("[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+")) {
                System.out.println("Error: solo letras.");
                continue;
            }
            return value;
        }
    }

    public static int readInt(String msg) {
        while (true) {
            try {
                System.out.print(msg);
                return Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Error: número inválido.");
            }
        }
    }

    public static double readDouble(String msg) {
        while (true) {
            try {
                System.out.print(msg);
                return Double.parseDouble(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Error: número inválido.");
            }
        }
    }

    // ================= MENÚS =================

    public static void createMenu() {
        System.out.println("1.City 2.Hospital 3.Mayor 4.Building 5.Neighborhood");
        int op = readInt("Seleccione: ");

        switch (op) {
            case 1: createCity(); break;
            case 2: createHospital(); break;
            case 3: createMayor(); break;
            case 4: createBuilding(); break;
            case 5: createNeighborhood(); break;
        }
    }

    public static void searchMenu() {
        System.out.println("1.City 2.Hospital 3.Mayor 4.Building 5.Neighborhood");
        int op = readInt("Seleccione: ");

        switch (op) {
            case 1: searchCity(); break;
            case 2: searchHospital(); break;
            case 3: searchMayor(); break;
            case 4: searchBuilding(); break;
            case 5: searchNeighborhood(); break;
        }
    }

    public static void updateMenu() {
        System.out.println("1.City 2.Hospital 3.Mayor 4.Building 5.Neighborhood");
        int op = readInt("Seleccione: ");

        switch (op) {
            case 1: updateCity(); break;
            case 2: updateHospital(); break;
            case 3: updateMayor(); break;
            case 4: updateBuilding(); break;
            case 5: updateNeighborhood(); break;
        }
    }

    public static void deleteMenu() {
        System.out.println("1.City 2.Hospital 3.Mayor 4.Building 5.Neighborhood");
        int op = readInt("Seleccione: ");

        switch (op) {
            case 1: deleteCity(); break;
            case 2: deleteHospital(); break;
            case 3: deleteMayor(); break;
            case 4: deleteBuilding(); break;
            case 5: deleteNeighborhood(); break;
        }
    }

    // ================= CRUD CITY =================
    public static void createCity() {
        cities.add(new City(readPostalCode(), readString("Name: "), readString("Country: "),
                readInt("Population: "), readDouble("Area: "), readString("Climate: ")));
    }

    public static void searchCity() {
        int code = readPostalCode();
        for (City c : cities)
            if (c.getPostalCode() == code)
                System.out.println(c);
    }

    public static void updateCity() {
        int code = readPostalCode();
        for (City c : cities)
            if (c.getPostalCode() == code)
                c.setName(readString("New name: "));
    }

    public static void deleteCity() {
        int code = readPostalCode();
        cities.removeIf(c -> c.getPostalCode() == code);
    }

    // ================= CRUD HOSPITAL =================
    public static void createHospital() {
        hospitals.add(new Hospital(readId("Hospital ID: "), readString("Name: "),
                readString("Address: "), readInt("Beds: "), readString("Type: ")));
    }

    public static void searchHospital() {
        int id = readId("Hospital ID: ");
        for (Hospital h : hospitals)
            if (h.getHospitalId() == id)
                System.out.println(h);
    }

    public static void updateHospital() {
        int id = readId("Hospital ID: ");
        for (Hospital h : hospitals)
            if (h.getHospitalId() == id)
                h.setName(readString("New name: "));
    }

    public static void deleteHospital() {
        int id = readId("Hospital ID: ");
        hospitals.removeIf(h -> h.getHospitalId() == id);
    }

    // ================= CRUD MAYOR =================
    public static void createMayor() {
        mayors.add(new Mayor(readId("Cédula: "), readString("Name: "),
                readInt("Age: "), readString("Party: "), readInt("Years: ")));
    }

    public static void searchMayor() {
        int id = readId("Cédula: ");
        for (Mayor m : mayors)
            if (m.getId() == id)
                System.out.println(m);
    }

    public static void updateMayor() {
        int id = readId("Cédula: ");
        for (Mayor m : mayors)
            if (m.getId() == id)
                m.setName(readString("New name: "));
    }

    public static void deleteMayor() {
        int id = readId("Cédula: ");
        mayors.removeIf(m -> m.getId() == id);
    }

    // ================= CRUD BUILDING =================
    public static void createBuilding() {
        buildings.add(new MunicipalBuilding(readId("Building ID: "), readString("Name: "),
                readInt("Floors: "), readInt("Year: "), readString("Type: ")));
    }

    public static void searchBuilding() {
        int id = readId("Building ID: ");
        for (MunicipalBuilding b : buildings)
            if (b.getBuildingId() == id)
                System.out.println(b);
    }

    public static void updateBuilding() {
        int id = readId("Building ID: ");
        for (MunicipalBuilding b : buildings)
            if (b.getBuildingId() == id)
                b.setName(readString("New name: "));
    }

    public static void deleteBuilding() {
        int id = readId("Building ID: ");
        buildings.removeIf(b -> b.getBuildingId() == id);
    }

    // ================= CRUD NEIGHBORHOOD =================
    public static void createNeighborhood() {
        neighborhoods.add(new Neighborhood(
                readId("Neighborhood ID: "),
                readPostalCode(),
                readString("Name: "),
                readString("Country: "),
                readInt("Population: "),
                readDouble("Area: "),
                readString("Climate: "),
                readInt("Stratum: "),
                readDouble("Neighborhood Area: ")
        ));
    }

    public static void searchNeighborhood() {
        int id = readId("Neighborhood ID: ");
        for (Neighborhood n : neighborhoods)
            if (n.getNeighborhoodId() == id)
                System.out.println(n);
    }

    public static void updateNeighborhood() {
        int id = readId("Neighborhood ID: ");
        for (Neighborhood n : neighborhoods)
            if (n.getNeighborhoodId() == id)
                n.setName(readString("New name: "));
    }

    public static void deleteNeighborhood() {
        int id = readId("Neighborhood ID: ");
        neighborhoods.removeIf(n -> n.getNeighborhoodId() == id);
    }

    // ================= MOSTRAR TODO =================
    public static void showAll() {
        cities.forEach(System.out::println);
        hospitals.forEach(System.out::println);
        mayors.forEach(System.out::println);
        buildings.forEach(System.out::println);
        neighborhoods.forEach(System.out::println);
    }
}