package com.hr.service;

import com.hr.entity.Topic;

import java.util.List;

/*
    Created with IntelliJ IDEA.
    @author: wang sir
    Date: 2021/7/16
    Time: 14:36
    To change this template use File | Settings | File Templates.
    Description: 
 */
public interface TopicService {

    /*
    * 查询所有主题
    * @return
    *
    * */

    public List<Topic> quarryAllTopics();
}