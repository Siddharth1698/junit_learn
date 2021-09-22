package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    void groupedAsserion(){
        Person person = new Person(1l,"joe","bin");

        assertAll("Test props set",
                () -> assertEquals("joe",person.getFirstName(),"Firstname failed"),
                () -> assertEquals("bin",person.getLastName(),"lastname failed")
                );
    }

}