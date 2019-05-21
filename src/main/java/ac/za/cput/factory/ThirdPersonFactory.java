package ac.za.cput.factory;

import ac.za.cput.domain.ThirdPerson;

public class ThirdPersonFactory
{
    public static ThirdPerson getPerson(String name, String surname, String personId) {

        return new ThirdPerson.Builder().name(name).surname(surname).personId(personId).build();
    }
}
