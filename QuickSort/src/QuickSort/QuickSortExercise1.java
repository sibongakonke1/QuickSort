 package QuickSort;

public class QuickSortExercise1 {

	public static void main(String[] args) {
		
		int[] numbers= {5,2,8,1,3};
		
		System.out.println("Unsorted array: ");
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);
		}
		
		quicksort(numbers,0,numbers.length-1);
		
		System.out.println("Sorted array: ");	
		for(int i=0;i<numbers.length;i++) {
			System.out.println(numbers[i]);		
		}
	}
	
	
		public static void quicksort(int[] numbers,int lowIndex, int highIndex) {
			
		if(lowIndex>=highIndex) {
					return;				
				}
		
			int pivot=numbers[highIndex];
			int leftPointer=lowIndex;
			int rightPointer=highIndex;
			
			while(leftPointer < rightPointer) {	
				
				while(leftPointer<rightPointer && numbers[leftPointer]<=pivot ) {
					leftPointer++;
				}
				
				while(rightPointer>leftPointer&& numbers[rightPointer]>=pivot) {
					rightPointer--;				
				}
							
	
	         swap(numbers,leftPointer,rightPointer);
					  
			}
			swap(numbers,leftPointer, highIndex);
							
				quicksort(numbers,lowIndex,leftPointer-1);
				quicksort(numbers,leftPointer+1,highIndex);	
		}
			
			public static void swap(int[] numbers,int index1,int index2) {
				
				int temp=numbers[index1];
				numbers[index1]=numbers[index2];
				numbers[index2]=temp;
			
			
				}
			}
			
				 