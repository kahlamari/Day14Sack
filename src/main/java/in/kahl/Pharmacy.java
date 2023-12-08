package in.kahl;

import java.util.HashMap;
import java.util.Map;

public class Pharmacy {
    Map<String, Medication> stock = new HashMap<>();

    public int getCount() {
        // TODO: should filter by availability
        return stock.size();
    }

    public void save(Medication medication) {
        stock.put(medication.getName(), medication);
    }

    public Medication find(String medicationName) {
        return stock.get(medicationName);
    }

    public void delete(String medicationName) {
        stock.remove(medicationName);
    }

    @Override
    public String toString() {
        return "Pharmacy{" +
                "stock=" + stock +
                '}';
    }
}
