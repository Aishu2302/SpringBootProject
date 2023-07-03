package com.aishu.ItemsAPI.service;



import com.aishu.ItemsAPI.repository.entity.Item;

import java.util.List;

public interface ItemService
{

    Item save( Item item );

    void delete( int itemId );

    List<Item> all();

    Item findById( int itemId );

}
