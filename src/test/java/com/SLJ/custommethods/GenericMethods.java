/**
 * 
 */
package com.SLJ.custommethods;

/**
 * @author Rajesh Thakur
 * @description Method to get and set user name and password.
 */
public class GenericMethods {

		private String userName;
		private String password;
		
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		
		public void setAll(String userName, String password) {
			this.userName = userName;
			this.password = password;
		}
}
