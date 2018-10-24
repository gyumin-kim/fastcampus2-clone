package examples.daoexam.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;

public class MainController {
    public MainController() {
        System.out.println("MainController()");
    }

    @RequestMapping("/")
    public String main(ModelMap modelMap) {
        Set<String> keySet = modelMap.keySet();
        for (String key : keySet)
            System.out.println("key: " + key + ", value: " + modelMap.get(key));

        return "index"; //  index.jsp
    }
}
