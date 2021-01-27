public class insertionSort {
    static int[] list = {1, 9, 4, 6, 5, -4};
    public static void insertionSort(int [] list){
        for (int i = 1; i < list.length; i++){
//insert list[i] into a sorted sublist list[0...i-1]
//so that list[0..i] is sorted
            int currentElement = list[i];
            int k;
            for(k = i - 1; k >=0 && list[k] > currentElement; k--){
                list[k+1] = list[k];
            }
//insert the current elemtn into list[k+1]
            list[k+1] = currentElement;
        }
    }

    public static void main(String[] args) {
        insertionSort(list);
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }
}
