package at.reder.railcom.data.model.impl;

import at.reder.railcom.data.model.Entity;

/**
 *
 * @author alex
 */
public abstract class AbstractEntity implements Entity {

    protected String name;
    protected String description;

    protected AbstractEntity() {

    }

    /**
     * @return the name
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    @Override
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the description
     */
    @Override
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    @Override
    public void setDescription(String description) {
        this.description = description;
    }

}
