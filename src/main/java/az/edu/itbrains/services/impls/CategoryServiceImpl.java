package az.edu.itbrains.services.impls;

import az.edu.itbrains.dtos.CategoryDtos.CategoryAddDto;
import az.edu.itbrains.dtos.CategoryDtos.CategoryHomeDto;
import az.edu.itbrains.models.Category;
import az.edu.itbrains.repositories.CategoryRepostory;
import az.edu.itbrains.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.Cache;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryServiceImpl implements CategoryService {


    @Autowired
    private CategoryRepostory categoryRepostory;


    @Override
    public void createCategory(CategoryAddDto categoryAddDto) {
        Category category = new Category();
        category.setName(categoryAddDto.getName());
   categoryRepostory.save(category);
    }

    @Override
    public List<CategoryHomeDto> getHomeCategories() {
        return List.of();
    }
}
