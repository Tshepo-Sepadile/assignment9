package ac.za.cput.domain;
import javax.persistence.*;

import java.util.Objects;

@Entity
public class FifthPerson {

    @Id
    private String personId;
    private String name;
    private String surname;

    private FifthPerson(){}

    public FifthPerson(Builder builder)
    {
        this.name = builder.name;
        this.surname = builder.surname;
        this.personId = builder.personId;
    }

    public String personName()
    {
        return name;
    }

    public String personSurname()
    {
        return surname;
    }

    public String personId()
    {
        return personId;
    }

    public static class Builder{
        private String name;
        private String surname;
        private String personId;

        public Builder name(String name)
        {
            this.name = name;
            return this;
        }

        public Builder surname(String surname)
        {
            this.surname = surname;
            return this;
        }

        public Builder personId(String personId)
        {
            this.personId = personId;
            return this;
        }

        public Builder copy(FifthPerson person)
        {
            this.name = person.name;
            this.surname = person.surname;
            this.personId = person.personId;
            return this;
        }

        public FifthPerson build()
        {
            return new FifthPerson(this);
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FifthPerson person = (FifthPerson) o;
        return personId.equals(person.personId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(personId);
    }
}
