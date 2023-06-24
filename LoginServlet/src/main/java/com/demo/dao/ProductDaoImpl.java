package com.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.demo.beans.Product;

public class ProductDaoImpl implements ProductDao{
   private static Connection con;
   private static PreparedStatement psget,pgetbyid,psalter,psdel;
   
   static {
	   con=DBUtil.getConnection();
	   try {
		psget=con.prepareStatement("select * from productss;");
		pgetbyid=con.prepareStatement("select * from productss where prodid=?");
		psalter=con.prepareStatement("update productss set pname=?, Quantity=?, Price=? where prodid=?");
		psdel=con.prepareStatement("delete from productss where prodid=?");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
	@Override
	public List<Product> getAllProduct() {
		try {List<Product>plist=new ArrayList<>();
			ResultSet rs=psget.executeQuery();
			while(rs.next()) {
				plist.add(new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getFloat(4)));
			}
			return plist;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	@Override
	public Product getById(int pid) {
		try {
			pgetbyid.setInt(1, pid);
			ResultSet rs=pgetbyid.executeQuery();
			rs.next();
			Product p=new Product(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getFloat(4));
			return p;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	@Override
	public void update(Product p) {
		try {
			psalter.setString(1, p.getPname());
			psalter.setInt(2, p.getQty());
			psalter.setFloat(3, p.getPrice());
			psalter.setInt(4, p.getPid());
			psalter.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		
		
	}
	@Override
	public void delete(int pid) {
		try {
			psdel.setInt(1, pid);
			psdel.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

}
