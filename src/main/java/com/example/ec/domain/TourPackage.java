package com.example.ec.domain;

import java.util.Objects;
import jakarta.persistence.*;

@Entity
public class TourPackage{
    @Id
    private String code;

    @Column
    private String name;

    public TourPackage() {
    }

    public TourPackage(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "TourPackage{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TourPackage that = (TourPackage) o;
        return Objects.equals(code, that.code) &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, name);
    }
}