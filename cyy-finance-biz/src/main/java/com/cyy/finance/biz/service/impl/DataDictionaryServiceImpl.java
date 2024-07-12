package com.cyy.finance.biz.service.impl;


import com.cyy.finance.biz.config.ObjectConvertor;
import com.cyy.finance.biz.domain.DataDictionary;
import com.cyy.finance.biz.enums.DataCodeCateEnum;
import com.cyy.finance.biz.mapper.DataDictionaryMapper;
import com.cyy.finance.biz.service.DataDictionaryService;
import com.cyy.mybatis.help.MyBatisWrapper;
import com.cyy.finance.biz.dto.vo.DataDictionaryVo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.cyy.finance.biz.domain.DataDictionaryField.*;


@Service
@Slf4j
@RequiredArgsConstructor
public class DataDictionaryServiceImpl implements DataDictionaryService {
    final DataDictionaryMapper dataDictionaryMapper;
    final ObjectConvertor objectConvertor;

    /**
     * 查看行业数据字典列表
     * @return
     */
    @Override
    public List<DataDictionaryVo> listHangYe() {
        List<DataDictionary> data = listByDataTypeCode(DataCodeCateEnum.HANG_YE.getCode());
        return objectConvertor.toDataDictionaryVo(data);
    }

    /**
     * 查看会计准则数据字典列表
     * @return
     */
    @Override
    public List<DataDictionaryVo> listKuaiJiZhunZe() {
        List<DataDictionary> data = listByDataTypeCode(DataCodeCateEnum.KUAI_JI_ZHUN_ZE.getCode());
        return objectConvertor.toDataDictionaryVo(data);
    }

    /**
     * 更加数据字典类别查看数据字典
     * @param dataCodeCate
     * @return
     */
    private List<DataDictionary> listByDataTypeCode(String dataCodeCate) {
        MyBatisWrapper<DataDictionary> myBatisWrapper = new MyBatisWrapper<>();
        myBatisWrapper.select(Id, DataCode, DataValue)
                .whereBuilder().andEq(setDisable(false))
                .andEq(setDataCodeCate(dataCodeCate));

        myBatisWrapper.orderByAsc(DataSort);
        return dataDictionaryMapper.list(myBatisWrapper);
    }
}
