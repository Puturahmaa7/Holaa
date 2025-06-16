package pomofocus;

public class TugasGetSet {
    private int idTugas;
    private String namaTugas;
    private String tanggalDeadline;
    private String jamDeadline;
    private String deskripsi;
    private String status;

    public TugasGetSet(int idTugas, String namaTugas, String tanggalDeadline, String jamDeadline,
        String deskripsi, String status) {
        this.idTugas = idTugas;
        this.namaTugas = namaTugas;
        this.tanggalDeadline = tanggalDeadline;
        this.jamDeadline = jamDeadline;
        this.deskripsi = deskripsi;
        this.status = status;
    }
}
