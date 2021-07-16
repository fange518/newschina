package com.hr.service.impl;

import com.hr.dao.TopicDao;
import com.hr.entity.Topic;
import com.hr.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
    Created with IntelliJ IDEA.
    @author: wang sir
    Date: 2021/7/16
    Time: 14:42
    To change this template use File | Settings | File Templates.
    Description: 
 */
@Service
public class ToicServiceImpl implements TopicService {
    @Autowired
    private TopicDao topicDao;
    @Override
    public List<Topic> quarryAllTopics() {
        List<Topic> topicList = topicDao.getAllBy();

        return topicList;
    }
}