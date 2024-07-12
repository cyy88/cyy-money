package com.cyy.finance.biz.mapper;

import com.cyy.finance.biz.domain.Member;
import com.cyy.mybatis.help.CommonMapper;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper extends CommonMapper<Member> {
}