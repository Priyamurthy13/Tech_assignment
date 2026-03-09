package Assignment3.module7;
public class FirstLastOccurrence {

    static int first(int[] arr,int x){
        int l=0,r=arr.length-1,res=-1;

        while(l<=r){
            int mid=(l+r)/2;

            if(arr[mid]==x){
                res=mid;
                r=mid-1;
            }
            else if(arr[mid]<x)
                l=mid+1;
            else
                r=mid-1;
        }
        return res;
    }

    static int last(int[] arr,int x){
        int l=0,r=arr.length-1,res=-1;

        while(l<=r){
            int mid=(l+r)/2;

            if(arr[mid]==x){
                res=mid;
                l=mid+1;
            }
            else if(arr[mid]<x)
                l=mid+1;
            else
                r=mid-1;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr={1,2,2,2,3,4};

        System.out.println(first(arr,2));
        System.out.println(last(arr,2));
    }
}