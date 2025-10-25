package com.sk;



public class ArrayWithPratyushSet1 {
	
	//Remove Duplicates (easy)
	public static void RemoveDuplicate(int arr[])
	{
		int ofc=0;
		int cm=1;
		int placed=1;
		
		//1,1,1,2,2,2,3,3,3,3,4,4,5,6,6
		while(cm < arr.length-1)
		{
			if(arr[ofc] == arr[cm])
			{
				cm++;
				continue;
			}
			ofc++;
			arr[ofc]=arr[cm];
			cm++;
			placed++;
			
		}
		//only print unique elements..
		for(int i=0;i<placed;i++)
		{
			System.out.print(arr[i]+ " ");
			
		}
		System.out.println("Total unqiue placed aquire "+ placed);
	}
	
	//pair found in sorted array....(easy)
	public static void PairSum(int[] arr)
	{
        int target=21;
        int start=0;
        int end=arr.length-1;
        boolean flag=false;
        while(start < end)
        {
        	int sum=arr[start]+arr[end];
        	if(target ==sum)
        	{
        		System.out.println("Pair found "+ sum);
        		flag=true;
        		break;
        	}else if(target > sum)
        	{
        		start ++;
        	}
        	else {
				end --;
			}
        }
        if (!flag) {
			System.out.println("Pair not found: ");
		}
        
	}
	
	public static void main(String[] args) {
		int[] arr= {1,1,1,2,2,2,3,3,3,3,4,4,5,6,6,19};
		RemoveDuplicate(arr);
		PairSum(arr);
	}

}
