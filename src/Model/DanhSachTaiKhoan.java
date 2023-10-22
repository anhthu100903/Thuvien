package Model;

import java.util.ArrayList;

public class DanhSachTaiKhoan {
  private ArrayList<TaiKhoan> dsTaiKhoan;

  public DanhSachTaiKhoan() {
  }

  public DanhSachTaiKhoan(ArrayList<TaiKhoan> dsTaiKhoan) {
    this.dsTaiKhoan = dsTaiKhoan;
  }

  public ArrayList<TaiKhoan> getDsTaiKhoan() {
    return dsTaiKhoan;
  }

  public void setDsTaiKhoan(ArrayList<TaiKhoan> dsTaiKhoan) {
    this.dsTaiKhoan = dsTaiKhoan;
  }
}
