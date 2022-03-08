package DsAlgo.java;

public class BubbleSort {

	public static void bubblesort(int arr[]){
		int n=arr.length;
		int temp=0;
		
		for(int i=0;i<n;i++){
			for(int j=1;j<(n-1);j++){
				if(arr[j-1]>arr[j]){
					temp=arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] arr={5,2,15,40,6};
		
		 System.out.println("Array Before Bubble Sort");  
         for(int i=0; i < arr.length; i++){  
                 System.out.print(arr[i] + " ");  
         }  
         System.out.println();  
           
         bubblesort(arr);//sorting array elements using bubble sort  
          
         System.out.println("Array After Bubble Sort");  
         for(int i=0; i < arr.length; i++){  
                 System.out.print(arr[i] + " ");  
         }  
	}

}
