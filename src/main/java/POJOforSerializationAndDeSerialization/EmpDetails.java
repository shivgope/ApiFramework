package POJOforSerializationAndDeSerialization;

public class EmpDetails {
	
//Declare all the variables as global
String ename;
String eid;
int mobileno;
String address;
//use constructor to initialize
public EmpDetails(String ename, String eid, int mobileno, String address) {

	this.ename = ename;
	this.eid = eid;
	this.mobileno = mobileno;
	this.address = address;
}
//Constructor for deserialisation
public EmpDetails()
{
	
}
//use getters and setters to access the variable
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public String getEid() {
	return eid;
}
public void setEid(String eid) {
	this.eid = eid;
}
public int getMobileno() {
	return mobileno;
}
public void setMobileno(int mobileno) {
	this.mobileno = mobileno;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

}
