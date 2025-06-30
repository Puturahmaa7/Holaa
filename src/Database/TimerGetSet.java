package Database;
import java.sql.Timestamp;

public class TimerGetSet {

    private int idTujuan;
    private int idPengguna;
    private String judulTujuan;
    private int durasiTujuan;
    private int persentaseProgres;
    private int totalWaktuBelajar;
    private Timestamp dibuatPada;

    public int getIdTujuan() {
        return idTujuan;
    }

    public void setIdTujuan(int idTujuan) {
        this.idTujuan = idTujuan;
    }

    public int getIdPengguna() {
        return idPengguna;
    }

    public void setIdPengguna(int idPengguna) {
        this.idPengguna = idPengguna;
    }

    public String getJudulTujuan() {
        return judulTujuan;
    }

    public void setJudulTujuan(String judulTujuan) {
        this.judulTujuan = judulTujuan;
    }

    public int getDurasiTujuan() {
        return durasiTujuan;
    }

    public void setDurasiTujuan(int durasiTujuan) {
        this.durasiTujuan = durasiTujuan;
    }

    public int getPersentaseProgres() {
        return persentaseProgres;
    }

    public void setPersentaseProgres(int persentaseProgres) {
        this.persentaseProgres = persentaseProgres;
    }

    public int getTotalWaktuBelajar() {
        return totalWaktuBelajar;
    }

    public void setTotalWaktuBelajar(int totalWaktuBelajar) {
        this.totalWaktuBelajar = totalWaktuBelajar;
    }

    public Timestamp getDibuatPada() {
        return dibuatPada;
    }

    public void setDibuatPada(Timestamp dibuatPada) {
        this.dibuatPada = dibuatPada;
    }
}
