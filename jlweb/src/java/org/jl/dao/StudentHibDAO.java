/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.jl.dao;

import java.util.List;
import org.jl.vo.StudentTo;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Rishitha
 */

public class StudentHibDAO extends HibernateDaoSupport implements StudentDAOI{

    
    public StudentTo getStudent(StudentTo st) {
        
       List stList = getHibernateTemplate().find("FROM StudentTo st WHERE st.uname=? AND "+
                "st.password=?",new Object[]{st.getUname(),st.getPassword()});
        //getHibernateTemplate().f
           if(stList != null & stList.size() > 0)     
      return (StudentTo)stList.get(0);
           else
               return null;
    
    }
    
}
