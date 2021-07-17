package com.hr.service.impl;

import com.hr.dao.NewsDao;
import com.hr.entity.News;
import com.hr.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
    Created with IntelliJ IDEA.
    @author: wang sir
    Date: 2021/7/16
    Time: 16:07
    To change this template use File | Settings | File Templates.
    Description: 
 */
@Service
public class NewsServiceImpl implements NewsService {
    @Autowired
    private NewsDao newsDao;

    @Override
    public List<News> queryAllNews() {
        List<News> newsList = newsDao.getAllByOrderByNcreateDateDesc();
        return newsList;
    }

    @Override
    public List<News> queryNewsByTname(String tname) {
        return newsDao.getAllNewsByTname(tname);
    }

    @Override
    public List<News> queryNewsByTid(long tid) {
        return newsDao.getAllByNtidOrderByNcreateDateDesc(tid);
    }
}