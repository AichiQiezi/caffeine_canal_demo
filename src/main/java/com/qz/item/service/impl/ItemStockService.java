package com.qz.item.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qz.item.service.IItemStockService;
import com.qz.item.mapper.ItemStockMapper;
import com.qz.item.pojo.ItemStock;
import org.springframework.stereotype.Service;

@Service
public class ItemStockService extends ServiceImpl<ItemStockMapper, ItemStock> implements IItemStockService {
}
