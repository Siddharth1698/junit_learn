package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OwnerTest {
    @Test
    void dependentAsserion(){
        Owner owner = new Owner(1l,"joe","bin");
        owner.setCity("Key West");
        owner.setTelephone("12131241234");
        assertAll("Property test",
                () -> assertAll("Person properties",
                    () -> assertEquals("joe",owner.getFirstName()),
                    () -> assertEquals("bin",owner.getLastName())),

                () -> assertAll("Owner Properties",
                        () -> assertEquals("Key West",owner.getCity()),
                        () -> assertEquals("12131241234",owner.getTelephone())
                )

        );
    }

}