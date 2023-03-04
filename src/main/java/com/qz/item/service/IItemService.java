package com.qz.item.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qz.item.pojo.Item;

public interface IItemService extends IService<Item> {
    void saveItem(Item item);
}
