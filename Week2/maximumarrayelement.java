class maxelement{
  public static void main(String[] arg){
    int arr[]={12,3,4,5,6,9,1};
    int max=arr[0];
    for(int i=1;i<arr.length;i++){
      if(max<arr[i]){
        max=arr[i];
        
      }

    }
    System.out.println(max);
  }
  }
