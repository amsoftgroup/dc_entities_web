package com.amsoftgroup.geospatial.dc.business;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.amsoftgroup.dbpool.Database;
import com.amsoftgroup.geospatial.dc.hibernate.*;
import com.amsoftgroup.geospatial.dc.business.EntityFactory;

public class EntityFactory {

	public MegaEntity getEntity(int entityType, int gid){

		MegaEntity me = new MegaEntity();
		me.setEntityType(entityType);
		me.setGid(gid);

		switch (entityType){

		case (EntityTypes.Anc):{
			me.setAnc(getAnc(gid));
			break;
		}
		case (EntityTypes.Barsandliquor):{
			me.setBarsandliquor(getBarsandliquor(gid));
			break;
		}
		case (EntityTypes.Bicyclelanes):{
			//return null;
			break;
		}
		case (EntityTypes.Embassy):{
			me.setEmbassy(getEmbassy(gid));
			break;
		}
		case (EntityTypes.Gasstations):{
			me.setGasstations(getGasstations(gid));
			break;
		}
		case (EntityTypes.GroceryStores):{
			me.setGrocerystores(getGrocerystores(gid));
			break;
		}
		case (EntityTypes.Hikingtrails):{
			//return null;
			break;
		}
		case (EntityTypes.Historicdistrics):{
			//return null;
			break;
		}
		case (EntityTypes.Historicstructures):{
			me.setHistoricstructures(getHistoricstructures(gid));
			break;
		}
		case (EntityTypes.Hospital):{
			me.setHospitals(getHospital(gid));
			break;
		}
		case (EntityTypes.Hotels):{
			me.setHotels(getHotels(gid));
			break;
		}
		case (EntityTypes.Libraries):{
			me.setLibraries(getLibraries(gid));
			break;
		}
		case (EntityTypes.Metrostations):{
			//return null;
			break;
		}
		case (EntityTypes.Nationalparks):{
			//return null;
			break;
		}
		case (EntityTypes.Neighborhoodcomposition):{
			//return null;
			break;
		}
		case (EntityTypes.Placesofworship):{
			//return null;
			break;
		}
		case (EntityTypes.Policestations):{
			me.setPolicestations(getPoliceStation(gid));
			break;
		}
		case (EntityTypes.Postoffice):{
			me.setPostoffice(getPostoffice(gid));			
			break;
		}
		case (EntityTypes.Wards):{
			//return null;
			break;
		}

		default:{
			//return null;
			break;
		}
		}
		return me;
	}

	private ArrayList<Anc> getAnc(int gid) {

		Database d = new Database();
		Connection conn = null;
		ArrayList<Anc> Ancs = new ArrayList<Anc>();

		try {
			conn = d.getConnection();
			CallableStatement cstm = conn.prepareCall("{call \"dc_data\".\"select_anc\"(?)}") ;
			cstm.setInt(1, gid);
			ResultSet rs = cstm.executeQuery();

			while( rs.next() ){		
				Anc e = new Anc();
				e.setDescription(rs.getString("name"));
				e.setGid(rs.getInt("gid"));
				e.setWebUrl(rs.getString("web_url"));
				e.setAncId(rs.getString("anc_id"));
				Ancs.add(e);
			}
			rs.close();
			cstm.close();
			conn.close();
		} catch (SQLException ex) {
			System.out.println("Error" + ex.toString());
		}

		return Ancs;
	}

	public ArrayList<Embassy> getEmbassy(int gid){

		Database d = new Database();
		Connection conn = null;
		ArrayList<Embassy> embassies = new ArrayList<Embassy>();

		try {
			conn = d.getConnection();
			CallableStatement cstm = conn.prepareCall("{call \"dc_data\".\"select_embassy\"(?)}") ;
			cstm.setInt(1, gid);
			ResultSet rs = cstm.executeQuery();

			while( rs.next() ){		
				Embassy e = new Embassy();
				e.setDescription(rs.getString("emb_title"));
				e.setGid(rs.getInt("gid"));
				e.setEmbTitle(rs.getString("emb_title"));
				e.setAddress(rs.getString("address"));
				e.setCity(rs.getString("city"));
				e.setState(rs.getString("state"));
				e.setCountry(rs.getString("country"));
				e.setAddrid(rs.getLong("addrid"));
				e.setWeburl(rs.getString("weburl"));
				e.setTelephone(rs.getString("telephone"));
				embassies.add(e);
			}
			rs.close();
			cstm.close();
			conn.close();
		} catch (SQLException ex) {
			System.out.println("Error" + ex.toString());
		}

		return embassies;
	}

	public ArrayList<Hospitals> getHospital(int gid){

		Database d = new Database();
		Connection conn = null;
		ArrayList<Hospitals> hospitals = new ArrayList<Hospitals>();

		try {
			conn = d.getConnection();
			CallableStatement cstm = conn.prepareCall("{call \"dc_data\".\"select_hospital\"(?)}") ;
			cstm.setInt(1, gid);
			ResultSet rs = cstm.executeQuery();

			while( rs.next() ){		
				Hospitals h = new Hospitals();
				h.setAddress(rs.getString("address"));
				h.setName(rs.getString("name"));
				h.setType(rs.getString("type"));
				h.setWebUrl(rs.getString("web_url"));
				h.setGid(rs.getInt("gid"));

				hospitals.add(h);
			}

			rs.close();
			cstm.close();
			conn.close();


		} catch (SQLException ex) {
			System.out.println("Error " + ex.toString());
		}

		return hospitals;
	}

	public ArrayList<Grocerystores> getGrocerystore(int gid){

		Database d = new Database();
		Connection conn = null;
		ArrayList<Grocerystores> arlGrocerystores = new ArrayList<Grocerystores>();

		try {
			conn = d.getConnection();
			CallableStatement cstm = conn.prepareCall("{call \"dc_data\".\"select_grocerystore\"(?)}") ;
			cstm.setInt(1, gid);
			ResultSet rs = cstm.executeQuery();

			while( rs.next() ){		
				Grocerystores h = new Grocerystores();
				h.setAddress(rs.getString("address"));
				h.setStorename(rs.getString("storename"));
				h.setPhone(rs.getString("phone"));
				h.setGid(rs.getInt("gid"));
				arlGrocerystores.add(h);
			}

			rs.close();
			cstm.close();
			conn.close();


		} catch (SQLException ex) {
			System.out.println("Error " + ex.toString());
		}

		return arlGrocerystores;
	}	

	public ArrayList<Barsandliquor> getBarsandliquor(int gid){

		Database d = new Database();
		Connection conn = null;
		ArrayList<Barsandliquor> arlBarsandliquor = new ArrayList<Barsandliquor>();

		try {
			conn = d.getConnection();
			CallableStatement cstm = conn.prepareCall("{call \"dc_data\".\"select_barsandliquor\"(?)}") ;
			cstm.setInt(1, gid);
			ResultSet rs = cstm.executeQuery();

			while( rs.next() ){		
				Barsandliquor h = new Barsandliquor();
				h.setAddress(rs.getString("address"));
				h.setTradeName(rs.getString("trade_name"));
				h.setApplicant(rs.getString("applicant"));
				h.setDescriptio(rs.getString("descriptio"));
				h.setGid(rs.getInt("gid"));
				arlBarsandliquor.add(h);
			}

			rs.close();
			cstm.close();
			conn.close();


		} catch (SQLException ex) {
			System.out.println("Error " + ex.toString());
		}

		return arlBarsandliquor;
	}	

	public ArrayList<Policestations> getPoliceStation(int gid){

		Database d = new Database();
		Connection conn = null;
		ArrayList<Policestations> arlPolicestation = new ArrayList<Policestations>();

		try {
			conn = d.getConnection();
			CallableStatement cstm = conn.prepareCall("{call \"dc_data\".\"select_policestation\"(?)}") ;
			cstm.setInt(1, gid);
			ResultSet rs = cstm.executeQuery();

			while( rs.next() ){		
				Policestations h = new Policestations();
				h.setAddress(rs.getString("address"));
				h.setName(rs.getString("name"));
				h.setPhone(rs.getString("phone"));
				h.setWebUrl(rs.getString("web_url"));
				h.setGid(rs.getInt("gid"));
				arlPolicestation.add(h);
			}

			rs.close();
			cstm.close();
			conn.close();


		} catch (SQLException ex) {
			System.out.println("Error " + ex.toString());
		}

		return arlPolicestation;
	}		

	public ArrayList<Gasstations> getGasstations(int gid){

		Database d = new Database();
		Connection conn = null;
		ArrayList<Gasstations> arlGasstations = new ArrayList<Gasstations>();

		try {
			conn = d.getConnection();
			CallableStatement cstm = conn.prepareCall("{call \"dc_data\".\"select_gasstation\"(?)}") ;
			cstm.setInt(1, gid);
			ResultSet rs = cstm.executeQuery();

			while( rs.next() ){		
				Gasstations h = new Gasstations();
				h.setAddress(rs.getString("address"));
				h.setName(rs.getString("name"));
				h.setPhone(rs.getString("phone"));
				int fs = 0;
				String Service = rs.getString("full_servi");
				try{
					fs = Integer.parseInt(Service);
				}catch(Exception e){
					//TODO: fail silently
				}
				h.setFullServi(fs);
				h.setGid(rs.getInt("gid"));
				arlGasstations.add(h);
			}

			rs.close();
			cstm.close();
			conn.close();


		} catch (SQLException ex) {
			System.out.println("Error " + ex.toString());
		}

		return arlGasstations;
	}
	
	public ArrayList<Grocerystores> getGrocerystores(int gid){

		Database d = new Database();
		Connection conn = null;
		ArrayList<Grocerystores> arlGrocerystores = new ArrayList<Grocerystores>();

		try {
			conn = d.getConnection();
			CallableStatement cstm = conn.prepareCall("{call \"dc_data\".\"select_grocerystore\"(?)}") ;
			cstm.setInt(1, gid);
			ResultSet rs = cstm.executeQuery();

			while( rs.next() ){		
				Grocerystores h = new Grocerystores();
				h.setStorename(rs.getString("storename"));
				h.setAddress(rs.getString("address"));
				h.setPhone(rs.getString("phone"));
				h.setGid(rs.getInt("gid"));
				String w = rs.getString("ward");
				int ward = 0;
				try{
					ward = Integer.parseInt(w);
				}catch(Exception e){
					//TODO: fail silently
					// need server side logging!
				}
				h.setWard(ward);
				arlGrocerystores.add(h);
			}

			rs.close();
			cstm.close();
			conn.close();


		} catch (SQLException ex) {
			System.out.println("Error " + ex.toString());
		}

		return arlGrocerystores;
	}	
	
	public ArrayList<Historicstructures> getHistoricstructures(int gid){

		Database d = new Database();
		Connection conn = null;
		ArrayList<Historicstructures> arlHistoricstructures = new ArrayList<Historicstructures>();

		try {
			conn = d.getConnection();
			CallableStatement cstm = conn.prepareCall("{call \"dc_data\".\"select_historicstructures\"(?)}") ;
			cstm.setInt(1, gid);
			ResultSet rs = cstm.executeQuery();

			while( rs.next() ){		
				Historicstructures h = new Historicstructures();
				h.setAddress(rs.getString("address"));
				h.setGid(rs.getInt("gid"));
				h.setName(rs.getString("label"));
				h.setLabel(rs.getString("name"));

				arlHistoricstructures.add(h);
			}

			rs.close();
			cstm.close();
			conn.close();


		} catch (SQLException ex) {
			System.out.println("Error " + ex.toString());
		}

		return arlHistoricstructures;
	}	
	
	public ArrayList<Hospitals> getHospitals(int gid){

		Database d = new Database();
		Connection conn = null;
		ArrayList<Hospitals> arlHospitals = new ArrayList<Hospitals>();

		try {
			conn = d.getConnection();
			CallableStatement cstm = conn.prepareCall("{call \"dc_data\".\"select_hospitals\"(?)}") ;
			cstm.setInt(1, gid);
			ResultSet rs = cstm.executeQuery();

			while( rs.next() ){		
				Hospitals h = new Hospitals();
				h.setName(rs.getString("name"));
				h.setAddress(rs.getString("address"));
				h.setWebUrl(rs.getString("web_url"));
				h.setGid(rs.getInt("gid"));
				arlHospitals.add(h);
			}
			rs.close();
			cstm.close();
			conn.close();
		} catch (SQLException ex) {
			System.out.println("Error " + ex.toString());
		}
		return arlHospitals;
	}		
	
	public ArrayList<Hotels> getHotels(int gid){

		Database d = new Database();
		Connection conn = null;
		ArrayList<Hotels> arlHotels = new ArrayList<Hotels>();

		try {
			conn = d.getConnection();
			CallableStatement cstm = conn.prepareCall("{call \"dc_data\".\"select_hotel\"(?)}") ;
			cstm.setInt(1, gid);
			ResultSet rs = cstm.executeQuery();

			while( rs.next() ){		
				Hotels h = new Hotels();
				h.setName(rs.getString("name"));
				h.setAddress(rs.getString("address"));
				h.setZip(rs.getString("zip"));
				h.setPhone(rs.getString("phone"));
				h.setWebUrl(rs.getString("web_url"));
				h.setNumrooms(rs.getInt("numrooms"));
				h.setGid(rs.getInt("gid"));

				arlHotels.add(h);
			}
			rs.close();
			cstm.close();
			conn.close();
		} catch (SQLException ex) {
			System.out.println("Error " + ex.toString());
		}

		return arlHotels;
	}		
	
	public ArrayList<Libraries> getLibraries(int gid){

		Database d = new Database();
		Connection conn = null;
		ArrayList<Libraries> arlLibraries = new ArrayList<Libraries>();

		try {
			conn = d.getConnection();
			CallableStatement cstm = conn.prepareCall("{call \"dc_data\".\"select_library\"(?)}") ;
			cstm.setInt(1, gid);
			ResultSet rs = cstm.executeQuery();

			while( rs.next() ){		
				Libraries h = new Libraries();
				h.setName(rs.getString("name"));
				h.setAddress(rs.getString("address"));
				h.setPhone(rs.getString("phone"));
				h.setWebUrl(rs.getString("web_url"));
				h.setGid(rs.getInt("gid"));
				arlLibraries.add(h);
			}
			rs.close();
			cstm.close();
			conn.close();
		} catch (SQLException ex) {
			System.out.println("Error " + ex.toString());
		}
		return arlLibraries;
	}	
	
	public ArrayList<Postoffice> getPostoffice(int gid){

		Database d = new Database();
		Connection conn = null;
		ArrayList<Postoffice> arlPostoffice = new ArrayList<Postoffice>();

		try {
			conn = d.getConnection();
			CallableStatement cstm = conn.prepareCall("{call \"dc_data\".\"select_postoffice\"(?)}") ;
			cstm.setInt(1, gid);
			ResultSet rs = cstm.executeQuery();

			while( rs.next() ){		
				Postoffice h = new Postoffice();
				h.setName(rs.getString("name"));
				h.setAddress(rs.getString("address"));
				//h.setPhone(rs.getString("phone"));
				h.setWebUrl(rs.getString("web_url"));
				h.setGid(rs.getInt("gid"));
				arlPostoffice.add(h);
			}
			rs.close();
			cstm.close();
			conn.close();
		} catch (SQLException ex) {
			System.out.println("Error " + ex.toString());
		}
		return arlPostoffice;
	}	
	
}
