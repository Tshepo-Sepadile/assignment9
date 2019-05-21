package ac.za.cput.factory;

import ac.za.cput.domain.SecondPerson;

public class SecondPersonFactory
{
    public static SecondPerson getPerson(String name, String surname, String personId) {

        return new SecondPerson.Builder().name(name).surname(surname).personId(personId).build();
    }
}
