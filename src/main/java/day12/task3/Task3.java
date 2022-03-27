package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List<MusicBand> MusicBands = new ArrayList<>();

        for (int i = 0; i < 15; i++){
            MusicBands.add(i, new MusicBand("BestMusicNumber"+i, 1970+5*i));
        }

        Collections.shuffle(MusicBands);

        System.out.println(MusicBands);
        System.out.println(groupsAfter2000(MusicBands));

    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        List<MusicBand> bandsAfter2000 = new ArrayList<>(bands);
        for (int i = 0; i < bands.size(); i++){
            if(bandsAfter2000.get(i).getYear() <= 2000) {
                bandsAfter2000.remove(i);
                i--;
            }
        }
        return bandsAfter2000;
    }
}
