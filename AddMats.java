import java.util.Arrays;

public class AddMats {

	public static void main(String[] args) {
		double[][] matA = {
				{1, 2.2, 3},
				{4, 5, 6},
				{7, 8, 9}
		};
		int rowA = matA.length, colA = matA[0].length;
		double[][] matB = {
				{10, 11.5, 12},
				{13, 14, 16},
				{16, 17, 18.1}
		};
		int rowB = matB.length, colB = matB[0].length;
		
		double[][] matR = new double[rowA][colA];
		
		if (rowA==rowB&&colA==colB) {
			System.out.println("Sum of 2 Matrices: ");
			for (int i=0;i<rowA;++i) {
				for (int j=0;j<colA;++j) 
					matR[i][j]=matA[i][j]+matB[i][j];
				System.out.println(Arrays.toString(matR[i]));
			}
		}
	}

}
