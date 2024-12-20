package com.green.demo_mandalart.mandalart;

import com.green.demo_mandalart.mandalart.model.MandalartGetDto;
import com.green.demo_mandalart.mandalart.model.MandalartGetReq;
import com.green.demo_mandalart.mandalart.model.MandalartGetRes;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class MandalartService {
    private final MandalartMapper mapper;

    public MandalartGetRes getMandalart (MandalartGetReq p){
        // 프로젝트 id 체크 -> 만다라트 id 부여 -> 하위 테이블 데이터 전부 출력
        MandalartGetRes res = mapper.getMandalart(p);

        MandalartGetDto dto = new MandalartGetDto();

        if (res == null){
            return res;
        }
        long userId;


        return res;
    }
}
