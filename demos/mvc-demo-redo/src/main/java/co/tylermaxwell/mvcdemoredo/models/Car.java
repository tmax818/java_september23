package co.tylermaxwell.mvcdemoredo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String make;
    private String carModel;
    private Integer year;


    public Car() {
    }


    public Car(Long id, String make, String carModel, Integer year) {
        this.id = id;
        this.make = make;
        this.carModel = carModel;
        this.year = year;
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getCarModel() {
        return this.carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public Integer getYear() {
        return this.year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", make='" + getMake() + "'" +
            ", carModel='" + getCarModel() + "'" +
            ", year='" + getYear() + "'" +
            "}";
    }




    
}
