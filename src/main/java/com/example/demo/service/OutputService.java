package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.object.Output;
import com.example.demo.repository.OutputMapper;

@Service
public class OutputService {
  @Autowired OutputMapper mapper;
  public void Create(Output output) {
	  mapper.Create(output);
  }
  public List<Output> Index() {
    return mapper.Index(); 
  }
}