class Solution{
    static String printMinNumberForPattern(String S){
        // code here
        int n=S.length();
        char[] arr=new char[n+1]; // created an array to store all the possible numbers till the length of the string including 0
        for(int i=0;i<n+1;i++){
            arr[i]=(char)(i+1+'0'); // stored them as character
        }
        // currently elements in the array are in increasing order
        for(int i=n-1;i>=0;i--){
            if(S.charAt(i)=='D'){ // if the string provided at any point says decreasing, swap the next and current index number, so now they are in decreasing order
                swap(arr,i,i+1);
                int j=i+1; // shift j to the next index
                while(j<n && S.charAt(j)=='D'){ // condition that it iterates till the end, checking for if there is any need for swapping such that it is in decreasing form
                    swap(arr,j,j+1); // doing the same operation
                    j++;
                }
            }
        }
    String res = new String(arr);
    return res;
    }
    static void swap(char[] arr, int i, int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
