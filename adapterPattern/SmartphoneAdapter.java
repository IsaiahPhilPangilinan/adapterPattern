package adapterPattern;

public class SmartphoneAdapter  implements PowerOutlet {

    private Smartphone smartphone;

    public SmartphoneAdapter(Smartphone smartphone) {
        this.smartphone = smartphone;
    }

    @Override
    public String plugIn() {
        return smartphone.chargePhone();
    }

}
