package net.proselyte.jwtappdemo.model;

import lombok.Data;

import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
@Data
public class BaseEntity {
    private Long id;

    private Date created;
    private Date updated;
}
