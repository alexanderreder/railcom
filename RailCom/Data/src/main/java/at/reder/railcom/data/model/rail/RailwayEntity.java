package at.reder.railcom.data.model.rail;

import at.reder.railcom.data.model.ClassDesignation;
import at.reder.railcom.data.model.Entity;
import java.util.Set;

/**
 *
 * @author alex
 */
public interface RailwayEntity extends Entity {

    public ClassDesignation getDeliveryClassDesignation();

    public void setDeliveryClassDesignation(ClassDesignation deliveryClass);

    public Set<ClassDesignation> getAdditionalClassDesignations();

    public void addAdditionalClassDesignation(ClassDesignation additionalClassDesignation);

    public void removeAdditionalClassDesignation(ClassDesignation additionalClassDesignation);

    public int getWheelTrack();

    public void setWheelTrack(int wheelTrack);

    public int getMass();

    public void setMass(int mass);
}
