import java.util.Arrays;
import java.util.List;

public class Shoe {
    private int size;
    private String colour, brand, type, gender;
    private double price;

    public Shoe(int size, String colour, String brand, String type, String gender, double price) {
        setSize(size);
        setColour(colour);
        setBrand(brand);
        setType(type);
        setGender(gender);
        setPrice(price);
    }

    public void setSize(int size) {
        if (size >= 2 && size <=24)
            this.size = size;
        else
            throw new IllegalArgumentException("shoe size must be 2 to 24");
    }

    public void setColour(String colour) {
        List<String> colourOptions = Arrays.asList("brown","blue","yellow","white","black");
        if (colourOptions.contains(colour))
            this.colour = colour;
        else
            throw new IllegalArgumentException("Colour must be one of "+colourOptions);
    }

    public void setBrand(String brand) {
        List<String> validBrands = Arrays.asList("Nike","Addidas","Li-ning","Reebox","Under Armour","Fox");
        if (validBrands.contains(brand))
            this.brand = brand;
        else
            throw new IllegalArgumentException("Shoe brand must be in the list "+validBrands);
    }

    public void setType(String type) {
        List<String> validTypes = Arrays.asList("running","hiking","dress","water","lifting","work");
        if (validTypes.contains(type))
            this.type = type;
        else
            throw new IllegalArgumentException("type must be in the list "+type);
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
