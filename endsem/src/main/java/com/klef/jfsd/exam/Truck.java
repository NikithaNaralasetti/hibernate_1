package com.klef.jfsd.exam;

import javax.persistence.*;

@Entity
public class Truck extends vehicle {
    private int loadCapacity;

    public int getLoadCapacity() { return loadCapacity; }
    public void setLoadCapacity(int loadCapacity) { this.loadCapacity = loadCapacity; }
}