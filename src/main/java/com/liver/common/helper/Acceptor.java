package com.liver.common.helper;

import java.util.function.Consumer;

@FunctionalInterface
public interface Acceptor <V> extends Consumer<V>{

    void accept(V value);

}