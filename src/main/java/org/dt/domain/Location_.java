package org.dt.domain;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2013-03-01T11:06:18.155+0200")
@StaticMetamodel(Location.class)
public class Location_ extends AbstractLocation_ {
	public static volatile SingularAttribute<Location, DeviceUser> responsible;
	public static volatile ListAttribute<Location, Device> devices;
}
