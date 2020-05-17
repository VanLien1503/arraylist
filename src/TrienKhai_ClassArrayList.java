import jdk.nashorn.internal.parser.Scanner;

import java.util.ArrayList;


public class TrienKhai_ClassArrayList {
    public static void main(String[]args){
        ArrayList<Integer>arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        System.out.println(arrayList);
        for (Integer arraylist:arrayList) {
            System.out.print(arraylist+"\t");
        }
        System.out.println("\n"+"size: "+ arrayList.size());
        // them phân tử 40 vào vị trí 3
        System.out.println();
        System.out.println(" them phân tử 40 vào vị trí 3");
        arrayList.add(3,40);
        System.out.println(arrayList);
        System.out.println( arrayList.size());

        //set
        arrayList.set(3,40-2);
        System.out.println(arrayList);
        System.out.println("size: "+arrayList.size());
        ArrayList<Integer>arrayList1=new ArrayList<>();
        arrayList1.add(2+arrayList1.size());
        arrayList1.add(2+arrayList1.size());
        arrayList1.add(2+arrayList1.size());
        arrayList1.add(2+arrayList1.size());
        arrayList1.add(2+arrayList1.size());

        System.out.println("Thêm các phần tử của arraylist1 vào vị trí thứ ídex :"+arrayList.size());
        arrayList.addAll(arrayList.size(),arrayList1);
        System.out.println(arrayList);
// truy suat đến các phần tử thông qua chỉ số:
        Integer index = arrayList.get(arrayList.size()-1);
        System.out.println("size : "+arrayList.size());
        System.out.println("Truy suất đến phần tử có chỉ số " + (arrayList.size()-1) + " value = "+ index);

        // xóa phần tử
        System.out.println(arrayList.size());
        arrayList.clear();
        System.out.println(arrayList.size());
        arrayList.addAll(arrayList.size(),arrayList1);
        arrayList.size();
        System.out.println(arrayList);
        arrayList.remove(arrayList.size()/2);
        System.out.println(arrayList);
        arrayList.remove("6");
        System.out.println(arrayList);

        // kiểm tra phân tử có trong mảng không
        boolean check = arrayList.contains(5);
        if (check)
            System.out.println("tìm thấy 5 ");
        else
            System.out.println("k thấy");

        // indexOf trả về Vị trí tìm thấy
        int checkindexOF =arrayList.indexOf(7);
        System.out.println(checkindexOF);
}

}
