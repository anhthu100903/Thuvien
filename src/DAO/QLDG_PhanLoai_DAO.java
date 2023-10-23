package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import Model.PhanLoaiThe;

public class QLDG_PhanLoai_DAO {
  KetNoiSQL connect = new KetNoiSQL();
  ArrayList<PhanLoaiThe> dsLoaiThe = new ArrayList<>();

  public ArrayList dsLoaiThe(){
    PreparedStatement ps = null;
    ResultSet rs = null;

    try{
      String sql = "Select* from LoaiThe";
      ps = connect.getConnection().prepareStatement(sql);
      rs = ps.executeQuery();

      while(rs.next()){
        PhanLoaiThe loaiThe = new PhanLoaiThe();
        loaiThe.setMaLoaiThe(rs.getString("maLoaiThe"));
        loaiThe.setTenLoaiThe(rs.getString("tenLoaiThe"));
        loaiThe.setNgayMoThe(rs.getString("ngayMoThe"));
        loaiThe.setHanDungThe(rs.getString("hanSuDung"));
        loaiThe.setSoLuongSachMuon(rs.getInt("soSachDuocMuon"));
        loaiThe.setThoiGianMuonToiDa(rs.getInt("thoiGianDuocMuonToiDa"));
        loaiThe.setGiaTienGiaHan("giaTienGiaHan");

        dsLoaiThe.add(loaiThe);
      }
    }catch(Exception e){
      e.printStackTrace();
    }
    return dsLoaiThe;
  }

  public boolean Add_LoaiThe(PhanLoaiThe loaiThe){
    String sql = "insert into LoaiThe values(?,?,?,?,?,?,?)";
    try{
      PreparedStatement ps = connect.getConnection().prepareStatement(sql);
      ps.setString(0, loaiThe.getMaLoaiThe());
      ps.setString(1, loaiThe.getTenLoaiThe());
      ps.setString(2, loaiThe.getNgayMoThe());
      ps.setString(3, loaiThe.getHanDungThe());
      ps.setInt(4, loaiThe.getSoLuongSachMuon());
      ps.setInt(5, loaiThe.getThoiGianMuonToiDa());
      ps.setString(6, loaiThe.getGiaTienGiaHan());

      return ps.executeUpdate()>0;
    }catch(Exception e){
      e.printStackTrace();
    }
    return false;
  }
}
