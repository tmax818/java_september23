package co.tylermaxwell.mvcdemoredo.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name="cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @NotEmpty
    private String make;

    @NotEmpty
    private String carModel;

    @NotNull(message = "dude, what year is your car")
    @Min(1900)
    private Integer year;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "cars_drivers", 
        joinColumns = @JoinColumn(name = "car_id"), 
        inverseJoinColumns = @JoinColumn(name = "driver_id")
    )
    private List<Driver> drivers;



    public Car() {
    }


  

    public List<Driver> getDrivers() {
        return this.drivers;
    }

    public void setDrivers(List<Driver> drivers) {
        this.drivers = drivers;
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



  
  




    
}
