package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {
    public Job() {
        this.id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    //getters and setters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

//methods
    public String toString() {
        String defaultValue = "Data not available";
        return "\n ID: "
                + this.id + "\n Name: "
                + (this.name == null ? defaultValue : this.name)
                + "\n Employer: "
                + (this.employer.getValue() == null ? defaultValue : this.employer.getValue())
                + "\n Location: "
                + (this.location.getValue() == null ? defaultValue : this.location.getValue())
                + "\n Position Type: "
                + (this.positionType.getValue() == null ? defaultValue : this.positionType.getValue())
                + "\n Core Competency: "
                + (this.coreCompetency == null ? defaultValue : this.coreCompetency) + "\n";
    }

}
