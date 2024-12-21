package com.green.demo_mandalart.mandalart;


import com.green.demo_mandalart.mandalart.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MandalartMapper {
    List<MandalartGetDto> getMandalart (MandalartGetReq p);
    List<MandalartPostDto>  patchMand (MandalartPostReq p);

}
