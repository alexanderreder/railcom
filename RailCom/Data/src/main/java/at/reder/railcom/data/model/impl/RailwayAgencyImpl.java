package at.reder.railcom.data.model.impl;

import at.reder.railcom.data.model.RailwayAgency;
import java.util.Date;

/**
 *
 * @author alex
 */
public class RailwayAgencyImpl implements RailwayAgency {

    private final String name;
    private final String nationality;
    private final Date dateFrom;
    private Date dateTo;

    public RailwayAgencyImpl(String name, String nationality, Date dateFrom) {
        this.name = name;
        this.nationality = nationality;
        this.dateFrom = dateFrom;
    }

    /**
     * @return the name
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * @return the nationality
     */
    @Override
    public String getNationality() {
        return nationality;
    }

    /**
     * @return the dateFrom
     */
    @Override
    public Date getDateFrom() {
        return dateFrom;
    }

    /**
     * @return the dateTo
     */
    @Override
    public Date getDateTo() {
        return dateTo;
    }

    /**
     * @param dateTo the dateTo to set
     */
    @Override
    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

}
