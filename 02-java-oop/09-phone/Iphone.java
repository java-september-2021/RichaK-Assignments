public class Iphone extends Phone implements Ringable{

    public Iphone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }

    @Override
    public void displayInfo() {
        System.out.println("Iphone " + getVersionNumber() + " from " + getCarrier());

    }

    @Override
    public String ring() {
        String ringtone = getRingTone();
        return ringtone;
    }

    @Override
    public String unlock() {
        return "fingerprint";
    }
}
