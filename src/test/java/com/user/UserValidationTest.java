package com.user;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidationTest {
    @Test
    void givenFirstName_WhenProper_ShouldReturnTrue() {
        UserValidation uservalidator = new UserValidation();
        boolean result = uservalidator.validateFirstName("Pooja");
        Assertions.assertEquals(true,result);
    }

}

