package org.dt.domain;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2013-02-22T10:05:19.814+0200")
@StaticMetamodel(Loan.class)
public class Loan_ extends AbstractEntity_ {
	public static volatile SingularAttribute<Loan, Device> device;
	public static volatile SingularAttribute<Loan, DeviceUser> loaner;
	public static volatile SingularAttribute<Loan, String> comment;
	public static volatile SingularAttribute<Loan, Date> startDate;
	public static volatile SingularAttribute<Loan, Date> endDate;
}
