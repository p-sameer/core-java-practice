//WAP to check the given element is present in the array or not.
class Example7{

 public static void main(String args[]){
int arr[]={23,78,45,12,23,23,12,90,11};
   boolean b=false;
int key=12;

 for(int i=0;i<arr.length;i++){
if(key==arr[i]){
b=true;
}
}
if(b){
System.out.println("Yes, The element is present in the the array");
}
else{
System.out.println("No, The element is not present in the array");
}

}
}