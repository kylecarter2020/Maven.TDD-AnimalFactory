package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }

    @Test
    public void testAddDog() {
        // Given
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();
        int numberOfDogs = 1;

        // When
        DogHouse.add(animal);

        // Then
        int actualNumberOfDogs = DogHouse.getNumberOfDogs();
        Assert.assertEquals(numberOfDogs, actualNumberOfDogs);
    }

    @Test
    public void testRemoveDogById() {
        // Given
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();
        int numberOfDogs = 0;

        // When
        DogHouse.add(animal);
        DogHouse.remove(animal.getId());

        // Then
        int actualNumberOfDogs = DogHouse.getNumberOfDogs();
        Assert.assertEquals(numberOfDogs, actualNumberOfDogs);
    }

    @Test
    public void testRemoveDog() {
        // Given
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();
        int numberOfDogs = 0;

        // When
        DogHouse.add(animal);
        DogHouse.remove(animal);

        // Then
        int actualNumberOfDogs = DogHouse.getNumberOfDogs();
        Assert.assertEquals(numberOfDogs, actualNumberOfDogs);
    }

    @Test
    public void testGetDogByID() {
        // Given
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();
        DogHouse.add(animal);

        // When
        Dog actualDog = DogHouse.getDogById(animal.getId());

        // Then
        Assert.assertEquals(animal, actualDog);
    }
}
