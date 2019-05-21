package ac.za.cput.factory;

import ac.za.cput.domain.FourthPerson;

public class FourthPersonFactory
{
    public static FourthPerson getPerson(String name, String surname, String personId) {

        return new FourthPerson.Builder().name(name).surname(surname).personId(personId).build();
    }
}
