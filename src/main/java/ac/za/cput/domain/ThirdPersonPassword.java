package ac.za.cput.domain;
import javax.persistence.*;

import java.util.Objects;

@Entity
public class ThirdPersonPassword {

    @Id
    private String passW3;

    private ThirdPersonPassword(){}

    public String password()
    {
        return passW3;
    }

    public ThirdPersonPassword(Builder builder)
    {
        this.passW3 = builder.passW3;
    }

    public static class Builder{
        private String passW3;

        public Builder passW3(String passW3)
        {
            this.passW3 = passW3;
            return this;
        }

        public Builder copy(ThirdPersonPassword thirdPersonPassword)
        {
            this.passW3 = thirdPersonPassword.passW3;
            return this;
        }

        public ThirdPersonPassword build()
        {
            return new ThirdPersonPassword(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ThirdPersonPassword that = (ThirdPersonPassword) o;
        return passW3.equals(that.passW3);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passW3);
    }

}
