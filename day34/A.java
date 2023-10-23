package day34;

// Serialization and De-serialization are process in java that allow you to convert object into a byte stream (serialization) and then recreate objects from that byte stream(de-serialization).

import java.io.Serializable;

public class A implements Serializable{
	public String name="vikesh";
	transient String password ="testing";
	

}
