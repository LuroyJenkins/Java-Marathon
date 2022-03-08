package day12.task5;

import java.util.ArrayList;
import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        MusicBand band1 = new MusicBand("AC/DC", 1980, new ArrayList<>(Arrays.asList(new MusicArtist("Angus Young", 19), new MusicArtist("Steve Young", 32))));
        MusicBand band2 = new MusicBand("Metallica", 1989, new ArrayList<>(Arrays.asList(new MusicArtist("James Hetfield", 22), new MusicArtist("Lars Ulrich", 27))));

        MusicBand.transferMembers(band1, band2);

        band1.printMembers();
        band2.printMembers();
    }
}
