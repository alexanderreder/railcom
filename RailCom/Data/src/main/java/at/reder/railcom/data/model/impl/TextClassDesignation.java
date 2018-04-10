package at.reder.railcom.data.model.impl;

import java.util.Date;

/**
 *
 * @author alex
 */
public class TextClassDesignation extends AbstractClassDesignation {

    private final String name;

    public TextClassDesignation(String name, Date dateFrom) {
        super(dateFrom);
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

}
