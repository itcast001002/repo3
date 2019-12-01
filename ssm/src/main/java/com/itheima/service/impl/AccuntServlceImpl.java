package com.itheima.service.impl;

import com.itheima.domain.Account;
import com.itheima.mapper.AccuntMapper;
import com.itheima.service.AccuntServlce;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
@Service("accuntServlce")
public class AccuntServlceImpl implements AccuntServlce {
    @Autowired
private AccuntMapper accuntMapper;
    @Override
    public void save(Account account) {
       /* try {
            InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            AccuntMapper mapper = sqlSession.getMapper(AccuntMapper.class);
            mapper.save(account);
            sqlSession.commit();
            sqlSession.close();

        } catch (IOException e) {
            e.printStackTrace();
        }*/
       accuntMapper.save(account);
    }

    @Override
    public List<Account> findAll() {
        try {
            InputStream resourceAsStream = Resources.getResourceAsStream("sqlMapConfig.xml");
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
            SqlSession sqlSession = sqlSessionFactory.openSession();
            AccuntMapper mapper = sqlSession.getMapper(AccuntMapper.class);
            List<Account> all = mapper.findAll();
            sqlSession.close();
            return all;


        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
    }

