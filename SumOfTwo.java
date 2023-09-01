class SumOfTwo {

    private int arr[];
    private  int target;

    SumOfTwo(int[] arr, int target){
         this.arr = arr;
         this.target = target;
    }

    public  void  getIndices(){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){

                int sum = arr[i] + arr[j];
                   if (sum == target && i != j) {
                            System.out.print(i + "," + j);
                        }


            }


        }
    }

}
