package com.klef.jfsd.exam;

import javax.persistence.*;

@Entity
public class car extends vehicle {
    private int numberOfDoors;

    public int getNumberOfDoors() { return numberOfDoors; }
    public void setNumberOfDoors(int numberOfDoors) { this.numberOfDoors = numberOfDoors; }
}