package ac.za.cput.domain;

import java.util.Objects;

public class FifthPersonPassword implements Password {

    private String passW5;

    public String password()
    {
        return passW5;
    }

    public FifthPersonPassword(Builder builder)
    {
        this.passW5 = builder.passW5;
    }

    public static class Builder{
        private String passW5;

        public Builder passW5(String passW5)
        {
            this.passW5 = passW5;
            return this;
        }

        public FifthPersonPassword build()
        {
            return new FifthPersonPassword(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FifthPersonPassword that = (FifthPersonPassword) o;
        return passW5.equals(that.passW5);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passW5);
    }

}
