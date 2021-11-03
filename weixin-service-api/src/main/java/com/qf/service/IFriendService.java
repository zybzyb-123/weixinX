package com.qf.service;

import com.qf.base.service.BaseService;
import com.qf.entity.Friend;

import java.util.List;

public interface IFriendService extends BaseService<Friend> {
    void addFriend(Integer tid, Integer fid, int i);

    List<Friend> getFriendListByUid(Integer uid);
}
