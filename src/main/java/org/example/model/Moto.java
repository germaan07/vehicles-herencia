package org.example.model;

import java.util.Objects;

public class Moto extends Vehicle{
    private int engineDisplacement;


    public Moto(int kmRealizes, int engineDisplacement) {
        super(kmRealizes);
        this.engineDisplacement = engineDisplacement;
    }


    public int getEngineDisplacement() {
        return engineDisplacement;
    }

    public void setEngineDisplacement(int engineDisplacement) {
        this.engineDisplacement = engineDisplacement;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Moto moto = (Moto) o;
        return engineDisplacement == moto.engineDisplacement;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), engineDisplacement);
    }


    @Override
    public String toString() {
        return "Moto{" +
                "engineDisplacement=" + engineDisplacement +
                '}';
    }
}
