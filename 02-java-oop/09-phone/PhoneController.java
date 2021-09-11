public class PhoneController {
    public static void main(String[] args) {
        Iphone iphone = new Iphone("x12",80, "Sprint", "ringaloo");
        Galaxy galaxy = new Galaxy("Note10", 100, "Verizon", "trin-trin");

        iphone.displayInfo();
        String iPhoneRing = iphone.ring();
        System.out.println("Iphone " + iphone.getVersionNumber() + " says " + iPhoneRing);
        System.out.println("Unlocking via " + (iphone.unlock()));
        System.out.println("**************************************");
        galaxy.displayInfo();
        String galaxyRing = galaxy.ring();
        System.out.println("Galaxy " + galaxy.getVersionNumber() + " says " + galaxyRing);
        System.out.println("Unlocking via " + (galaxy.unlock()));


    }
}