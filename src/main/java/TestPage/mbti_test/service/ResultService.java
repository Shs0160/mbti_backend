package TestPage.mbti_test.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import TestPage.mbti_test.repository.ResultRepository;

@Service
@Transactional(readOnly = true)
public class ResultService {

    private final ResultRepository resultRepository;

    public ResultService(ResultRepository resultRepository){
        this.resultRepository = resultRepository;
    }

    //public String getResultById(Long UserId){
    //    return resultRepository.
    //}

}
