package com.green.demo_mandalart.mandalart;



import com.green.demo_mandalart.mandalart.common.model.ResultResponse;
import com.green.demo_mandalart.mandalart.model.*;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("mand")
@Tag(name = "만다라트", description = "만다라트")
public class MandalartController {
    private final MandalartService service;
        /*
        만다라트 조회 -> 프로젝트id "?" , mandalart : [
        {
        만다라트 id : ?
        , title : 만다라트 명칭
        , contents : 만다라트 내용
        , completed_fd : 완료 여부 0 or 1
        , depth : 단계(레벨) 0,1,2
        , order_id : 순서 0~7칸
        , start_date : 계획 시작일
        , finish_date : 계획 종료일
        }
        ]
        만다라트 마다 출력
         */
    public ResultResponse<MandalartGetRes> getMandalart (MandalartGetReq p){
        MandalartGetRes mandalartGetRes = new MandalartGetRes();

        return ResultResponse.<MandalartGetRes>builder()
                .resultMessage("조회완료")
                .resultData(mandalartGetRes)
                .build();
    }
}










