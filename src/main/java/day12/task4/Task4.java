package day12.task4;

import java.util.ArrayList;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("AC/DC", 1980, new ArrayList<>(Arrays.asList("Angus Young", "Steve Young")));
        MusicBand band2 = new MusicBand("Metallica", 1989, new ArrayList<>(Arrays.asList("James Hetfield", "Lars Ulrich")));

        MusicBand.transferMembers(band1, band2);

        band1.printMembers();
        band2.printMembers();
    }
}
