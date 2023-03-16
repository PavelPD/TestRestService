package ru.students.testrestservice.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.students.testrestservice.model.Response;

@Service
@Qualifier("MyModifyUid")
public class MyModifyUid implements MyModifyService{
    @Override
    public Response modify(Response response) {
        response.setUid("New Uid");
        return response;
    }
}
