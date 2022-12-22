import MergeSort.MergeS;
import TestG.TG;

import java.util.*;

public class Main {

    public static void main (String args[])
    {
        Integer [] l1 = {5,4,3,2,1,0};
        MergeS m = new MergeS(l1);


        m.sort();
        m.printArr();

    }


}
