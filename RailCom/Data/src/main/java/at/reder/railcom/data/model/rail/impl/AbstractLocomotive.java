package at.reder.railcom.data.model.rail.impl;

import at.reder.railcom.data.model.rail.Locomotive;

/**
 *
 * @author alex
 */
public abstract class AbstractLocomotive extends AbstractRailwayEntity implements Locomotive {

    protected int power;
    protected String wheelArrangement;

    protected AbstractLocomotive() {
        super();
    }

    /**
     * @return the wheelArrangement
     */
    @Override
    public String getWheelArrangement() {
        return wheelArrangement;
    }

    /**
     * @param wheelArrangement the wheelArrangement to set
     */
    @Override
    public void setWheelArrangement(String wheelArrangement) {
        this.wheelArrangement = wheelArrangement;
    }

    /**
     * @return the power
     */
    @Override
    public int getPower() {
        return power;
    }

    /**
     * @param power the power to set
     */
    @Override
    public void setPower(int power) {
        this.power = power;
    }

}
