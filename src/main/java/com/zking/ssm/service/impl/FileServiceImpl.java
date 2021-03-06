package com.zking.ssm.service.impl;

import com.zking.ssm.mapper.FileMapper;
import com.zking.ssm.model.File;
import com.zking.ssm.service.IFileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class FileServiceImpl implements IFileService {

    @Autowired
    private FileMapper fileMapper;


    @Override
    public void add(File file) {
        fileMapper.insert(file);
    }

    @Override
    public File load(File file) {
        File f = fileMapper.selectByPrimaryKey(file.getFileId());
        return f;
    }
}
