import java.util.Arrays;

public class ArrOps {

	public static void main(String[] args) {
		double[] a = {4.0,4.0,4.0,3.6};
		int n = a.length;
		
		for (int i=0;i<n;++i) 
			for (int j=0;j<i;++j)
				if (a[j]>a[i]) {
					a[j]=a[j]+a[i];
					a[i]=a[j]-a[i];
					a[j]=a[j]-a[i];
				}
		System.out.println("Array after sorted: " + Arrays.toString(a));
		
		double sum=0;
		for (int i=0;i<n;++i) sum+=a[i];
		System.out.println("Sum of array elements: " + sum);
		System.out.println("Average value of array elements: " + sum/n);
	}

}
