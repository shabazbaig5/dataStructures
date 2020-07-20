class SelectionSort{

    public static void main(String[] args){

        int[] arr = {9,2,8,12,7};

        int[] sortedArr = new SelectionSort().sort(arr);

    }





    public int[] sort(int[] arr){

        System.out.println("The recieved array would be : ");
        for(int i = 0; i<arr.length; i++){

            System.out.print(arr[i] + " ");

        }
        System.out.println("\n the sorted array would be : ");

        int min = 0;

        for(int i =0; i<arr.length; i++){

            min = i;
            for(int j=i+1; j<arr.length; j++){

                if(arr[min] > arr[j]){
                    min = j;
                }
            }

            if(min != arr[i]){

                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
            }

        }
        for(int i = 0; i<arr.length; i++){

            System.out.print(arr[i] + " ");

        }
        return arr;
    }

}