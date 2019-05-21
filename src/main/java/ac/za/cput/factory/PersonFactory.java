package ac.za.cput.factory;

import ac.za.cput.domain.Person;

public class PersonFactory
{
    public static Person getPerson(String name, String surname, String personId) {
        return new Person.Builder().name(name).surname(surname).personId(personId).build();
    }
}
