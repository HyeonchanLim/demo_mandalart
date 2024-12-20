package com.green.demo_mandalart.mandalart.common.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Builder
@Setter
public class ResultResponse<T> {
    private String resultMessage;
    private T resultData;
}