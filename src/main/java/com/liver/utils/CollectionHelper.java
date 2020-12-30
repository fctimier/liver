package com.liver.utils;

import com.liver.common.helper.Acceptor;
import com.liver.common.helper.Maper;
import org.springframework.util.CollectionUtils;

import java.lang.reflect.Method;
import java.util.*;

/**
 *  集合工具类
 * @date 2020/12/30
 */
public class CollectionHelper extends CollectionUtils {


        public static <K,V> Map<K,V> map(Collection<V> clt, Maper<K, V> maper){

            Map<K,V> map = new HashMap<>();

            for (V value : clt) {
                map.put(maper.map(value), value);
            }
            return map;
        }


        public static <K,V,T> Map<K,T> map(Collection<V> clt,Maper<K, V> maper,Maper<T, V> tmaper){

            Map<K,T> map = new HashMap<>();

            for (V value : clt) {
                map.put(maper.map(value), tmaper.map(value));
            }
            return map;
        }



        public static <K,V> Map<K,List<V>> mapCollection(Collection<V> clt, Maper<K, V> maper){

            Map<K,List<V>> map = new HashMap<K, List<V>>();

            for (V value : clt) {
                K key = maper.map(value);
                List<V> list = map.get(key);
                if(list == null) {
                    list = new ArrayList<>();
                    map.put(key, list);
                }
                list.add(value);
            }
            return map;
        }

        public  static <T> void range(List<T> list, int step, Acceptor<List<T>> acceptor){
            int len = list.size();
            int start = 0;

            while(start < len) {

                acceptor.accept(list.subList(start, Math.min(start + step , len)));
                start += step;
            }
        }

        public static Object getValueByFieldName(String fieldName, Object obj) throws Exception{

            String firstLetter = fieldName.substring(0, 1).toUpperCase();

            String getter = "get" + firstLetter + fieldName.substring(1);

            Method method = obj.getClass().getMethod(getter, new Class[] {});

            Object value = method.invoke(obj, new Object[] {});

            return value;
        }


}
