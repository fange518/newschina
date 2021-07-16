package com.hr.controller;

import com.hr.entity.News;
import com.hr.entity.Topic;
import com.hr.service.NewsService;
import com.hr.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/*
    Created with IntelliJ IDEA.
    @author: wang sir
    Date: 2021/7/16
    Time: 10:23
    To change this template use File | Settings | File Templates.
    Description: 
 */
@Controller
public class IndexController {


    @Autowired
    private TopicService topicService;
    @Autowired
    private NewsService newsService;
    @GetMapping("/")
    public String Index(Model model){
        List<Topic> topics = topicService.quarryAllTopics();
        List<News> newslist = newsService.queryAllNews();

        model.addAttribute("newslist",newslist);
        model.addAttribute("topics",topics);
        return "index";
    }

}