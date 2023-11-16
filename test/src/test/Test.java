package test;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-111-111-");
		if(args!=null) {
			for(int i=0 ; i< args.length ; i++) {
				System.out.println(args[i]);
			}
		}
		
		int[] arr = {10 , 4 , 0 , 5 , 1 , -1};
		System.out.println("=================");
		
		int a = arr[1];
		int b = arr[2];
		
		arr[2] = a;
		arr[1] = b;
		for (int k=0 ; k<arr.length ; k++) {
			System.out.println(arr[k]);
		}
		
	}

}
