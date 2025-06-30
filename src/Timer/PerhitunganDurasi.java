package Timer;

import Database.Session;
import java.util.ArrayList;
import java.util.List;

public class PerhitunganDurasi {
    private int totalMenit;

    public PerhitunganDurasi(int totalMenit) {
        this.totalMenit = totalMenit;
    }

    public List<TimerSession> generateSesiPomodoro() {
        final int FOKUS = 25;
        final int ISTIRAHAT_PENDEK = 5;
        final int ISTIRAHAT_PANJANG = 15;

        List<TimerSession> sesi = new ArrayList<>();
        int sisa = totalMenit;
        int jumlahFokus = 0;

        while (sisa >= FOKUS) {
            // Tambah sesi fokus
            sesi.add(new TimerSession("Fokus", FOKUS));
            sisa -= FOKUS;
            jumlahFokus++;

            // Tambah istirahat
            if (jumlahFokus % 4 == 0) {
                if (sisa >= ISTIRAHAT_PANJANG) {
                    sesi.add(new TimerSession("Istirahat Panjang", ISTIRAHAT_PANJANG));
                    sisa -= ISTIRAHAT_PANJANG;
                }
            } else {
                if (sisa >= ISTIRAHAT_PENDEK) {
                    sesi.add(new TimerSession("Istirahat Pendek", ISTIRAHAT_PENDEK));
                    sisa -= ISTIRAHAT_PENDEK;
                }
            }
        }

        if (sisa > 0) {
            sesi.add(new TimerSession("Sisa Waktu", sisa));
        }

        return sesi;
    }
}

