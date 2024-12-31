package map;

import java.util.HashMap;
import java.util.Map;

/**
 * java.util.Map接口
 * Map是一个很常用的数据结构，体现的样子是一个多行两列的表格。
 * 其中左列叫做key,右列叫做value.
 * Map总是根据key来获取value。
 *
 * 最常用的实现类:java.util.HashMap 散列表，当今查询速度最快的数据结构
 */
public class MapDemo1 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        /*
            V put(K k,V v)
            向Map中存入一组键值对
            Map有一个要求，key不允许重复(equals比较)。如果使用已有的key
            保存新的value时则是替换value操作。因此put方法定义了返回值，
            当有value被替换时会返回被替换的value。如果key不存在那么返回
            值也为null(放进去时没有value被替换)

         */
        Integer num = map.put("语文",99);
        System.out.println(num);
        map.put("数学",98);
        map.put("英语",97);
        map.put("物理",96);
        map.put("化学",99);

        System.out.println(map);

        num = map.put("语文",88);//原来的99会被替换
        System.out.println(map);
        System.out.println(num);

        /*
            V get(Object key)
            根据给定的key获取对应的value。如果给定的key在Map中不存在则
            返回值为null
         */
        num = map.get("数学");
        System.out.println(num);
        num = map.get("体育");
        System.out.println(num);

        int size = map.size();
        System.out.println("size:"+size);

        /*
            V remove(Object key)
            删除给定的key所对应的键值对。返回值为该key对应的value
         */
        num = map.remove("数学");
        System.out.println(map);
        System.out.println(num);

        /*
            void clear()
            清空Map
         */
        map.clear();
        System.out.println(map);

    }
}








