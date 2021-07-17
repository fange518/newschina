package com.hr.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

/*
    Created with IntelliJ IDEA.
    @author: wang sir
    Date: 2021/7/16
    Time: 14:37
    To change this template use File | Settings | File Templates.
    Description: 
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "topic")


public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long tid;
    @Column(name = "tname")
    private String tname;
}