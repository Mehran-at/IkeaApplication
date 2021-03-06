//    Create the Wardrobe class that has a list of String representing its different parts. It implements Furniture.
//    Its add method adds the part to its parts. Implement its toString method to display its parts.
import java.util.ArrayList;
import java.util.List;

public class Wardrobe implements Furniture{
    List<String> parts = new ArrayList<>();


    @Override
    public void add(String part) {
        parts.add(part);
    }

    @Override
    public String toString() {
        return "Wardrobe{" +
                "parts=" + parts +
                '}';
    }

}