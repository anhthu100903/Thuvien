package Model;

import java.util.ArrayList;

public class DanhSachLoaiThe {
  private ArrayList<PhanLoaiThe> dsLoaiThe;

  public DanhSachLoaiThe() {
  }

  public DanhSachLoaiThe(ArrayList<PhanLoaiThe> dsLoaiThe) {
    this.dsLoaiThe = dsLoaiThe;
  }

  public ArrayList<PhanLoaiThe> getDsLoaiThe() {
    return dsLoaiThe;
  }

  public void setDsLoaiThe(ArrayList<PhanLoaiThe> dsLoaiThe) {
    this.dsLoaiThe = dsLoaiThe;
  }
  
}
