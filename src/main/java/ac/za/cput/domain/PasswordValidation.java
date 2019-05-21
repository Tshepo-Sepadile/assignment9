package ac.za.cput.domain;

import java.util.Objects;

public class PasswordValidation {

    private String passwordVal;

    public String validatePassword()
    {
        return passwordVal;
    }

    public PasswordValidation(Builder builder)
    {
        this.passwordVal = builder.passwordVal;
    }

    public static class Builder{
        private String passwordVal;

        public Builder passwordVal(String passwordVal)
        {
            this.passwordVal = passwordVal;
            return this;
        }

        public PasswordValidation build()
        {
            return new PasswordValidation(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PasswordValidation that = (PasswordValidation) o;
        return passwordVal.equals(that.passwordVal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passwordVal);
    }
}
