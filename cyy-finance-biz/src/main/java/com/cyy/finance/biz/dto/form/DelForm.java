package com.cyy.finance.biz.dto.form;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class DelForm {

    @NotNull
    private Long id;
}