package Model;

public class PhanLoaiThe {
  private String maLoaiThe;
  private String tenLoaiThe;
  private String ngayMoThe;
  private String hanDungThe;
  private int soLuongSachMuon;
  private int thoiGianMuonToiDa;
  private String giaTienGiaHan;
  
  public PhanLoaiThe() {
  }

  public PhanLoaiThe(String maLoaiThe, String tenLoaiThe, String ngayMoThe, String hanDungThe, int soLuongSachMuon,
      int thoiGianMuonToiDa, String giaTienGiaHan) {
    this.maLoaiThe = maLoaiThe;
    this.tenLoaiThe = tenLoaiThe;
    this.ngayMoThe = ngayMoThe;
    this.hanDungThe = hanDungThe;
    this.soLuongSachMuon = soLuongSachMuon;
    this.thoiGianMuonToiDa = thoiGianMuonToiDa;
    this.giaTienGiaHan = giaTienGiaHan;
  }

  public String getMaLoaiThe() {
    return maLoaiThe;
  }

  public void setMaLoaiThe(String maLoaiThe) {
    this.maLoaiThe = maLoaiThe;
  }

  public String getTenLoaiThe() {
    return tenLoaiThe;
  }

  public void setTenLoaiThe(String tenLoaiThe) {
    this.tenLoaiThe = tenLoaiThe;
  }

  public String getNgayMoThe() {
    return ngayMoThe;
  }

  public void setNgayMoThe(String ngayMoThe) {
    this.ngayMoThe = ngayMoThe;
  }

  public String getHanDungThe() {
    return hanDungThe;
  }

  public void setHanDungThe(String hanDungThe) {
    this.hanDungThe = hanDungThe;
  }

  public int getSoLuongSachMuon() {
    return soLuongSachMuon;
  }

  public void setSoLuongSachMuon(int soLuongSachMuon) {
    this.soLuongSachMuon = soLuongSachMuon;
  }

  public int getThoiGianMuonToiDa() {
    return thoiGianMuonToiDa;
  }

  public void setThoiGianMuonToiDa(int thoiGianMuonToiDa) {
    this.thoiGianMuonToiDa = thoiGianMuonToiDa;
  }

  public String getGiaTienGiaHan() {
    return giaTienGiaHan;
  }

  public void setGiaTienGiaHan(String giaTienGiaHan) {
    this.giaTienGiaHan = giaTienGiaHan;
  }
}
