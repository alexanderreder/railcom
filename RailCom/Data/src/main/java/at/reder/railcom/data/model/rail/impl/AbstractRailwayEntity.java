package at.reder.railcom.data.model.rail.impl;

import at.reder.railcom.data.model.ClassDesignation;
import at.reder.railcom.data.model.impl.AbstractEntity;
import at.reder.railcom.data.model.rail.RailwayEntity;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author alex
 */
public abstract class AbstractRailwayEntity extends AbstractEntity implements RailwayEntity {

    protected ClassDesignation deliveryClassDesignation;
    protected final Set<ClassDesignation> additionalClassDesignations;
    protected int wheelTrack;
    protected int mass;

    protected AbstractRailwayEntity() {
        super();
        this.additionalClassDesignations = new HashSet<>();
    }

    @Override
    public ClassDesignation getDeliveryClassDesignation() {
        return this.deliveryClassDesignation;
    }

    @Override
    public void setDeliveryClassDesignation(ClassDesignation deliveryClassDesignation) {
        this.deliveryClassDesignation = deliveryClassDesignation;
    }

    @Override
    public Set<ClassDesignation> getAdditionalClassDesignations() {
        return Collections.unmodifiableSet(this.additionalClassDesignations);
    }

    @Override
    public void addAdditionalClassDesignation(ClassDesignation additionalClassDesignation) {
        this.additionalClassDesignations.add(additionalClassDesignation);
    }

    @Override
    public void removeAdditionalClassDesignation(ClassDesignation additionalClassDesignation) {
        this.additionalClassDesignations.remove(additionalClassDesignation);
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
