package at.reder.railcom.data.model.impl;

import at.reder.railcom.data.model.ClassDesignation;
import at.reder.railcom.data.model.RailwayAgency;
import java.util.Date;

/**
 *
 * @author alex
 */
public class ClassDesignationImpl implements ClassDesignation {

    private final int majorNr;
    private final int minorNr;
    private final int cntrlNr;
    private RailwayAgency railwayAgency;
    private final Date dateFrom;
    private Date dateTo;

    public ClassDesignationImpl(int majorNr, int minorNr, int cntrlNr, Date dateFrom) {
        this.majorNr = majorNr;
        this.minorNr = minorNr;
        this.cntrlNr = cntrlNr;
        this.dateFrom = dateFrom;
    }

    /**
     * @return the minorNr
     */
    @Override
    public int getMinorNr() {
        return minorNr;
    }

    /**
     * @return the cntrlNr
     */
    @Override
    public int getCntrlNr() {
        return cntrlNr;
    }

    /**
     * @return the railwayAgency
     */
    @Override
    public RailwayAgency getRailwayAgency() {
        return railwayAgency;
    }

    /**
     * @param railwayAgency the railwayAgency to set
     */
    @Override
    public void setRailwayAgency(RailwayAgency railwayAgency) {
        this.railwayAgency = railwayAgency;
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

    @Override
    public String getName() {
        StringBuilder nameBuilder = new StringBuilder(10);
        nameBuilder.append(this.majorNr).append(".").append(this.minorNr).append("-").append(this.cntrlNr);
        return nameBuilder.toString();
    }

    @Override
    public int getMajorNr() {
        return this.majorNr;
    }

}
