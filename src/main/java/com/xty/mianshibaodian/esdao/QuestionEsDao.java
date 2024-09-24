package com.xty.mianshibaodian.esdao;

import com.xty.mianshibaodian.model.dto.question.QuestionEsDTO;
import com.xty.mianshibaodian.model.entity.Question;
import org.apache.ibatis.annotations.Select;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.Date;
import java.util.List;

/**
 * 帖子 ES 操作
 *

 */
public interface QuestionEsDao extends ElasticsearchRepository<QuestionEsDTO, Long> {

    List<QuestionEsDTO> findByUserId(Long userId);

}