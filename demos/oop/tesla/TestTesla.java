public class TestTesla {

    public static void main(String[] args) {
        Tesla tesla = new Tesla();
        System.out.println(tesla.getModel());
        Tesla tylersTesla = new Tesla();
        System.out.println(tesla == tylersTesla);
        tylersTesla.setYear(2010);
        System.out.println(tylersTesla.getYear());
        tylersTesla.drive();
        tylersTesla.drive();
        tylersTesla.drive();
        tesla.drive();
        tesla.drive(6.5);
        Tesla richards_tesla = new Tesla("S", 2023, "black", false, 0.0);
        System.out.println(tylersTesla.getMileage());
        System.out.println(richards_tesla);
        Tesla braxtonsTesla = new Tesla(2023, "red", false, 0);
        System.out.println(braxtonsTesla);
        System.out.println(tylersTesla);
        System.out.println(tesla);
        Tesla.displayCEO();
        

    }
    
}
