import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ValidEmailTest {
    private String email12test;
    private String expectedResult;
    public ValidEmailTest(String email,String expectedResult){
        this.email12test=email;
        this.expectedResult=expectedResult;
    }
    @Parameterized.Parameters
    public static Collection data(){
        return Arrays.asList(new Object[][] {
                {"abc@yahoo.com","HAPPY"},
                {"abc111@abc.com","HAPPY"},
                {"abc@1.com","HAPPY"},
                {"abc","SAD"},
                {"abcgmail.com","SAD"}
        });
    }
    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue(){
        main main0=new main();
        String mood=main0.EmailValidation(this.email12test);
        Assert.assertThat(mood,CoreMatchers.is("HAPPY"));
    }
}
