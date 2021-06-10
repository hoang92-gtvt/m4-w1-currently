package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ConvertController {
    @GetMapping("/convert")
    public String home(){
        return "/list";
    }

    @PostMapping("/convert")
    public ModelAndView convert(String countSt , String rateSt ){
        ModelAndView modelAndViewObj = null;
        try{
            Double count = Double.parseDouble(countSt);
            Double rate = Double.parseDouble(rateSt);

            modelAndViewObj = new ModelAndView("/list");
            Double result = count *rate ;
            modelAndViewObj.addObject("result", result);

        }catch (Exception e){
            e.printStackTrace();
            modelAndViewObj= new ModelAndView("/list");
            modelAndViewObj.addObject("mess", "Lỗi cmmr");
        }

//        }catch (Exception e){
//            e.printStackTrace();
//            modelAndViewObj= new ModelAndView("/error");
//
//        }
        return modelAndViewObj;
    }
}
