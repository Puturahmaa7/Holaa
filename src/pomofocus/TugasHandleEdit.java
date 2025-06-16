package pomofocus;

import java.sql.Timestamp;

public class TugasHandleEdit {
    private int idTugas;
    private String namaTugas, tanggalDeadline, jamDeadline, deskripsi;
    private Timestamp dibuatPada;

    public TugasHandleEdit(int id, String nama, String tanggal, String jam, String desk, Timestamp dibuat) {
        this.idTugas = id;
        this.namaTugas = nama;
        this.tanggalDeadline = tanggal;
        this.jamDeadline = jam;
        this.deskripsi = desk;
        this.dibuatPada = dibuat;
    }

    // Getter
    public int getIdTugas() { return idTugas; }
    public String getNamaTugas() { return namaTugas; }
    public String getTanggalDeadline() { return tanggalDeadline; }
    public String getJamDeadline() { return jamDeadline; }
    public String getDeskripsi() { return deskripsi; }
    public Timestamp getDibuatPada() { return dibuatPada; }

    // Setter (jika dibutuhkan)
}

