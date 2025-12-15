package org.example.model;

import java.util.Objects;

public class Truck extends Vehicle {
    private int numAxles;

    public Truck(int kmRealizes, int numAxles) {
        super(kmRealizes);
        this.numAxles = numAxles;
    }


    public int getNumAxles() {
        return numAxles;
    }

    public void setNumAxles(int numAxles) {
        this.numAxles = numAxles;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Truck truck = (Truck) o;
        return numAxles == truck.numAxles;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numAxles);
    }


    @Override
    public String toString() {
        return "Truck{" +
                "numAxles=" + numAxles +
                '}';
    }
}
