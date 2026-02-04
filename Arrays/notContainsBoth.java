class notContainsBoth {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] arr2 = {3,4,5,6};
        int[] arr3 = new int[arr.length + arr2.length];
        int k = 0;
        
        for(int i = 0; i <arr.length; i++){
            boolean isFound =  false;
            for(int j = 0; j < arr2.length; j++){
                if(arr[i] == arr2[j]){
                    isFound = true;
                    break;
                }
                
            }
                    if(!isFound){
                    arr3[k++] = arr[i];
                }
        }
        
        for(int i = 0; i <arr2.length; i++){
            boolean isFound =  false;
            for(int j = 0; j < arr.length; j++){
                if(arr2[i] == arr[j]){
                    isFound = true;
                    break;
                }
                
            }
                    if(!isFound){
                    arr3[k++] = arr2[i];
                }
        }
        for(int i = 0; i <k; i++){
            System.out.println(arr3[i]);
        }
    }
}