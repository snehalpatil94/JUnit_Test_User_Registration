package com.bl.test;

import com.bl.Junit.ValidateUserRegistration;
import org.junit.Assert;
import org.junit.Test;

/**
 *Write JUnit Test to validate the User Entry for First Name, Last Name,
 * Email, Mobile, and Password.
 *
 * @auther : Snehal Patil
 */
public class UserRegistrationTest {
    //------------Test Cases for First Name Validation--------
    ValidateUserRegistration validator = new ValidateUserRegistration();

    @Test
    public void givenFirstName_WhenProper_ShouldReturn_True() {
        boolean result = validator.validateFirstName("Snehal");
        Assert.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenNotProper_ShouldReturn_False() {
        boolean result = validator.validateFirstName("sn");
        Assert.assertFalse(result);
    }

    //------------Test Cases for Last Name Validation--------
    @Test
    public void givenLastName_WhenProper_ShouldReturn_True() {
        boolean result = validator.validateLastName("Patil");
        Assert.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenNotProper_ShouldReturn_False() {
        boolean result = validator.validateLastName("pat");
        Assert.assertFalse(result);
    }

    //------------Test Cases for Email Id Validation--------
    @Test
    public void validateEmailAddress_WhenValid_ShouldReturnHappy() {
        ValidateUserRegistration userValidation = new ValidateUserRegistration();
        String expectedValue = "Happy";
        String email = userValidation.validateEmail("snehal@gmail.com");
        Assert.assertEquals(expectedValue, email);
    }

    @Test
    public void validateEmailAddress_WhenNotValid_ShouldReturnSad() {
        ValidateUserRegistration userValidation = new ValidateUserRegistration();
        String expectedValue = "Sad";
        String email = userValidation.validateEmail("abc#gmail.com");
        Assert.assertEquals(expectedValue, email);
    }

    // ----------Test Cases for Mobile Number Validation------
    @Test
    public void givenPhoneNo_WhenProper_ShouldReturn_True() {
        boolean result = validator.validateMobileNum("91 1234567809");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPhoneNo_WhenNotProper_ShouldReturn_False() {
        boolean result = validator.validateMobileNum("1234567809");
        Assert.assertFalse(result);
    }

    //-------- Test Cases for Password Validation --------
    @Test
    public void givenPassword_WhenProper_ShouldReturn_True() {
        boolean result = validator.validatePassword("Sneha123&");
        Assert.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenNotProper_ShouldReturn_False() {
        boolean result = validator.validatePassword("sneha$123");
        Assert.assertFalse(result);
    }
}
