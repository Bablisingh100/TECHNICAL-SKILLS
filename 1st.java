//given an array count no. of element having atleast one element greater than itself
class Ist{
    public static void main(String[] args){
        int arr[]={-3,2,6,8,4,5,7};
        int count = 0 ;
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for (int i=0;i<arr.length;i++){
            if (arr[i]<max){
                count++;
            }
        }
        System.out.println(count);
    }
}
