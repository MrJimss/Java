package Ch03_BubbleSort;

import java.util.Scanner;
class BubbleSortApp
{
public static void main(String[] args)
{
    int count=0;
    int[] arr= new int[10];
    Scanner k= new Scanner(System.in);
for (int i=0; i<10;i++)
{
     int n= k.nextInt();
     arr[i]=n;
}
int n = arr.length;
for (int i = 0; i < n - 1; i++)
for (int j = 0; j < n - i - 1; j++)
    if (arr[j] > arr[j + 1]) {
        count++;
        int temp = arr[j];
        arr[j] = arr[j + 1];
        arr[j + 1] = temp;
    }
k.close();

System.out.println("count total is "+ count);
}  // end main()
}  // end class BubbleSortApp
