package common;

import com.github.javafaker.Faker;

public class FakeData extends Base {

    Faker faker = new Faker();

    public String generate_Fake_First_Name(){
        String firstName = faker.name().firstName().replace("'","");

        return firstName;
    }

    public String generate_Fake_Last_Name(){
        String lastName = faker.name().lastName().replace("'","");

        return lastName;
    }

    public String get_Fake_City(){

        return faker.address().city();
    }

    public String get_Fake_Zip(){
        String zipCode = faker.address().zipCode().split("-")[0];
        return zipCode;

    }

    public String get_Fake_State(){
        return faker.address().stateAbbr();
    }

    public String get_Fake_Simple_Address(){
        return faker.address().streetName();
    }

    public String get_Fake_Phone_Number_no_Especial_Char(){

        return faker.phoneNumber().cellPhone();
    }

    public String get_Fake_Email(){
        String email = faker.bothify("????##@gmail.com");
        return email;
    }

    public String get_NPI(){
        return faker.bothify("##########");
    }

    public String get_DEA(){
        return "AU"+faker.bothify("#######");
    }
}
