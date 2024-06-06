package az.edu.itbrains.dtos.ArticleDtos;

import az.edu.itbrains.dtos.CategoryDtos.CategoryHomeDto;
import lombok.Data;

@Data
public class ArticleDetailDto {
    private int id;
    private String title;
    private String description;
    private String photoUrl;
    private int viewCount;
    private CategoryHomeDto category;
}
