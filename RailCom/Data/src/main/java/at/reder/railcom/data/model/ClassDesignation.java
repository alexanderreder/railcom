package at.reder.railcom.data.model;

import java.util.Date;

/**
 *
 * @author alex
 */
public interface ClassDesignation {

    public String getName();

    public RailwayAgency getRailwayAgency();

    public void setRailwayAgency(RailwayAgency railwayAgency);

    public Date getDateFrom();

    public Date getDateTo();

    public void setDateTo(Date dateTo);
}
