package Timer;

public class Progress {
    private int idProgress;
    private int idTujuan;
    private int idSesi;
    private int waktuTersisa;

    public Progress (int idProgress, int idTujuan, int idSesi, int waktuTersisa) {
        this.idProgress = idProgress;
        this.idTujuan = idTujuan;
        this.idSesi = idSesi;
        this.waktuTersisa = waktuTersisa;
    }

    public int getIdProgress() { return idProgress; }
    public int getIdTujuan() { return idTujuan; }
    public int getIdSesi() { return idSesi; }
    public int getWaktuTersisa() { return waktuTersisa; }
}  
