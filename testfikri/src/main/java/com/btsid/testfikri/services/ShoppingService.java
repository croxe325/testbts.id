package com.btsid.testfikri.services;

import com.btsid.testfikri.model.Shopping;

import java.util.List;

public interface ShoppingService {

    List<Shopping> listShopping();
    Shopping saveOrUpdate(Shopping shopping);
    Shopping getIdShopping(Integer id);
    String hapus(Integer id);
}
