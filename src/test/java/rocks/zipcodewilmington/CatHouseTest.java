package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void testGetNumberOfCats() {
        // Given
        String name = "Zulu";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();
        int numberOfCats = 1;

        // When
        CatHouse.add(animal);

        // Then
        int actualNumberOfCats = CatHouse.getNumberOfCats();
        Assert.assertEquals(numberOfCats, actualNumberOfCats);
    }

    @Test
    public void testAddCat() {
        // Given
        String name = "Zulu";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();
        int numberOfCats = 1;

        // When
        CatHouse.add(animal);

        // Then
        int actualNumberOfCats = CatHouse.getNumberOfCats();
        Assert.assertEquals(numberOfCats, actualNumberOfCats);
    }

    @Test
    public void testRemoveCatById() {
        // Given
        String name = "Zulu";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();
        int numberOfCats = 0;

        // When
        CatHouse.add(animal);
        CatHouse.remove(animal.getId());

        // Then
        int actualNumberOfCats = CatHouse.getNumberOfCats();
        Assert.assertEquals(numberOfCats, actualNumberOfCats);
    }

    @Test
    public void testRemoveCat() {
        // Given
        String name = "Zulu";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();
        int numberOfCats = 0;

        // When
        CatHouse.add(animal);
        CatHouse.remove(animal);

        // Then
        int actualNumberOfCats = CatHouse.getNumberOfCats();
        Assert.assertEquals(numberOfCats, actualNumberOfCats);
    }

    @Test
    public void testGetCatByID() {
        // Given
        String name = "Zulu";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();
        CatHouse.add(animal);

        // When
        Cat actualCat = CatHouse.getCatById(animal.getId());

        // Then
        Assert.assertEquals(animal, actualCat);
    }
}
