package ac.za.cput.domain;

import java.util.Objects;

public class Occupation {

    private String occupationID;

    public String occupationIdentity()
    {
        return occupationID;
    }

    public Occupation(Builder builder)
    {
        this.occupationID = builder.occupationID;
    }


    public static class Builder{
        private String occupationID;

        public Builder occupationID(String occupationID)
        {
            this.occupationID = occupationID;
            return this;
        }

        public Occupation build()
        {
            return new Occupation(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Occupation that = (Occupation) o;
        return occupationID.equals(that.occupationID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(occupationID);
    }
}
