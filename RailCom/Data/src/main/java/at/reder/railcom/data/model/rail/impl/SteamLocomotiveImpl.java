package at.reder.railcom.data.model.rail.impl;

import at.reder.railcom.data.model.rail.SteamLocotomive;
import java.util.EnumMap;
import java.util.Map;

/**
 *
 * @author alex
 */
public class SteamLocomotiveImpl extends AbstractLocomotive implements SteamLocotomive {

    protected final Map<CylinderType, Integer> cylinderCount;
    protected FuelType fuelType;
    protected int fuelCapacity;
    protected int waterCapacity;

    public SteamLocomotiveImpl() {
        super();
        this.cylinderCount = new EnumMap<>(CylinderType.class);
    }

    /**
     * @return the fuelType
     */
    @Override
    public FuelType getFuelType() {
        return fuelType;
    }

    /**
     * @param fuelType the fuelType to set
     */
    @Override
    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    /**
     * @return the fuelCapacity
     */
    @Override
    public int getFuelCapacity() {
        return fuelCapacity;
    }

    /**
     * @param fuelCapacity the fuelCapacity to set
     */
    @Override
    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    /**
     * @return the waterCapacity
     */
    @Override
    public int getWaterCapacity() {
        return waterCapacity;
    }

    /**
     * @param waterCapacity the waterCapacity to set
     */
    @Override
    public void setWaterCapacity(int waterCapacity) {
        this.waterCapacity = waterCapacity;
    }

    @Override
    public int getCylinderCount(CylinderType type) {
        return this.cylinderCount.get(type);
    }

    @Override
    public void setCylinderCount(CylinderType type, int count) {
        this.cylinderCount.put(type, count);
    }

}
