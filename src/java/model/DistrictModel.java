package model;

import domain.District;

import java.util.ArrayList;
import java.util.List;

public final class DistrictModel {
    private static ArrayList<District> districts = new ArrayList<>();

    public static void save(District district) {
        if (district != null) {
            districts.add(district);
        }
    }

    public static List<District> getContacts() {
        return districts;
    }
}
