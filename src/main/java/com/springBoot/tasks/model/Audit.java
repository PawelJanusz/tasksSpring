package com.springBoot.tasks.model;

import javax.persistence.Embeddable;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import java.time.LocalDateTime;

@Embeddable
public class Audit {

    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;


    @PrePersist //metoda odpali się przed uruchomieniem
    void prePersist(){
        createdOn = LocalDateTime.now();
    }

    @PreUpdate //dokładanie encji
    void preMerge(){
        updatedOn = LocalDateTime.now();
    }
}
