class BinarySearch{

    public static void main(String[] args){

        int[] arr = {3,7,20,32,45,55,60,75};

        int foundNumber = new BinarySearch().search(arr,60);

        System.out.println(foundNumber);

    }


    public int search(int[] arr, int n){

        int min = 0;
        int max=arr.length-1;
        int mid = (max+min)/2;

        System.out.println(max);
        System.out.println(min);
        System.out.println(mid);
        if(arr[mid] == n){
            System.out.println("Number is at index " + mid);
            return arr[mid];
        }else{

            while((min+max) % 2 >1){

                 if(n>arr[mid]){

                    min = mid;
                    mid = (max+min)/2;
                    if(arr[mid] == n){
                        System.out.println("Number is at index " + mid);
                        return arr[mid];
                    }

                }else if(n<arr[mid]){

                    max = mid;
                    mid = (max+min)/2;
                    if(arr[mid] == n){
                        System.out.println("Number is at index " + mid);
                        return arr[mid];
                    }

                }
    
            }
            return -1;
            
    

        }
        
    }

}