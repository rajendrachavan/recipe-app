package spring5.kitchen.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import spring5.kitchen.Repositories.CategoryRepository;
import spring5.kitchen.Repositories.UnitOfMeasureRepository;
import spring5.kitchen.domain.Category;
import spring5.kitchen.domain.UnitOfMeasure;
import spring5.kitchen.services.RecipeService;

import java.util.Optional;

@Controller
public class IndexController {

    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"","/","/index"})
    public String getIndexPage(Model model){

        model.addAttribute("recipes", recipeService.getRecipes());

        return "index";
    }
}
