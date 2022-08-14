int min;
        int temp;
        for(int k=0;k< arr.length-1;k++){
            min= k;
            for(int j=k+1;j< arr.length;j++){
                if(arr[j]<arr[min]){
                    min= j;
                }
            }
            if(min != k){
//                Swap
                temp=arr[k];
                arr[k]=arr[min];
                arr[min]=temp;
            }
        }