package practiceproblems;

import java.util.HashSet;

public class TransactionDuplicateCheck {

    public static void main(String[] args) {

        String[] ids = {
            "TXN1001", "TXN1002", "TXN1003",
            "TXN1002", "TXN1004"
        };

        HashSet<String> set = new HashSet<>();

        boolean duplicate = false;

        for (String id : ids) {
            if (set.contains(id)) {
                duplicate = true;
                break;
            }

            set.add(id);
        }

        System.out.println(duplicate);
    }
}