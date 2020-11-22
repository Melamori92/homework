package com.company;

public class Select {
    public String selectNumberOrLetter (int number2) {
        if (number2 == 10)
            return "A";
        if (number2 == 11)
            return "B";
        if (number2 == 12)
            return "C";
        if (number2 == 13)
            return "D";
        if (number2 == 14)
            return "E";
        if (number2 == 15)
            return "F";

        return Integer.toString(number2);
    }
}
