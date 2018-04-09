package at.reder.railcom.data.model.rail;

import at.reder.railcom.data.model.Entity;

/**
 *
 * @author alex
 */
public interface RailwayEntity extends Entity {

    public int getWheelTrack();

    public void setWheelTrack(int wheelTrack);

    public String getRailwayAgency();

    public void setRailwayAgency(String railwayAgency);

    public int getMass();

    public void setMass(int mass);
}
