public class MatrixTranspose {
    static final int n=3;
    static void transpose(int Mat[][])
    {
        for (int i=0;i<n;i++)
            for (int j=i+1;j<n;j++){
                int temp=Mat[i][j];
                Mat[i][j]=Mat[j][i];
                Mat[j][i]=temp;
            }
    }

    public static void main(String[] args) {
        int Mat[][]={{1,1,1},{2,2,2},{3,3,3}};
        transpose(Mat);
        System.out.println("Modified matrix is \n");
        for (int i=0;i<n;i++){
            for (int j=0;j<n;j++)
                System.out.print(Mat[i][j] + " ");
            System.out.print("\n");
        }
    }
}
//time complexity => O( n^2 )
//Space complexity => O( n )
