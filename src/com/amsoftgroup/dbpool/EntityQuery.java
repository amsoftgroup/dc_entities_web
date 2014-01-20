package com.amsoftgroup.dbpool;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.amsoftgroup.geospatial.dc.business.MegaEntity;
import com.amsoftgroup.geospatial.dc.business.Entity;
import com.amsoftgroup.geospatial.dc.business.EntityType;
import com.amsoftgroup.geospatial.dc.business.EntityTypes;
import com.amsoftgroup.geospatial.dc.hibernate.*;


public class EntityQuery {

	@SuppressWarnings("unchecked")
	public ArrayList<EntityType> getEntityTypes(){
		
		ArrayList<EntityType> ets = new ArrayList<EntityType>();
		PreparedStatement ps =  null;
		Connection c = null;
		Database d = new Database();

		try {
			
			c = d.getConnection();
			String sql = "SELECT * FROM \"dc_data\".\"entityquery\" order by \"EntityDescription\"";			
			ps = c.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while( rs.next() ){		
				EntityType et = new EntityType();
				et.setEntityId(rs.getInt(1));
				et.setEntityDescription(rs.getString(2));
				ets.add(et);
			}

			rs.close();
			ps.close();
			c.close();
		}
		catch( SQLException se )
		{
			System.out.println( "SQL Exception:" ) ;

			while( se != null )
			{
				System.out.println( "State  : " + se.getSQLState()  ) ;
				System.out.println( "Message: " + se.getMessage()   ) ;
				System.out.println( "Error  : " + se.getErrorCode() ) ;

				se = se.getNextException() ;
			}
		}
		catch( Exception e )
		{
			System.out.println( e ) ;
		}
		
		return ets;
	}

	@SuppressWarnings("unchecked")
	public Entity getEntity(int entityTypeId, int gid){

		String sql = "Select";
		Entity et = new Entity();
		Database d = new Database();
		Connection c = null;
		PreparedStatement ps = null;

		
		switch (entityTypeId){

		case 1: 
			sql += " name, gid FROM \"dc_data\".\"anc\"";
			break;
		case 2: 
			sql += " trade_name as name, gid FROM \"dc_data\".\"barsandliquor\"";
			break;
		case 3: 
			sql += " facilityid as name, gid FROM \"dc_data\".\"bicyclelanes\"";
			break;
		case 4: 
			sql += " country as name, gid FROM \"dc_data\".\"embassy\"";
			break;
		case 5: 
			sql += " name, gid FROM \"dc_data\".\"gasstations\"";
			break;
		case 6: 
			sql += " storename as name, gid FROM \"dc_data\".\"grocerystores\"";
			break;
		case 7: 
			sql += " name, gid FROM \"dc_data\".\"hikingtrails\"";
			break;
		case 8: 
			sql += " name, gid FROM \"dc_data\".\"historicdistricts\"";
			break;
		case 9: 
			sql += " label as name, gid FROM \"dc_data\".\"historicstructures\"";
			break;
		case 10: 
			sql += " name, gid FROM \"dc_data\".\"hospitals\"";
			break;
		case 11: 
			sql += " name, gid FROM \"dc_data\".\"hotels\"";
			break;
		case 12: 
			sql += " name, gid FROM \"dc_data\".\"libraries\"";
			break;
		case 13: 
			sql += " name, gid FROM \"dc_data\".\"metrostations\"";
			break;
		case 14: 
			sql += " name, gid FROM \"dc_data\".\"nationalparks\"";
			break;
		case 15: 
			sql += " z990_ct as name, gid FROM \"dc_data\".\"neighborhoodcomposition\"";
			break;
		case 16: 
			sql += " name, gid FROM \"dc_data\".\"placesofworship\"";
			break;
		case 17: 
			sql += " name, gid FROM \"dc_data\".\"policestations\"";
			break;
		case 18: 
			sql += " name, gid FROM \"dc_data\".\"postoffice\"";
			break;	
		case 19: 
			sql += " name, gid FROM \"dc_data\".\"wards\"";
			break;
		case 20: 
			sql += " name, gid FROM \"dc_data\".\"hikingtrails\"";
			break;
		case 21: 
			sql += " name, gid FROM \"dc_data\".\"tenniscourts\"";
			break;
		}
		sql += " where gid = " + gid;

		try{
			c = d.getConnection();
			ps = c.prepareStatement(sql);
			System.out.println("SQL: " + sql);
			ResultSet rs = ps.executeQuery();

			while( rs.next() ){		

				et.setDescription(rs.getString("name"));
				et.setGid(gid);
				et.setEntityTypeId(entityTypeId);
				et.setDistance(rs.getDouble("dist_meters"));
				System.out.println( "dist_meters:" + et.getDistance()) ;

			}

			rs.close();
			ps.close();
			c.close();
		}
		catch( SQLException se )
		{
			System.out.println( "SQL Exception:" ) ;

			while( se != null )
			{
				System.out.println( "State  : " + se.getSQLState()  ) ;
				System.out.println( "Message: " + se.getMessage()   ) ;
				System.out.println( "Error  : " + se.getErrorCode() ) ;

				se = se.getNextException() ;
			}
		}
		catch( Exception e )
		{
			System.out.println( e ) ;
		}

		return et;
	}

	@SuppressWarnings("unchecked")
	public ArrayList<Entity> getEntityWithinRadius(int entityTypeId, int distance, double lon, double lat){
		
		//distance = distance * 100;
		String sql = "SELECT ST_Distance(ST_Transform(the_geom,26985) , ST_Transform(GeomFromText('POINT(" + lon + " " + lat + ")',4326),26985)  ) as dist_meters  ";
		ArrayList<Entity> ets = new ArrayList<Entity>();
		
		PreparedStatement ps =  null;
		Connection c = null;

		Database d = new Database();
	
		try {
			
			c = d.getConnection();
	
			switch (entityTypeId){
			
			case EntityTypes.Anc: 
				sql += " ,name, gid FROM \"dc_data\".\"anc\"";
				break;
			case EntityTypes.Barsandliquor: 
				sql += " ,trade_name as name, gid FROM \"dc_data\".\"barsandliquor\"";
				break;
			case EntityTypes.Bicyclelanes: 
				sql += " ,facilityid as name, gid FROM \"dc_data\".\"bicyclelanes\"";
				break;
			case EntityTypes.Embassy: 
				sql += " ,country as name, gid FROM \"dc_data\".\"embassy\"";
				break;
			case EntityTypes.Gasstations: 
				sql += " ,name, gid FROM \"dc_data\".\"gasstations\"";
				break;
			case EntityTypes.GroceryStores: 
				sql += " ,storename as name, gid FROM \"dc_data\".\"grocerystores\"";
				break;
			case EntityTypes.Hikingtrails: 
				sql += " ,name, gid FROM \"dc_data\".\"hikingtrails\"";
				break;
			case EntityTypes.Historicdistrics: 
				sql += " ,name, gid FROM \"dc_data\".\"historicdistricts\"";
				break;
			case EntityTypes.Historicstructures: 
				sql += " , label as name , gid FROM \"dc_data\".\"historicstructures\"";
				break;
			case EntityTypes.Hospital: 
				sql += " ,name, gid FROM \"dc_data\".\"hospitals\"";
				break;
			case EntityTypes.Hotels: 
				sql += " ,name, gid FROM \"dc_data\".\"hotels\"";
				break;
			case EntityTypes.Libraries: 
				sql += " ,name, gid FROM \"dc_data\".\"libraries\"";
				break;
			case EntityTypes.Metrostations: 
				sql += " ,name, gid FROM \"dc_data\".\"metrostations\"";
				break;
			case EntityTypes.Nationalparks: 
				sql += " ,name, gid FROM \"dc_data\".\"nationalparks\"";
				break;
			case EntityTypes.Neighborhoodcomposition: 
				sql += " ,z990_ct as name, gid FROM \"dc_data\".\"neighborhoodcomposition\"";
				break;
			case EntityTypes.Placesofworship: 
				sql += " ,name, gid FROM \"dc_data\".\"placesofworship\"";
				break;
			case EntityTypes.Policestations: 
				sql += " ,name, gid FROM \"dc_data\".\"policestations\"";
				break;
			case EntityTypes.Postoffice: 
				sql += " ,name, gid FROM \"dc_data\".\"postoffice\"";
				break;	
			case EntityTypes.Wards: 
				sql += " ,name, gid FROM \"dc_data\".\"wards\"";
				break;
			case EntityTypes.Tenniscourts: 
				sql += " ,name, gid FROM \"dc_data\".\"tenniscourts\"";
				break;
			}

			sql += " WHERE st_dwithin(the_geom, transform(GeomFromText('POINT(" + lon + " " + lat +")',4326),26985)," + distance + ")" +
			 	   " order by dist_meters asc";

			ps = c.prepareStatement(sql);
			System.out.println("SQL: " + sql);
			//ps.setDouble(1, lon);
			//ps.setDouble(2, lat);
			//ps.setInt(3, distance);
			//ps.setDouble(4, lon);
			//ps.setDouble(5, lat);	
			
			ResultSet rs = ps.executeQuery();

			while( rs.next() ){		
				Entity et = new Entity();
				et.setDescription(rs.getString("name"));
				et.setGid(rs.getInt("gid"));
				et.setEntityTypeId(entityTypeId);
				et.setDistance(rs.getDouble("dist_meters"));
				System.out.println( "dist_meters:" + et.getDistance()) ;
				ets.add(et);
			}

			rs.close();
			ps.close();
			c.close();
		}
		catch( SQLException se )
		{
			System.out.println( "SQL Exception:" ) ;

			while( se != null )
			{
				System.out.println( "State  : " + se.getSQLState()  ) ;
				System.out.println( "Message: " + se.getMessage()   ) ;
				System.out.println( "Error  : " + se.getErrorCode() ) ;

				se = se.getNextException() ;
			}
		}
		catch( Exception e )
		{
			System.out.println( e ) ;
		}
		
		return ets;
	}
}
