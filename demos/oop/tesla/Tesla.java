class Tesla {

    private String model;
    private int year;
    private String color;
    private boolean autoPilotActive;
    private double mileage = 0;
    private static String CEO = "Elon Musk";
    private static int TotalTeslas = 0;

    public void drive(){
        this.mileage += 10;
        System.out.println("wooosh");
        System.out.printf("Your tesla now has %f miles on it", this.mileage);
    }

    public void drive(double miles){
        this.mileage += miles;
        System.out.println("wooosh");
        System.out.printf("Your tesla now has %f miles on it", this.mileage);
    }

    public Tesla(){
    
    }

 

    public Tesla(String model, int year, String color, boolean autoPilotActive, double mileage) {
        this.model = model;
        this.year = year;
        this.color = color;
        this.autoPilotActive = autoPilotActive;
        this.mileage = mileage;
    }

    public Tesla( int year, String color, boolean autoPilotActive, double mileage) {

        this.model = "s";
        this.year = year;
        this.color = color;
        this.autoPilotActive = autoPilotActive;
        this.mileage = mileage;
    }

    public static void displayCEO(){
        System.out.println(Tesla.CEO);
    }
    


    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isAutoPilotActive() {
        return this.autoPilotActive;
    }

    public boolean getAutoPilotActive() {
        return this.autoPilotActive;
    }

    public void setAutoPilotActive(boolean autoPilotActive) {
        this.autoPilotActive = autoPilotActive;
    }


    public double getMileage() {
        return this.mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }


    @Override
    public String toString() {
        return "{" +
            " model='" + getModel() + "'" +
            ", year='" + getYear() + "'" +
            ", color='" + getColor() + "'" +
            ", autoPilotActive='" + isAutoPilotActive() + "'" +
            ", mileage='" + getMileage() + "'" +
            "}";
    }


}