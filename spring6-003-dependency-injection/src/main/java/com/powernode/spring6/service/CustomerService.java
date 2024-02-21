package com.powernode.spring6.service;

import com.powernode.spring6.dao.CustomerDao;

public class CustomerService {
    CustomerDao dao;

    public CustomerService(CustomerDao dao) {
        this.dao = dao;
    }
    public void say(){
        dao.Daosout();
    }

}
