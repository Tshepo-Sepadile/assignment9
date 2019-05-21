package ac.za.cput.factory;

import ac.za.cput.domain.FifthPerson;

public class FifthPersonFactory
{
    public static FifthPerson getPerson(String name, String surname, String personId) {

        return new FifthPerson.Builder().name(name).surname(surname).personId(personId).build();
    }
}
