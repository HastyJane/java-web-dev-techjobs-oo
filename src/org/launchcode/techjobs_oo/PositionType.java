package org.launchcode.techjobs_oo;

import java.util.Objects;

public class PositionType {
    @Override
    public boolean equals(Object oh) {
        if (this == oh) return true;
        if (oh == null || getClass() != oh.getClass()) return false;
        PositionType that = (PositionType) oh;
        return getId() == that.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    private int id;
    private static int nextId = 1;

    @Override
    public String toString() {
        return value;
    }

    private String value;

    public PositionType() {
        id = nextId;
        nextId++;
    }

    public PositionType(String value) {
        this();
        this.value = value;
    }

    // TODO: Add a custom toString() method that returns the data stored in 'value'.

    // TODO: Add custom equals and hashCode methods. Consider two PositionType objects "equal" when
    //  their id fields match.

    // Getters and Setters:

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
