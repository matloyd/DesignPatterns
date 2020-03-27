package com.matloyd.creationals.prototype.registery;

import java.util.HashMap;
import java.util.Map;




//this is another design pattern that is not one of gof dp collection
public class ItemRegistery {

    private Map<Long, Item> map = new HashMap<>();

    {
        add(new Item(12L, "Item 1"));
        add(new Item(13L, "Item 2"));
    }

    public Item get(Long id) {
        if(map.containsKey(id))
            return map.get(id).clone();
        return null;
    }

    public void add(Item item) {
        map.put(item.getId(), item);
    }
}
