package Exercise2_javaFaker;

import com.github.javafaker.Faker;
import com.github.javafaker.service.FakeValuesService;
import com.github.javafaker.service.RandomService;
import org.junit.Test;

import java.util.Date;
import java.util.Locale;

public class Exercise2_ByUsingJavaFaker {

    @Test
    public void dataValueGenerate(){

        //We need to create an object from the Faker class to be able to use methods.
        Faker faker = new Faker();

        String userName = faker.name().username();
        System.out.println("UserName = " + userName);


        int randomPassword = faker.random().hashCode();
        System.out.println("randomPassword = " + randomPassword);

        String birthday = String.valueOf(faker.date().birthday(18, 70));
        System.out.println("birthday = " + birthday);

        FakeValuesService fakeValuesService = new FakeValuesService(new Locale("en-US"), new RandomService());
        String email = fakeValuesService.bothify("?????##@achieve3000.com");  // you can make other email domains as
        // well like @gmail.com etc.

        System.out.println("email = " + email);

        String randomCountryName = faker.country().name();
        System.out.println("randomCountryName = " + randomCountryName);



    }

}
