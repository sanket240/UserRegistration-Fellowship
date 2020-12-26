import org.junit.Assert;
import org.junit.Test;
import org.hamcrest.CoreMatchers;

import static org.junit.Assert.*;

public class UserRegistrationTest {

      @Test
    public void givenFirstName_WhenProper_ShouldReturnHappy() {
        UserRegistration user=new UserRegistration();
        String mood=user.NameValidation("Sanket");
        Assert.assertThat(mood,CoreMatchers.is("HAPPY"));
    }
    @Test
    public void givenFirstName_WhenProper_ShouldReturnSad() {
        UserRegistration user=new UserRegistration();
        String mood=user.NameValidation("Sa");
        Assert.assertThat(mood,CoreMatchers.is("SAD"));
    }

    @Test
    public void givenLastName_WhenProper_ShouldReturnHappy() {
        UserRegistration user=new UserRegistration();
        String mood=user.LastNameValidation("Dulange");
        Assert.assertThat(mood,CoreMatchers.is("HAPPY"));
    }
    @Test
    public void givenLastName_WhenProper_ShouldReturnSad() {
        UserRegistration user=new UserRegistration();
        String mood=user.LastNameValidation("Du");
        Assert.assertThat(mood,CoreMatchers.is("SAD"));
    }
    @Test
    public void givenEmail_WhenProper_ShouldReturnHappy() {
        UserRegistration user=new UserRegistration();
        String mood=user.EmailValidation("sanketdulange24@gmail.com");
        Assert.assertThat(mood,CoreMatchers.is("HAPPY"));
    }
    @Test
    public void givenEmail_WhenProper_ShouldReturnSad() {
        UserRegistration user=new UserRegistration();
        String mood=user.EmailValidation("sanketdulangegmail.com");
        Assert.assertThat(mood,CoreMatchers.is("SAD"));
    }

    @Test
    public void givenPhone_WhenProper_ShouldReturnHappy(){
        UserRegistration user=new UserRegistration();
        String mood=user.PhoneValidation("91 9422484996");
        Assert.assertThat(mood,CoreMatchers.is("HAPPY"));
    }
    @Test
    public void givenPhone_WhenProper_ShouldReturnSad(){
        UserRegistration user=new UserRegistration();
        String mood=user.PhoneValidation("919422484996");
        Assert.assertThat(mood,CoreMatchers.is("SAD"));
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnHappy() {
        UserRegistration user=new UserRegistration();
        String mood=user.PasswordValidation("Sanket@24");
        Assert.assertThat(mood,CoreMatchers.is("HAPPY"));
    }
    @Test
    public void givenPassword_WhenProper_ShouldReturnSad() {
        UserRegistration user=new UserRegistration();
        String mood=user.PasswordValidation("Sanket4");
        Assert.assertThat(mood,CoreMatchers.is("SAD"));
    }
}
