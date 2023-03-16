package ru.students.testrestservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import ru.students.testrestservice.model.Response;

@Service
@RequiredArgsConstructor
@Qualifier("MyModifyErrorMessage")
public class MyModifyErrorMessage implements MyModifyService {
    @Override
    public Response modify(Response response) {
        response.setErrorMessage("Что-то сломалось");
        return response;
    }
}
