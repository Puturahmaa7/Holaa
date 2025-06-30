package Timer;

public class TimerSession {
    private int id;
    private String jenis;
    private int durasi;
    private boolean selesai;

    public TimerSession(String jenis, int durasi) {
        this.jenis = jenis;
        this.durasi = durasi;
        this.selesai = false; // default saat baru dibuat
    }

    // optional constructor full
    public TimerSession(int id, String jenis, int durasi, boolean selesai) {
        this.id = id;
        this.jenis = jenis;
        this.durasi = durasi;
        this.selesai = selesai;
    }

    public int getId() { return id; }
    public String getJenis() { return jenis; }
    public int getDurasi() { return durasi; }
    public boolean isSelesai() { return selesai; }

    @Override
    public String toString() {
        return jenis + " - " + durasi + " menit" + (selesai ? " (selesai)" : "");
    }
}
