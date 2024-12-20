package com.green.demo_mandalart.mandalart;


import com.green.demo_mandalart.mandalart.model.*;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MandalartMapper {
    MandalartGetRes getMandalart (MandalartGetReq p);
    MandalartPostRes postMandalart (MandalartPostReq p);

}
