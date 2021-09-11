public class MammalNew {
    protected int energyLevel = 100;

    public MammalNew(int energyLevel) {
        this.energyLevel = energyLevel;

    }

    public int displayEnergy() {
        System.out.println("Energy level: " + energyLevel);
        return energyLevel;
    }

}
