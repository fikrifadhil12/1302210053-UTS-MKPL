package tpmod10_1302210044;

import java.time.LocalDate;
import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        ArrayList<Email> emails = new ArrayList<>();

        emails.add(new Email(1, "Shielda", "Nama saya Shielda", "Saya dari Bandung", LocalDate.now(), true));
        emails.add(new Email(2, "Diasavitri", "Nama saya Diasavitri", "Saya dari Bali", LocalDate.now(), false));
        emails.add(new Email(3, "Chaerry", "Nama saya Chaerry", "Saya dari Jakarta", LocalDate.now(), true));

        System.out.println("All Emails:");
        emails.forEach((email) -> {
            email.display();
        });

        System.out.println("Starred Emails:");
        emails.stream().filter((email) -> (email.isStarred())).forEachOrdered((email) -> {
            email.display();
        });
    }
}
