class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int iteration = flowerbed.length - 2;
        int count = 0;
        if(flowerbed.length ==2 && flowerbed[0] == 0 && flowerbed[1] == 0){
               count++;
               return  n<=count;
            }else if(flowerbed.length == 1 && flowerbed[0] == 0){
                count++;
                return n<=count;
            }else if(flowerbed.length == 3 && (flowerbed[0] == 0 && flowerbed[1] == 0 &&   flowerbed[2] == 0) ){
                flowerbed[1] = 1 ; flowerbed[2] = 1;
                count+=2;
                return n<=count;
            }

        for(int i=0;i<iteration;i++){
            System.out.println(flowerbed[i] + ""+flowerbed[i+1] + ""+  flowerbed[i+2] );
            
            if((flowerbed[i] == 0 && flowerbed[i+1] == 0 &&   flowerbed[i+2] == 0) && i == 0 ){
                 flowerbed[i] = 1;
                 count++;
            }else if(flowerbed[i] == 0 && flowerbed[i+1] == 0 &&   flowerbed[i+2] == 0 ){
                flowerbed[i+1] = 1;
                count++;
            }else if ((flowerbed[i] == 1 && flowerbed[i+1] == 0 &&   flowerbed[i+2] == 0) && i == iteration-1 ){
                 flowerbed[i+2] = 1;
                 count++;
            }else if ((flowerbed[i] == 0 && flowerbed[i+1] == 0 &&   flowerbed[i+2] == 1) && i == 0 ){
                 flowerbed[i] = 1;
                 count++;
            }
        }
        
          return  n<=count;
    }
}