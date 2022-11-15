package array_list;

import java.util.ArrayList;

public class Array_List {

    public static void main(String[] args) {

        ArrayList<String> strArray = new ArrayList<>();

        strArray.add("Raseal");
        strArray.add("Nadim");
        strArray.add("alomgir");
        strArray.add("raju");

        strArray.add(1, "Hello");

        System.out.println(strArray);
        // 2nd type of printing arrayList
        for (String x : strArray) {
            System.out.println(x);
        }

        System.out.println("\n Custom Aarraylist declaration print");
        // arraylist using class
        ArrayList<StudentInfo> arraylist = new ArrayList<StudentInfo>();

        arraylist.add(new StudentInfo("rasel",1));
        arraylist.add(new StudentInfo("ddfds",2));
        arraylist.add(new StudentInfo("aadsafsel",3));

        for (int i = 0; i < arraylist.size(); i++) {
            
            StudentInfo st = arraylist.get(i);
            System.out.println(st.Name);
        }

    }

}
