package at.reder.railcom.data.model.impl;

import at.reder.railcom.data.model.Entity;
import at.reder.railcom.data.model.ModelEntity;
import at.reder.railcom.data.model.Scale;

/**
 *
 * @author alex
 */
public class AbstractModelEntity implements ModelEntity {

    protected final Entity entity;
    protected Scale scale;

    protected AbstractModelEntity(Entity entity) {
        super();
        this.entity = entity;
    }

    /**
     * @return the scale
     */
    @Override
    public Scale getScale() {
        return scale;
    }

    /**
     * @param scale the scale to set
     */
    @Override
    public void setScale(Scale scale) {
        this.scale = scale;
    }

    @Override
    public String getName() {
        return this.entity.getName();
    }

    @Override
    public void setName(String name) {
        this.entity.setName(name);
    }

    @Override
    public String getDescription() {
        return this.entity.getDescription();
    }

    @Override
    public void setDescription(String description) {
        this.entity.setDescription(description);
    }

}
