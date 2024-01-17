package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Male extends Person {
    public Male(String firstName, String lastName, String birthDate) {
        super(firstName, lastName, birthDate);
    }

    @Override
    public int calculateRetirementAge() {
        long diff = 0;
        try {
            int retirementAge = 65;
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

            Date birthDate = dateFormat.parse(getBirthDate());
            Date currentDate = new Date();

            Calendar calendar1 = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();

            calendar1.setTime(birthDate);
            calendar2.setTime(currentDate);

            int yil1 = calendar1.get(Calendar.YEAR);
            int yil2 = calendar2.get(Calendar.YEAR);

            diff = retirementAge - (yil2 - yil1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return (int) diff;
    }
}
