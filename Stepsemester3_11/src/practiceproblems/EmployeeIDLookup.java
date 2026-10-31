package practiceproblems;

import java.util.HashMap;

public class EmployeeIDLookup {

    public static void main(String[] args) {

        HashMap<String, String> lookup = new HashMap<>();

        lookup.put("E245", "Finance");
        lookup.put("E110", "Engineering");
        lookup.put("E390", "Marketing");
        lookup.put("E101", "Engineering");

        String id = "E390";

        if (lookup.containsKey(id))
            System.out.println(lookup.get(id));
        else
            System.out.println("Unknown");
    }
}