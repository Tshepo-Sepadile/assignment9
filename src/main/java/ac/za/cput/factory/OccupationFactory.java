package ac.za.cput.factory;

import ac.za.cput.domain.Occupation;

public class OccupationFactory {

    public static Occupation getOccupation(String occupationID) {
        return new Occupation.Builder().occupationID(occupationID).build();
    }

}
