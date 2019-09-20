package spring5.kitchen.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import spring5.kitchen.Repositories.CategoryRepository;
import spring5.kitchen.Repositories.UnitOfMeasureRepository;
import spring5.kitchen.domain.Category;
import spring5.kitchen.domain.UnitOfMeasure;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(){

        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByDescription("Teaspoon");

        System.out.println("Category ID is: "+categoryOptional.get().getId());
        System.out.println("UnitOfMeasure ID is: "+unitOfMeasureOptional.get().getId());

        return "index";
    }
}
