package it.unibo.smartgh.PlantValue.entity;

import it.unibo.smartgh.plantValue.entity.PlantValue;
import it.unibo.smartgh.plantValue.entity.PlantValueImpl;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlantValueTest {

    private static String greenhouseId;
    private static Date date;
    private static double value;
    private static PlantValue plantValue;

    @BeforeAll
    static void setUp() {
        greenhouseId = "63af0ae025d55e9840cbc1fa";
        date = new Date();
        value = 100.0;
        plantValue = new PlantValueImpl(greenhouseId, date, value);
    }

    @Test
    void testGetGreenhouseId() {
        assertEquals(greenhouseId, plantValue.getGreenhouseId());
    }

    @Test
    void testGetDate() {
        assertEquals(date, plantValue.getDate());
    }

    @Test
    void testGetValue() {
        assertEquals(value, plantValue.getValue());
    }

}