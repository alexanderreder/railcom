package at.reder.railcom.data.model.impl;

import java.util.Date;

/**
 *
 * @author alex
 */
public class ModernClassDesignation extends AbstractClassDesignation {

    private final int majorNr;
    private final int minorNr;
    private final int cntrlNr;

    public ModernClassDesignation(int majorNr, int minorNr, int cntrlNr, Date dateFrom) {
        super(dateFrom);
        this.majorNr = majorNr;
        this.minorNr = minorNr;
        this.cntrlNr = cntrlNr;
    }

    public int getMajorNr() {
        return this.majorNr;
    }

    public int getMinorNr() {
        return minorNr;
    }

    public int getCntrlNr() {
        return cntrlNr;
    }

    @Override
    public String getName() {
        StringBuilder nameBuilder = new StringBuilder(10);
        nameBuilder.append(this.majorNr).append(".").append(this.minorNr).append("-").append(this.cntrlNr);
        return nameBuilder.toString();
    }

}
