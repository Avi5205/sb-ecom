package in.kodder.model;

import lombok.Data;

@Data
//@Entity
public class Category {

    //    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long categoryId;
    private String categoryName;
}
