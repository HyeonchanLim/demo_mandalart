package com.green.demo_mandalart.mandalart.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class MandalartGetReq {
    @Schema(name = "project_id")
    private long projectId;

}
