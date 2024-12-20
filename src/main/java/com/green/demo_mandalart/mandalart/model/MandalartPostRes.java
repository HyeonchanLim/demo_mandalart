package com.green.demo_mandalart.mandalart.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Schema(title = "")
public class MandalartPostRes {
    @Schema(title = "project_id")
    private long projectId;
}
