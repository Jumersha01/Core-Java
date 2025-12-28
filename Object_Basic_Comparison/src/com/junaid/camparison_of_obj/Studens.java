package com.junaid.camparison_of_obj;
 class Studens1 implements Cloneable{
    String name;
    int id;
    Studens1(String name,int id){
    	this.name=name;
    	this.id=id;
    	
    }
    @Override
    public Object clone()throws CloneNotSupportedException {
    	return super.clone();
    }
    public String toString() {
    	return "name is "+this.name+" id is "+this.id;
    }
    
    
}
public class Studens{
	void main() throws CloneNotSupportedException {
    Studens1 s = new Studens1("Junaid",11);
  
 //  IO.println(s.toString());
   Studens1 s2= (Studens1) s.clone();
   IO.println(s2+":"+s);
  
	}
}
