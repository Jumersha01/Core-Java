package com.shallow.deep;

public class Deep {

	public static void main(String[] args) {
TestDeep t1 =new TestDeep("Junaid",12);

   
 accept(t1);
 TestDeep t2 =accept(t1);
 System.out.println(t2.name);

	}
	public static TestDeep accept(TestDeep t2) {
	 t2 =new TestDeep("Mannan",23);
	 return t2;
		
	}

}

class TestDeep{
	   String name;
	 int id;
	  
	  TestDeep(String name,int id){
		  this.name=name;
		  this.id=id;
		  
	  }
	   
	 public void setDetail(String name){
		   this.name=name;
		   
		   
	  }
	 public String getDetail() {
		 return this.name;
	 }
}
