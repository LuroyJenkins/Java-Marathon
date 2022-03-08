package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        List MusicBands = new ArrayList<>();

        for (int i = 0; i < 15; i++){
            MusicBands.add(i, new MusicBand("BestMusicNumber"+i, 1970+5*i));
        }

        Collections.shuffle(MusicBands);

        System.out.println(MusicBands);
        System.out.println(groupsAfter2000(MusicBands));

    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands){
        for (int i = 0; i < bands.size(); i++){
            if(bands.get(i).getYear() <= 2000) {
                bands.remove(i);
                i--;
            }
        }
        return bands;
    }
}
