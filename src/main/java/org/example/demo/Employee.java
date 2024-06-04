package org.example.demo;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable {
    private int ID;
    private String first_name;
    private String last_name;
    private String father_name;
    private int national_id;
    private Date date_of_birth;
    private Activity status;
}
