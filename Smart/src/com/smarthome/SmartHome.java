package com.smarthome;
import java.util.Scanner;
public class SmartHome {

	
	Scanner sc=new Scanner(System.in);
	
	int time;
	
	public int checkTemparature()
	{
		System.out.println("Enter the temparature:");
		int temparature=sc.nextInt();
		if(temparature>=35)
		{
			System.out.println("AC ON");
		}
		else if(temparature>=25 && temparature<35)
		{
			System.out.println("FAN O");
		}
		else
		{
			System.out.println("COOLING OFF");
		}
		return temparature;
	}
	
	public int checkLight()
	{
		System.out.println("Enter the Light Level:");
		int lightlevel=sc.nextInt();
		if(lightlevel<=3 && lightlevel>0)
		{
			System.out.println("Lights ON");
		}
		else
		{
			System.out.println("Lights OFF");
		}
		return lightlevel;
	}


	public int checkTime()
	{
		System.out.println("Enter the time:");
        time=sc.nextInt();
		if(time>=6 && time<=11)
		{
			System.out.println("Morning Mode Activated");
		}
		else if(time>=12 && time<=17)
		{
			System.out.println("Afternoon Mode Activated");
		}
		else if(time>=18 && time<=21)
		{
			System.out.println("Evening Mode Activated");
		}
		else
		{
			System.out.println("Night Mode Activated");
		}
		return time;
	}
	
	public int checkDoorLock()
	{

		if((time>=22 && time<=23) || (time>=0 && time<=5))
		{
			System.out.println("Door Locked(Night Security ON)");
		}
		else
		{
			System.out.println("Door Unlocked(Day Mode)");
		}
		return time;
	}
	
	public void runSystem()
	{
		SmartHome sm=new SmartHome();
		int temp=sm.checkTemparature();
		int light=sm.checkLight();
		int time=sm.checkTime();
		int door=sm.checkDoorLock();
	}
	
	public static void main(String[] args) {
		SmartHome sm1=new SmartHome();
		sm1.runSystem();
	}
}
