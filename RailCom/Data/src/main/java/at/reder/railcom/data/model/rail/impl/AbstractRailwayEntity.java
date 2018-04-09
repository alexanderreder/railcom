package at.reder.railcom.data.model.rail.impl;

import at.reder.railcom.data.model.impl.AbstractEntity;
import at.reder.railcom.data.model.rail.RailwayEntity;

/**
 *
 * @author alex
 */
public abstract class AbstractRailwayEntity extends AbstractEntity implements RailwayEntity {

    protected int wheelTrack;
    protected String railwayAgency;
    protected int mass;

    protected AbstractRailwayEntity() {
        super();
    }

    /**
     * @return the wheelTrack
     */
    @Override
    public int getWheelTrack() {
        return wheelTrack;
    }

    /**
     * @param wheelTrack the wheelTrack to set
     */
    @Override
    public void setWheelTrack(int wheelTrack) {
        this.wheelTrack = wheelTrack;
    }

    /**
     * @return the railwayAgency
     */
    @Override
    public String getRailwayAgency() {
        return railwayAgency;
    }

    /**
     * @param railwayAgency the railwayAgency to set
     */
    @Override
    public void setRailwayAgency(String railwayAgency) {
        this.railwayAgency = railwayAgency;
    }

    /**
     * @return the mass
     */
    @Override
    public int getMass() {
        return mass;
    }

    /**
     * @param mass the mass to set
     */
    @Override
    public void setMass(int mass) {
        this.mass = mass;
    }

}
