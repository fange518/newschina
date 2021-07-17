package com.hr.dao;

import com.hr.entity.News;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
    Created with IntelliJ IDEA.
    @author: wang sir
    Date: 2021/7/16
    Time: 16:04
    To change this template use File | Settings | File Templates.
    Description:
 */
@Repository
public interface NewsDao extends CrudRepository<News, Long> {

    /*
     *查询所有新闻，根据创建时间倒序排列
     * @return
     * */
    public List<News> getAllByOrderByNcreateDateDesc();

    /*
     * 根据tname查询主题下的新闻
     * */

    @Query(value = "select * from news where ntid=(select tid from topic where tname = ?1) order by ncreateDate desc limit 5",nativeQuery = true)
    public List<News> getAllNewsByTname(@Param("tname") String tname);

    /*
    *根据tid查询主题下的新闻
    * */

    public List<News> getAllByNtidOrderByNcreateDateDesc(long ntid);


}