package buoi3;

public class bubble {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

void Selection_Sort(int n , int a[])
{
    for(int i=1;i<n-1;i++)
  {
    int min = a[i], min_pos = i;
    for(int j=i+1;j<n;j++)
        if(a[j]<min){
            min = a[j];
            min_pos = j;
        }   
    int tam = a[i];
    a[i] = a[min_pos];
    a[min_pos] = tam;
  }
}

  void FirstDel (List L){{
    L.First = L.First.next;
  
}}