public class Main {
    public static void main(String args[]) {
        Laptop laptop = new Laptop();
        Refrigerator ref = new Refrigerator();
        SmartphoneCharger phoneCharger = new SmartphoneCharger();

        PowerOutlet LaptopAdapter = new LaptopAdapter(laptop);
        PowerOutlet RefrigeratorAdapter = new RefrigeratorAdapter(ref);
        PowerOutlet SmartphoneAdapter = new SmartphoneAdapter(phoneCharger);
        
        System.out.println("\n=== Powering Outlet ===");
        LaptopAdapter.plugIn();
        RefrigeratorAdapter.plugIn();
        SmartphoneAdapter.plugIn();
        System.out.println("=== Power Outlet working successfully. ===\n");
    }
}