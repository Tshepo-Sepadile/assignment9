package ac.za.cput.domain;
import javax.persistence.*;

import java.util.Objects;

@Entity
public class NameValidation {

    @Id
    private String nameVal;

    private NameValidation(){}

    public String validateName()
    {
        return nameVal;
    }

    public NameValidation(Builder builder)
    {
        this.nameVal = builder.nameVal;
    }


    public static class Builder{
        private String nameVal;

        public Builder nameVal(String nameVal)
        {
            this.nameVal = nameVal;
            return this;
        }

        public Builder copy(NameValidation nameValidation)
        {
            this.nameVal = nameValidation.nameVal;
            return this;
        }

        public NameValidation build()
        {
            return new NameValidation(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NameValidation that = (NameValidation) o;
        return nameVal.equals(that.nameVal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameVal);
    }
}
