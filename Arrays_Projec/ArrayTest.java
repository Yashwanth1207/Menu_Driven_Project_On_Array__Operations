package Arrays_Projec;

import java.util.*;

public class ArrayTest {
	
	static Array_Operations ob=new Array_Operations();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the array size");
		int size =sc.nextInt();
		int a[]= new int[size];
		System.out.println("enter array elements");
		for(int i=0;i<size;i++) {
			System.out.println("enter elements:" +(i+1));
			a[i]=sc.nextInt();
		}
		while(true) {
			System.out.println("\n1:insert \n2:delete |n"
						+"\n3:update\n4:search\n5:sort\n"
						+"6:reverse\n7:Min\n8:max\n9:display\n"
						+"10:isEmpty\n11:exit\n");
			int option=sc.nextInt();
			switch(option) {
			case 1:{
				System.out.println("enter new element");
				int new_ele=sc.nextInt();
				System.out.println("enter position");
				int pos =sc.nextInt();
				a=ob.insert(a, new_ele, pos);
				ob.display(a);
				break;
			}
			case 2:{
				System.out.println("enter deleting element");
				int del_ele=sc.nextInt();
				a=ob.delete(a, del_ele);
				ob.display(a);
				break;
			}
			case 3:{
				System.out.println("enter new element");
				int new_ele=sc.nextInt();
				System.out.println("enter old element");
				int old_ele=sc.nextInt();
				ob.update(a, new_ele, old_ele);
				ob.display(a);
				break;
			}
			case 4:{
				System.out.println("enter search element");
				int ele=sc.nextInt();
				int ind=ob.search(a, ele);
				if(ind==-1) {
					System.out.println("Elements not found");
					
				}
				else {
					System.out.println("elemnent is found at:"+(ind+1));
					
				}
				break;
				
				
			}
			case 5:{
				ob.sort(a);
				ob.display(a);
				break;
			}
			
			case 6:{
				int rev[]=ob.reverse(a);
				ob.display(a);
				break;
			}
			case 7:{
				System.out.println("minimum value is:"+ob.min(a));
				break;
			}
			case 8:{
				System.out.println("minimum value is:"+ob.max(a));
				break;
			}
			case 9:{
				ob.display(a);
				break;							//menu driven project on array Operations
			}
			case 10:{
				if(ob.isEmpty(a)) {
					System.out.println("array is empty");
				}
				else {
					System.out.println("array is not empty");
				}
				break;
			}
			case 11:{
				return;
			}
			default:{
			System.out.println("ley waste fellow choose "+"the option from the given options");
			}
			}
		}
	}
	

}
