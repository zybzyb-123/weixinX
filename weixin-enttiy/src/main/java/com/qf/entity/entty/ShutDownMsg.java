package com.qf.entity.entty;

import lombok.Data;

@Data
public class ShutDownMsg extends NettyMsg {

    {
        setType(6);
    }
}
