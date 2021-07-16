package com.hr.dao;

import com.hr.entity.Topic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
    Created with IntelliJ IDEA.
    @author: wang sir
    Date: 2021/7/16
    Time: 14:44
    To change this template use File | Settings | File Templates.
    Description: 
 */
@Repository
public interface TopicDao extends CrudRepository<Topic, Long> {

    public List<Topic> getAllBy();

}