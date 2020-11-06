package com.atguigu.gamll.user.service.impl;

import com.atguigu.gamll.user.bean.UmsMember;
import com.atguigu.gamll.user.bean.UmsMemberReceiveAddress;
import com.atguigu.gamll.user.mapper.UmsMemberReceiveAddressMapper;
import com.atguigu.gamll.user.mapper.UserMapper;
import com.atguigu.gamll.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;
    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMembers=userMapper.selectAll();
        return umsMembers;
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String meberId) {
        /*Example e=new Example(UmsMemberReceiveAddress.class);
        //定义过滤条件
        e.createCriteria().andEqualTo("memberId",meberId);
        //传入对象进行查询，具体使用那一个属性字段进行过滤就看对象中的哪个属性不为空
        List<UmsMemberReceiveAddress> umsMemberReceiveAddress = umsMemberReceiveAddressMapper.selectByExample(e);*/
        UmsMemberReceiveAddress umsMemberReceiveAddress=new UmsMemberReceiveAddress();
        umsMemberReceiveAddress.setMemberId(meberId);
        List<UmsMemberReceiveAddress> umsMemberReceiveAddressList = umsMemberReceiveAddressMapper.select(umsMemberReceiveAddress);
        return umsMemberReceiveAddressList;
    }
}
