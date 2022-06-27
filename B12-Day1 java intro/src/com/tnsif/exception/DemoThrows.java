package com.tnsif.exception;

import java.io.IOException;

public class DemoThrows {

		void m1(int num)throws IOException,ClassNotFoundException
		{
			if(num==1)
			{
				throw new IOException("IOException is occured");
			}
			else
			{
				throw new ClassNotFoundException("Class not found");
			}
		}
		public static void main(String[] args) {
			try
			{
				DemoThrows ob=new DemoThrows();
				ob.m1(10);
				
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
	}

}
