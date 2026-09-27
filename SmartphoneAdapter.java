public class SmartphoneAdapter implements PowerOutlet {
    private SmartphoneCharger phoneCharger;

    public SmartphoneAdapter(SmartphoneCharger phoneCharger) {
        this.phoneCharger = phoneCharger;
    }

    @Override 
    public void plugIn() {
        System.out.println("Plugging in phone charger.");
        phoneCharger.chargePhone();
    } 
}