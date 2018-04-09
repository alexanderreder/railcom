package at.reder.railcom.data.model.rail;

import java.util.List;

/**
 *
 * @author alex
 */
public interface Train {

    public List<RailwayEntity> getTrain();

    public void addEntity(int pos, RailwayEntity entity);
}
