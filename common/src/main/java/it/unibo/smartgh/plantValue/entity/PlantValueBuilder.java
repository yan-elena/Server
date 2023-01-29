package it.unibo.smartgh.plantValue.entity;

import java.util.Date;

public class PlantValueBuilder {

    private String greenhouseId;
    private Date date;
    private Double value;

    public PlantValueBuilder() {
    }

    public PlantValueBuilder greenhouseId(String greenhouseId){
        this.greenhouseId = greenhouseId;
        return this;
    }

    public PlantValueBuilder date(Date date) {
        this.date = date;
        return this;
    }

    public PlantValueBuilder value(Double value) {
        this.value = value;
        return this;
    }

    public PlantValue build(){
        return new PlantValueImpl(this.greenhouseId, this.date, this.value);
    }
}
