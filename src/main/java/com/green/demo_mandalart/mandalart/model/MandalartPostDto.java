package com.green.demo_mandalart.mandalart.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@Schema(title = "")
public class MandalartPostDto {
    @Schema(title = "mandalart_id")
    private long mandalartId;
    @Schema(description = "실천 목표")
    private String title;
    @Schema(description = "계획 목표")
    private String contents;
    @Schema(description = "계획 시작일")
    private LocalDate startDate;
    @Schema(description = "계획 종료일")
    private LocalDate finishDate;
    @Schema(name = "completed_fd", description = "완료 여부 0:미완료 , 1:완료")
    private int completedFg;
    @Schema(description = "0:최상위 부모 1:1단계 2:2단계")
    private int depth;
    @Schema(name = "order_id", description = "각 단계별 0~7칸 , 선택 칸 -> 데이터 입력 ")
    private int orderId;
}
