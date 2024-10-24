package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size
     plus one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    /**
     * add a city
     * get the size of the list
     * decrease the list by deleting a city
     * check if our current size matches the initial size
     minus one
     */
    @Test
    public void deleteCityTest(){
        list = MockCityList();
        City cityToTest = new City("Estevan", "SK");
        list.addCity(cityToTest);
        int listSize = list.getCount();
        list.deleteCity(cityToTest);
        assertEquals(list.getCount(),listSize - 1);
    }

    /**
     * create new city
     * check the city is not in the list
     * add city to the list
     * check the city is in the list
     */
    @Test
    public void hasCityTest(){
        list = MockCityList();
        City cityToTest = new City("Estevan", "SK");
        assertFalse(list.hasCity(cityToTest));
        list.addCity(cityToTest);
        assertTrue(list.hasCity(cityToTest));
    }

}
