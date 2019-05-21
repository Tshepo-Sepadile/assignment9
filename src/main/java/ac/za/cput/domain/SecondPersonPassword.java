package ac.za.cput.domain;

import java.util.Objects;

public class SecondPersonPassword implements Password {

    private String passW2;

    public String password()
    {
        return passW2;
    }

    public SecondPersonPassword(Builder builder)
    {
        this.passW2 = builder.passW2;
    }

    public static class Builder{
        private String passW2;

        public Builder passW2(String passW2)
        {
            this.passW2 = passW2;
            return this;
        }

        public SecondPersonPassword build()
        {
            return new SecondPersonPassword(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SecondPersonPassword that = (SecondPersonPassword) o;
        return passW2.equals(that.passW2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passW2);
    }

}
