package at.reder.railcom.data.model.rail.impl;

import at.reder.railcom.data.model.rail.DieselLocomotive;

/**
 *
 * @author alex
 */
public class DieselLocomotiveImpl extends AbstractLocomotive implements DieselLocomotive {

    protected int cylinderCount;
    protected int cylinderCapacity;
    protected int fuelCapacity;

    public DieselLocomotiveImpl() {
        super();
    }

    /**
     * @return the cylinderCount
     */
    @Override
    public int getCylinderCount() {
        return cylinderCount;
    }

    /**
     * @param cylinderCount the cylinderCount to set
     */
    @Override
    public void setCylinderCount(int cylinderCount) {
        this.cylinderCount = cylinderCount;
    }

    /**
     * @return the cylinderCapacity
     */
    @Override
    public int getCylinderCapacity() {
        return cylinderCapacity;
    }

    /**
     * @param cylinderCapacity the cylinderCapacity to set
     */
    @Override
    public void setCylinderCapacity(int cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }

    /**
     * @return the fuelCapacity
     */
    public int getFuelCapacity() {
        return fuelCapacity;
    }

    /**
     * @param fuelCapacity the fuelCapacity to set
     */
    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

}
