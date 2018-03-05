public class Customer {
    private String customerName;
    private String customerPhone;
    private String customerAddress;
    private double squareFootage;

    Customer() {
        // Empty constructor so I can use get and set methods for variable initialization
    }
    Customer(String name, String phone, String address, double sqft) {
        customerName = name;
        customerPhone = phone;
        customerAddress = address;
        squareFootage = sqft;
    }

    public String getName() {
        return customerName;
    }

    public void setName(String name) {
        customerName = name;
    }

    public String getPhone() {
        return customerPhone;
    }

    public void setPhone(String phone) {
        customerPhone = phone;
    }

    public String getAddress() {
        return customerAddress;
    }

    public void setAddress(String address) {
        customerAddress = address;
    }

    public double getSquareFootage() {
        return squareFootage;
    }

    public void setSquareFootage(double sqft) {
        squareFootage = sqft;
    }
}
