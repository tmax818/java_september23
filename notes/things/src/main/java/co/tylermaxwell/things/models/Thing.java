package co.tylermaxwell.things.models;

import java.util.UUID;

public class Thing {

    private String id;
    private String name;
    private String type;
    private Integer number;


    public Thing() {
        this.id = UUID.randomUUID().toString();
    }
    
    
    public Thing(String name, String type, Integer number) {
        this();
        this.name = name;
        this.type = type;
        this.number = number;
    }



    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }
    


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getNumber() {
        return this.number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }


    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", type='" + getType() + "'" +
            ", number='" + getNumber() + "'" +
            "}";
    }


    
}
