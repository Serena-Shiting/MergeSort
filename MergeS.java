package MergeSort;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeS <T extends Number> {

    ArrayList <T> list;

    public MergeS(ArrayList<T> list)
    {
        this.list = list;
    }

    public void sort()
    {
        if (list.size()> 0)
        {
            this.list = sortHelper(0, list.size()-1);

        }
    }

    private ArrayList<T> sortHelper(int startIndex, int endIndex)
    {

        if (startIndex == endIndex)
        {
            return new ArrayList <>((Integer) this.list.get(startIndex));
        }else{
            int mid = (endIndex + startIndex)/2;
            ArrayList <T> new1  = this.sortHelper(startIndex, mid);
            ArrayList <T> new2  = this.sortHelper(mid+1, endIndex);

            return this.combineArr(new1, new2);
        }


    }

    private ArrayList<T> combineArr (ArrayList<T> arr1, ArrayList<T> arr2 )
    {

        ArrayList <T> temp = new ArrayList<>();
        int p1 = 0;
        int p2 = 0;
        int t1 = 0;

//        while (p1 < arr1.size() || p2 < arr2.size())
//        {
//            if (p1 < arr1.size()&& p2 < arr2.size() && arr1.get(p1) <= arr2.get(p2))
//            {
//                temp[t1] = arr1[p1++];
//            }
//            else if (p1 < arr1.length && p2 < arr2.length && arr1[p1] > arr2[p2])
//            {
//                temp[t1] = arr2[p2++];
//            }
//            else if (p1 < arr1.length)
//            {
//                temp[t1] = arr1[p1++];
//            }
//            else
//            {
//                temp[t1] = arr2[p2++];
//            }
//            t1 ++;
//        }

        return temp;

    }

//    public void printArr()
//    {
//        for (Integer integer : Arrays.stream(this.arr).toList()) {
//            System.out.println(integer);
//        }
//
//    }
}

// 0,1,2,3,4,5,6,7
// 1,2,3,4,5,6,7,8

//4,5,6,7
//
//11/2 = 5
//13/2 = 6
//
//p1 < l1 && p2 < l2 && arr1[p1] <= arr2[p2]
//
//p1 < l1 && p2 < l2 && arr1[p1] > arr2[p2]
//
//p1 < l1
//add all in p1 to temp
//
// p2 < l2
// add all in p2 to temp
//
