package com.liver.common.helper;

@FunctionalInterface
public interface Maper<K,V> {

    K map(V input);
}
