package at.reder.railcom.data.model;

import java.util.Date;

/**
 *
 * @author alex
 */
public interface RailwayAgency {

    public String getName();

    public String getNationality();

    public Date getDateFrom();

    public Date getDateTo();

    public void setDateTo(Date dateTo);
}
