package org.example.model;

import java.util.Objects;

public class Car extends Vehicle{
    private int numDoors;
    private int horsepowers;


    public Car(int kmRealizes, int numDoors, int horsepowers) {
        super(kmRealizes);
        this.numDoors = numDoors;
        this.horsepowers = horsepowers;
    }

    public int getNumDoors() {
        return numDoors;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public int getHorsepowers() {
        return horsepowers;
    }

    public void setHorsepowers(int horsepowers) {
        this.horsepowers = horsepowers;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return numDoors == car.numDoors && horsepowers == car.horsepowers;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numDoors, horsepowers);
    }


    @Override
    public String toString() {
        return "Car{" +
                "numDoors=" + numDoors +
                ", horsepowers=" + horsepowers +
                '}';
    }
}
