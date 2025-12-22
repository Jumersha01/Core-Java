package com.junaid.array_logicals;
import java.util.function.Consumer;
public class PrimeWithBiFunction {
	

	    void main(){
	       
	        int size = Integer.parseInt(IO.readln
	        ("Enter The Size of The Array: "));
	        
	        int arr2[] = new int[size];
	        for(int k = 0 ; k<size;k++){
	            arr2[k]=Integer.parseInt(IO.readln("Enter "+(k+1)+"th Array:"));
	        }
	        Consumer<int[]> find = arr ->{
	           for(int i =0;i<arr.length;i++){
	                 int count =0;
	               for(int l =1;l<=arr[i];l++){
	                if(arr[i]%l==0){
	                    count++;
	                }
	                
	               }
	               if((count==2)){
	            	   IO.print(" "+arr[i]);
	               }
	            }

	        };
	        IO.print("Prime numbers are:");find.accept(arr2);
	    }
	}


