package com.hr.controller;

import com.hr.entity.News;
import com.hr.entity.Topic;
import com.hr.service.NewsService;
import com.hr.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

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
    @Autowired
    private Environment environment;
    @GetMapping("/")
    public String Index(Model model,@RequestParam(value = "tid",required = false) Long tid){
        List<News> newslist=null;
        if (tid == null) {
               newslist = newsService.queryAllNews();
        }else {
            newslist = newsService.queryNewsByTid(tid);
        }

        List<Topic> topics = topicService.quarryAllTopics();

        String guonei = environment.getProperty("guonei");
        String guonji = environment.getProperty("guoji");
        String yule = environment.getProperty("yule");
        List<News> newsList1 = newsService.queryNewsByTname(guonei);//国内新闻
        List<News> newsList2 = newsService.queryNewsByTname(guonji);//国际新闻
        List<News> newsList3 = newsService.queryNewsByTname(yule);//娱乐新闻

        model.addAttribute("newslist",newslist);
        model.addAttribute("topics",topics);
        model.addAttribute("newsList1",newsList1);
        model.addAttribute("newsList2",newsList2);
        model.addAttribute("newsList3",newsList3);
        return "index";
    }

    /*@GetMapping("/index/topicnews/{tid}")
    public String topicNews(@PathVariable("tid") long tid,Model model){
        List<News> topicNewsList = newsService.queryNewsByTid(tid);
        model.addAttribute("topicNewsList",topicNewsList);
        return "index";*/
    }

