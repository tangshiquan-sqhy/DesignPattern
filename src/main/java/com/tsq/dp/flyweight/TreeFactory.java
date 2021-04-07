package com.tsq.dp.flyweight;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 也可以在IOC容器刷新时，通过依赖查找，进行map数据的初始化。
 */
public class TreeFactory {
    private static Map<String, Tree> map = new ConcurrentHashMap<>();

    public static Tree createTree(String name, String data) {
        if (map.containsKey(name)) {
            return map.get(name);
        }
        // todo 多线程时 这里应该使用单例模式，保证同名对象只有一个
        Tree tree = new Tree(name, data);
        map.put(name, tree);
        return tree;
    }
}
