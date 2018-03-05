import java.text.NumberFormat;

public class Residential extends Customer{
    private boolean seniorDiscount = false;
    private final double RESIDENTIAL_RATE = 6;  // per 1000sqft

    Residential() {
        // Empty Constructor
    }

    Residential(boolean senior, String name, String phone, String address, double sqft){
        super(name, phone, address, sqft);
        seniorDiscount = senior;
    }

    public boolean getSenior() {
        return seniorDiscount;
    }

    public void setSenior(boolean senior) {
        seniorDiscount = senior;
    }

    public void weeklyCharge() {
        double weeklyCost;
        NumberFormat format = NumberFormat.getCurrencyInstance();

        weeklyCost = RESIDENTIAL_RATE * (getSquareFootage() / 1000);
        if (seniorDiscount) {
            // Give a 15% discount
            weeklyCost = weeklyCost - (weeklyCost * 0.15);
        }

        // Print all the data to the user and provide the estimate
        System.out.println(getName());
        System.out.println(getPhone());
        System.out.println(getAddress());
        System.out.println("Square Footage: " + getSquareFootage());
        System.out.println("Senior Discount: " + seniorDiscount);
        System.out.println("Weekly Cost: " + format.format(weeklyCost));
    }
}