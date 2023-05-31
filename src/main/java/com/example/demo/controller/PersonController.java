package com.example.demo.controller;
import com.example.demo.entity.Person;
import com.example.demo.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
public class PersonController {
    @RequestMapping("jsp")
    public String callJsp(){
        System.out.println("this is first integrate");
        return "index";
    }
    @Resource
    private PersonService ps;

    //显示所有人员信息

    @RequestMapping(value = "/person/all")
    public String findAll(Map<String,Object> model){// 声明 model 用来传递数据

        List<Person> personList = ps.findAll();

        model.put("personList",personList); // 通过这一步，JSP 页面就可以访问 personList
        return "/person/personList";  // 跳转到 personList 页面
    }

    @RequestMapping(value = "/person/find")
    public String find(Integer id, Map<String,Object> model){
        if (id == null) {
            return "/person/personFind";
        } else {
            Person person = ps.get(id);
            model.put("person", person);
            return "/person/personInfo";
        }
    }

    @RequestMapping(value ="/person/create")
    public String toCteatePersonInfo(){  // 跳转新增页面
        return "/person/personCreate";
    }
    @RequestMapping(value = "/person/update")
    public String toUpdatePersonInfo(Integer id, Model model) {
        Person pp = ps.get(id);
// 获得要修改的记录，重新设置页面的值
        model.addAttribute("p",pp);// 将数据放到model
        return "/person/personUpdate";
    }

    // 对修改或新增数据进行相应操作
    @RequestMapping(value ="/person/updateList")
    public String updatePersonList(Person p) {
        if (p.getId() == null) {
            ps.insert(p);   // 调用 Service 层方法，插入数据
        } else {
            ps.update(p);   // 调用 Service 层方法，更新数据
        }
        //下面一个语句可以不要
        //ModelAndView modelAndView = new ModelAndView();
        //返回值类型改为ModelAndView
        //return new ModelAndView("redirect:/person/all");
        //return "forward:/person/all";//forward 转发
        return "redirect:/person/all";//redirect 定向
    }

    @RequestMapping(value = "/person/deleteById")
    public ModelAndView deleteById(Integer id){
        ps.deleteById(id);
        //ModelAndView modelAndView = new ModelAndView();
        return new  ModelAndView("redirect:/person/all");
    }
}
