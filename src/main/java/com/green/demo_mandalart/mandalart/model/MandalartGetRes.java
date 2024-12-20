package com.green.demo_mandalart.mandalart.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Schema(title = "만다라트 조회 정보")
@Setter
public class MandalartGetRes {
    @Schema(name = "project_id")
    private long projectId;
    @Schema(name = "mandalart_id")
    private long mandalartId;
}
