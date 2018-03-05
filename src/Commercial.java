import java.text.NumberFormat;

public class Commercial extends Customer {
    private String propertyName;
    private boolean multiProperty;
    private final double COMMERCIAL_RATE = 5;  // per 1000sqft

    Commercial() {
        // Empty constructor
    }

    Commercial(String pName, boolean multi, String name, String phone, String address, double sqft){
        super(name, phone, address, sqft);
        propertyName = pName;
        multiProperty = multi;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String name) {
        propertyName = name;
    }

    public boolean getMultiProperty() {
        return multiProperty;
    }

    public void setMultiProperty(boolean multi) {
        multiProperty = multi;
    }

    public void weeklyCharge() {
        double weeklyCost;
        NumberFormat format = NumberFormat.getCurrencyInstance();

        weeklyCost = COMMERCIAL_RATE * (getSquareFootage() / 1000);
        if (multiProperty) {
            // Give a 10% discount
            weeklyCost = weeklyCost - (weeklyCost * 0.1);
        }

        // Print all the data and provide the estimate
        System.out.println(getName());
        System.out.println(getPhone());
        System.out.println(getAddress());
        System.out.println(propertyName);
        System.out.println("Square Footage: " + getSquareFootage());
        System.out.println("Multiple Properties: " + multiProperty);
        System.out.println("Weekly Cost: " + format.format(weeklyCost));
    }
}
