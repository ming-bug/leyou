package com.leyou.item.service;

import com.leyou.item.pojo.Category;

import java.util.List;

public interface ICategoryService {

    public List<Category> queryCategoriesByPid(Long pid);

    public List<String> queryNamesByIds(List<Long> ids);

    List<Category> queryAllByCid3(Long id);
}
