package com.nt.upi;

import java.util.Random;

public class UPIPayment {
	public String upiPayment(String upi,float amount)
	{
		return "upipayment amount"+amount+"is done";
	}
}
class UPIAmount{
	public double enhancement(String upid)
	{
		return new Random().nextInt(120000);
	}
}