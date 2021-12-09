package com.application.autogestionClientes.dto;

import com.application.autogestionClientes.entity.Tutorial;
import lombok.Data;

import java.io.Serializable;
import java.util.List;
@Data
public class TutorialesDto implements Serializable {
    private List<Tutorial> tutoriales;
    private Integer currentPage;
    private Long totalItems;
    private Integer totalPages;

    public TutorialesDto(List<Tutorial> tutoriales, Integer currentPage, Long totalItems, Integer totalPages) {
        this.tutoriales = tutoriales;
        this.currentPage = currentPage;
        this.totalItems = totalItems;
        this.totalPages = totalPages;
    }
}
