package Database;

public class TugasGetSet {
    private int idTugas;
    private String namaTugas;
    private String tanggalDeadline;
    private String jamDeadline;
    private String deskripsi;
    private String status;

    public TugasGetSet() {
 
    }
    public TugasGetSet(int idTugas, String namaTugas, String tanggalDeadline, String jamDeadline,
        String deskripsi, String status) {
        this.idTugas = idTugas;
        this.namaTugas = namaTugas;
        this.tanggalDeadline = tanggalDeadline;
        this.jamDeadline = jamDeadline;
        this.deskripsi = deskripsi;
        this.status = status;
    }

    public int getIdTugas() {
        return idTugas;
    }

    public String getNamaTugas() {
        return namaTugas;
    }

    public String getTanggalDeadline() {
        return tanggalDeadline;
    }

    public String getJamDeadline() {
        return jamDeadline;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public String getStatus() {
        return status;
    }
    

    public void setIdTugas(int idTugas) {
        this.idTugas = idTugas;
    }

    public void setNamaTugas(String namaTugas) {
        this.namaTugas = namaTugas;
    }
    
    public void setTanggalDeadline(String tanggalDeadline) {
        this.tanggalDeadline = tanggalDeadline;
    }

    public void setJamDeadline(String jamDeadline) {
        this.jamDeadline = jamDeadline;
    }
    
    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
