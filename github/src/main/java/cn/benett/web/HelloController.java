package cn.benett.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Author:chenpeng09@meituan.com
 * Date: 2017/12/7.
 * Time: 下午7:40.
 **/
public class HelloController {
    public static void main(String[] args) {
        HelloController hc = new HelloController();
        hc.fun();
//        System.out.println("hahhhah");
    }

    private static String getName(){
        return "cp09";
    }

    /**
     *
     */
    private void fun(){
        List<Integer> list;
        list = new ArrayList<>();
        list.add(1);
        list.add(2);
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        map.put(1,list);
        Iterator<Map.Entry<Integer, List<Integer>>> it = map.entrySet().iterator();
        while (it.hasNext()) System.out.println(it.next());
        list.add(3);
        Iterator<Map.Entry<Integer, List<Integer>>> it2 = map.entrySet().iterator();
        while (it2.hasNext()) System.out.println(it2.next());

    }



    public void fun2(){
        System.out.println("本地提交ff");
    }
}
