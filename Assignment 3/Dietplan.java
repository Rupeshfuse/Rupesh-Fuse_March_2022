import java.util.*;
class Dietplan{
	String name;
	String gender;
	int age;
	double weight;
	static String nuetrients="Minerals, Vitamins, Proteans";
	
	Dietplan(){
		this("Sanket","Male",26,80.20);
		
	}
	
	Dietplan(String name,String gender,int age,double weight){
		this.name=name;
		this.gender=gender;
		this.age=age;
		this.weight=weight;
		System.out.println("Information"+this.name);
		System.out.println("Information"+this.gender);
		System.out.println("Information"+this.age);
		System.out.println("Information"+this.weight);
	}
	
	void setdata(String name,String gender,int age,double weight){
		this.name=name;
		this.gender=gender;
		this.age=age;
		this.weight=weight;
	}
	
	void getdata(){
		System.out.println("Clients Information");
		System.out.println("Clients Name:"+name);
		System.out.println("Clients Genfer:"+this.gender);
		System.out.println("Clients Age:"+this.age);
		System.out.println("Clients Weight:"+this.weight);
		System.out.println("Clients Nuetrients:"+nuetrients);
	}
	
      public static void main(String... sum){
		   Dietplan d3 = new Dietplan();
		   d3.getdata();
		   
	      Dietplan d1 = new Dietplan();
	      d1.setdata("Saurabh","Male",23,68.45);
	      d1.getdata();
	  
	       Dietplan d2 = new Dietplan("Sakshi","Female",30,70.45);
	       d2.getdata();
	  }
}