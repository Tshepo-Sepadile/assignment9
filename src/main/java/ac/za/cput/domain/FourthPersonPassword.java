package ac.za.cput.domain;
import javax.persistence.*;

@Entity
public class FourthPersonPassword {

    @Id
    private String passW4;

    private FourthPersonPassword(){}

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

        public Builder copy(FourthPersonPassword fourthPersonPassword)
        {
            this.passW4 = fourthPersonPassword.passW4;
            return this;
        }

        public FourthPersonPassword build()
        {
            return new FourthPersonPassword(this);
        }
    }

}
