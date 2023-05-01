package com.myplantdiary.enterprise;

import com.myplantdiary.enterprise.dto.Specimen;
import com.myplantdiary.enterprise.service.ISpecimenService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


@SpringBootTest
class EnterpriseApplicationTests {

    @Autowired
    private ISpecimenService specimenService;
    private Specimen specimen = new Specimen();

//    @MockBean
//    private ISpecimenDAO specimenDAO;


    @Test
    void contextLoads() {
    }

    @Test
    void fetchSpecimenByID_returnsRedbudForId83(){

        givenSpecimenDataAreAvailable();
        whenSearchSpecimenWithId83();
        thenReturnOneEasternRedbudSpecimenForId83();
    }

    private void givenSpecimenDataAreAvailable() {
    }

    private void whenSearchSpecimenWithId83() {

        specimen=specimenService.fetchById(83);
    }

    private void thenReturnOneEasternRedbudSpecimenForId83() {
        String description = specimen.getDescription();
        assertEquals("Eastern Redbud", description);
    }

}
