/*Ques2.  read the array and add the length
create the prefix array of the given array
initialize the count  = 0
caculate the left sum 
calculate the right sum 
 */
 class PrefixArray2{
    public static void main(String[] X){
        int[] arr={1,2,3,4,5};
        int i, ls,rs;
        int n = arr.length;
        int[] prefix = new int[n];
        prefix[0] = arr[0];
        for (i=1;i<n;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        for (i=0;i<n;i++){
            ls = prefix[i] - arr[i];
            rs = prefix[n-1] - prefix[i];
            System.out.println("Left sum = " + ls + " Right sum = " + rs);
        }
    }    
 }
