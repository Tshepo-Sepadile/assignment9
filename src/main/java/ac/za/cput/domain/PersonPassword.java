package ac.za.cput.domain;
import javax.persistence.*;

import java.util.Objects;

@Entity
public class PersonPassword {

    @Id
    private String passW;

    private PersonPassword(){}

    public String password()
    {
        return passW;
    }

    public PersonPassword(Builder builder)
    {
        this.passW = builder.passW;
    }

    public static class Builder{
        private String passW;

        public Builder passW(String passW)
        {
            this.passW = passW;
            return this;
        }

        public Builder copy(PersonPassword personPassword)
        {
            this.passW = personPassword.passW;
            return this;
        }

        public PersonPassword build()
        {
            return new PersonPassword(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonPassword that = (PersonPassword) o;
        return passW.equals(that.passW);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passW);
    }
}
