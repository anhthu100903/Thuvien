package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


import Model.TaiKhoan;

public class QuanLiDocGia_DAO {
  
  KetNoiSQL connect = new KetNoiSQL();
  ArrayList<TaiKhoan> dsDG = new ArrayList<>();

  //tồn tại -> false
  public boolean checkMaTaiKhoan(String maTaiKhoan){
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    try{
      String sql = "select Count(*) FROM TAIKHOAN WHERE maTaiKhoan="+maTaiKhoan;
      ps = connect.getConnection().prepareStatement(sql);
      rs = ps.executeQuery();
      if (rs.next()) {
        int count = rs.getInt(1); // Lấy kết quả đếm
        if(count == 0) return true;
      }
    }catch(Exception e){
      e.printStackTrace();
    }
    return false;
  }

  public ArrayList dsDOCGIA(){

    PreparedStatement ps = null;
    ResultSet rs = null;
    
    try{
      String sql = "select* FROM TAIKHOAN WHERE trangThai=1";
      ps = connect.getConnection().prepareStatement(sql);
      rs = ps.executeQuery();
      
      while(rs.next()){
        TaiKhoan dg = new TaiKhoan();
        dg.setTenTaiKhoan(rs.getString("maTaiKhoan"));
        dg.setTenNguoiDung(rs.getString("tenNguoiDung"));
        dg.setLoaiTK(rs.getString("loaiTaiKhoan"));
        dg.setMatKhau(rs.getString("matKhau"));
        dg.setGioiTinh(rs.getString("gioiTinh"));
        dg.setEmail(rs.getString("email"));
        dg.setNgaySinh(rs.getString("ngaySinh"));
        dg.setSdt(rs.getString("sdt"));
        dg.setSoLuongMuon(rs.getInt("soLuongMuon"));
        dg.setTrangThai(rs.getInt("trangThai"));
        dg.setLoaiTK(rs.getString("loaiTaiKhoan"));
        //tên loại thẻ, hạn dùng thẻ
        dsDG.add(dg);
      }
    } catch(Exception e){
      e.printStackTrace();
    }
    return dsDG;
  } 

  public boolean Add_DG(TaiKhoan tk){
    String sql="insert into TAIKHOAN values (?,?,?,?,?,?,?,?,?,?)";
    try{
      PreparedStatement ps = connect.getConnection().prepareStatement(sql);
      ps.setString(1, tk.getTenTaiKhoan());
      ps.setString(2, tk.getMatKhau());
      ps.setString(3, tk.getLoaiTK());
      ps.setString(4, tk.getTenNguoiDung());
      ps.setString(5, tk.getNgaySinh());
      ps.setString(6, tk.getGioiTinh());
      ps.setString(7, tk.getEmail());
      ps.setString(8, tk.getSdt());
      ps.setInt(9, tk.getTrangThai());
      ps.setInt(10, tk.getSoLuongMuon());

      return ps.executeUpdate()>0;
    }catch(Exception e){
      e.printStackTrace();
    }
    return false;
  }

  public boolean update_DG(TaiKhoan tk){
    String sql = "update TAIKHOAN set matKhau=?, tenNguoiDung=?, ngaySinh=?, gioiTinh=?, email=?, sdt=?, soLuongMuon=? where maTaiKhoan=?";
    try{
      PreparedStatement ps = connect.getConnection().prepareStatement(sql);
      ps.setString(1, tk.getMatKhau());
      ps.setString(2, tk.getTenNguoiDung());
      ps.setString(3, tk.getNgaySinh());
      ps.setString(4, tk.getGioiTinh());
      ps.setString(5, tk.getEmail());
      ps.setString(6, tk.getSdt());
      ps.setInt(7, tk.getSoLuongMuon());
      ps.setString(8, tk.getTenTaiKhoan());

      return ps.executeUpdate()>0;
    }catch (Exception e){
      e.printStackTrace();
    }
    return false;
  }

  public boolean delete_DG(String maTK){
    String sql = "update TAIKHOAN set trangThai=0 where maTaiKhoan='"+maTK+"'";
    try{
      PreparedStatement ps = connect.getConnection().prepareStatement(sql);
      return ps.executeUpdate()>0;
    }catch(Exception e){
      e.printStackTrace();
    }
    return false;
  }
}

