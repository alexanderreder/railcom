package at.reder.railcom.data.model.rail;

/**
 *
 * @author alex
 */
public interface Locomotive extends RailwayEntity {

    public String getWheelArrangement();

    public void setWheelArrangement(String wheelArragement);

    public int getPower();

    public void setPower(int power);
}
