package com.jmr.obdx.util;

/***
 * @author JMR
 */
public class Utility {

	public static final String ALREADY_EXISITING = "Already exisiting";
	public static final String NOT_AVAILABLE = "Not Available";
	public static final String USER_NAME = "userName";
	public static final String IS_REQUIRED = "is Required";
	public static final String ADMIN = "ROLE_ADMIN";
	public static final String ENTERED = "Entered ";
	public static final String EXITING = "Exiting ";
	public static final String EXCEPTION_IN = "Exception in ";
	public static final String VIEW_BAD_REQUEST = "badrequest";
	public static final String VIEW_OPPS = "oops";
	public static final String DEVICE = "device";
	public static final String DEVICE_ID = "01";
	public static final String SAVINGSANDCURRENT = "C";
	public static final String CONTRACTANDTERMDEPOSIT = "T";
	public static final String LOANSANDCURRENT = "L";
	public static final String ACTIVEACCOUNT = "A";
	public static final String INACTIVEACCOUNT = "I";
	public static final String ACTIVE = "A";
	public static final String CLOSED = "C";
	public static final String OAT ="own account Transfer";	
	public static final String IAT ="internal account Transfer";
	public static final String BP ="bill payment";

	public static String getReferenceNumber(String text, int length) {
		  String referenceNumber = text;
		  for (int idx = referenceNumber.length(); idx < length; idx++) {
		   referenceNumber = referenceNumber + " ";
		  }
		  return referenceNumber;
		 }

}
