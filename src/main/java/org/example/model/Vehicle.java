package org.example.model;

import java.util.Objects;

public abstract class Vehicle {
    protected int kmRealizes;
    protected String matricle;

    public Vehicle(int kmRealizes) {
        this.kmRealizes = kmRealizes;
    }


    public int getKmRealizes() {
        return kmRealizes;
    }

    public void setKmRealizes(int kmRealizes) {
        this.kmRealizes = kmRealizes;
    }

    public String getMatricle() {
        return matricle;
    }

    public void setMatricle(String matricle) {
        this.matricle = matricle;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return kmRealizes == vehicle.kmRealizes && Objects.equals(matricle, vehicle.matricle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(kmRealizes, matricle);
    }


    @Override
    public String toString() {
        return "Vehicle{" +
                "kmRealizes=" + kmRealizes +
                ", matricle='" + matricle + '\'' +
                '}';
    }
}
