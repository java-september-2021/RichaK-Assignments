public class Galaxy extends Phone implements Ringable{
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }

    @Override
    public void displayInfo() {
        System.out.println("Galaxy " + getVersionNumber() + " from " + getCarrier());
    }

    @Override
    public String ring() {
        String ringtone = getRingTone();
        return ringtone;
    }

    @Override
    public String unlock() {
        return "Voice Command";
    }
}
