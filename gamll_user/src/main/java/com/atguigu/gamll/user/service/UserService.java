package com.atguigu.gamll.user.service;

import com.atguigu.gamll.user.bean.UmsMember;
import com.atguigu.gamll.user.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
