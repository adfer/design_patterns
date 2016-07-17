package com.adfer.designpatterns.prototype;

import com.adfer.designpatterns.prototype.enums.ShapeType;

/**
 * Created by adrianferenc on 16.07.2016.
 */
public abstract class Shape implements Cloneable {
    private String id;
    protected ShapeType type;

    abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShapeType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "id='" + id + '\'' +
                ", type=" + type +
                '}';
    }

    @Override
    protected Object clone(){
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

}
