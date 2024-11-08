package F_ObjectsAndClasses.E07_GroomingSalon;

import java.util.*;

public class GroomingSalon {

    private int capacity;
    private List<Pet> petsData;

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public GroomingSalon(int capacity) {
        this.capacity = capacity;
    }

    public void add(Pet pet) {
        if (this.petsData.size() < this.capacity) {
            this.petsData.add(pet);
        }
    }

    public boolean remove(String name) {
        for (Pet petName : this.petsData) {
            if (name.equals(petName.getName())) {
                this.petsData.remove(petName);
                return true;
            }
        }
        return false;
    }

    public Pet get(String bella, String mia) {
    }

    public boolean getCount() {
    }

    public boolean getStatistics() {
    }
}
