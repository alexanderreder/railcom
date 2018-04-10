package at.reder.railcom.data.model.impl;

import at.reder.railcom.data.model.ClassDesignation;
import at.reder.railcom.data.model.RailwayAgency;
import java.util.Date;

/**
 *
 * @author alex
 */
public abstract class AbstractClassDesignation implements ClassDesignation {

    protected final Date dateFrom;
    protected Date dateTo;
    protected RailwayAgency railwayAgency;

    protected AbstractClassDesignation(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    @Override
    public RailwayAgency getRailwayAgency() {
        return this.railwayAgency;
    }

    @Override
    public void setRailwayAgency(RailwayAgency railwayAgency) {
        this.railwayAgency = railwayAgency;
    }

    @Override
    public Date getDateFrom() {
        return this.dateFrom;
    }

    @Override
    public Date getDateTo() {
        return this.dateTo;
    }

    @Override
    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }

}
