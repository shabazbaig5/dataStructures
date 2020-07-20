class InsertionSort{

    public static void main(String[] args){

        int[] arr = {10,2,8,6,7,3};

        int[] sortedArr = new InsertionSort().sort(arr);

        // for(int i =0; i<arr.length; i++){

        //     System.out.print(sortedArr[i] + " ");

        // }

    }


    public int[] sort(int[] arr){


        System.out.println("The arr before sorting is : ");

        for(int i =0; i<arr.length; i++){

            System.out.print(arr[i] + " ");

        }

        
        for(int i = 1; i < arr.length; i++){

            int p = arr[i];

            int j = i-1;

            while(j >= 0 && arr[j] > p){

                arr[j+1] = arr[j];
                j--;

            }
            arr[j+1] = p;
        }

        // for(int i=1; i<arr.length; i++){

        //     int p = arr[i];
            
        //     int j =i-1;
        //     while(j >= 0 && arr[j] > p){mmmmmmmmmmmmmmmmmmmmmmmmmmmmm

        //         arr[j+1] = arr[j];

        //         j--;
            

        //     }
        //     arr[j+1] = p;

        // }

        System.out.println("\nThe arr after sorting is : ");

        for(int i =0; i<arr.length; i++){

            System.out.print(arr[i] + " ");

        }

        return arr;

    }

}