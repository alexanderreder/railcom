package at.reder.railcom.data.model.rail.impl;

import at.reder.railcom.data.model.rail.ElectricLocomotive;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author alex
 */
public class ElectricLocomotiveImpl extends AbstractLocomotive implements ElectricLocomotive {

    protected final Set<ElectricSystem> electricSystems;

    public ElectricLocomotiveImpl() {
        super();
        this.electricSystems = new HashSet<>();
    }

    @Override
    public Set<ElectricSystem> getElectricSystems() {
        return Collections.unmodifiableSet(this.electricSystems);
    }

    @Override
    public void addElectircSystem(ElectricSystem electricSystem) {
        this.electricSystems.add(electricSystem);
    }

    @Override
    public void removeElectricSystem(ElectricSystem electricSystem) {
        this.electricSystems.remove(electricSystem);
    }

}
