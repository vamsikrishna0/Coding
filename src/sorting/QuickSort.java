package sorting;
import java.util.Scanner;

public class QuickSort {

	  public void sort (int[] p , int lo, int hi){
	   if(lo < hi){ 
		int part = partition(p, lo, hi);
		sort(p, lo, part-1);
		sort(p, part+1, hi);
	   }
	  }

	  public int partition(int[] p, int lo, int hi){
	    int pivot = p[hi];
		int tmp;
	    int i = lo;
		for (int j=lo; j <= hi-1; j++){
		  if(p[j] <= pivot){
		    tmp = p[i];
			p[i] = p[j];
			p[j] = tmp;
			i = i+1;
		  }
		}
		
		tmp = p[hi];
		p[hi] = p[i];
		p[i] = tmp;
		
		return i;
	  
	  }
	  public static void main(String args[]){
		    Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int[] p = new int[n];
			for (int i=0; i<n; i++){
			  p[i] = sc.nextInt();
			}
			QuickSort x = new QuickSort();
			x.sort(p, 0, n-1);
			
			for (int i=0; i<n; i++){
			  System.out.println(p[i]);
			}
		  }
	}

