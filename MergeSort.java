package sorting;

public class MergeSort {
     static void merge(int[] a, int p, int q, int r){
        int n1 = q - p+1;
        int n2 = r - q;

        int L[] = new int[n1];
        int M[] = new int[n2];

        for(int i = 0; i < n1; i++)
            L[i] = a[p+i];
        for(int j = 0; j < n2; j++)
            M[j]  = a[q+1+j];

        int i = 0, j = 0;
        int k = p;
        while (i < n1 && j < n2) {
            if(L[i] <= M[j]){
                a[k] = L[i];
                i++;
            }else{
                a[k] = M[j];
                j++;
            }
            k++;
        }
        while(i < n1){
           a[k] = L[i];
           i++;
           k++;
        }
        while(j < n2){
            a[k] = M[j];
            j++;
            k++;
        }
     }
    static void mergeSort(int[] a, int l, int r){
        if (l < r) {
            int mid = (r + l)/2;
            mergeSort(a, l, mid);
            mergeSort(a, mid+1, r);

            merge(a, l, mid, r);
        }
    }
    public static void main(String[] args) {
        int[] array = {6,5,12,108,9,1};
        mergeSort(array, 0, array.length-1);
        for (int i : array) {
            System.out.println(i);
        }
    }
}
