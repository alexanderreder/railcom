package at.reder.railcom.data.model.rail;

/**
 *
 * @author alex
 */
public interface Wagon extends RailwayEntity {

    public int getAxisCount();

    public void setAxisCount(int axisCount);
}
