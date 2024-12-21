package com.green.demo_mandalart.mandalart;

import com.green.demo_mandalart.mandalart.model.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Service
@RequiredArgsConstructor
public class MandalartService {
    private final MandalartMapper mapper;

    public List<MandalartGetDto> getMandalart (MandalartGetReq p){
        // 프로젝트 id 체크 -> 만다라트 id 부여 -> 하위 테이블 데이터 전부 출력
        List<MandalartGetDto> list = mapper.getMandalart(p);

        if (list == null){
            return list;
        }
        MandalartGetRes res = new MandalartGetRes();
        res.setProjectId(p.getProjectId());
        res.setMandalartIdGetList(list);

        List<MandalartGetRes> resList = new ArrayList<>();
        resList.add(res);

        return res;
    }

    @Transactional
    public List<MandalartPostRes> patchMand (MandalartPostReq p){
        List<MandalartPostDto>  list = mapper.patchMand(p);
        if (list.size() == 0){
            return new ArrayList<>();
        }

        MandalartPostRes res = new MandalartPostRes();
        res.setProjectId(p.getProjectId());
        res.setMandalartIdPostList(list);

        List<MandalartPostRes> result = new ArrayList<>();
        result.add(res);

        return result;
    }
}
