package Arrays_Projec;

public class Array_Operations {


	public int[] insert(int a[], int new_ele, int pos) {
		if(pos<=0 || pos>a.length+1) {
			System.out.println("Insertion is not possible");
		}
		else {
			int res[] =new int[a.length+1];
			for(int i=0,j=0;i<res.length;i++) {
				if(i==pos-1) {
					res[i]=new_ele;
				}
				else {
					res[i]=a[j++];
				}
			}
			return res;
		}
		return a;
	}
	
	
	
	public int[] delete (int a[], int del_ele) {
		int ind =search(a,del_ele);
		if(isEmpty(a)) {
			System.out.println("array is empty");
		}
		else if(ind ==-1) {
			System.out.println("deletingelement is not present");
		}
		else {
			int res[]=new int[a.length-1];
			for(int i=0,j=0;i<a.length;i++) {
				if(i!=ind) {
					res[j++]=a[i];
				}
			}
			return res;
		}
		return a;
	}
	
	
	public void update(int a[],int new_ele, int old_ele) {
		int ind =search(a,old_ele);
		if(isEmpty(a)) {
			System.out.println("Array is empty");
		}
		else if(ind==-1) {
			System.out.println("Replacing element is not present");
		}
		else {
			for(int i=0;i<a.length;i++) {
//				if(i==ind) {//first occurence replacing
				if(a[i]==old_ele) { //all occurence replacing
					a[i]=new_ele;
				}
			}
		}
	}
	
	
	
	public void sort(int a[]) {
		for(int i=0;i<a.length;i++) {
			int min=i;
			for(int j=1+1;j<a.length;j++) {
				if(a[min]>a[j]) {
					min=j;
				}
			}
			if(min!=i) {
				int temp=a[min];
				a[min]=a[i];
				a[i]=temp;
			}
		}
	}
	
	
	public int search(int a[], int ele) {
		int rev[]= new int[a.length];
		for(int i=0;i<a.length;i++) {
			if(a[i]==ele) {
				return i;
			}
		}
		return -1;
	}
	
	public int[] reverse (int a[]) {
		int rev[]= new int[a.length];
		for(int i=0,j=a.length-1;i<a.length;i++,j--) {
			rev[i]=a[j];
		}
		return rev;
	}
	
	public int min(int a[]) {
		int min=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
			}
		}
		return min;
	}
	
	
	public int max(int a[]) {
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		return max;
	}
	
	
	public boolean isEmpty(int a[]) {
		return a.length==0;
	}
	
	public void display(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+ " ");
		}
	}
	
}
