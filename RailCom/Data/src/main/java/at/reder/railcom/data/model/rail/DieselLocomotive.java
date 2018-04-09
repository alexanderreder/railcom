package at.reder.railcom.data.model.rail;

/**
 *
 * @author alex
 */
public interface DieselLocomotive extends Locomotive {

    public int getCylinderCount();

    public void setCylinderCount(int cylinderCount);

    public int getCylinderCapacity();

    public void setCylinderCapacity(int cylinderCapacity);

    public int getFuelStorage();

    public void setFuelStorage(int fuelStorage);

}
