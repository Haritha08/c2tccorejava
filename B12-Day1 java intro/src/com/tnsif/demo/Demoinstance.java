package com.tnsif.demo;
class Animal
{
	public void show()
	{
		System.out.println("This is animal class");
	}
}
class Dog
{
	public void show()
	{
		System.out.println("This is dog class");
	}
}
class WildFox
{
	public void show()
	{
		System.out.println("This is Wild class");
	}
}

public class Demoinstance {

	public static void main(String[] args) {
		Animal ob=new Animal();
		Dog obj=new Dog();
		WildFox obj1=new WildFox();
		if(ob instanceof Animal)
		{
			System.out.println("ob is object of Animal");
		}
		else
		{
			System.out.println("Ob is not object of Animal");
		}
		

	}

}
