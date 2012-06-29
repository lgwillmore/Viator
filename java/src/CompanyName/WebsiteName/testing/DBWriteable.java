/*
 * Copyright (c) 2012-2013 of BWC LTD.
 * Your address LAWRENCE :D
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of BWC,
 * LTD. ("Confidential Information").  You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with BWC.
 */


package CompanyName.WebsiteName.testing;

/**
 * 
 * Am Interface to be implemented by any Model class
 * 
 * @version 1.0 	29.06.2012
 * @author belov
 *
 */

public interface DBWriteable{
	
	/**
	 * Returns an array of the names of all the Cities.
	 *  @return does not include any auto generated keys 
	 */
	public abstract String[] getCities();
	
	/**
	 * Returns all field names for the table prefix_Journeys to be used.
	 * @return does not include any auto generated keys 
	 */
	public abstract String[] getFiledNames();
	
	/**
	 * Returns the data in the same order as provided in the
	 * getFields() method of each entry.
	 * @return does not include any auto generated keys
	 */
	public abstract String[][] getData();
	
}
