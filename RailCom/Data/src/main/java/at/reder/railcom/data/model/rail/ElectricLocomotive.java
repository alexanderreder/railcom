package at.reder.railcom.data.model.rail;

import java.util.Set;

/**
 *
 * @author alex
 */
public interface ElectricLocomotive extends Locomotive {

    public Set<ElectricSystem> getElectricSystems();

    public void addElectircSystem(ElectricSystem electricSystem);

    public void removeElectricSystem(ElectricSystem electricSystem);

    public interface ElectricSystem {

        public int getVoltage();

        public double getFrequency();
    }
}
