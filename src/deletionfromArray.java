import java.util.Scanner;

public class deletionfromArray {
    public static void main(String[] args) {
        int n,m,p;
        Scanner s = new Scanner(System.in);
        System.out.println("enter no.of elements in array");
        n=s.nextInt();
        int a[]=new int[n];
        int b[]=new int[n-1];
        System.out.println("Enter values");
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();

        }
        System.out.println("enter the index value to be deleted");
        m=s.nextInt();
        for(int i=0;i<a.length;i++){
            if(i<m)
            {
                b[i]=a[i];

            }
            else if (i==m)
                continue;
            else
            {
                b[i-1]=a[i];
            }


        }
        System.out.println("elements are:");
        for(int i=0;i<n-1;i++)
        {
            System.out.println(b[i]);
        }

    }

}

