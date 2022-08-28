package dat3.cars.repository;

import dat3.cars.entity.Car;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@DataJpaTest
class CarRepositoryTest {

    @Autowired
    CarRepository carRepository;

    static int car1Id;
    static int car2Id;

    @BeforeAll
    public static void setUpData(@Autowired CarRepository carRepository) {

        Car car1 = new Car("aa", "aa",10,10);
        Car car2 = new Car( "bb","bb",10,10);

        carRepository.save(car1);
        carRepository.save(car2);

        car1Id = car1.getId();
        car2Id = car2.getId();

    }

    @Test
    public void testFindByModel(){
        Car found = carRepository.findCarByModel("aa");
        assertEquals(car1Id, found.getId());
    }

    /*
    @Test
    public void testFindByEmail(){
        Customer found = customerRepository.findCustomerByEmail("bb");
        assertEquals(cust2,found.getId());
    }

     */

}