package com.example.demo.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.object.Output;

@Mapper
public interface OutputMapper {
  
  public void Create(Output output);
  
  public List<Output> Index();
}
