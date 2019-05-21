package ac.za.cput.domain;

public class FourthPersonPassword implements Password {

    private String passW4;

    public String password()
    {
        return passW4;
    }

    public FourthPersonPassword(Builder builder)
    {
        this.passW4 = builder.passW4;
    }

    public static class Builder{
        private String passW4;

        public Builder passW4(String passW4)
        {
            this.passW4 = passW4;
            return this;
        }

        public FourthPersonPassword build()
        {
            return new FourthPersonPassword(this);
        }
    }

}
