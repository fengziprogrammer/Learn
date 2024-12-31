package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Map的遍历
 * Map提供了三种遍历方式:
 * 1:遍历所有的key
 * 2:遍历每一组键值对
 * 3:遍历所有的value(相对不常用)
 */
public class MapDemo2 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("语文",99);
        map.put("数学",98);
        map.put("英语",97);
        map.put("物理",96);
        map.put("化学",99);
        System.out.println(map);
        /*
            Set<K> keySet()
            将当前Map中所有的key以一个Set集合形式返回。遍历该集合等同于
            遍历Map中所有的key
         */
        Set<String> keySet = map.keySet();
        for(String key : keySet){
            System.out.println("key:"+key);
        }

        /*
            遍历每一组键值对
            Set<Entry> entrySet()
            将当前Map中的每一组键值对(若干Entry实例)以一个Set集合形式返回

            java.util.Map.Entry
            该类的每一个实例用于表示Map中的一组键值对
         */
        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
        for(Map.Entry<String,Integer> e:entrySet){
            String key = e.getKey();
            Integer value = e.getValue();
            System.out.println(key+":"+value);
        }
        /*
            Collection<V> values()
            将当前Map中的所有value以一个集合形式返回
         */
        Collection<Integer> values = map.values();
        for(Integer value :values){
            System.out.println("value:"+value);
        }
    }
}


