package com.hr.service;/*
    Created with IntelliJ IDEA.
    @author: wang sir
    Date: 2021/7/16
    Time: 16:07
    To change this template use File | Settings | File Templates.
    Description: 
 */

import com.hr.entity.News;

import java.util.List;

public interface NewsService {
    /*
    * 查询所有新闻
    * */


    public List<News> queryAllNews();

    /*
    * 根据主题名称查询新闻
    * */

    public List<News> queryNewsByTname(String tname);

    /*
     * 根据主题tid查询新闻
     * */

    public List<News> queryNewsByTid(long tid);
}
