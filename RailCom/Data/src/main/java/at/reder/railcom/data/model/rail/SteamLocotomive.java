package at.reder.railcom.data.model.rail;

/**
 *
 * @author alex
 */
public interface SteamLocotomive extends Locomotive {

    public enum CylinderType {
        SUPERHEATED_STEAM_CYLINDER, WET_STEAM_CYLINDER;
    }

    public enum FuelType {
        WOOD("t"), COAL("t"), OIL("t"), STEAM("m³");

        private final String unit;

        private FuelType(String unit) {
            this.unit = unit;
        }

        public String getUnit() {
            return this.unit;
        }
    }

    public int getCylinderCount(CylinderType type);

    public void setCylinderCount(CylinderType type, int count);

    public FuelType getFuelType();

    public void setFuelType(FuelType fuelType);

    public int getFuelCapacity();

    public void setFuelCapacity(int fuelCapacity);

    public int getWaterCapacity();

    public void setWaterCapacity(int waterCapacity);
}
