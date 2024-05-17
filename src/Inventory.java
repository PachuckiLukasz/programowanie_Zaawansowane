import java.util.LinkedList;
import java.util.List;

public class Inventory {
    private List<Guitar> guitars;

    public Inventory() {
        guitars = new LinkedList<>();
    }

    public void addGuitar(String serialNumber, double price, Builder builder, String model,
                          Type type, int numStrings, Wood backWood, Wood topWood) {
        GuitarSpec spec = new GuitarSpec(builder, model, type, numStrings, backWood, topWood);
        Guitar guitar = new Guitar(serialNumber, price, spec);
        guitars.add(guitar);
    }

    public List<Guitar> search(GuitarSpec searchSpec) {
        List<Guitar> matchingGuitars = new LinkedList<>();
        for (Guitar guitar : guitars) {
            if (guitar.getSpec().matches(searchSpec)) {
                matchingGuitars.add(guitar);
            }
        }
        return matchingGuitars;
    }
}