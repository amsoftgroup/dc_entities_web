package com.amsoftgroup.geospatial.dc.business;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.GenericEntity;

import com.amsoftgroup.dbpool.EntityQuery;
import com.amsoftgroup.geospatial.dc.hibernate.*;

@Path("/entity")
public class EntityResource {

	EntityFactory	ef = new EntityFactory();
	EntityQuery		eq = new EntityQuery();
	
	@GET
	@Path("/get")
	@Produces({"application/json", "text/xml"})
	public List<EntityType> get() {
		return eq.getEntityTypes();
	}
	
	@GET
	@Path("/getEntityByDistance/{id}/{distance}/{lon}/{lat}")
	@Produces({"application/json", "text/xml"})
	public List<Entity> getEntityByDistance(@PathParam("id") int entityTypeId,
								  @PathParam("distance") int distance,
								  @PathParam("lon") double lon,
								  @PathParam("lat") double lat) {
		return eq.getEntityWithinRadius(entityTypeId, distance, lon, lat);
	}

	@GET
	@Path("/getEntity/{entityType}/{gid}")
	@Produces({"application/json", "text/xml"})
	public MegaEntity getEntity(@PathParam("entityType") int entityTypeId,
								  @PathParam("gid") int gid) {
		return ef.getEntity(entityTypeId, gid);

	}


}
